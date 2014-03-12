/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package examen2eva;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Almacenes extends Productos {// almacen toma como propiedad los atributos de las clase productos
    private String nombreAlmacen;
    private String situacionAlmacen;
    private int costeEnvio;

    public Almacenes(String nombreAlmacen, String situacionAlmacen, int costeEnvio) {
        this.nombreAlmacen = nombreAlmacen;
        this.situacionAlmacen = situacionAlmacen;
        this.costeEnvio = costeEnvio;
    }

    public Almacenes() {
    }

    

    public String getNombreAlmacen() {
        return nombreAlmacen;
    }

    public String getSituacionAlmacen() {
        return situacionAlmacen;
    }

    public double getCosteEnvio() {
        return costeEnvio;
    }

    public void setNombreAlmacen(String nombreAlmacen) {
        this.nombreAlmacen = nombreAlmacen;
    }

    public void setSituacionAlmacen(String situacionAlmacen) {
        this.situacionAlmacen = situacionAlmacen;
    }

    public void setCosteEnvio(int costeEnvio) {
        this.costeEnvio = costeEnvio;
    }
    Scanner sc1=new Scanner(System.in);
    ArrayList<Almacenes> almacenArray= new ArrayList<Almacenes>();
   
    public void DarAltaAlmacen(){
        
        int numalmacen;
                    System.out.println("Cuantos almacenes vas a dar de alta?");
                    numalmacen = sc1.nextInt();
                    for (int i = 0; i < numalmacen; i++) {
                        System.out.println("Introduzca nombre del almacen: ");
                        this.nombreAlmacen= sc1.next();
                        System.out.println("Introduzca localidad del almacen: ");
                        this.situacionAlmacen= sc1.next();
                        System.out.println("Introduzca coste de envio desde ese almacen: ");
                        this.costeEnvio= sc1.nextInt();

                        Almacenes almacen=new Almacenes(nombreAlmacen, situacionAlmacen, costeEnvio);
                        almacenArray.add(almacen);
                        System.out.println("Almacen guardado...");
    }
                    
     
    
}
    
   public void Mostrarproductos(){
       
       for (int i = 0; i < productos.size(); i++) {
            System.out.println("En el almacen "+almacenArray.get(i).getNombre()+ " hay estos productos: "+productos.get(i).getNombre());
       }
      
       
   }
}
