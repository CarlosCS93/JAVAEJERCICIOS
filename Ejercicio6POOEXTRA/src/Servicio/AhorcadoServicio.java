/*
 * Juego Ahorcado: Crear una clase Ahorcado (como el juego), la cual deberá contener
como atributos, un vector con la palabra a buscar, la cantidad de letras encontradas y la
cantidad jugadas máximas que puede realizar el usuario. Definir los siguientes métodos
con los parámetros que sean necesarios:
 Constructores, tanto el vacío como el parametrizado.
 Metodo crearJuego(): le pide la palabra al usuario y cantidad de jugadas máxima.
Con la palabra del usuario, pone la longitud de la palabra, como la longitud del
vector. Después ingresa la palabra en el vector, letra por letra, quedando cada letra
de la palabra en un índice del vector. Y también, guarda en cantidad de jugadas
máximas, el valor que ingresó el usuario y encontradas en 0.
 Método longitud(): muestra la longitud de la palabra que se debe encontrar. Nota:
buscar como se usa el vector.length.
 Método buscar(letra): este método recibe una letra dada por el usuario y busca sila
letra ingresada es parte de la palabra o no. También informará si la letra estaba o no.
 Método encontradas(letra): que reciba una letra ingresada por el usuario y muestre
cuantas letras han sido encontradas y cuantas le faltan. Este método además deberá
devolver true si la letra estaba y false si la letra no estaba, ya que, cada vez que se
busque una letra que no esté, se le restará uno a sus oportunidades.
 Método intentos(): para mostrar cuantas oportunidades le queda al jugador.
 Método juego(): el método juego se encargará de llamar todos los métodos
previamente mencionados e informará cuando el usuario descubra toda la palabra o
se quede sin intentos. Este método se llamará en el main.*/
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in);

    public void crearJuego(Ahorcado ah) {

        String[] juego = new String[ah.getCantidadLetras()];
        String[] aux = new String[ah.getCantidadLetras()];

        for (int i = 0; i < ah.getCantidadLetras(); i++) {
            juego[i] = (ah.getPalabras().substring(i, i + 1));
            aux[i] = "_";
            ah.setPalabra(juego);
            ah.setAuxiliar(aux);
        }
        //longitud(ah);
        //System.out.print("\033[H\033[2J");
        //System.out.flush();

    }

    public static void longitud(Ahorcado ah) {
        System.out.println("La longitud de la palabra es: " + ah.getPalabra().length);
    }

    public void buscar(Ahorcado ah, String letra) {

        String[] aux = ah.getAuxiliar();

        int cantidadd = 0;

        for (int i = 0; i < ah.getPalabra().length; i++) {
            if (ah.getPalabra()[i].equals(letra)) {
                if (aux[i].equals("_")) {
                    aux[i] = letra;
                    ah.setAuxiliar(aux);
                    cantidadd++;

                }
                System.out.print("[" + ah.getAuxiliar()[i] + "]");
            } else {
                System.out.print("[" + ah.getAuxiliar()[i] + "]");
            }
        }

        ah.setCantidadLetras(cantidadd);

        System.out.println("");

        if (cantidadd == 0) {
            System.out.println("No forma parte de la palabra");

        } else {
            System.out.println("Mensaje: La letra forma parte de la palabra");

        }

    }

    public boolean encontradas(Ahorcado ah, String letra) {

        boolean var = false;
        for (int i = 0; i < ah.getPalabra().length; i++) {
            if (ah.getPalabra()[i].equals(letra)) {
                var = true;
            }
        }
        return var;
    }

    public void intentos(Ahorcado ah, String letra, int cantidad) {

        int aux = ah.getPalabras().length();
        aux -= cantidad;
        if (encontradas(ah, letra) == true) {
            System.out.println("Numero de letras (encontradas / faltantes) ( " + cantidad + " , " + aux + " )");
            System.out.println("");
            System.out.println("Numero de oportunidades restantes: " + ah.getCantidaddeJugadas());
            System.out.println("=================================================");
            System.out.println("");
        } else {
            System.out.println("Numero de letras (encontradas / faltantes) ( " + cantidad + " , " + aux + " )");
            System.out.println("");
            ah.setCantidaddeJugadas(ah.getCantidaddeJugadas() - 1);
            System.out.println("Numero de oportunidades restantes: " + ah.getCantidaddeJugadas());
            System.out.println("=================================================");
            System.out.println("");
        }
    }

    public Ahorcado juego() {

        Ahorcado ah = new Ahorcado();
        int cantidad = 0;
        System.out.println("Ingrese la palabra para comenzar el juego");
        ah.setPalabras(leer.next().toUpperCase());
        ah.setCantidadLetras(ah.getPalabras().length());
        System.out.println("Ingrese la cantidad de jugadas maxima");
        ah.setCantidaddeJugadas(leer.nextInt());
        crearJuego(ah);

        do {

            System.out.println("Ingrese una letra");
            String letra = leer.next().toUpperCase();
            buscar(ah, letra);
            encontradas(ah, letra);
            cantidad += ah.getCantidadLetras();
            intentos(ah, letra, cantidad);

            if (cantidad == ah.getPalabra().length) {
                System.out.println("FELICIDADES GANASTE PALABRA ENCONTRADA");
                break;
            }

        } while (ah.getCantidaddeJugadas() > 0);

        if (ah.getCantidaddeJugadas() == 0) {
            System.out.println("Lo siento, Perdiste");
            System.out.println("La palabra es: " + ah.getPalabras());
        }
        return ah;
    }

}
