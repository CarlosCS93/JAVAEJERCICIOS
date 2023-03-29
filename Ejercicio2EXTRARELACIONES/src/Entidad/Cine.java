/*
 * Nos piden hacer un programa sobre un Cine, que tiene una sala con un conjunto de asientos
(8 filas por 6 columnas). De Cine nos interesa conocer la película que se está reproduciendo, la
sala con los espectadores y el precio de la entrada. Luego, de las películas nos interesa saber
el título, duración, edad mínima y director. Por último, del espectador, nos interesa saber su
nombre, edad y el dinero que tiene disponible.
Para representar la sala con los espectadores vamos a utilizar una matriz. Los asientos son
etiquetados por una letra y un número la fila A1 empieza al final del mapa como se muestra en
la tabla. También deberemos saber si el asiento está ocupado por un espectador o no, si esta
ocupado se muestra una X, sino un espacio vacío.

Se debe realizar una pequeña simulación, en la que se generen muchos espectadores y se los
ubique en los asientos aleatoriamente (no se puede ubicar un espectador donde ya este
ocupado el asiento).
Los espectadores serán ubicados de uno en uno y para ubicarlos tener en cuenta que sólo se
podrá sentar a un espectador si tiene el dinero suficiente para pagar la entrada, si hay espacio
libre en la sala y si tiene la edad requerida para ver la película. En caso de que el asiento este
ocupado se le debe buscar uno libre.
Al final del programa deberemos mostrar la tabla, podemos mostrarla con la letra y numero de
cada asiento o solo las X y espacios vacíos.

 */
package Entidad;

import Libreria.Consola;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * @author Usuario
 */
public class Cine {

    private Cine[][] salaCine;
    private ArrayList<Pelicula> peliculas;
    private int num;
    private String letra;
    private double precioEntrada;
    private Pelicula pelicula;
    private Espectador espectador;
    private ArrayList<Pelicula> cartelera;
    private ArrayList<Espectador> personas;

    public Cine() {

        salaCine = new Cine[8][6];
        pelicula = new Pelicula();
        espectador = new Espectador();
        cartelera = pelicula.cartelera();
        personas = espectador.espectadores();
    }

    public Cine(int num, String letra) {
        this.num = num;
        this.letra = letra;
    }

    public void crearsalaCine() {

        int n = 8;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < 6; j++) {
                String[] l = {"A", "B", "C", "D", "E", "F"};
                String le = l[j];
                salaCine[i][j] = new Cine((n - i), le);
            }
        }
    }

    public void mostrarSala() {

        crearsalaCine();

        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print("[ " + salaCine[i][j] + " ]");
            }
            System.out.println(" ");
        }
    }

    public void mostrarCartelera() {

        for (Pelicula cartelera : this.cartelera) {
            System.out.println(cartelera);
        }

    }

    public void mostrarEspectadores() {

        for (Espectador personas : this.personas) {
            System.out.println(personas);
        }

    }

    public void asignarAsiento() {

        String nombrePeli = Consola.leer("Escoja una pelicula");
        String nombrePersona = Consola.leer("Escriba su nombre");
        for (int j = 0; j < cartelera.size(); j++) {
            if (nombrePeli.equalsIgnoreCase(cartelera.get(j).getTitulo())) {
                for (int i = 0; i < personas.size(); i++) {
                    if (nombrePersona.equalsIgnoreCase(personas.get(i).getNombre())) {
                        if (personas.get(i).getEdad() >= cartelera.get(j).getEdadMinima()) {
                            Consola.escribirSinSaltar("Cumple con la edad minima");

                        } else {
                            Consola.escribir("No cumple con la edad minima para ver esta Pelicula");
                            break;
                        }
                    }
                }

            }

        }
        System.out.println("");

    }

    @Override

    public String toString() {
        return num + letra;
    }

}
