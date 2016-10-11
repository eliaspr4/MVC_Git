/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import views.View_Main;
import javax.swing.JPanel;
/**
 *
 * @author megam
 */
public class Controller_Main implements ActionListener{
    View_Main viewMain = new View_Main();
    JPanel[] views;

    public Controller_Main(View_Main viewMain, JPanel[] views) {
        this.viewMain = viewMain;
        this.views = views;
        this.viewMain.jmi_perimetro.addActionListener(this);
        this.viewMain.jmi_area.addActionListener(this);
        this.viewMain.jmi_volumen.addActionListener(this);
        initView();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()== viewMain.jmi_perimetro){
            jmi_perimetro();
        }
        else if(e.getSource()== viewMain.jmi_area){
            jmi_area();
        }
        else if(e.getSource()== viewMain.jmi_volumen){
            jmi_volumen();
        }
    }
    
    public void jmi_perimetro(){
        this.viewMain.setContentPane(views[0]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    
    public void jmi_area(){
        this.viewMain.setContentPane(views[1]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }
    
    public void jmi_volumen(){
        this.viewMain.setContentPane(views[2]);
        this.viewMain.revalidate();
        this.viewMain.repaint();
    }

    public void initView(){
        this.viewMain.setTitle("Integracion");
        this.viewMain.setLocationRelativeTo(null);
        this.viewMain.setVisible(true);
    }
}
