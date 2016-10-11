
package models;


public class Model_Area {
    public double largo = 0;
    public double ancho = 0;
    
    
  public double getLargo (){
     return largo;
 }
 
  public void setLargo(double base){
      this.largo = base;
  }
 

 public double getAncho (){
     return ancho;
 }
 
  public void setAncho(double altura){
      this.ancho = altura;
  }


public double area_Triangulo(){
    return this.largo*ancho/2;
}

public double area_Cuadrado(){
    return this.largo*largo;
}

public double area_Rectángulo(){
    return this.largo*ancho;
}

public double getarea_Triangulo(){
    return  this.area_Triangulo();
}

public double getarea_Cuadrado(){
    return  this.area_Cuadrado();
}

public double getarea_Rectangulo(){
    return  this.area_Rectángulo();
}
}






