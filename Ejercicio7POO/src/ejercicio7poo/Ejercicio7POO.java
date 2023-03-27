/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio7poo;

import Entidad.Persona;
import Servicio.PersonaServicio;

/**
 *
 * @author Usuario
 */
public class Ejercicio7POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        Persona p1 = ps.crearPersona();
        System.out.println("Informacion agregada correctamente en PERSONA 1");
        System.out.println("");
        Persona p2 = ps.crearPersona();
        System.out.println("Informacion agregada correctamente en PERSONA 2");
        System.out.println("");
        Persona p3 = ps.crearPersona();
        System.out.println("Informacion agregada correctamente en PERSONA 4");
        System.out.println("");
        Persona p4 = ps.crearPersona();
        System.out.println("Informacion agregada correctamente en PERSONA 4");
        System.out.println("");

        System.out.println("CALCULO DE INDICE DE MASA CORPORAL (ICM)");
        System.out.println("Persona 1 " + p1.getNombre());
        ps.calcularICM(p1);
        System.out.println(ps.edadM(p1));
        System.out.println("Persona 2 " + p2.getNombre());
        ps.calcularICM(p2);
        System.out.println(ps.edadM(p2));
        System.out.println("Persona 3 " + p3.getNombre());
        ps.calcularICM(p3);
        System.out.println(ps.edadM(p3));
        System.out.println("Persona 4 " + p4.getNombre());
        ps.calcularICM(p4);
        System.out.println(ps.edadM(p4));
        
        
        
        

    }
}