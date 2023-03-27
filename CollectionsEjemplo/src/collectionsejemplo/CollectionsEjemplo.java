/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionsejemplo;

import Entidad.Auto;
import Entidad.Consecionaria;

/**
 *
 * @author Usuario
 */
public class CollectionsEjemplo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Consecionaria c = new Consecionaria("EvelinCar");
        //c.mostrarAutos();

        /*c.agregarAuto(new Auto("asd333", "Azul")); // con el metodo agregar auto no expongo la lista de autos y es enteramente 
        c.agregarAuto(new Auto("dfg443", "Rojo")); // de la clase consecionaria a diferencia del metodo get donde paso la referencia
        c.agregarAuto(new Auto("kij987", "Verde"));// de la lista la cual no es una copia si no la lista original
        */
        //c.getAutos().add(new Auto("asd333", "Azul")); // con el metodo get no cumplo con el encapsulamiento porque le doy tambien
        //c.getAutos().add(new Auto("dfg443", "Rojo")); // el control al metodo principal de poder incluso borrar la lista que le 
        //c.getAutos().add(new Auto("kij987", "Verde"));// pertenece exlusivamente a la concesionaria
        

        /*c.agregarAuto(new Auto("asd333", "Azul", 1800));// si le cambiamos por otro valor ejemplo 1803 vemos que el promedio de km no cambia y se mantiene
        c.agregarAuto(new Auto("fgf904", "Rojo", 3500));// lo cual es un error porque aumenta el valor de la sumatoria por ende tambien 
        c.agregarAuto(new Auto("kiu445", "Amarillo", 2200));// deberia cambiar el promedio, para resolver eso usamos el casting
        c.agregarAuto(new Auto("zas872", "Verde", 2500));// revisar los comentarios del metodo promdioKmReorridos (OJO).
        */
        //c.mostrarAutos();
        
        System.out.println("Kms totales recorridos: "+ c.sumatoriaKmRecorridos());
        System.out.println("Cantidad de autos: "+ c.cantidadAutos());
        System.out.println("Promedio de kms recorridos: " + c.promdioKmRecorridos()); // leer la linea 33, 34, 35 y 36
        
    }

}
