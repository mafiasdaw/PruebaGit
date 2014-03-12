/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package mediateca;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Max
 */
public class Mediateca {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {


        ArrayList<Soporte> ejemplares = new ArrayList();
        Socio socio1 = new Socio("arturo", "navarrete", "avenida la paloma");
        Libros libro1 = new Libros(50, "Los simpson", "Matt groenning", "EFAL-556698752");
        DVD dvd1 = new DVD("Jhon Travolta", 120, "Pulp fiction", " Quentin Tarantino");
        CD cd1 = new CD("Los mojinos escozios", 45, "pa pito el mio", "Los Mojinos");
        ejemplares.add(cd1);
        ejemplares.add(dvd1);
        ejemplares.add(libro1);


        Scanner sc = new Scanner(System.in);
        Scanner s1 = new Scanner(System.in);
        System.out.println("------------Que desea buscar:-----------"
                + "-------1.Peliculas DVD----"
                + "-------2.Libros-----------"
                + "-------3.Cd's Musica----- ");
        int opcion = sc.nextInt();

        switch (opcion) {
            case 1:
                Scanner sc2 = new Scanner(System.in);
                System.out.println("Busqueda por :"
                        + "1.Titulo"
                        + "2.Autor");
                int opcion1a = sc2.nextInt();

                switch (opcion1a) {

                    case 1:
                        System.out.println(" Peliculas DVD --> titulo a buscar: ");
                        String tpelicula = s1.nextLine();
                        if (tpelicula == dvd1.Titulo) {
                            System.out.println("Este titulo esta disponible para su prestamo"
                                    + ejemplares.toString());
                            break;
                        } else {
                            System.out.println("Pelicula no encontrada u ocupada por otro socio");
                            break;
                        }
                    case 2:
                        System.out.println(" Peliculas DVD --> Autor a buscar: ");
                        String apelicula = s1.nextLine();
                        if (apelicula == dvd1.Autor) {
                            System.out.println("Este DVD de este Autor esta disponible para su prestamo");
                        } else {
                            System.out.println("Autor no encontrado");
                        }
                }


            case 2:
                Scanner sc3 = new Scanner(System.in);
                System.out.println("Busqueda por :"
                        + "1.Titulo"
                        + "2.Autor");
                int opcion1b = sc3.nextInt();

                switch (opcion1b) {

                    case 1:
                        System.out.println(" Libros--> titulo a buscar: ");
                        String tlibro = s1.nextLine();
                        if (tlibro == libro1.Titulo) {
                            System.out.println("Este libro esta disponible para su prestamo");
                        } else {
                            System.out.println("Libro no encontrado u ocupado por otro socio");
                        }
                    case 2:
                        System.out.println(" Libros --> Autor a buscar: ");
                        String alibro = s1.nextLine();
                        if (alibro == libro1.Autor) {
                            System.out.println("Este libro de este Autor esta disponible para su prestamo");
                        } else {
                            System.out.println("Autor no encontrado");
                        }


                }




        }
    }
}
