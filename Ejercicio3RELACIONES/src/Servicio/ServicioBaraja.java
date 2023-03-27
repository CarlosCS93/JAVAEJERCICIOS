/*
 * Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• 
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta.

 */
package Servicio;

import Entidad.Baraja;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ServicioBaraja {

    private Baraja cartas;
    private ArrayList<Baraja> mazo;
    private Scanner scan;
    private ArrayList<Baraja> monton;

    public ServicioBaraja() {

        cartas = new Baraja();
        mazo = cartas.generarCartas();
        scan = new Scanner(System.in).useDelimiter("\n");
        monton = new ArrayList();

    }

    //public void recibirBaraja(ArrayList<Baraja> baraja, Baraja ba) {
    //  cartas = new Baraja();
    //mazo = baraja;
    //}
    public void cartasDisponibles() {

        //•cartasDisponibles(): indica el número de cartas que aún se puede repartir
        System.out.println("La cantidad de cartas de la baraja es: " + mazo.size());
    }

    public void mostrarCartas() {

        mazo.forEach((baraja) -> {
            System.out.println(baraja);
        });
    }

    public void escogerCarta() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el numero de carta que desea ");
        int opcion = leer.nextInt();

        System.out.println(mazo.get(opcion));
    }

    public void barajarCartas() {
        //• barajar(): cambia de posición todas las cartas aleatoriamente.
        Collections.shuffle(mazo);
    }

    public void siguienteCarta() {

        /*siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
          se haya llegado al final, se indica al usuario que no hay más cartas.
         */
        for (int i = 0; i < 1; i++) {

            if (mazo.isEmpty()) {
                System.out.println("No hay mas cartas");
            } else {
                System.out.println(mazo.get(i));
                monton.add(mazo.get(i));
                mazo.remove(i);
            }
        }
        
        cartasDisponibles();
    }

    public void darCartas() {

        /*• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
        cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
        debemos indicárselo al usuario.
         */
        int num = scan.nextInt();

        if (mazo.size() < num) {
            System.out.println("No hay suficientes cartas");

        } else {

            for (int i = 0; i < num; i++) {
                System.out.println(mazo.get(i));
                monton.add(mazo.get(i));
            }

            for (int i = 0; i < num; i++) {
                for (int j = 0; j < 1; j++) {
                    mazo.remove(j);
                }
            }
        }
    }

    public void cartasMonton() {
        /*• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
            indicárselo al usuario
         */
        if (monton.isEmpty()) {
            System.out.println("No ha salido ninguna carta");
        } else {
            System.out.println("CARTAS DEL MONTON");

            for (Baraja baraja : monton) {
                System.out.println(baraja);
            }

        }
        System.out.println("La cantidad de cartas de monton es: "+ monton.size());
    }

    public void barajaInglesa() {

        int opcion;
        do {

            System.out.println("BARAJA INGLESA");

            System.out.println("1. Barajar");
            System.out.println("2. Siguiente Carta");
            System.out.println("3. Cartas Disponibles");
            System.out.println("4. Dar Cartas");
            System.out.println("5. Cartas Monton");
            System.out.println("6. Mostrar Cartas");
            System.out.println("7. Terminar Juego");
            System.out.println("Ingrese Opcion");
            opcion = scan.nextInt();
            switch (opcion) {
                case 1:
                    barajarCartas();
                    break;
                case 2:
                    siguienteCarta();
                    break;
                case 3:
                    cartasDisponibles();
                    break;
                case 4:
                    darCartas();
                    break;
                case 5:
                    cartasMonton();
                    break;
                case 6:
                    mostrarCartas();
                    break;
                case 7:
                    System.out.println("Juego Terminado");
                    
            }

        } while (opcion != 7);

    }
}
