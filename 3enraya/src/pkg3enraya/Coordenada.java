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
public class Coordenada {
  private int fila;
  private int columna;
  
  public void RecogerTeclado(){
      
      Scanner sc= new Scanner(System.in);
      System.out.println("Introduce nº de fila: ");
      this.fila=sc.nextInt();
      System.out.println("Introduce nº de columna: ");
      this.columna=sc.nextInt();
      }
        
  public int fila(){
      return fila;
  }
  public int columna(){
      return columna;
  }
        
    }
    

