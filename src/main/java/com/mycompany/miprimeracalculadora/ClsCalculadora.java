
package com.mycompany.miprimeracalculadora;

/**
 *FGALVEZ
 * WLOPEZ
 * AORJUELA
 */
public class ClsCalculadora {
    private double suma; 
    private double resta;
    private double multiplicacion;
    private double division;
    private double potencia;
    private double RaizCuadrada;

    public ClsCalculadora(double suma, double resta, double multiplicacion, double division, double potencia, double RaizCuadrada) {
        this.suma = suma;
        this.resta = resta;
        this.multiplicacion = multiplicacion;
        this.division = division;
        this.potencia = potencia;
        this.RaizCuadrada = RaizCuadrada;
    }

    public double getRaizCuadrada() {
        return RaizCuadrada;
    }

    public void setRaizCuadrada(double RaizCuadrada) {
        this.RaizCuadrada = RaizCuadrada;
    }

    public double getSuma() {
        return suma;
    }

    public void setSuma(double suma) {
        this.suma = suma;
    }

    public double getResta() {
        return resta;
    }

    public void setResta(double resta) {
        this.resta = resta;
    }

    public double getMultiplicacion() {
        return multiplicacion;
    }

    public void setMultiplicacion(double multiplicacion) {
        this.multiplicacion = multiplicacion;
    }

    public double getDivision() {
        return division;
    }

    public void setDivision(double division) {
        this.division = division;
    }

    public double getPotencia() {
        return potencia;
    }

    public void setPotencia(double potencia) {
        this.potencia = potencia;
    }
    
    //metodo realiza suma
    public double suma(double numero1,double numero2){
       double resultadoSuma = (numero1 + numero2); 
    
    return resultadoSuma;
    }
    
    //metodo realiza resta
    public double resta(double numero1,double numero2){
       double resultadoResta = (numero1 - numero2); 
    
    return resultadoResta;
    }
  
    //metodo realiza multiplicacion
    public double multiplicacion(double numero1,double numero2){
       double resultadoMultiplicacion = (numero1 * numero2); 
    
    return resultadoMultiplicacion;
    }
    
    //metodo realiza division
    public double division(double numero1,double numero2){
       double resultadoDivision = (numero1 / numero2); 
    
    return resultadoDivision;
    }
    
    //metodo realiza potencia
    public double potencia(double numero1, double numero2){
       double resultadoPotencia = Math.pow(numero1, numero2); 
    
    return resultadoPotencia;
    }
    
    //metodo realiza Raiz Cuadrada
    public double RaizCuadrada(double numero1){
       double resultadoRaizCuadrada = Math.sqrt(numero1); 
    
    return resultadoRaizCuadrada;
    } 
    
}
