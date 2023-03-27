/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Objeto;
import java.io.ObjectOutput;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;


public class ObjetoServicio {

    Scanner leer = new Scanner(System.in);

    public Objeto crearObjeto() {

        Objeto ob = new Objeto();

        System.out.println("Ingrese la raza del perro");
        ob.setNombre(leer.next());

        return ob;
    }

    public void agregarObjeto(Objeto ob) {

        boolean ban;
        
        do {

            ob.getRazas().add(crearObjeto());

            System.out.println("Quiere ingresar otra raza de perro");
            String respuesta = leer.next();
            ban = respuesta.equalsIgnoreCase("si");

        } while (ban);

        mostrarRazas(ob);
    }

    private void mostrarRazas(Objeto ob) {

        System.out.println(ob.getRazas());

    }

    public void eliminarObjeto(Objeto ob) {

        System.out.println("Ingrese la raza que desea eliminar");
        String raza2 = leer.next();

        Iterator<Objeto> it = ob.getRazas().iterator();
        int x = 0;
        while (it.hasNext()) {
            
            if (it.next().getNombre().equals(raza2)) {
                it.remove();
                x++;

            }
        }
        System.out.println("");
        if (x > 0) {
            Comparator< Objeto> nombre = Comparator.comparing(Objeto::getNombre);
            Collections.sort(ob.getRazas(),nombre);

            System.out.println(ob.getRazas());
        } else {
            System.out.println("Raza de perro no encontrada");
            System.out.println("-- " + raza2 + " --");
            Comparator< Objeto> nombre = Comparator.comparing(Objeto::getNombre);
            Collections.sort(ob.getRazas(),nombre);
            System.out.println(ob.getRazas());
        }

    }

}
