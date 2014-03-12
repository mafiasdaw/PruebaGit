/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.pkg4;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Fraccion {
    
    private int numerador;
    private int denominador;


    public void RecogerTeclado(){
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce el numerador");
        this.numerador = sc.nextInt();
        
        System.out.println("Introduce el denominador");
        this.denominador = sc.nextInt();
        
    }
    public void Visualizar(){
        
            System.out.println("La fraccion es : " + this.numerador + " / " + this.denominador );
    }
    public boolean igual(Fraccion fraccion){
        boolean igual = this.numerador == fraccion.numerador && this.denominador == fraccion.denominador;
        return igual;
   }
    public boolean equivalentes(Fraccion fraccion){
        
        boolean equivalente = (this.numerador*fraccion.denominador == this.denominador*fraccion.numerador);
        return equivalente;
        
        
    }
    
    
   
    
}
