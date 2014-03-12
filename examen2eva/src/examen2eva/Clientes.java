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
public class Clientes {
    private String DNI;
    private String nombre;
    
    public Clientes() {
    }

    public Clientes(String DNI, String nombre) {
        this.DNI = DNI;
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public String getNombre() {
        return nombre;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    Scanner sc4=new Scanner(System.in);
    ArrayList<Clientes> cliente=new ArrayList<Clientes>();
    
    public void DarAltaCliente(){
        System.out.println("Cuantos clientes vas a dar de alta?");
        int numclientes=sc4.nextInt();
        for (int i = 0; i < numclientes; i++) {
             System.out.println("Introduzca nombre: ");
             this.nombre=sc4.next();
             System.out.println("DNI: ");
             this.DNI=sc4.next();
             
             Clientes clientenuevo=new Clientes(DNI, nombre);
             cliente.add(clientenuevo);
             System.out.println("Cliente creado...");
             
        }
    }
       public void CompraCliente(){
           for (int i = 0; i < 10; i++) {
                System.out.println("El cliente "+cliente.get(i).getNombre());
           }
          
           
           
           
       }
        
    }
    

