/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.pkg4;

/**
 *
 * @author Max
 */
public class Pila_de_fracciones {

   
       Fraccion pila[]=new Fraccion [9];
       
       int  contador;
   
   public void push (Fraccion fraccion){
    pila [contador]=fraccion;   
        contador++;
       
       // este metodo apila (mete) en un orden (el ultimo que entra es el primero que sale)
       
       
   }
   public Fraccion pop (){
       
       pila[contador - 1] = null;

        contador--;
        if (contador==0) {
            System.out.println("Tu pila esta vacia.");
            
        }
        return pila[contador];
    
       
       // este metodo desapila (saca) 
       
   }
   public void Empty(){
       //este metodo indica si la pila esta vacia (true & false)
       if (contador<=0){
           System.out.println("La pila esta vacia");
           
       }else{
           System.out.println("La pila contiene datos ");
         
           
       }
       }
      
   
   public void full(int contador){

    if (contador >=10){
        System.out.println("La pila esta totalmente llena");
    }else{
        System.out.println("La pila contiene datos pero no está totalmente llena");
        
       // este metodo indica si la pila esta llena 
     
   }
   }
   public void mostrar(){
       for (int i = 0; i < contador; i++) {
            System.out.print("tu fraccion " + (i + 1) + " vale:");
            pila[i].Visualizar();
        }
 if (contador == 0) {
            System.out.println("Tu pila de fracciones esta vacia");


    }
   
   }
}


