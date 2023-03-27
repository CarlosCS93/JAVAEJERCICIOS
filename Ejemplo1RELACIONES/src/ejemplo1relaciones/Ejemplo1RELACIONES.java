/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo1relaciones;

import Entidad.Dni;
import Entidad.Jugador;
import Entidad.Persona;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Ejemplo1RELACIONES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Dni cedula = new Dni();
        cedula.setSerie("2300264351");
        Persona p = new Persona();
        p.setNombre("Carlos");
        p.setApellido("Chugcho");
        p.setDni(cedula);

        System.out.println(p);

        System.out.println("***********************************");

        Jugador j1 = new Jugador("Carlos", "Chugcho", "Delantero", 9);
        Jugador j2 = new Jugador("Javier", "Silva", "Defensa", 22);
        Jugador j3 = new Jugador("Martin", "Zambrano", "Mediocampista", 8);
        Jugador j4 = new Jugador("Luis", "Moreira", "Lateral", 16);

        ArrayList<Jugador> lista = new ArrayList();
        lista.add(j1);
        lista.add(j2);
        lista.add(j3);
        lista.add(j4);

        for (Jugador jugador : lista) {
            System.out.print(jugador);
        }

    }

}
