/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2eva;

import java.util.Scanner;


/**
 *
 * @author Max
 */
public class descuentos  {
  
    private int descuento;

    public int getDescuento() {
        return descuento;
    }

    public void setDescuento(int descuento) {
        this.descuento = descuento;
    }
    
 
    Scanner sc5=new Scanner(System.in);
    int descuentos[]= new int[20];
    
    public void PedirDescuentos(){
        
        System.out.println("Cuantos descuentos vas a dar de alta: ");
        int numdescuento=sc5.nextInt();
        
        for (int i = 0; i < numdescuento; i++) {
            System.out.println("Introduce el descuento: ");
            descuentos[i]=sc5.nextInt();
           }
        
        
        
    }
    
    public void MostrarDescuentos(){
        System.out.println("Numero de resultados a consultar:");
        int numdescuento1=sc5.nextInt();
        for (int i = 0; i < numdescuento1; i++) {
            System.out.println("Todos los descuentos guardados son: "+descuentos[i]);
        }
    }
    

    
    
}
