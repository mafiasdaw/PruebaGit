/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fastmetodos;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Max
 */
public class Jugador {

    private String nombre;
    
    private int orden;
    private int nitro=3;
    private int oro;
    private int dado;
    private int posicion=0;

    public Jugador() {
    }

    
    public Jugador(String nombre) {
        this.nombre = nombre;
    }

    public int getDado() {
        return dado;
    }

    public int getPosicion() {
        return posicion;
    }

    public Jugador(int posicion) {
        this.posicion = 0;
    }
   
    public String getNombre() {
        return nombre;
    }

    public int getOrden() {
        return orden;
    }

    public int getNitro() {
        return nitro;
    }

    public int getOro() {
        return oro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   

    public void setOrden(int orden) {
        this.orden = orden;
    }

    public void setNitro(int nitro) {
        this.nitro = 3;
    }

    public void setOro(int oro) {
        this.oro = 0;
    }
    Scanner sc = new Scanner(System.in);

//    public String PedirJugador() {
//
//        System.out.println("Introduce nombre de jugador: ");
//        String nombre1 = sc.next();
//        return nombre;
//       
//    }

    public int Orden() {
        Random r = new Random();
        int orden = r.nextInt(10);

        return orden;
    }

    public int TirarDadoNitro() {
        Scanner sc1 = new Scanner(System.in);
        Random r1 = new Random();
        int dado1 = r1.nextInt(14) + 1;
        System.out.println(nombre + "Has sacado un: " + dado1);
        if (dado1 == 13) {
            System.out.println("!!!! Te has equivocado de marcha !!!! ------> !!!! NO AVANZAS NADA !!!! <-------");

        }
        while (dado1 == 14) {
            System.out.println("!!!! Te has chocado !!!! ------> !!!! Vuelves al principio !!!! <-------");
            posicion = 0;
        }

        System.out.println(nombre + " has sacado un: " + dado1 + " ¿quieres usar el nitro? "
                + "1. Si"
                + "2. No");
        int opnitro = sc1.nextInt();
        if (opnitro == 1) {
            int usonitro = dado1 * 2;
            System.out.println("Has usado el nitro, el resultado es: " + usonitro);
            nitro = nitro -1;
            System.out.println("Te quedan: " + nitro + " nitros.");
            if (nitro <= 0) {
                System.out.println("Has agotado los nitros");
            }
        } else if (nitro == 2) {
            System.out.println("OK");
        }

        return posicion;
    }

    
    
}
