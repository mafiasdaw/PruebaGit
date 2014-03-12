/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediateca;

/**
 *
 * @author Max
 */
public class CD extends Soporte {
    
  
    private String musicos;
    private int duracionCD;

    public CD(String musicos, int duracionCD, String Titulo, String Autor) {
        super(Titulo, Autor);
        this.musicos = musicos;
        this.duracionCD = duracionCD;
    }

    public String getMusicos() {
        return musicos;
    }

    public int getDuracionCD() {
        return duracionCD;
    }

    public void setMusicos(String musicos) {
        this.musicos = musicos;
    }

    public void setDuracionCD(int duracionCD) {
        this.duracionCD = duracionCD;
    }

    @Override
    public String toString() {
        return "CD{" + "musicos=" + musicos + ", duracionCD=" + duracionCD + '}';
    }

    



}


