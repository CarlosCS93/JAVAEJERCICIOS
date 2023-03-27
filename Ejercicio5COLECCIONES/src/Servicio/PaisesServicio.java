/*
 * Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
 */
package Servicio;

import Entidad.Paises;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;

public class PaisesServicio {

    /**
     *
     * @return
     */
    public Paises pedirInformacion() {

        Paises p = new Paises();

        System.out.println("Ingrese el nombre de un pais");
        p.setNombrePais(p.getScan().next());

        return p;
    }

    /**
     *
     * @param p
     */
    public void agregarenHashSet(Paises p) {

        boolean ban;

        do {

            p.getPais().add(pedirInformacion());

            System.out.println("Desea ingresar el nombre de otro pais");
            String respuesta = p.getScan().next();
            while (!respuesta.equals("si") && !respuesta.equals("no")) {
                System.out.println("Ingrese una opcion valida");
                respuesta = p.getScan().next();
            }
            ban = respuesta.equals("si");
        } while (ban);

        mostrarConjunto(p);
    }

    /**
     *
     * @param p
     */
    public void mostrarConjunto(Paises p) {

        //System.out.println(p.getPais());
        for (Paises pai : p.getPais()) {
            System.out.println(pai);
        }
    }

    /**
     *
     * @param p
     */
    
    public void ordenarAlfabeticamente(Paises p) {

        System.out.println("*****PAISES ORDENADOS ALFABETICAMENTE");

        ArrayList<Paises> bar = new ArrayList(p.getPais());

        Comparator <Paises> aux = Comparator.comparing(Paises::getNombrePais);

        Collections.sort(bar, aux);

        for (Paises paises : bar) {
            System.out.println(paises);
        }
    }

    /**
     *
     * @param p
     */
    public void eliminarPais(Paises p) {

        System.out.println("*******************************************");
        System.out.println("Ingrese el nombre del pais que desea eliminar");
        String paises2 = p.getScan().next();
        int x = 0;
        Iterator<Paises> ite = p.getPais().iterator();

        while (ite.hasNext()) {

            if (ite.next().getNombrePais().equals(paises2)) {
                ite.remove();
                x++;
            }
        }
        if (x > 0) {
            ordenarAlfabeticamente(p);
        } else {
            System.out.println("No exite el nombre ingresado");
            System.out.println("--" + paises2 + "--");
        }
    }
}
