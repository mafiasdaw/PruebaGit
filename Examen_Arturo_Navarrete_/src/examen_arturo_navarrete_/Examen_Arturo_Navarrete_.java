/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen_arturo_navarrete_;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Examen_Arturo_Navarrete_ {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int ejercicio;
        System.out.println("Introduce num ejercicio");
        ejercicio=sc.nextInt();
        switch (ejercicio){
            case 1:
                   Ejercicio1();
                           break;
            case 2:
                    ejercicio2();
                break;
            case 3: 
                Ejercicio3();
                break;
            case 4:
                Ejercicio4();
                break;
            case 5: 
                Ejercicio5();
                break;
                
                
        }
        
        
        
        
    }
    public static void Ejercicio4(){
              //Ejercicio 4 
        //4. Rellena una matriz de 10 por 10 con numeros aleatorios, 
        //calcula la media de todos los valores de la matriz.

     
        Random r = new Random();
        int anchoi=10;
        int tabla[][]=new int [anchoi][10];
       
        int media = 0;
        int suma = 0;
        int numerototal = 0;
        System.out.println("Se asignará un numero aleatorio en el alto y ancho de la matriz");


       

        for (int i = 0; i < tabla.length; i++) {
            for (int j = 0; j < tabla[0].length; j++) {
                tabla [i][j]= r.nextInt(6)+1;
                suma = suma + tabla[i][j];

                numerototal++;
            }
            media = suma / numerototal;
        }
        System.out.println("La media de todos los numeros de la matriz es: " + media);
    }
    
  

    public static void Ejercicio3() {
        //Un empresario necesita un programa para calcular lo que se gasta su empresa en sueldos 
//de manera anual para ver si hace un ERE o no.Existen 3 categorias, jefe, ingeniero y mindundi. 
//El empresario te dira cuantos hay en su empresa de cada tipo, cual es el sueldo en su empresa al mes, 
//y tendras que decirle lo que se gasta en sueldos al año. El empresario tb te dira lo que gana al año, 
//y el programa le dira si hace falta el ERE o no, dependiendo de si lo que gana es menos que lo que gasta.

        Scanner sc = new Scanner(System.in);
        System.out.println("Bienvenido al sistema de gestion de su empresa");
        int numjefe;
        int jefe;
        int numingeniero;
        int ingeniero;
        int mindundi;
        int nummindundi;
        int sueldoanual;
        int gananciaanual;
        //introduccion de datos
        //jefes y numjefes
        System.out.println("Introduzca el numero de jefes de su empresa:");
        numjefe = sc.nextInt();
        System.out.println("Introduzca el sueldo de cada jefe al mes");
        jefe = sc.nextInt();
        //ingenieros y numingenieros
        System.out.println("Introduzca el numero de ingenieros de su empresa");
        numingeniero = sc.nextInt();
        System.out.println("El sueldo del ingeniero");
        ingeniero = sc.nextInt();
        //minundis
        System.out.println("Numero de mindundis");
        nummindundi = sc.nextInt();
        System.out.println("Sueldo de los mindundis");
        mindundi = sc.nextInt();
        //operaciones
        System.out.println("Señor empresario, ¿ cuanta es la ganacia anual de su empresa? ");
        gananciaanual = sc.nextInt();
        sueldoanual = (jefe * numjefe) + (ingeniero * numingeniero) + (mindundi * nummindundi) * 12;
        if (sueldoanual > gananciaanual) {
            System.out.println("Es necesario hacer un ERE a la empresa, gasta mas de lo que gana!!!");
        } else if (gananciaanual > sueldoanual) {
            System.out.println(" !!!!Enhorabuena, estas ganando dinero !!!!");
        }
    }

    public static void Ejercicio5() {
//       5. Calcula el numero de veces que tendrás que tirar un dado de 6 caras, para que la suma de las tiradas llegue a 100.  
//Para hacerlo bien, realiza el calculo 1000 veces y calcula la media de las 1000 veces. 
        Random r = new Random();
        int dado;
         dado=r.nextInt(6);
        if (dado < 1000) {
        
                
                
                
            }
        }
    

    public static void Ejercicio1() {

// 1. Teniendo en cuenta los numeros primos entre dos numeros pedidos por teclado, 
//indicar cual es el primero que cumple que su suma y la 
//de todos sus antecesores (teniendo en cuenta solo el intervalo de numeros dado) es mayor que 100. 
        //Ej. primos entre 10 y 20, el 17, seria 17+13+11, 
//no se cuenta para la suma ni el 7 ni menores por ser menores a 10.
        Scanner sc = new Scanner(System.in);
        int i;//dividendo
        int j;//divisores
        int resto;
        System.out.println("Introduce intervalos de numeros, primero el minimo y despues el maximo");
        System.out.println("Minimo");
        i = sc.nextInt();//20
        System.out.println("Maximo");
        j = sc.nextInt();//40
    for (i =0; i < 100; i++) {
                                                    //ciclo para recorrer los numeros hasta el num 100
            resto = 0;                              //variable para contar cuantas veces es el resto de dividir es 0
            for (j = 1; j < 100; j++) {             //ciclo para recorrer los numeros hasta el  100 (estos seran los divisores)
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
    
    public static void ejercicio2(){
//        2. Se pide por teclado un intervalo de numeros mayores que 0, y una serie de numeros indeterminados, 
//los que quiera el usuario, coger numeros hasta que el usuario ponga uno negativo. 
//Una vez acabado de meter numeros sacar por pantalla los numeros
// del intervalo que NO haya puesto.
        Scanner sc= new Scanner(System.in);
        
        int numeros[]=new int [100];
        for (int i = 0; i < 100 ; i++) {
            System.out.println("Introduce numeros");
            numeros[i]=sc.nextInt();
            sc.nextLine();
            
            
            if (numeros[i] > 100){
                System.out.println("Numero fuera de rango");
            } else if ( numeros [] < 0 ){
            int numtotal=100;
            numeros[i]= numeros[i]-numtotal;
            System.out.println("Estos son los numero que no has introducido: " + numtotal);
                
                
            }
        }
        
        
        
    }
}
