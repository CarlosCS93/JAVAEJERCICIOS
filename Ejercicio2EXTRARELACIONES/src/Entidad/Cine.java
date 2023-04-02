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

public class Cine {

    private Cine[][] salaCine;
    private int num;
    private String letra;
    private double precioEntrada;
    private ArrayList<Pelicula> cartelera;
    private ArrayList<Espectador> personas;
    private String asiento;
    private Espectador gente;
    private Pelicula movies;

    public Cine() {

        this.asiento = asiento;
        gente = new Espectador();
        movies = new Pelicula();
        salaCine = new Cine[8][6];
        cartelera = movies.cartelera();
        personas = gente.espectadores();
        this.precioEntrada = 3.8;
//crearsalaCine();
    }

    public Cine(int num, String letra, String asiento) {
        this.num = num;
        this.letra = letra;
        this.asiento = asiento;
        this.precioEntrada = 3.8;
    }

    public Cine[][] crearsalaCine() {

        for (int i = 0; i < salaCine.length; i++) {
            for (int j = 0; j < salaCine[0].length; j++) {
                String[] l = {"A", "B", "C", "D", "E", "F"};
                this.letra = l[j];
                this.asiento = "";
                this.salaCine[i][j] = new Cine((this.num = salaCine.length - i), this.letra, this.asiento);
            }
        }
        return salaCine;
    }

    public void mostrarSala() {

        for (int i = 0; i < salaCine.length; i++) {
            for (int j = 0; j < salaCine[0].length; j++) {
                System.out.print("[ " + this.salaCine[i][j] + " ]");
            }
            System.out.println(" ");
        }
    }

    public boolean precioEntradas() {

        return new Espectador().getDinero() >= this.precioEntrada;

    }

    public boolean edadMinima() {

        return new Espectador().getEdad() >= new Pelicula().getEdadMinima();
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

        String nombrePeli = Consola.leer("Escoja una pelicula");
        String nombrePersona = Consola.leer("Escriba su nombre");
        for (int j = 0; j < cartelera.size(); j++) {
            if (nombrePeli.equalsIgnoreCase(cartelera.get(j).getTitulo())) {
                for (int i = 0; i < personas.size(); i++) {
                    if (nombrePersona.equalsIgnoreCase(personas.get(i).getNombre())) {
                        System.out.println(personas.get(i).getNombre());
                        if (personas.get(i).getEdad() >= cartelera.get(j).getEdadMinima()) {
                            System.out.println(personas.get(i).getDinero());
                            System.out.println(this.precioEntrada);
                            if (personas.get(i).getDinero() >= this.precioEntrada) {
                                asignacion = true;
                            } else {
                                Consola.escribir("No dispone del dinero suficiente");
                                break;
                            }

                        } else {
                            Consola.escribir("No cumple con la edad minima para ver esta Pelicula");
                            break;
                        }
                    }
                }

            }
        }
        System.out.println("");

        return asignacion;
    }

    public boolean asientoOcupado() {
        return this.asiento.equals("");
    }

    public void escogerAsiento() {

        if (asignarAsiento()) {
            Consola.escribir("Seleccione el asiento");

            mostrarSala();

            int numeral = Consola.leerEntero("FILA ");
            String letra = Consola.leer("COLUMNA ");

            for (int i = 0; i < this.salaCine.length; i++) {
                for (int j = 0; j < this.salaCine[0].length; j++) {
                    String[] l = {"A", "B", "C", "D", "E", "F"};
                    this.letra = l[j];
                    if (letra.equals(this.letra)) {
                        int aux = j;
                        if ((this.salaCine.length - numeral) == i && aux == j) {
                            if (this.salaCine[i][j].asientoOcupado()) {
                                this.asiento = "X";
                                this.salaCine[i][j] = new Cine((this.salaCine.length - i), this.letra, this.asiento);
                                break;
                            } else {
                                System.out.println("ASIENTO OCUPADO");
                                break;
                            }
                        }
                    }
                }
                break;
            }
        }

    }


    /*public void aplicacionCine() {

        do {
            System.out.println("======SUPERCINES=======");
            System.out.println(" CARTELERA");

            mostrarCartelera();

            System.out.println("1. SELECCIONAR PELICULA");
            System.out.println("2. LLENAR DATOS");
            System.out.println("3. CANTIDAD DE ENTRADAS");
            System.out.println("4. SELECCIONAR ASIENTOS");
            System.out.println("5. SALIR");
            int opcion = Consola.leerEntero("Ingrese su opcion");

            switch (opcion) {
                case 1:
                    for (int j = 0; j < cartelera.size(); j++) {
                        if (nombrePeli.equalsIgnoreCase(cartelera.get(j).getTitulo())) {
                        }
                    }
                    break;

                case 2:
                    String nombrePersona = Consola.leer("Escriba su nombre");
                    int edadPersona nombrePersona = Consola.leer("Escriba su nombre");
                    double dinerobolsillo
                            = breck;
                case 3:

                    if (precioEntradas()) {

                    }

            }

        } while (true);

    }*/
    @Override

    public String toString() {
        return num + letra + asiento;
    }

}
