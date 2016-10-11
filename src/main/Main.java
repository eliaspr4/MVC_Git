/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import views.*;
import controllers.*;
import models.*;
import javax.swing.JPanel;


/**
 *
 * @author megam
 */
public class Main {
    public static Model_Area modelArea;
    public static View_Area viewArea;
    public static Controller_Area controllerArea;
    
    public static Model_Perimetro modelPeri;
    public static View_Perimetro viewPeri;
    public static Controller_Perimetro controllerPeri;
    
    public static Model_Volumen modelVolu;
    public static View_Volumen viewVolu;
    public static Controller_Volumen controllerVolu;
    
    public static View_Main viewMain;
    public static Controller_Main controllerMain;
    
    public static void main (String [] lfar){
        modelArea = new Model_Area();
        viewArea = new View_Area();
        controllerArea = new Controller_Area(modelArea, viewArea);
        
        modelPeri = new Model_Perimetro();
        viewPeri = new View_Perimetro();
        controllerPeri = new Controller_Perimetro(modelPeri, viewPeri);
        
        modelVolu = new Model_Volumen();
        viewVolu = new View_Volumen();
        controllerVolu = new Controller_Volumen(modelVolu, viewVolu);
        
        JPanel views[] = new JPanel[3];
        views[0] = viewPeri;
        views[1] = viewArea;
        views[2] = viewVolu;
        
        viewMain = new View_Main();
        controllerMain = new Controller_Main(viewMain, views);
    }
}