/*
 * Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.

 */
package Servicio;

import Entidad.Usuario;
import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class ServicioJuego {

    Scanner leer = new Scanner(System.in);

    public Usuario numeroenJuego() {

        Random r = new Random();
        Usuario u = new Usuario();

        u.setNumeroComputadora(r.nextInt(500) + 1);

        return u;

    }

    public void juegoAdivinar(Usuario u) {

        System.out.println("JUEGO ADIVINAR NUMERO");
        boolean ganador = false;
        int aux = 0;
        String respuesta;
        System.out.println(u.getNumeroComputadora());

        while (ganador == false) {

            try {
                System.out.println("Ingrese un numero");
                u.setIntento(leer.nextInt());

                if (u.getIntento() == u.getNumeroComputadora()) {
                    System.out.println("Felicidades adivinaste el numero");
                    u.getIntentos().add(u.getIntento());
                    ganador = true;
                    numIntentos(u);
                } else {

                    System.out.println("FALLASTE...");

                    if (u.getIntento() < u.getNumeroComputadora()) {
                        System.out.println("Ingresa un numero mayor");
                    } else {
                        System.out.println("Ingresa un numero menor");
                    }

                    u.getIntentos().add(u.getIntento());
                    numIntentos(u);
                }

            } catch (InputMismatchException i) {
                System.out.println("¡ERROR! Ingrese solo numeros!!!!!");
                leer.next();
                aux++;
                u.getIntentos().add(aux);
                numIntentos(u);
            }
        }
    }

    public void numIntentos(Usuario u) {

        System.out.println("Numero de intentos " + u.getIntentos().size());
    }

}
