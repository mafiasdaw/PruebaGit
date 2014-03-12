/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

import java.util.Random;

/**
 *
 * @author Max
 */

    public class Coche {

    private Motor motor;
    private String marca;
    private String modelo;
    private double precio;
    
    
    public Motor getMotor() {
        return motor;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public double getPrecio() {
        return precio;
    }

    public Coche(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
        this.motor=new Motor(0);
    }

    public void acumulaAveria() {

        Random random = new Random();
        double averia = this.precio + Math.random() * 1000;
        this.precio = averia;

    }
    }
    
