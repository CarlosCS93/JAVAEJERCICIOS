package ejercicio2extrarelaciones;

import Entidad.Cine;

public class Ejercicio2EXTRARELACIONES {

    public static void main(String[] args) {

        Cine c = new Cine();
        c.crearsalaCine();
        c.mostrarCartelera();
        c.mostrarEspectadores();
        int n = 0;
        
        while (n < 5) {
            c.escogerAsiento();
            n++;
        }

    }

}
