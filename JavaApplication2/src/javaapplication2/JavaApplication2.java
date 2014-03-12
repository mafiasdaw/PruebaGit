/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

/**
 *
 * @author Max
 */
public class JavaApplication2 {

    /**
     * @param args the command line arguments
     */}
    public static void main(String[] args) {
        // TODO code application logic here
        int ejercicio = 0;
        do {


            System.out.println("Seleccione opción");
            System.out.println("1: Ejercicio 1 \n"
                    + "2: Ejercicio 2 \n"
                    + "3: Ejercicio 3 \n"
                    + "4: Ejercicio 4 \n"
                    + "5: Ejercicio 5 \n"
                    + "6: Ejercicio 6 \n"
                    + "7: Ejercicio 7 \n"
                    + "8: Ejercicio 8 \n"
                    + "9: Ejercicio 9 \n"
                    + "10: Ejercicio 10 \n"
                    + "11: Ejercicio 11 \n"
                    + "12: Salir");
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
        } while (ejercicio != 12);
    

    public static void ejercicio1() {
        System.out.println("la resolución del ejercicio es:");
        for (int valor = 531; valor <= 540; valor++) {
            System.out.println(valor);
        }
    }

    public static void ejercicio2() {

        int numero=0;
        int suma=0;
       do {
          numero++;
          suma=suma+numero;
                  
       }while(suma<125);
       System.out.println(numero);
            
    }

    public static void ejercicio3() {
        int numero;

        System.out.println("los multipolos de 5 son");
        for (int multiplo=1; multiplo <= 20; multiplo++){
        numero=5*multiplo;
               System.out.println(numero); }
        
    }

    public static void ejercicio4() {
        int numeros[] = new int[15];
        int media = 0;
        int suma = 0;
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < 15; i++) {
            System.out.println("Dame los numeros ");
            numeros[i] = scanner.nextInt();
            suma += numeros[i];

        }
        System.out.println("El total es " + suma);
        media = suma / 15;
        System.out.println("La media es " + media);
    }

    public static void ejercicio5() {
        int numvariables;
        Scanner scanner= new Scanner(System.in);
        System.out.println("Dame el numero de variables");
        numvariables=scanner.nextInt();
        int numeros[]= new int [numvariables];
       
    for (int i=0; i < numvariables; i++)
    {
        System.out.println("dame los numeros"+ (i+1));
    numeros [i]=scanner.nextInt();
    }
    int media=0;
    for (int i=0; i < numeros.length; i++)
    {media+=numeros[i];
    }
        System.out.println("El total de la suma es: "+media);
    media= media / numvariables;
        System.out.println("La media es: "+media);
    }

    public static void ejercicio6() {
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
        System.out.println("el resultado en minutos es:"+minutos);
    }

    public static void ejercicio7() {
        int horas;
        int minutos;
        int segundos;
      Scanner scanner = new Scanner(System.in);
        System.out.println("introduce segundos");
       segundos = scanner.nextInt();
       horas=segundos/3600;
       segundos=segundos%3600;
       minutos=segundos/60;
       segundos=segundos%60;

       
        System.out.println("el resultado es\n" +horas+"\n"+minutos+"\n"+segundos);
        
    }

    public static void ejercicio8() {
        int numero[] = new int [9];
        System.out.println("dame numeros");
        for(int i=0;i<9;i++)
        {Scanner scanner=new Scanner(System.in);
        numero[i]=scanner.nextInt();
        }
        
       }

    public static void ejercicio9() {
        int numero;
        int factorial;
        Scanner scanner=new Scanner(System.in);
        Scanner scanner1=new Scanner(System.in);
        System.out.println("introduce un numero");
        numero=scanner.nextInt();
        System.out.println("introduce un factorial");
        factorial=scanner1.nextInt();
        while(numero!=0){
        factorial=factorial*numero;
        numero--;}
        System.out.println(factorial);
        
        
                
    }

    public static void ejercicio10() {
    }

    public static void ejercicio11() {
    }


    
            