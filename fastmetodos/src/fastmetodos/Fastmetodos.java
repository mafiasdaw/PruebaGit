/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package fastmetodos;

import java.util.Scanner;
import java.util.ArrayList;


/**
 *
 * @author Max
 */
public class Fastmetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner sc2 = new Scanner(System.in);
        ArrayList<Jugador>jugadores=new ArrayList<Jugador>();
        System.out.println("¿ Que distancia quieres en la pista ? ");
        int pista=sc2.nextInt();
        tablero t=new tablero(pista);
        
       
        System.out.println("Cuantos jugadores van a jugar: ");
        int numJug = sc2.nextInt();//n veces
        
        //añadir jugadores
        for (int i = 0; i < numJug; i++) {
          
          System.out.println("Nombre del jugador: ");
          String nombre=sc2.next();
          Jugador jug=new Jugador(nombre);
          jugadores.add(jug);
          System.out.println("Jugador creado...");
            
        }
        //Tirar dado cada jugador
        
        for (int i = 0; i < jugadores.size(); i++) {
            
            int posicion=(jugadores.get(i).getPosicion())+(jugadores.get(i).TirarDadoNitro());
            
                do{
                        if (jugadores.get(i).getPosicion()<pista)
                            System.out.println("El jugador "+jugadores.get(i)+ " esta en la posicion "+jugadores.get(i).getPosicion()+" de la longitud total: "+pista);
                        
                        if(jugadores.get(i).getPosicion()>pista)//comprobar final de carrera y asignar oro
                            System.out.println("!! Enhorabuena, ha ganado la carrera !!");
                            for (int j = 0; j < jugadores.size(); j++) {
                                if(jugadores.get(i).getPosicion()>pista)
                                    jugadores.get(j).getOro()+(numJug);
                            
                    }
                            jugadores.get(i).setOro(jugadores.size());//asi solo se da oro tanto como sea el arraylist, pero los demas jugadores..??
                            System.out.println(jugadores.get(i).getOro());
                } while (jugadores.get(i).getPosicion() < pista);  
        }
    
    
    
    
    
    
    
    
    
    
                
                
            
                    
                
            
            
            
            
            
        
        
    
    
    
       
        
        
        
        
    

