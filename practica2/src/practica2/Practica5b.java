/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author Max
 */
public class Practica5b {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
        Asignatura Matematicas= new Asignatura(1);
        Asignatura Fisica=new Asignatura(2);
        Asignatura Quimica= new Asignatura(3);
        
        Alumno alumno= new Alumno(Matematicas, Fisica, Quimica);
        
        Profesor profesor=new Profesor();
        profesor.ponerNotas(alumno);
        
        System.out.println("El alumno: "+alumno+" tiene las siguientes notas: ");
        System.out.println("Matematicas: "+ alumno.getMatematicas().getCalificacion());
        System.out.println("Fisica: "+alumno.getFisica().getCalificacion());
        System.out.println("Quimica: "+alumno.getQuimica().getCalificacion());
        System.out.println("-------------------------------------------------");
        System.out.println("La media total del alumno es: "+profesor.calcularMedia(alumno));
               
        
    }
}
