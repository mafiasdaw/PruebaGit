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
public class Productos {
 private String nombre;
 private String descripcion;
 private double precio;
 private int cantidad;
 private String TipoAzul;
 private String TipoRojo;

    public Productos(String nombre, String descripcion, double precio, int cantidad) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }

    public Productos() {
    }
    

    

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public double getPrecio() {
        return precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public String getTipoAzul() {
        return TipoAzul;
    }

    public String getTipoRojo() {
        return TipoRojo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public void setTipoAzul(String TipoAzul) {
        this.TipoAzul = TipoAzul;
    }

    public void setTipoRojo(String TipoRojo) {
        this.TipoRojo = TipoRojo;
    }
    Scanner sc3=new Scanner (System.in);
    ArrayList<Productos> productos=new ArrayList <Productos>();
   
    
    
    public void DardeAltaProducto(){
     
     int numproductos;
                    System.out.println("Cuantos productos vas a registrar: ");
                    numproductos=sc3.nextInt();
                    for (int i = 0; i < numproductos; i++) {
                        System.out.println("Nombre del producto: ");
                        this.nombre=sc3.next();
                        System.out.println("Descripcion del producto: ");
                        this.descripcion=sc3.next();
                        System.out.println("Precio: ");
                        this.precio=sc3.nextDouble();
                        System.out.println("Cantidad a registar: ");
                        this.cantidad=sc3.nextInt();
                        Productos prod=new Productos(nombre, descripcion, precio, cantidad);
                        productos.add(prod);
                        System.out.println("Producto/s creados...");
                        
                    }
                    
 }
    public int aumentarstock(){
        
        System.out.println("Introduce cantidad a añadir:");
        int num=sc3.nextInt();
        this.cantidad=num+this.cantidad;
        return cantidad;
    }
    
 
}
