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
import java.util.Random;

public class Cine {

    private Cine[][] salaCine;
    private int num;
    private String letra;
    private String asiento;
    private double precioEntrada;
    private ArrayList<Pelicula> cartelera;
    private ArrayList<Espectador> personas;
    private Espectador gente;
    private Pelicula movies;

    public Cine() {

        this.asiento = asiento;
        gente = new Espectador();
        movies = new Pelicula();
        salaCine = new Cine[8][6];
        salaCine = crearsalaCine();
        cartelera = movies.cartelera();
        personas = gente.espectadores();
        this.precioEntrada = precioEntrada;

    }

    public Cine(int num, String letra, String asiento) {
        this.num = num;
        this.letra = letra;
        this.asiento = asiento;

    }

    public int precioEntrada() {
        Random r = new Random();
        int num = ((int) (5 + r.nextDouble() * (4 + 1) - 3));
        return num;
    }

    public Cine[][] crearsalaCine() {

        for (int i = 0; i < salaCine.length; i++) {
            for (int j = 0; j < salaCine[0].length; j++) {
                String[] l = {"A", "B", "C", "D", "E", "F"};
                this.salaCine[i][j] = new Cine((this.num = salaCine.length - i), this.letra = l[j], this.asiento = " ");
            }
        }
        return salaCine;
    }

    public void mostrarSala() {

        for (int i = 0; i < salaCine.length; i++) {
            for (int j = 0; j < salaCine[0].length; j++) {
                System.out.print("[  " + this.salaCine[i][j] + " ]");
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

    public boolean asignarAsiento() {

        boolean asignacion = false;

        for (int j = 0; j < cartelera.size(); j++) {
            for (int i = j; i < personas.size(); i++) {
                System.out.println(personas.get(i).getNombre());
                if (personas.get(i).getEdad() >= cartelera.get(j).getEdadMinima()) {
                    if (personas.get(i).getDinero() >= this.precioEntrada) {
                        System.out.println("PELICULA EN REPRODUCCION: " + cartelera.get(j).getTitulo());
                        asignacion = true;
                        personas.remove(j);
                        break;
                    } else {
                        Consola.escribir("No dispone del dinero suficiente");
                        System.out.println("Precio de la entrada : $ " + precioEntrada());
                        personas.remove(j);
                        break;
                    }
                } else {
                    Consola.escribir("No cumple con la edad minima para ver esta Pelicula");
                    personas.remove(j);
                    break;
                }
            }
            break;
        }
        System.out.println("");

        return asignacion;
    }

    public boolean asientoOcupado() {
        return this.asiento.equals(" ");
    }

    public void llenarAsiento(int i, int j) {

        String[] letras = {"A", "B", "C", "D", "E", "F"};

        this.salaCine[i][j] = new Cine((this.salaCine.length - i), this.letra = letras[j], this.asiento);
        mostrarSala();
        System.out.println("");

    }

    public void escogerAsiento() {

        Random r = new Random();

        if (asignarAsiento()) {

            int i, j;
            int x = 0;

            do {
                i = r.nextInt(8);
                j = r.nextInt(5);
                x++;
            } while (!this.salaCine[i][j].asientoOcupado());

            if (x == 1) {
                llenarAsiento(i, j);
            } else {
                System.out.println("ASIENTO OCUPADO");
                System.out.println("BUSCANDO ASIENTO . . . . . .");
                llenarAsiento(i, j);
                System.out.println("REUBICADO");
                System.out.println("");
            }
        }
    }

    @Override

    public String toString() {
        return num + letra + asiento;
    }

}
