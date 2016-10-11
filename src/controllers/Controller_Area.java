/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import models.Model_Area;
import views.View_Area;
import libreria.Libreria;

/**
 *
 * @author megam
 */
public class Controller_Area implements ActionListener{
    Model_Area modelArea = new Model_Area();
    View_Area viewArea = new View_Area();
    Libreria libreria = new Libreria();

    public Controller_Area (Model_Area modelArea, View_Area viewArea){
        this.modelArea = modelArea;
        this.viewArea = viewArea;
        this.viewArea.jbtn_area.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.viewArea.jbtn_area) {
            if (this.viewArea.jrb_cuadrado.isSelected()) {
                area_cuad();
            }
            else if (this.viewArea.jrb_triangulo.isSelected()) {
                area_trian();
            }
            else if ( this.viewArea.jrb_rectangulo.isSelected()){
                area_rect();
            }
        }
    }
    
    public void area_cuad(){
        modelArea.setLargo(libreria.stringToDouble(viewArea.jtf_largo.getText()));
        modelArea.setAncho(libreria.stringToDouble(viewArea.jtf_ancho.getText()));
        viewArea.jtf_resultado.setText("" + modelArea.area_Cuadrado());
    }
    
    public void area_trian(){
        modelArea.setLargo(libreria.stringToDouble(viewArea.jtf_largo.getText()));
        modelArea.setAncho(libreria.stringToDouble(viewArea.jtf_ancho.getText()));
        viewArea.jtf_resultado.setText("" + modelArea.area_Triangulo());
    }
    
    public void area_rect(){
        modelArea.setLargo(libreria.stringToDouble(viewArea.jtf_largo.getText()));
        modelArea.setAncho(libreria.stringToDouble(viewArea.jtf_ancho.getText()));
        viewArea.jtf_resultado.setText("" + modelArea.area_Rectángulo());
    }
}
