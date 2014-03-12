/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package practica3;

/**
 *
 * @author Max
 */
public class Garaje {Coche coche;
    String averia;
    int contadorCochesReparados;

//• Tenga un método aceptarCoche que recibe un parámetro de tipo Coche y
//la avería asociada. El garaje solo podrá atender a un coche en cada
//momento. Si ya esta atendiendo uno, que devuelva un false.
    

public void aceptarCoche(Coche coche, String averia) {


        if (this.coche == null) {
            this.coche = coche;
            coche.acumulaAveria();
            contadorCochesReparados++;
            
            if (averia == "aceite") {
                coche.getMotor().setLitros(10);
                
                
            }
        } else {
            System.out.println("El garaje tiene coche dentro, solo acepta de 1 en 1");
        }



    }

    public void devolverCoche() {

        this.coche = null;

    }
}
   
    
    
    

            
        
    
    
    
    

