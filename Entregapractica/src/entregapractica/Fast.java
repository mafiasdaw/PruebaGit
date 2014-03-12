/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entregapractica;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Fast {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int jugadores;
        
        int nitro=0;
        int dado = 0;
        int posicion [];
       
        
        
        
        System.out.println("::::::::::::::::::::::::::::::::::::::::::::\n"
                + "::::::::::::::::::::::::::::::::::::::::::::\n"
                + "::::::::::::  BIENVENIDO A :::::::::::::::::\n"
                + ":::::::: Fast&Furious Pocket Edition:::::::::\n"
                + ":::::::::::::::::::::::::::::::::::::::::::::\n"
                + " :::::::::::::::::::::::::::::::::::::::::::::\n");
        System.out.println("Cuantos jugadores van a participar: ");
        jugadores = sc.nextInt();
        sc.nextLine();
        String nombre[] = new String[jugadores];

        //Pido los nombres y los guarda en el array
        for (int i = 0; i < jugadores; i++) {
            System.out.println("Introduce el nombre del jugador ----> " + (i + 1) + ": ");
            nombre[i] = sc.nextLine();
            System.out.println( nombre[i] + " , ¿Quieres usar el NITRO?\n"
                    + "1. True \n"
                    + "2. False \n");
            nitro = sc.nextInt();
            sc.nextLine();
         
            
        }
        //...................................................................................................................
        
        System.out.println("-------->  Ahora se tirara el dado y se dará un valor a cada jugador:\n <---------"
                + "--------------------------------------------------------------------------------\n"
                + "--------------------------------------------------------------------------------\n");

        //.................................Tirar el dado................................................................
        do {
             dado = r.nextInt(13);
            if (nitro == 1) {
                //Opcion de usar el nitro, multiplicar por 2 el random
                for (int j = 3; j < 0; j--) {
                   int usonitro = dado * 2;
                    System.out.println("---->Has usado el Nitro, el resultado es: " + usonitro + "<------"); 
                   System.out.println("-----te quedan "+ j + " nitros por usar -----");
                }
                
                
            } else if (nitro == 2) {
                System.out.println("!! Haces bien, mejor reservarlo !!");
            }
            

            for (int i = 0; i < jugadores; i++) {
            
                System.out.println("El jugador " + nombre[i] + " ha sacado un: " + (dado));
                
                
                
                //si el dado muestra 13(marcha) no avanza nada, si muestra 14(choque) vuelve a empezar .
                if (dado == 13) {
                    System.out.println("!!!! Te has equivocado de marcha !!!! ------> !!!! NO AVANZAS NADA !!!! <-------");
                      // no avanza nada
                }
                while (dado == 14) {
                    System.out.println("!!!! Te has chocado !!!! ------> !!!! Vuelves al principio !!!! <-------");
                    //al chocarse la distancia se queda a 0
                   
                }

            }
        } while (false);
            
//                if (distancia[dado]>=100){
            //        System.out.println("Enhorabuena, has llegado a la meta");
                    
          //      }

    }
}
