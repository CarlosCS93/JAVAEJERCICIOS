package ejercicio5exceptions;

import Entidad.Usuario;
import Servicio.ServicioJuego;
import java.util.InputMismatchException;

/**
 *
 * @author Usuario
 */
public class Ejercicio5EXCEPTIONS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        ServicioJuego sj = new ServicioJuego();
        Usuario u = sj.numeroenJuego();

        sj.juegoAdivinar(u);

    }

}
