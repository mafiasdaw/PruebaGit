/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediateca;
import java.util.ArrayList;
/**
 *
 * @author Max
 */
public class Socio {
    
    private String nombre;
    private String apellido;
    private String direccion;
    
    ArrayList <String> prestamos=new ArrayList <String>();

    public Socio(String nombre, String apellido, String direccion) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public String getDireccion() {
        return direccion;
    }

    public ArrayList<String> getPrestamos() {
        return prestamos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setPrestamos(ArrayList<String> prestamos) {
        this.prestamos = prestamos;
    }
    
    public void AddPrestamos(){
        if (prestamos.size() > 3) {
            System.out.println("Has alcanzado el limite maximo de prestamos");
            }else{}
        }
    public void RemovePrestamo(){
        
    }
    
    
}
