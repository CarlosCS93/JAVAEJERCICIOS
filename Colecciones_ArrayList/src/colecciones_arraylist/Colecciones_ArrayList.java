/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_arraylist;

import Entidad.Auto;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Colecciones_ArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto a1 = new Auto("XYZ456", "Verde");
        Auto a2 = new Auto("ASD113", "Azul");
        Auto a3 = new Auto("DFG456", "Amarillo");
        Auto a4 = new Auto("GGG435", "Morado");
        ArrayList<Auto> misAutos = new ArrayList<>();

        System.out.println(misAutos.size()); //nos permite devolver un entero el numero de elementos dentro del arraylist
        System.out.println(misAutos);

        System.out.println("************************************************");

        misAutos.add(a1); // Se puede colocar una referencia del objeto
        //misAutos.add(new Auto("ASD113", "Azul")); // tambien se puede colocar directamente la instanciacion de un objeto
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        System.out.println("************************************************");

        misAutos.add(a2);
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        System.out.println("************************************************");

        misAutos.add(a3);
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        System.out.println("************************************************");
        System.out.println("El segundo auto es: " + misAutos.get(1));

        System.out.println("**********************************************");
        System.out.println("Mostrando todos los autos de la lista: ");
        for (int i = 0; i < misAutos.size(); i++) {
            System.out.println("El auto en la posicion " + i + " es " + misAutos.get(i));

        }

        System.out.println("************************************************");

        System.out.println(misAutos.indexOf(a3)); // devuelve la posicion del objeto dentro del array en un entero

        System.out.println("************************************************");

        misAutos.remove(0); // metodo remove remueve el objeto alojado en la posicion que se indica
        System.out.println(misAutos.size());
        System.out.println(misAutos);
        // los objetos recorren un puesto a la izquierda para ocupar el lugar removidos

        System.out.println("************************************************");

        System.out.println("Aplicado el remove se modifica las posiciones de los objetos dentro del array");
        System.out.println(misAutos.indexOf(a3)); // devuelve la posicion del objeto dentro del array en un entero

        System.out.println("************************************************");

        misAutos.add(0, a1); // metodo que agrega un objeto en la posicion que se desea colocar desplazando al objeto de la posicion selecionada a la derecha
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        misAutos.add(2, a4);
        System.out.println(misAutos.size());
        System.out.println(misAutos);

        /*System.out.println("************************************************");

        misAutos.clear(); //elimina todos los elementos de la lista
        
        System.out.println(misAutos.size());
        System.out.println(misAutos);*/
        
        System.out.println("************************************************");

        
        System.out.println(misAutos.size());
        System.out.println(misAutos);
    }

}
