/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica1;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Punto {
    private double num1;
    private double num2;
    
    public void Constructor(){
        
        Scanner sc= new Scanner(System.in);
        
        this.num1=num1;
        this.num2=num2;
        
    }
    
      public double getNum1() {
        return num1;
    }

    public double getNum2() {
        return num2;
    }

    public Punto(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
public double calcularDistanciaDesde(Punto punto){
    
    double distancia;
    distancia=Math.sqrt((this.num1-num1)*(this.num1-num1))+((this.num2-num2)*(this.num2-num2));
   return distancia;
    
}


}


