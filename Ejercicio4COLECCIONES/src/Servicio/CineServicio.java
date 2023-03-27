/*
 * Un cine necesita implementar un sistema en el que se puedan cargar peliculas. Para esto,
tendremos una clase Pelicula con el título, director y duración de la película (en horas).
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo
que se pide a continuación : 
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones:

• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla.

 */
package Servicio;

import Entidad.Cine;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class CineServicio {

    Scanner leer = new Scanner(System.in);

    public Pelicula cargarPeliculas() {

        Pelicula pelicula = new Pelicula();

        String respuesta;

        do {

            Pelicula peliAuxiliar = new Pelicula();
            System.out.println("Ingrese el titulo de la pelicula");
            peliAuxiliar.setTitulo(leer.next());
            //pelicula.setTitulo(leer.next());
            System.out.println("Ingrese el director de la pelicula");
            peliAuxiliar.setDirector(leer.next());
            //pelicula.setDirector(leer.next());
            System.out.println("Ingrese la duracion de la pelicula");
            peliAuxiliar.setDuracion(leer.nextInt());
            pelicula.setTitulo(peliAuxiliar.getTitulo());
            pelicula.setDirector(peliAuxiliar.getDirector());
            pelicula.setDuracion(peliAuxiliar.getDuracion());
            pelicula.getCartelera().add(peliAuxiliar);

            System.out.println("Quiere crear otra pelicula");
            respuesta = leer.next();

        } while (respuestaUsuario(respuesta));

        return pelicula;

    }

    public boolean respuestaUsuario(String respuesta) {

        return respuesta.equals("si");
    }

    public void mostrarPeliculas(Pelicula pelicula) {
        System.out.println("CARTELERA DE PELICULAS");
        System.out.print(pelicula.getCartelera());
        System.out.println("");

    }

    public void duracionHora(Pelicula pelicula) {

        int j = 0;

        System.out.println("******************************");
        for (int i = 0; i < pelicula.getCartelera().size(); i++) {
            if (pelicula.getCartelera().get(i).getDuracion() == 1) {
                System.out.println("Pelicula Disponible Nº " + (i + 1));
                System.out.println(pelicula.getCartelera().get(i));
                j++;
            }
        }
        if (j == 0) {
            System.out.println("No hay peliculas con 1 hora de duracion");

        }

    }

    public void ordenarMayoraMenor(Pelicula pelicula) {
        System.out.println("********************************************");
        System.out.println("MAYOR A MENOR DURACION");
        Comparator<Pelicula> duracion = Comparator.comparing(Pelicula::getDuracion);
        Collections.sort(pelicula.getCartelera(), duracion);
        Collections.reverse(pelicula.getCartelera());
        mostrarPeliculas(pelicula);
    }

    public void ordenarDescendente(Pelicula pelicula) {

        System.out.println("*******************************");
        System.out.println("MENOR A MAYOR DURACION");
        Comparator<Pelicula> duracion = Comparator.comparing(Pelicula::getDuracion);
        Collections.sort(pelicula.getCartelera(), duracion);

        mostrarPeliculas(pelicula);
    }

    public void ordenarAlfabeticamente(Pelicula pelicula) {

        System.out.println("******************************************");
        System.out.println("PELICULAS ORDENADAS ALFABETICAMENTE POR TITULO");
        Comparator<Pelicula> titulo = Comparator.comparing(Pelicula::getTitulo);
        Collections.sort(pelicula.getCartelera(), titulo);
        mostrarPeliculas(pelicula);
    }

    public void ordenarDirector(Pelicula pelicula) {
        System.out.println("******************************************");
        System.out.println("PELICULAS ORDENADAS POR DIRECTOR ALFABETICAMENTE");
        Comparator<Pelicula> director = Comparator.comparing(Pelicula::getDirector);
        Collections.sort(pelicula.getCartelera(), director);
        mostrarPeliculas(pelicula);
    }
}
