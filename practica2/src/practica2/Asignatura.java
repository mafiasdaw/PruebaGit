/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author Max
 */
public class Asignatura {
    
    private int identificador;
    private double calificacion;
    
   
   public Asignatura(int identificador) {
        this.identificador = identificador;
        
    }

    public int getIdentificador() {
        return identificador;
    }

    public double getCalificacion() {
        return calificacion;
    }

    public void setIdentificador(int identificador) {
        this.identificador = identificador;
    }

    public void setCalificacion(double calificacion) {
        this.calificacion = calificacion;
    }
   
    
}
