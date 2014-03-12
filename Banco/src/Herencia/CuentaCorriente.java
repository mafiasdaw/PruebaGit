/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Herencia;

import java.util.Scanner;

/**
 *
 * @author Max
 */
public class CuentaCorriente {

         private Titular titular;
         private String numeroCuenta;
         private double saldo;
         Scanner sc=new Scanner(System.in);

    public CuentaCorriente() {
    }

    public CuentaCorriente(String numeroCuenta, double saldo,Titular titular) {
        this.numeroCuenta = numeroCuenta;
        this.saldo = 15.3;
        this.titular=titular;
    }
         
           
        
    public String getNumeroCuenta() {
        return numeroCuenta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    
    public void Ingresar (){
        System.out.println("Cantidad a ingresar: ");
        double ingreso=sc.nextDouble();
        this.saldo=this.saldo+ingreso;
        }
    public void Reintegro(){
        System.out.println("Cuanto a gastado: ");
        double gasto=sc.nextDouble();
        this.saldo=this.saldo-gasto;
        }
    public void MostrarCuenta(){
        System.out.println("Datos:"
                + "1.Numero de cuenta: "+this.numeroCuenta
                + "2.Saldo de cuenta: "+this.saldo);
    }
    public void Comparar(CuentaCorriente cuenta1,CuentaCorriente cuenta2){
        
        if(cuenta1 == cuenta2){
            System.out.println("Las cuentas son iguales");
        }else{
            System.out.println("Las cuentas son diferentes");
        }
        
    }

   
    
    
    
}
