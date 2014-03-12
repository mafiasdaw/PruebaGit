/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

import java.util.Random;

/**
 *
 * @author Max
 */
public class Profesor {
    
    
    public void ponerNotas(Alumno alumno){
        
       Random r= new Random();
      alumno.getMatematicas().setCalificacion(r.nextDouble()*10) ;
      alumno.getFisica().setCalificacion(r.nextDouble()*10);
      alumno.getQuimica().setCalificacion(r.nextDouble()*10);
    }
    public double calcularMedia (Alumno alumno){
        double media=(alumno.getFisica().getCalificacion()+alumno.getMatematicas().getCalificacion()+alumno.getQuimica().getCalificacion())/3;
              
            return media;
    }
}
