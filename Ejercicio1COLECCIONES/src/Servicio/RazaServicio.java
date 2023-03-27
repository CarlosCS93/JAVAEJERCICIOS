/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.

Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le pedirá
un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. Si el perro
está en la lista, se eliminará el perro que ingresó el usuario y se mostrará la lista
ordenada. Si el perro no se encuentra en la lista, se le informará al usuario y se mostrará
la lista ordenada.
 */
package Servicio;

import Entidad.Raza;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;


public class RazaServicio {

    Scanner leer = new Scanner (System.in);
       

    public Raza pedirRaza() {
        
        Raza rz = new Raza();
        ArrayList<String> aux = new ArrayList();
        
        boolean ban;

        do {

            System.out.println("Ingrese la raza de su perro");
            rz.setRazas(leer.next());
            aux.add(rz.getRazas());
            rz.setRaza(aux);
            System.out.println("");
            System.out.println("Desea Ingresar otra raza de perro");
            String respuesta = leer.next().toLowerCase();
            System.out.println("");
            ban = respuesta.equals("si");
            
        } while (ban);

        mostrarLista(rz);

        return rz;
    }

    
    private void mostrarLista(Raza rz) {
        
        System.out.println(rz.getRaza().size());
        System.out.println(rz.getRaza());
    }

    public void eliminarRaza(Raza rz) {

        System.out.println("****************************************");
        System.out.println("Ingrese una raza de perro");
        String raza2 = leer.next();
        
        int x = 0;

        Iterator<String> it = rz.getRaza().iterator();

        while (it.hasNext()) {

            if (it.next().equals(raza2)) {
                it.remove();
                x++;
            }
        }
        System.out.println("");
        if (x > 0) {
            Collections.sort(rz.getRaza());
            
            System.out.println(rz.getRaza());
        } else {
            System.out.println("Raza de perro no encontrada");
            System.out.println("-- " + raza2 + " --");
            Collections.sort(rz.getRaza());
            System.out.println(rz.getRaza());
        }

    }

}
