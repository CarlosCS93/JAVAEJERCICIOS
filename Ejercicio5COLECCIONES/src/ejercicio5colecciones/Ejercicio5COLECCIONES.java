package ejercicio5colecciones;

import Entidad.Paises;
import Servicio.PaisesServicio;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;

public class Ejercicio5COLECCIONES {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        PaisesServicio ps = new PaisesServicio();
        Paises p = new Paises();
        ps.agregarenHashSet(p);
        ps.ordenarAlfabeticamente(p);
        ps.eliminarPais(p);

        
        
        
        
        
        
        
        /*HashSet<Paises> pa = new HashSet();
        pa.add(new Paises("carlos"));
        pa.add(new Paises("carlos"));
        pa.add(new Paises("carlos"));
        pa.add(new Paises("evelin"));
        pa.add(new Paises("carlos"));
        pa.add(new Paises("evelin"));
        pa.add(new Paises("carlos"));
        pa.add(new Paises("carlos"));
        pa.add(new Paises("tatiana"));
        pa.add(new Paises("carlos"));
        pa.add(new Paises("anita"));
        System.out.println(pa);
        
        ArrayList<Paises> auxiliar = new ArrayList (pa);
        Comparator<Paises> orden = Comparator.comparing(Paises::getNombrePais);
        Collections.sort(auxiliar, orden);
                
        System.out.println(auxiliar);*/

    }

}
