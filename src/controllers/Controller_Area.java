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
import epr.Data_Flow;

/**
 *
 * @author megam
 */
public class Controller_Area implements ActionListener{
    Model_Area modelArea = new Model_Area();
    View_Area viewArea = new View_Area();
    epr.Data_Flow libreria = new epr.Data_Flow();

    public Controller_Area (Model_Area modelArea, View_Area viewArea){
        this.modelArea = modelArea;
        this.viewArea = viewArea;
        this.viewArea.jtf_ancho.addActionListener(this);
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.viewArea.jtf_area) {
            if (this.viewArea.jCB_cuadrado.isSelected()) {
                area_cuad();
            }
            else if (this.viewArea.jCB_triangular.isSelected()) {
                area_trian();
            }
            else if ( this.viewArea.jCB_rectangulo.isSelected()){
                area_rect();
            }
        }
    }
    
    public void area_cuad(){
        modelArea.setAltura(libreria.stringToDouble(viewArea.jtf_altura.getText()));
        modelArea.setAncho(libreria.stringToDouble(viewArea.jtf_ancho.getText()));
        view_Area.jtf_resultado = modelArea.area_Cuadrado();
    }
    
    public void area_trian(){
        modelArea.setAltura(libreria.stringToDouble(viewArea.jtf_altura.getText()));
        modelArea.setAncho(libreria.stringToDouble(viewArea.jtf_ancho.getText()));
        view_Area.jtf_resultado = modelArea.area_Triangulo();
    }
    
    public void area_rect(){
        modelArea.setAltura(libreria.stringToDouble(viewArea.jtf_altura.getText()));
        modelArea.setAncho(libreria.stringToDouble(viewArea.jtf_ancho.getText()));
        ViewsArea.jtf_resultado = modelArea.area_Rectángulo();
    }
}
