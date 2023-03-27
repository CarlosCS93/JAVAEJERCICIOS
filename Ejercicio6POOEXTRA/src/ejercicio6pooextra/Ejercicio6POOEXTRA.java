package ejercicio6pooextra;

import Entidad.Ahorcado;
import Servicio.AhorcadoServicio;
import java.util.Scanner;

public class Ejercicio6POOEXTRA {

    public static void main(String[] args) {
        AhorcadoServicio sa = new AhorcadoServicio();
        Ahorcado a = sa.juego();










        /*Ahorcado a = sa.crearJuego();
        sa.longitud(a);
        sa.buscar(a);*/

 /*Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la palabra para comenzar el juego");
        String palabra = leer.next();
        int letras = palabra.length();
        System.out.println("Ingrese la cantidad de jugadas maxima");
        int cantidaddeJugadas = (leer.nextInt());

        int cantidad = 0;
        String[] juego = new String[letras];
        String[] aux = new String[letras];
        for (int i = 0; i < juego.length; i++) {
            juego[i] = (palabra.substring(i, i + 1));
            aux[i] = "*";
        }
        
        do {
            int cantidadd = 0;
            System.out.println("Ingrese una letra");
            String letra = leer.next();
            for (String juego1 : juego) {

                if (juego1.equals(letra)) {
                    cantidadd++;
                }
            }
            cantidad += cantidadd;
            letras -= cantidadd;
            if (cantidadd == 0) {
                System.out.println("No forma parte de la palabra");
                cantidaddeJugadas--;
            } else {
                System.out.println("Mensaje: La letra ' " + letra + " ' forma parte de la palabra por " + cantidadd);
            }
            System.out.println("Numero de letras (encontradas / faltantes) ( " + cantidad + " , " + letras + " )");
            System.out.println("Numero de oportunidades restantes: " + cantidaddeJugadas);

            for (int i = 0 ; i < juego.length ; i++) {
                if (juego [i].equals(letra)) {
                    if (aux [i].equals("*")) {
                        aux [i]=letra;
                    
                    System.out.print("[" + aux [i] + "]");
                    }
                }else {
                    System.out.print("[" + aux [i] + "]");
                }
            }
            System.out.println("");
            System.out.println("=========================================================================");
            System.out.println("");
            if (cantidad == juego.length) {
                System.out.println("FELICIDADES GANASTE PALABRA ENCONTRADA");
                break;
            }
        } while (cantidaddeJugadas > 0);*/
    }
}
