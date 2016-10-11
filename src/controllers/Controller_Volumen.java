/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Model_Volumen;
import views.View_Volumen;
import libreria.Libreria;

/**
 *
 * @author megam
 */
public class Controller_Volumen implements ActionListener{
    Model_Volumen modelVolu = new Model_Volumen();
    View_Volumen viewVolu = new View_Volumen();
    Libreria libreria = new Libreria();

    public Controller_Volumen (Model_Volumen modelVolu, View_Volumen viewVolu){
        this.modelVolu = modelVolu;
        this.viewVolu = viewVolu;
        this.viewVolu.jbtn_volumen.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.viewVolu.jbtn_volumen) {
            if (this.viewVolu.jrb_cubo.isSelected()) {
                volu_cubo();
            }
            else if (this.viewVolu.jrb_prismatrian.isSelected()) {
                volu_pristrian();
            }
            else if ( this.viewVolu.jrb_prismarect.isSelected()){
                volu_prisrec();
            }
        }
    }
    
    public void volu_cubo(){
        modelVolu.setLargo(libreria.stringToDouble(viewVolu.jtf_largo.getText()));
        viewVolu.jtf_resultado.setText("" + modelVolu.volumen_Cubo());
    }
    
    public void volu_pristrian(){
        modelVolu.setLargo(libreria.stringToDouble(viewVolu.jtf_largo.getText()));
        modelVolu.setAlturatrian(libreria.stringToDouble(viewVolu.jtf_alturatrian.getText()));
        modelVolu.setAltura(libreria.stringToDouble(viewVolu.jtf_altura.getText()));
        viewVolu.jtf_resultado.setText("" + modelVolu.volumen_Prismatriangular());
    }
    
    public void volu_prisrec(){
        modelVolu.setLargo(libreria.stringToDouble(viewVolu.jtf_largo.getText()));
        modelVolu.setAncho(libreria.stringToDouble(viewVolu.jtf_ancho.getText()));
        modelVolu.setAltura(libreria.stringToDouble(viewVolu.jtf_altura.getText()));
        viewVolu.jtf_resultado.setText("" + modelVolu.volumen_Prismarectangular());
    }
}


