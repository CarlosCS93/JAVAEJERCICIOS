package ejercicio2relaciones;

import Entidad.Juego;
import Entidad.Jugador;

import Entidad.Revolver;

public class Ejercicio2RELACIONES {

    public static void main(String[] args) {

        Juego juego = new Juego();
        Jugador ju = new Jugador();
        Revolver re = new Revolver();
        juego.llenarJuego(ju.cargarJugadores(ju), re);
        juego.ronda();

    }
}
