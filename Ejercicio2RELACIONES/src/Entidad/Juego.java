/*
 * Clase Juego: esta clase posee los siguientes atributos: Jugadores (conjunto de Jugadores) y
Revolver
Métodos:
• llenarJuego(ArrayList<Jugador>jugadores, Revolver r): este método recibe los jugadores
y el revolver para guardarlos en los atributos del juego.
• ronda(): cada ronda consiste en un jugador que se apunta con el revolver de agua y
aprieta el gatillo. Sí el revolver tira el agua el jugador se moja y se termina el juego, sino se
moja, se pasa al siguiente jugador hasta que uno se moje. Si o si alguien se tiene que
mojar. Al final del juego, se debe mostrar que jugador se mojó.
 */
package Entidad;

import java.util.ArrayList;
import java.util.HashSet;

public class Juego {

    private ArrayList<Jugador> jugadores;
    private Revolver revolver;

    public Juego() {
        jugadores = new ArrayList();

    }

    public void llenarJuego(ArrayList< Jugador> ju, Revolver r) {
        jugadores = ju;
        revolver = r;
        
    }

    public void ronda() {

        for (int i = 0; i < jugadores.size(); i++) {

            if (jugadores.get(i).disparo(revolver)) {
                System.out.println("Jugador " + (i + 1));
                System.out.println(revolver);
                System.out.println("Participante " + jugadores.get(i).getNombre() + (i + 1) + " ---- MOJADO--- ");
                break;
            } else {

                System.out.println("Jugador " + (i + 1));
                System.out.println("Aprieta el gatillo");
                System.out.println(revolver);
                System.out.println("Siguiente Jugador");
                revolver.siguienteChorro();
            }
        }
    }

    @Override
    public String toString() {
        return "Juego{" + "jugadores=" + jugadores + ", revolver=" + revolver + '}';
    }

}
