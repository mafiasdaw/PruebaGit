/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediateca;

/**
 *
 * @author Max
 */
public class DVD extends Soporte {
   
    private String actores;
    private int duracionDVD;

    @Override
    public String toString() {
        return "DVD{" + "actores=" + actores + ", duracionDVD=" + duracionDVD + '}';
    }
    

    public DVD(String actores, int duracionDVD, String Titulo, String Autor) {
        super(Titulo, Autor);
        this.actores = actores;
        this.duracionDVD = duracionDVD;
    }

    public String getActores() {
        return actores;
    }

    public int getDuracionDVD() {
        return duracionDVD;
    }

    public void setActores(String actores) {
        this.actores = actores;
    }

    public void setDuracionDVD(int duracionDVD) {
        this.duracionDVD = duracionDVD;
    }

   
    
    
}
