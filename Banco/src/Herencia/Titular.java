/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Max
 */
public class Titular {
    
    private String nombre;
    private String apellido;
    private int edad;


    public Titular(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
        
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }
public void DatosTitular(){
    System.out.println("Nombre: "+this.nombre
            +"Apellidos: "+this.apellido
            +"Edad: "+this.edad);
    
}
        
    }
    

