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
public class Arrays_y_matrices_Arturo_Navarrete {

    /**
     * <marquee> este es el menu con el que elegir el ejercicio a hacer. introduce el numero de ejercicio y se te mostrara. </marquee>
     * @see Entregapractica#main(java.lang.String[]) <br> Pincha aqui para ir a <mark>"Entrega Practica"</mark></br>
     * @see Fast#main(java.lang.String[])<br> pincha aqui para ir a <mark>"Juego Fast"</mark></br>
     * 
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ejercicio;
        int matriz[][] = null;


        do {
            System.out.println("Introduce el ejercicio que quieres ver: \n"
                    + "Ejercicio 1 (obligatorio)\n"
                    + "Ejercicio 2\n"
                    + "Ejercicio 3\n"
                    + "Ejercicio 4\n"
                    + "Ejercicio 5\n"
                    + "Ejercicio 6\n"
                    + "Ejercicio 7\n"
                    + "Ejercicio 8\n"
                    + "Ejercicio 9\n"
                    + "Ejercicio 10\n"
                    + "Ejercicio 11\n"
                    + "Ejercicio 12\n"
                    + "Salir 13");
            ejercicio = sc.nextInt();

            switch (ejercicio) {
                case 1:
                    matriz = Ejercicio1(matriz);
                    break;
                case 2:
                    Ejercicio2(matriz);
                    break;
                case 3:
                    Ejercicio3(matriz);
                    break;
                case 4:
                    Ejercicio4(matriz);
                    break;
                case 5:
                    Ejercicio5(matriz);
                    break;
                case 6:
                    Ejercicio6(matriz);
                    break;
                case 7:
                    Ejercicio7(matriz);
                    break;
                case 8:
                    Ejercicio8(matriz);
                    break;
                case 9:
                    Ejercicio9(matriz);
                case 10:
                    Ejercicio10(matriz);
                    break;
                case 11:
                    Ejercicio11(matriz);
                    break;
                case 12:
                    Ejercicio12(matriz);
                    break;




            }
        } while (ejercicio != 13);

    }

    /**
     * Pide al usuario el alto y el ancho de una matriz y la rellena con numeros aleatorios del -100 al 100 incluidos.
     * @param tabla
     * @return
     */
    public static int[][] Ejercicio1(int[][] tabla) {
        Scanner sc = new Scanner(System.in);
        Random r = new Random();
        int alto;
        int ancho;

        System.out.println("Introduce primero el alto y despues el ancho de la matriz y se asignará un numero aleatorio a la matriz");
        alto = sc.nextInt();
        ancho = sc.nextInt();
        tabla = new int[alto][ancho];

        for (int i = 0; i < alto; i++) {

            for (int j = 0; j < ancho; j++) {
                tabla[i][j] = r.nextInt(201) - 100;
                //System.out.println("la tabla queda" + i + "en el alto y " + j + " en el ancho");
            }
        }

        return tabla;

    }

    /**
     * Saca por pantalla toda la matriz
     * @param tabla
     */
    public static void Ejercicio2(int[][] tabla) {

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                System.out.println("En la posicion " + i + " es el alto y la posicion " + j + " es el ancho = " + tabla[i][j]);

            }
        }

    }

    /**
     * Sacar por pantalla solo una fila o columna que te de el usuario.
     * @param tabla
     */
    public static void Ejercicio3(int[][] tabla) {
        Scanner sc = new Scanner(System.in);
        int opcion, alto, ancho;
        System.out.println("Introduce una opcion \n"
                + "1.Fila \n"
                + "2.Columna\n");

        opcion = sc.nextInt();
        alto = sc.nextInt();
        ancho = sc.nextInt();
        if (opcion == 1) {
            for (int i = 0; i < tabla.length; i++) {
                System.out.println("las filas son " + tabla[alto][0]);

            }
            while (opcion != 1) {
                for (int i = 0; i < tabla.length; i++) {
                    System.out.println("Las columnas son  " + tabla[0][ancho]);
                }
            }
        }



    }

    /**
     * Calcular la media de todos los numeros de la matriz.
     * @param tabla
     */
    public static void Ejercicio4(int[][] tabla) {
        //4. Calcular la media de todos los numeros de la matriz.

        int suma = 0;
        int media;
        int numerototal = 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla.length; j++) {
                suma = suma + tabla[i][j];

                numerototal = (i + 1) * (j + 1);
            }


        }
        media = suma / numerototal;
        System.out.println("La media de todos los numeros de la matriz es : " + media);
    }

    /**
     *Calcula la media de los numeros negativos de la matriz y de los positivos.
     * @param tabla
     */
    public static void Ejercicio5(int[][] tabla) {
        int sumaNeg = 0;
        int sumaPos = 0;
        int numeroElementosPos = 0;
        int numeroElementosNeg = 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                if (tabla[i][j] < 0) {
                    sumaNeg = sumaNeg + tabla[i][j];
                    numeroElementosNeg++;
                } else {
                    sumaPos = sumaPos + tabla[i][j];
                    numeroElementosPos++;
                }
            }
        }
        int mediaPos = sumaPos / numeroElementosPos;
        int mediaNeg = sumaNeg / numeroElementosNeg;
        System.out
                .println("La media de los numeros positivos de la matriz es: "
                + mediaPos);
        System.out
                .println("La media de los numeros negativos de la matriz es: "
                + mediaNeg);
    }

    /**
     * Calcula la suma de los numeros de la diagonal de la matriz, esto solo se hace si la matriz es cuadrada, en caso contrario dar un error.
     * @param tabla
     */
    public static void Ejercicio6(int[][] tabla) {
        //6. Calcular la suma de los numeros de la diagonal de la matriz, esto solo se hace si la matriz es cuadrada, en caso contrario dar un error.

        // Comprobamos que la matriz es cuadrada
        if (tabla.length != tabla[0].length) {
            // Si no es cuadrada, error
            System.err.println("ERROR !!! Introduce una matriz cuadrada !!!");
        } else {
            int suma = 0;
            for (int i = 0; i < tabla.length; i++) {
                suma = suma + tabla[i][i];
            }
            System.out.println("La suma de los numeros de la diagonal de la matriz: " + suma);
        }
    }

    /**
     * Mirar cuantos numeros son primos dentro de la matriz.
     * @param tabla
     */
    public static void Ejercicio7(int[][] tabla) {
        //7. Mirar cuantos numeros son primos dentro de la matriz.
        int numeroPrimos = 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                int numero = tabla[i][j];
                if (numero < 0) {
                    numero = numero * (-1);
                }
                boolean esPrimo = true;

                // Divido por todos los numeros positivos menores que el excepto
                // 1
                for (int divisor = 2; divisor < numero; divisor++) {
                    // Si es divisible por el divisor, no es primo
                    if (numero % divisor == 0) {
                        esPrimo = false;
                    }
                }

                if (esPrimo) {
                    numeroPrimos++;
                    System.out.println("He encontrado el numero primo "
                            + tabla[i][j] + " en la posicion [" + i + "][" + j
                            + "]");
                }
            }
        }
        System.out.println("El numero de numeros primos de la matriz es: "
                + numeroPrimos);
    }

    /**
     * Mirar cuantos numeros de la matriz son divisibles entre 3 y 2, a la vez.
     * @param tabla
     */
    public static void Ejercicio8(int[][] tabla) {
        int numeroDivisibles = 0;
        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[i].length; j++) {
                int numero = tabla[i][j];
                // Cualquier numero divisible por 2 y 3 a la vez, es divisible
                // por 6
                if (numero % 6 == 0) {
                    numeroDivisibles++;
                    System.out
                            .println("He encontrado el numero divisible entre 2 y 3: "
                            + tabla[i][j]
                            + " en la posicion ["
                            + i
                            + "][" + j + "]");
                }
            }
        }
        System.out.println("El numero de numeros primos de la matriz es: "
                + numeroDivisibles);
    }

    /**
     *Sumar un numero a una posición concreta de la matriz dada por el usuario.
     * @param tabla
     */
    public static void Ejercicio9(int[][] tabla) {

        Scanner scanner = new Scanner(System.in);

        int sumando = 0;
        System.out.println("Introduzca el numero a sumar");
        sumando = scanner.nextInt();

        int numfila = 0;
        do {
            System.out.println("Introduzca el numero de fila (1 - "
                    + tabla.length + ")");
            numfila = scanner.nextInt();
        } while (numfila < 1 || numfila > tabla.length);

        int numcolumna = 0;
        do {
            System.out.println("Introduzca el numero de columna (1 - "
                    + tabla[0].length + ")");
            numcolumna = scanner.nextInt();
        } while (numcolumna < 1 || numcolumna > tabla[0].length);

        int valorInicial = tabla[numfila - 1][numcolumna - 1];
        tabla[numfila - 1][numcolumna - 1] = valorInicial + sumando;

        System.out.println("valorInicial: " + valorInicial + " valor Final: "
                + tabla[numfila - 1][numcolumna - 1]);
    }

    /**
     * Invertir una fila dada por el usuario de la matriz (cambiar posiciones de izq a drcha)
     * @param tabla
     */
    public static void Ejercicio10(int[][] tabla) {
        Scanner scanner = new Scanner(System.in);

        int numfila = 0;
        do {
            System.out.println("Introduzca el numero de fila (1 - "
                    + tabla.length + ")");
            numfila = scanner.nextInt();
        } while (numfila < 1 || numfila > tabla.length);

        int[] fila = tabla[numfila - 1];
        int[] filaInvertida = new int[tabla[0].length];
        for (int i = 0; i < fila.length; i++) {
            filaInvertida[fila.length - i - 1] = fila[i];
        }
        tabla[numfila - 1] = filaInvertida;
    }

    /**
     *Invertir una columna dada por el usuario. 
     * @param tabla
     */
    public static void Ejercicio11(int[][] tabla) {

        Scanner scanner = new Scanner(System.in);

        int numcolumna = 0;
        do {
            System.out.println("Introduzca el numero de columna (1 - "
                    + tabla[0].length + ")");
            numcolumna = scanner.nextInt();
        } while (numcolumna < 1 || numcolumna > tabla[0].length);

        for (int i = 0; i < tabla.length / 2; i++) {
            int elemento = tabla[i][numcolumna - 1];
            tabla[i][numcolumna - 1] = tabla[tabla.length - i - 1][numcolumna - 1];
            tabla[tabla.length - i - 1][numcolumna - 1] = elemento;

        }
    }

    /**
     * Invertir toda la matriz, primero todas las filas y luego todas las columnas.
     * @param tabla
     */
    public static void Ejercicio12(int[][] tabla) {
    }
}
