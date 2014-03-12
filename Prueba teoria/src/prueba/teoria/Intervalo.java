package prueba.teoria;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Max
 */
public class Intervalo {

    private int inicio;
    private int fin;

    public void visualizar() {

        System.out.println(this.getInicio() + " inicio y " + this.getFin() + " es el fin");

    }

    public int calcularIntervalo() {

        int longitud = this.getFin() - this.getInicio();
        return longitud;

    }

    public boolean compara(Intervalo intervalo) {

        boolean igual = (this.getInicio() == intervalo.getFin()) && (this.getFin() == intervalo.getFin());
        return igual;


    }

    public void desplazarValor(int desplazamiento) {

        this.setFin(this.getFin() + desplazamiento);
        this.setInicio(this.getInicio() + desplazamiento);
    }

    public void unir(Intervalo intervalo) {

        this.setFin(this.getFin() + intervalo.calcularIntervalo());

    }

    public boolean inside(Intervalo intervalo) {
        boolean dentro = intervalo.getInicio() >= this.getInicio() && intervalo.getFin() <= this.getFin();
        return dentro;
    }
   public boolean  dentro (Intervalo intervalo){
       boolean dentro;
       dentro= intervalo.calcularIntervalo() >= this.getInicio() 
               && intervalo.calcularIntervalo()<=this.getFin();
       
       return dentro;
   }
public Intervalo (int inicio,int fin){
    
    // Esto es el constructor del "intervalo" , el cual debes de meter valores obligatorios entre () al que use tu clase, te lo pedirá 
    // al llamar al metodo, metiendo los valores entre parentesis en el Main.
    
}

    /**
     * @return the inicio
     */
    public int getInicio() {
        return inicio;
    }

    /**
     * @param inicio the inicio to set
     */
    public void setInicio(int inicio) {
       
        if (inicio > this.fin){
            this.fin = inicio;
            
        } else {
            this.inicio=inicio;
            
            }
    }

    /**
     * @return the fin
     */
    public int getFin() {
        return fin;
    }

    /**
     * @param fin the fin to set
     */
    public void setFin(int fin) {
        this.fin = fin;
    }
}
