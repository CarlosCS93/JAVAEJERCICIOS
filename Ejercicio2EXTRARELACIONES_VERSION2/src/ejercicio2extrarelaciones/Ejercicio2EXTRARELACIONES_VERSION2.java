package ejercicio2extrarelaciones;

import Entidad.Cine;

public class Ejercicio2EXTRARELACIONES_VERSION2 {

    public static void main(String[] args) {

        Cine c = new Cine();

        c.mostrarCartelera();
        c.mostrarEspectadores();


        int n = 0;
        while (n < 20) {
            c.escogerAsiento();
            n++;
        }

    }

}
