/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author Max
 */
public class Motor {  
    private int litros=0;
    private int cv;
    
    public int getLitros() {
        return litros;
    }

    public void setLitros(int litros) {
        this.litros = this.litros+litros;
    }

    public int getCv() {
        return cv;
    }

     public Motor(int cv) {
        this.cv = cv;
        this.litros=0;
    }
}
