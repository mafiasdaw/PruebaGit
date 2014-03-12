/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_en_raya;

/**
 *
 * @author Max
 */
public class Ficha {
    
    private Posicion posicion;

    public Ficha(String tipoFicha) {
      
        this.tipoFicha = tipoFicha;
    }

    public void setPosicion(Posicion posicion) {
        this.posicion = posicion;
    }

    public void setTipoFicha(String tipoFicha) {
        this.tipoFicha = tipoFicha;
    }

    public Posicion getPosicion() {
        return posicion;
    }

    public String getTipoFicha() {
        return tipoFicha;
    }
    private String tipoFicha;

public String mostrar()
{
    return this.tipoFicha;
}
}