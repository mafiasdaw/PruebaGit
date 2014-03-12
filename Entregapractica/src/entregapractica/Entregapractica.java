/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package entregapractica;

import java.util.Scanner;

/**
 *
 * @author Arturo Navarrete
 * 
 */
public class Entregapractica {

    /**
     * @param args the command line arguments
     * <b><H1>Aqui se presenta el menu de seleccion de ejercicio </b></H!>
     * El usuario introduce el numero de ejercicio a realizar.
     * 
     */
    public static void main(String[] args) {
        int ejercicio;
        do {

            System.out.println("Elige el ejercicio que quieres ver: ");
            System.out.println("1: Ejercicio 1");
            System.out.println("2: Ejercicio 2");
            System.out.println("3: Ejercicio 3");
            System.out.println("4: Ejercicio 4");
            System.out.println("5: Ejercicio 5");
            System.out.println("6: Ejercicio 6");
            System.out.println("7: Ejercicio 7");
            System.out.println("8: Ejercicio 8");
            System.out.println("9: Ejercicio 9");
            System.out.println("10: Ejercicio 10");
            System.out.println("11: Ejercicio 11");
            System.out.println("12: Salir 12");

            Scanner scanner = new Scanner(System.in);
            ejercicio = scanner.nextInt();
            if (ejercicio != 12) {
                switch (ejercicio) {
                    case 1:
                        ejercicio1();
                        break;
                    case 2:
                        ejercicio2();
                        break;
                    case 3:
                        ejercicio3();
                        break;
                    case 4:
                        ejercicio4();
                        break;
                    case 5:
                        ejercicio5();
                        break;
                    case 6:
                        ejercicio6();
                        break;
                    case 7:
                        ejercicio7();
                        break;
                    case 8:
                        ejercicio8();
                        break;
                    case 9:
                        ejercicio9();
                        break;
                    case 10:
                        ejercicio10();
                        break;
                    case 11:
                        ejercicio11();
                        break;
                    case 12:

                        break;
                }
            }
        } while (ejercicio != 12);
    }

    /**
     * Este ejercicio escribe los valores comprendidos ente el 531 y el 540
     */
    public static void ejercicio1() //1. Programa que escriba los valores comprendidos entres 531 y 540. 
    {
        System.out.println("Solucion: ");
        for (int valor = 531; valor <= 540; valor++) {
            System.out.println(valor);
        }
    }

    /**
     *Este ejercicio escribe el primer numero natural para el cual la suma de el mismo mas sus antecesores es mayor a 125.
     */
    public static void ejercicio2() {
//2. Escribir un programa que escribe el primer número natural para el cual la suma de él más sus antecesores es mayor a 125.
        int numero = 0;
        int suma = 0;
        do {
            numero++;
            suma += numero;

        } while (suma < 125);
        System.out.println(numero);

    }

    /**
     * Este ejercicio escribe por pantalla los veinte primeros múltiplos de cinco.
     */
    public static void ejercicio3() {

        //3. Escribir un programa que escriba por pantalla los veinte primeros múltiplos de cinco.
        int numero;

        System.out.println("los multiplos de 5 son: ");
        for (int multiplo = 1; multiplo <= 20; multiplo++) {
            numero = 5 * multiplo;
            System.out.println(numero);
        }

    }

    /**
     * Este ejercicio escribe la media de 15 valores suministrados por el teclado.
     *
     */
    public static void ejercicio4() {

        //4. Escribir la media de 15 valores suministrados por el teclado. 
        int numeros[] = new int[15];
        int media;
        int suma = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            System.out.println("Introduce los numeros: ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];

        }
        System.out.println("El total es " + suma);
        media = suma / 15;
        System.out.println("La media es " + media);
    }

    /**
     *Escribe la media de n valores suministrados por teclado suministrando a su vez el valor n por teclado.
     */
    public static void ejercicio5() {

        //Escribir la media de n valores suministrados por teclado suministrando a su vez el valor n por teclado.
        int numvariables;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Dame el numero de variables");
        numvariables = scanner.nextInt();
        // declarar bien los arrays con "new int [nombrearray]"
        int numeros[] = new int[numvariables];

        for (int i = 0; i < numvariables; i++) {
            System.out.println("dame los numeros" + (i + 1));
            numeros[i] = scanner.nextInt();
        }
        int media = 0;
        for (int i = 0; i < numeros.length; i++) {
            media += numeros[i];
        }
        System.out.println("El total de la suma es: " + media);
        media = media / numvariables;
        System.out.println("La media es: " + media);
    }

    /**
     *Programa que recibe una cantidad horaria en horas, minutos y segundos y lo convierte todo a minutos.
     */
    public static void ejercicio6() {
        //Programa que recibe una cantidad horaria en horas, minutos y segundos y lo convierte todo a minutos.
        double horas;
        double minutos;
        double segundos;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce horas");
        horas = scanner.nextDouble();
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("introduce minutos");
        minutos = scanner1.nextDouble();
        Scanner scanner2 = new Scanner(System.in);
        System.out.println("introduce segundos");
        segundos = scanner2.nextDouble();
        minutos = (horas * 60) + minutos + (segundos / 60);
        System.out.println("el resultado en minutos es:" + minutos);
    }

    /**
     * Programa que recibe una cantidad horaria en segundos y la convierte en horas, minutos y segundos.
     */
    public static void ejercicio7() {

        //Programa que recibe una cantidad horaria en segundos y la convierte en horas, minutos y segundos.
        int horas;
        int minutos;
        int segundos;
        Scanner scanner = new Scanner(System.in);
        System.out.println("introduce segundos");
        segundos = scanner.nextInt();
        horas = segundos / 3600;
        segundos = segundos % 3600;
        minutos = segundos / 60;
        segundos = segundos % 60;


        System.out.println("el resultado es\n" + horas + "\n" + minutos + "\n" + segundos);

    }

    /**
     * Programa que solicita 10 números por teclado y al concluir escribe el mayor y menor de ellos.
     */
    public static void ejercicio8() {
        {
            // Programa que solicita 10 números por teclado y al concluir escribe el mayor y menor de ellos.

            Scanner scanner = new Scanner(System.in);
            int num, max = 0, min = 0;

            for (int i = 1; i < 11; i++) {
                System.out.print(i + " Introduce un numero: ");
                num = scanner.nextInt();
                if (min != 0 && max != 0) {//atento el uso del &&
                    if (num > max) {
                        max = num;
                    }
                    if (num < min) {
                        min = num;
                    }
                } else {
                    min = num;
                    max = num;
                }
            }
            System.out.println("Maximo: " + max);
            System.out.println("Minimo: " + min);
        }

    }
    // TODO code application logic here

    /**
     * Escribe un programa que calcule el factorial de un número pedido por teclado
     */
    public static void ejercicio9() {

        //Escribir un programa que calcule el factorial de un número pedido por teclado 
        int num, resultado = 1;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Introduce el numero ");
        num = scanner.nextInt();
        for (int i = 0; i < num; i++) {
            resultado *= num - i;
            //"resultado" se multiplica directamente con el resultado de num-i

        }
        System.out.println("El resultado es: " + resultado);




    }

    /**
     *Realizar un programa que imprima todos los números primos entre 1 y n, siendo n un número introducido por el usuario 
     *
     */
    public static void ejercicio10() {
        int i, j, resto;                // 3 variables: dividendo (i), divisor(j) y resto.
        for (i = 1; i < 101; i++) {
                                                    //ciclo para recorrer los numeros hasta el num 100
            resto = 0;                              //variable para contar cuantas veces es el resto de dividir es 0
            for (j = 1; j < 101; j++) {             //ciclo para recorrer los numeros hasta el  100 (estos seran los divisores)
                if (i % j == 0)                     //evalua la condicion de que el resto de dividir i entre j es igual a cero
                {
                    resto++;                          // si la condicion anterior se cumple entonces entonces suma 1 a esta variable
                }
            }
            if (resto == 2) //evalua la condicion de que solo 2 entre 2 numeros el residuo sea igual a =
            {
                System.out.println(i + " es numero primo.");
            }
        }
    }

    /**
     * Esto es un juego en el que el usuario tiene que adivinar un numero entre el 0 y el 100. Se le indicara si es mayor o menor y le dejara volver a intentarlo.
     */
    public static void ejercicio11() {

        //Diseñar un programa para jugar a adivinar un número entre 0 y 100. El juego tiene que dar pistas de si el número introducido por el jugador está por encima o por debajo. El juego termina cuando se adivina el número o se decide terminar de jugar 
        Scanner scanner = new Scanner(System.in);
        int num;


        do {
            System.out.println("Intenta adivinar el número, escribe uno");
            num = scanner.nextInt();
            if (num < 23) {
                System.out.println("El numero es mayor");
            } else if (num > 23) {
                System.out.println("El numero es menor");
            }
            if (num == 23) {
                System.out.println("Acertaste el numero");
            }

        } while (num != 23);


    }
}
