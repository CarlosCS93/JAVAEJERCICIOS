package ejercicio4colecciones;

import Entidad.Pelicula;
import Entidad.Cine;
import Servicio.CineServicio;
import java.util.Collections;

public class Ejercicio4COLECCIONES {

    public static void main(String[] args) {

        CineServicio cs = new CineServicio();

        Pelicula p = cs.cargarPeliculas();
       
               
        cs.mostrarPeliculas(p);
        cs.duracionHora(p);
        cs.ordenarMayoraMenor(p);
        cs.ordenarDescendente(p);
        cs.ordenarAlfabeticamente(p);
        cs.ordenarDirector(p);

    }

}
