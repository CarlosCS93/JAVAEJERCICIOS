/*
 * Clase Revolver de agua: esta clase posee los siguientes atributos: posición actual (posición
del tambor que se dispara, puede que esté el agua o no) y posición agua (la posición del
tambor donde se encuentra el agua). Estas dos posiciones, se generarán aleatoriamente.
Métodos:
• llenarRevolver(): le pone los valores de posición actual y de posición del agua. Los valores
deben ser aleatorios.
• mojar(): devuelve true si la posición del agua coincide con la posición actual
• siguienteChorro(): cambia a la siguiente posición del tambor
• toString(): muestra información del revolver (posición actual y donde está el agua)

 */
package Entidad;

public class Revolver {

    private int posicionActual;
    private int posicionAgua;

    public Revolver() {
        this.posicionActual = llenarAgua();
        this.posicionAgua = llenarAgua();
    }

    public int llenarAgua() {
        int num = (int) (Math.random() * (6 - 1) + 1);
        return num;
    }

    public boolean mojar() {
        return this.posicionActual == this.posicionAgua;
    }

    public void siguienteChorro() {

        if (posicionActual < 6) {
            posicionActual++;
        } else if (posicionActual == 6) {
            posicionActual = 1;
        }
    }

    @Override
    public String toString() {
        return "Revolver{" + "posicionActual=" + posicionActual + ", posicionAgua=" + posicionAgua + '}';
    }

    
}
