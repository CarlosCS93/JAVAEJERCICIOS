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

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getDinero() {
        return dinero;
    }

    public void setDinero(double dinero) {
        this.dinero = dinero;
    }

    
    public ArrayList espectadores() {

        ArrayList<Espectador> personas = new ArrayList();

        Espectador espe1 = new Espectador("carlos", 30, 5.5);
        Espectador espe2 = new Espectador("evelin", 25, 4);
        Espectador espe3 = new Espectador("jose", 12, 6.5);
        Espectador espe4 = new Espectador("maria", 22, 3.5);
        Espectador espe5 = new Espectador("luna", 15, 8.5);

        Espectador[] aux = {espe1, espe2, espe3, espe4, espe5};

        for (int i = 0; i < aux.length; i++) {
            personas.add(aux[i]);
        }

        return personas;
    }

    @Override
    public String toString() {
        return "Espectador{" + "Nombre=" + nombre + ", Edad= " + edad +"años "+ ", Dinero= $ " + dinero + '}';
    }

}
