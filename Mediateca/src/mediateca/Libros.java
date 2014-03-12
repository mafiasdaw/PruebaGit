/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediateca;

/**
 *
 * @author Max
 */
public class Libros extends Soporte {
   
    private int numPaginas;
    private String ISBN;

    @Override
    public String toString() {
        return "Libros{" + "numPaginas=" + numPaginas + ", ISBN=" + ISBN + '}';
    }

    public Libros(int numPaginas, String Titulo, String Autor, String ISBN) {
        super(Titulo, Autor);
        this.ISBN= ISBN;
        this.numPaginas = numPaginas;
    }

    public int getNumPaginas() {
        return numPaginas;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }

    public void setNumPaginas(int numPaginas) {
        this.numPaginas = numPaginas;
    }
    
    

   
    
    
}
