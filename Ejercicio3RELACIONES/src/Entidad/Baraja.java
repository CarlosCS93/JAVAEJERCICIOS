/*
 * Realizar una baraja de cartas españolas orientada a objetos. Una carta tiene un número entre 1
y 12 (el 8 y el 9 no los incluimos) y un palo (espadas, bastos, oros y copas). Esta clase debe
contener un método toString() que retorne el número de carta y el palo. La baraja estará
compuesta por un conjunto de cartas, 40 exactamente.
Las operaciones que podrá realizar la baraja son:
• barajar(): cambia de posición todas las cartas aleatoriamente.
• siguienteCarta(): devuelve la siguiente carta que está en la baraja, cuando no haya más o
se haya llegado al final, se indica al usuario que no hay más cartas.
• cartasDisponibles(): indica el número de cartas que aún se puede repartir.
• darCartas(): dado un número de cartas que nos pidan, le devolveremos ese número de
cartas. En caso de que haya menos cartas que las pedidas, no devolveremos nada, pero
debemos indicárselo al usuario.
• cartasMonton(): mostramos aquellas cartas que ya han salido, si no ha salido ninguna
indicárselo al usuario
• mostrarBaraja(): muestra todas las cartas hasta el final. Es decir, si se saca una carta y
luego se llama al método, este no mostrara esa primera carta. 

 */
package Entidad;

import java.util.ArrayList;

public class Baraja {

    private int numero;
    private String palos;

    public Baraja() {

    }

    public Baraja(int numero, String palos) {
        this.numero = numero;
        this.palos = palos;
    }

    //metodos
    public ArrayList generarCartas() {

        String figuras[] = {"ESPADAS", "BASTOS", "OROS", "COPAS"};

        ArrayList<Baraja> baraja = new ArrayList();

        for (int i = 0; i < figuras.length; i++) {
            String guardarPalo = figuras[i];
            for (int j = 1; j < 13; j++) {
                if (j != 8 && j != 9) {
                    baraja.add(new Baraja(j, guardarPalo));
                }
            }
        }
        
        return baraja;
        
        
        /*ArrayList<Baraja> barajass = new ArrayList();

        Random random = new Random();

        Palo[] paloss = Palo.values();

        for (int j = 1; j < 13; j++) {
            this.palos = paloss[random.nextInt(4)].toString();
            if (j != 8 && j != 9) {
                barajass.add(new Baraja(j, palos));
            }
        }

        return barajass;*/

        
    }

    @Override
    public String toString() {
        return "Baraja{" + "numero=" + numero + ", palos=" + palos + '}';
    }

}
