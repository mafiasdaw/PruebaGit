/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediateca;

/**
 *
 * @author Max
 */
public abstract class Soporte {
    String Titulo;
    String Autor;

    public Soporte() {
    }

    public Soporte(String Titulo, String Autor) {
        this.Titulo = Titulo;
        this.Autor = Autor;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }
    
    
    
}
