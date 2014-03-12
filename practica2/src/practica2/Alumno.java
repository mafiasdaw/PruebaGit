/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica2;

/**
 *
 * @author Max
 */
public class Alumno {
    
    private Asignatura Matematicas;
    private Asignatura Fisica;
    private Asignatura Quimica;

    public Alumno(Asignatura Matematicas, Asignatura Fisica, Asignatura Quimica) {
        this.Matematicas = Matematicas;
        this.Fisica = Fisica;
        this.Quimica = Quimica;
    }

    public Alumno(int Matematicas, int Fisica, int Quimica) {
        this.Matematicas = new Asignatura(Matematicas);
        this.Fisica = new Asignatura(Fisica);
        this.Quimica = new Asignatura(Quimica);
    }

    public Asignatura getMatematicas() {
        return Matematicas;
    }

    public Asignatura getFisica() {
        return Fisica;
    }

    public Asignatura getQuimica() {
        return Quimica;
    }
    
    
}
