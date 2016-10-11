package models;

public class Model_Perimetro {
    public double ancho =0;
    public double largo =0;
    public double lado =0;

  public double getAncho(){
   return ancho;
   }
public void setAncho(double ladoa){
    this.ancho = ladoa;
}

public double getLargo (){
    return largo;
}

public void setLargo(double ladob){
    this.largo = ladob;
}
public double getLado (){
    return lado;
}

public void setLado(double ladoc){
    this.lado = ladoc;
}


public double  perimetro_Triángulo(){
    return this.ancho+largo+lado;
}
public double perimetro_Cuadrado (){
    return (this.largo)*4;
}
public double perimetro_Rectangulo (){
    return (this.ancho+largo)*2;
}
public double  getperimetro_Triángulo(){
    return this.perimetro_Triángulo();
}
public double  getperimetro_Cuadrado(){
    return this.perimetro_Cuadrado();
}
public double  getperimetro_Rectangulo(){
    return this.perimetro_Rectangulo();
}
}



