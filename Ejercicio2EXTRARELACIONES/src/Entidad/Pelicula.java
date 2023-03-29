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

 */
package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Pelicula {

    private String titulo;
    private int duracion;
    private int edadMinima;
    private String director;
    private Scanner scan;

    public Pelicula() {
    }

    public Pelicula(String titulo, int duracion, int edadMinima, String director) {
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;

    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    
    
    
    public ArrayList cartelera() {

        ArrayList<Pelicula> cartelera = new ArrayList();

        Pelicula peli1 = new Pelicula("Zootopia", 2, 8, "evelin");
        Pelicula peli2 = new Pelicula("Rapidos y Furiosos", 3, 12, "luna");
        Pelicula peli3 = new Pelicula("Cars", 2, 12, "carlos");
        Pelicula peli4 = new Pelicula("Noches de Terror", 1, 16, "iliana");
        Pelicula peli5 = new Pelicula("Avengers Endgame", 3, 12, "mia khalifa");

        Pelicula[] auxi = {peli1, peli2, peli3, peli4, peli5};

        for (int i = 0; i < auxi.length; i++) {
            cartelera.add(auxi[i]);
        }

        return cartelera;
    }

    @Override
    public String toString() {
        return "Cartelera{" + "Titulo Pelicula= " + titulo + ", Duracion= " + duracion + ", EdadMinima= " + edadMinima +" horas "+ ", Director=" + director + '}';
    }

    
    
    
}
