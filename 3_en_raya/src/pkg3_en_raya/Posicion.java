/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_en_raya;

/**
 *
 * @author Max
 */
public class Posicion {
    int fila,columna;
    
    public Posicion( int fila, int columan){
        this.fila=fila;
        this.columna=columna;
        
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(int columna) {
        this.columna = columna;
    }

    public int getFila() {
        return fila;
    }

    public int getColumna() {
        return columna;
    }
}
