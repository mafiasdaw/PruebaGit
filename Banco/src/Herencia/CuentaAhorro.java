/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

/**
 *
 * @author Max
 */
public class CuentaAhorro extends CuentaCorriente {
    private double interes;

    public CuentaAhorro(double interes, String numeroCuenta, double saldo, Titular titular) {
        super(numeroCuenta, saldo, titular);
        this.interes = interes;
    }

    public CuentaAhorro(String numeroCuenta, double saldo, Titular titular) {
        super(numeroCuenta, saldo, titular);
    }

    public double getInteres() {
        return interes;
    }

    public void calcularinteres(){
        
        double interestotal= (getSaldo()* this.interes) /100;
        System.out.println("El interes al: "+this.interes + "del importe: " +getSaldo()+ " es: "+interestotal);
    }

   
    
    
    
}
