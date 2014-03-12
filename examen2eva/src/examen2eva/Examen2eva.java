/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2eva;

import java.util.Scanner;
import java.util.ArrayList;

/**
 *
 * @author Max
 */
public class Examen2eva {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int opcion;
        Almacenes alm = new Almacenes();
        Productos prod = new Productos();
        Clientes clie = new Clientes();
        descuentos des=new descuentos();
        Productos grapadora= new Productos("grapadora", "sirve para grapar", 12.0, 5);
        Productos impresora= new Productos("Impresora", "pá imprimir", 50.50, 8);
        Productos movil= new Productos("movil", "pá llamar o con el wacha", 200.60, 50);
        Productos bici=new Productos("bicicleta", "pa ir y venir", 40.60, 80);
        do {
            System.out.println("Introduce opcion a elegir:\n"
                    + "1.Dar de alta almacenes\n"
                    + "2.dar de alta productos\n"
                    + "3.Dar de alta descuentos\n"
                    + "4.Dar de alta clientes\n"
                    + "5.Añadir strock a un producto\n"
                    + "6.Comprar un producto por un cliente\n"
                    + "7.Mostrar todos los descuentos\n"
                    + "8.Mostrar todos los productos de un almacen\n"
                    + "9.Mostrar todos los productos\n"
                    + "10.Mostrar todos los productos que no tengan stock\n"
                    + "11.Mostrar todos los pagos de los clientes\n"
                    + "12.Mostrar la cantidad total pagada por cada cliente\n"
                    + "13.Mostrar todas las compras de la empresa.\n"
                    + "14.Mostrar todas las compras de un cliente determinado\n"
                    + "15......SALIR....");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    alm.DarAltaAlmacen();
                case 2:
                    prod.DardeAltaProducto();
                case 3:
                    des.PedirDescuentos();
                case 4:
                    clie.DarAltaCliente();
                case 5:
                    prod.aumentarstock();
                case 7:
                    des.MostrarDescuentos();
                case 8:
                    alm.Mostrarproductos();
                case 9:
                    for (int i = 0; i < prod.productos.size(); i++) {
                        System.out.println(prod.productos.get(i).getNombre());
                        }
                case 10:
                    
                    for (int i = 0; i < prod.productos.size(); i++) {
                        if (prod.productos.get(i).getCantidad()<=0)
                            System.out.println("El articulo: "+prod.productos.get(i).getNombre()+" esta fuera de stock");
                    }
                case 11:
                    
                    


            }
        } while (opcion != 15);

    }
}
