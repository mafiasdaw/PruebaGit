/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Poo;

/**
 *
 * @author Max
 */
public class Hora {
    
    int hora;
    int minuto;

    public Hora(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
    }

    public int getHora() {
        return hora;
    }
--
    public int getMinuto() {
        return minuto;
    }

    public void setHora(int hora) {
        this.hora = hora;
    }

    public void setMinuto(int minuto) {
        this.minuto = minuto;
    }
    
    
}
