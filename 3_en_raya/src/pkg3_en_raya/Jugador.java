/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3_en_raya;

/**
 *
 * @author Max
 */
public class Jugador {
    
    private String nombre;
    private String tipoFicha;
    private Ficha fichas[];

    public Jugador(String nombre, String tipoFicha, Ficha[] fichas) {
        this.nombre = nombre;
        this.tipoFicha = tipoFicha;
        fichas= new Ficha[3];
    }
    public Ficha hayFichalibre(){
        Ficha ficha=null;
        for (int i = 0; i < 3; i++) {
            if (this.fichas[i]==null)
            {
                fichas[i]= new Ficha(this.tipoFicha);
                ficha=fichas[i];
            }
            
        }
        return ficha;
    }
    public Ficha encuentraFicha (Posicion posicion)
    {
        Ficha ficha=null;
        for (int i = 0; i < 3; i++) {
            if (fichas[i].getPosicion().equals(posicion)){
                ficha=fichas[i];
                i=3; //es para que se salga del bucle, mirar la condicion.
            }
            
        }
        return null;
    }
    public boolean ganador ()
    {
        
        return false;
    }
    
}
