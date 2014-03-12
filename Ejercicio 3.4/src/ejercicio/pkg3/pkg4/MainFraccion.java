/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio.pkg3.pkg4;

import com.sun.org.apache.bcel.internal.generic.SWITCH;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class MainFraccion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el numero de fracciones que vas a introducir: ");
        int numfrac;
        int num;
        Fraccion f = new Fraccion();

        numfrac = sc.nextInt();
        Fraccion frac[] = new Fraccion[numfrac];


        System.out.println("Introduzca fracciones");

        for (int i = 0; i < frac.length; i++) { // introduce las fracciones
            frac[i] = new Fraccion();
            frac[i].RecogerTeclado();
        }
        for (int i = 0; i < frac.length; i++) { //visualiza las fracciones introducidas

            frac[i].Visualizar();
        }
       
        for (int i = 0; i < frac.length; i++) {//equivalentes o no           
            for (int j =i+1; j < frac.length; j++) {
                boolean equivalente = frac[i].equivalentes(frac[j]);
                if (equivalente == true) {
                    System.out.println("Son equivalentes ");
                } else {
                    System.out.println("NO son equivalentes!!! ");
                }

            }
        }
        for (int i = 0; i < frac.length; i++) { //decir si son iguales o no
            for (int j =i+1; j < frac.length; j++) {
                boolean igual= frac[i].igual(frac[j]);
                if (igual=false){
                        System.out.println("Son iguales");
                }else{
                        System.out.println("No son iguales");
            }
        }
    }
    
    
    
    //esto es el nuevo comentario para hacer el commit
    
        System.out.println("A continuacion las fracciones se guardaran en una pila:"
                + "Elige que opcion quieres hacer:"
                + "1.Apilar"
                + "2.Desapilar"
                + "3.Comprobar si esta llena"
                + "4.comprobar si esta vacia"
                + "5.Mostrar las fracciones de la pila"
                + "6.Salir...");
    
    Pila_de_fracciones pila=new Pila_de_fracciones();
    
    int eleccion;    
    eleccion=sc.nextInt();
    
        if (eleccion>6 | eleccion<1)
            System.out.println("Instroduzca un numero entre el 1-6");
       
    
    
    switch (eleccion) {
               
                case 1:
                    pila.push(f);
                    break;
                case 2:
                   pila.pop();
                    break;
                case 3:
                    pila.full(frac.length);
                    break;
                case 4:
                    pila.Empty();
                    break;
                case 5:
                   pila.mostrar();
                    break;
               
                    
                     } 
        
        
    
    
    
    
    }
    
   
   
   
    
    

//    public static Fraccion[] cargafracciones() {
//        Scanner s = new Scanner(System.in);
//
//        Fraccion[] fracciones;
//        // Leer la linea de teclado.
//        String linea = s.nextLine();
//        //separarlos por ,
//        String[] cadenasFraccion = linea.split(",");
//        //separarlos por /
//        fracciones = new Fraccion[cadenasFraccion.length];
//        for (int i = 0; i < cadenasFraccion.length; i++) {
//
//            String[] stringFraccion = cadenasFraccion[i].split("/");
//            //crear fraccion
//            int numerador = Integer.parseInt(stringFraccion[0]);
//            int denominador = Integer.parseInt(stringFraccion[1]);
//            fracciones[i] = new Fraccion(numerador, denominador);
//
//        }
//
//
//
//        return fracciones;
//
//    }
}
