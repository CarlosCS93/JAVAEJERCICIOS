/*
 * Clase Jugador: esta clase posee los siguientes atributos: id (representa el número del
jugador), nombre (Empezara con Jugador más su ID, “Jugador 1” por ejemplo) y mojado (indica
si está mojado o no el jugador). El número de jugadores será decidido por el usuario, pero
debe ser entre 1 y 6. Si no está en este rango, por defecto será 6.
Métodos:
• disparo(Revolver r): el método, recibe el revolver de agua y llama a los métodos de
mojar() y siguienteChorro() de Revolver. El jugador se apunta, aprieta el gatillo y si el
revolver tira el agua, el jugador se moja. El atributo mojado pasa a false y el método
devuelve true, sino false.

 */
package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

public class Jugador {

    private int id;
    private String nombre;
    private boolean mojado;
    private ArrayList<Jugador> jugador;
    private Scanner scan = new Scanner(System.in).useDelimiter("\n");

    public Jugador() {
        jugador = new ArrayList();
        this.nombre = "Jugador";
    }

    public void setJugador(ArrayList<Jugador> jugador) {
        this.jugador = jugador;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean disparo(Revolver r) {

        if (r.mojar()) {
            this.mojado = r.mojar();
        }
        return mojado;
    }



    public ArrayList cargarJugadores(Jugador j) {

        ArrayList<Jugador> ju = new ArrayList();

        for (int i = 0; i < 6; i++) {
            ju.add(new Jugador());
        }
        j.setJugador(jugador);

        return ju;
    }

    @Override
    public String toString() {
        return "" + nombre + " " + id + ", mojado=" + mojado + '}';
    }

}
