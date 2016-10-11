
package models;

public class Model_Volumen {
    public double ancho =0;
    public double largo=0;
    public double altura=0;
    public double alturatrian = 0;
    
    public double getAlturatrian(){
        return alturatrian;        
    }
    
    public void setAlturatrian(double alturatrian){
        this.alturatrian = alturatrian;
    }
    
     public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    
    public double getLargo() {
        return largo;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }
    
 
  public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double volumen_Cubo(){
        return (this.largo*largo)* this.largo;
    }
    
    public double volumen_Prismarectangular(){
        return (this.largo*ancho) * this.altura;
        
    }
    
    public double volumen_Prismatriangular(){
        return ((this.largo*alturatrian)/2)* this.altura;
    }
    
    public double getvolumen_Cubo(){
        return this.volumen_Cubo();
    }
    
    public double getvolumen_Prismarectangular(){
        return this.volumen_Prismarectangular();
    }
    
    public double getvolumen_Prismatriangular(){
        return this.getvolumen_Prismatriangular();
    }   
        }    
    
    
    
    
    
    
    
    


 