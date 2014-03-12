/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Max
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      
            Titular Arturo=new Titular("Arturo", "Navarrete");
            Titular Raul=new Titular("Raul", "Navarrete");
        
           CuentaCorriente cuenta1=new CuentaCorriente("123456789", 500,Arturo );
           CuentaCorriente cuenta2=new CuentaCorriente("987654321", 200, Raul);
           
           System.out.println("El numero de cuenta de Arturo es: "+cuenta1.getNumeroCuenta()
                   +" con saldo: "+cuenta1.getSaldo()
                   
                   +" y el de Raul: "+cuenta2.getNumeroCuenta()
                   +"con saldo: "+cuenta1.getSaldo());
           
           
        
           
        
    }
}
