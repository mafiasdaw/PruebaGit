/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author Max
 */
public class Practica5c {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
   
        Garaje g=new Garaje();
Coche Seat=new Coche(" Seat"," Ibiza");
Coche Opel=new Coche(" Opel "," Astra");
g.aceptarCoche(Seat, "aceite");
g.devolverCoche();
g.aceptarCoche(Opel, "aceite");
g.devolverCoche();
g.aceptarCoche(Seat, "aceite");
g.devolverCoche();
g.aceptarCoche(Opel, "aceite");
g.devolverCoche();

 System.out.println("El precio de la reparacion es: "+Seat.getPrecio()+" €");
 System.out.println("El precio de la reparacion es: "+Opel.getPrecio()+" €");
 System.out.println("Al vehiculo: "+Seat.getModelo()+" se le ha puesto"+Seat.getMotor().getLitros()+" litros");
 System.out.println("Al vehiculo: "+Opel.getModelo()+" se le ha puesto"+Opel.getMotor().getLitros()+" litros");
 System.out.println("Nº de coches atendidos: "+g.contadorCochesReparados+" coches.");

        
        

        
        
  
    
        
        
        
        
        
        
        
        
        
        
        
        
    }
}
