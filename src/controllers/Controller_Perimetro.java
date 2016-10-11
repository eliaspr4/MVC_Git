/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Model_Perimetro;
import views.View_Perimetro;
import libreria.Libreria;

/**
 *
 * @author megam
 */
public class Controller_Perimetro implements ActionListener{
    Model_Perimetro modelPeri = new Model_Perimetro();
    View_Perimetro viewPeri = new View_Perimetro();
    Libreria libreria = new Libreria();

    public Controller_Perimetro (Model_Perimetro modelPeri, View_Perimetro viewPeri){
        this.modelPeri = modelPeri;
        this.viewPeri = viewPeri;
        this.viewPeri.jbtn_perimetro.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.viewPeri.jbtn_perimetro) {
            if (this.viewPeri.jrb_cuadrado.isSelected()) {
                peri_cuad();
            }
            else if (this.viewPeri.jrb_triangulo.isSelected()) {
                peri_trian();
            }
            else if ( this.viewPeri.jrb_rectangulo.isSelected()){
                peri_rect();
            }
        }
    }
    
    public void peri_cuad(){
        modelPeri.setLargo(libreria.stringToDouble(viewPeri.jtf_largo.getText()));
        modelPeri.setAncho(libreria.stringToDouble(viewPeri.jtf_ancho.getText()));
        viewPeri.jtf_resultado.setText("" + modelPeri.perimetro_Cuadrado());
    }
    
    public void peri_trian(){
        modelPeri.setLargo(libreria.stringToDouble(viewPeri.jtf_largo.getText()));
        modelPeri.setAncho(libreria.stringToDouble(viewPeri.jtf_ancho.getText()));
        modelPeri.setLado(libreria.stringToDouble(viewPeri.jtf_lado.getText()));
        viewPeri.jtf_resultado.setText("" + modelPeri.perimetro_Triángulo());
    }
    
    public void peri_rect(){
        modelPeri.setLargo(libreria.stringToDouble(viewPeri.jtf_largo.getText()));
        modelPeri.setAncho(libreria.stringToDouble(viewPeri.jtf_ancho.getText()));
        viewPeri.jtf_resultado.setText("" + modelPeri.perimetro_Rectangulo());
    }
}

