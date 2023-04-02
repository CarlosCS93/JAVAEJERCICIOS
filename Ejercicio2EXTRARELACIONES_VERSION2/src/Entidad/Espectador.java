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
import java.util.Random;

/**
 *
 * @author Usuario
 */
public class Espectador {

    private String nombre;
    private int edad;
    private double dinero;

    public Espectador() {
    }

    public Espectador(String nombre, int edad, double dinero) {
        this.nombre = nombre;
        this.edad = edad;
        this.dinero = dinero;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getDinero() {
        return dinero;
    }

    public ArrayList espectadores() {

        ArrayList<Espectador> personas = new ArrayList();
        Random r = new Random();

        for (int i = 0; i < 20; i++) {
            personas.add(new Espectador(this.nombre = ("Persona " + (i + 1)), this.edad = (10 + r.nextInt((35 + 1) - 10)), this.dinero = ((int) (6 + r.nextDouble() * (4 + 1) - 3))));
        }

        return personas;
    }

 
    @Override
    public String toString() {
        return "Espectador{" + "Nombre = " + nombre + ", Edad = " + edad + " años " + ", Dinero = $ " + dinero + '}';
    }

}
