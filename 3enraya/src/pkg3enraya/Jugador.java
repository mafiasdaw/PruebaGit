/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg3enraya;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Jugador {
    
      
    private String Nombre;
    private String TipoFicha;
    
    Scanner sc = new Scanner(System.in);
    
    public void PedirNombre(){
        
        
        System.out.println("Introduce el nombre del jugador:");
        this.Nombre=sc.next();
    }
    public void PedirFicha(){
        System.out.println("Indica que ficha vas a usar:"
                + "X"
                + "O");
        TipoFicha = sc.next();
        if (TipoFicha != "X" && TipoFicha != "O" )
            System.out.println("Introduce una ficha valida");
        
        else {
            System.out.println("El jugador: "+ this.Nombre+" tiene la ficha: "+ TipoFicha);
        }
        
    }
    public Jugador(){
        this.TipoFicha = TipoFicha;
        }
    public void Ganador(){
        System.out.println("!!! Enhorabuena, el jugador "+Nombre+" ha ganado la partida !!!");
       }
    
    public void MostrarNombre(){
        
        System.out.println("El nombre es: "+this.Nombre);
    }
}
//    public void Ponficha(Tablero tablero){
//        do {
//            Coordenada c = new Coordenada();
//            System.out.println("indica en que fila y columna quieres poner la ficha: ");
//            c.RecogerTeclado();
//        }
        
        
    


