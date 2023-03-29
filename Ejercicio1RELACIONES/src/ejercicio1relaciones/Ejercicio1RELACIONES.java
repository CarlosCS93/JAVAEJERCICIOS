/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1relaciones;

import Entidad.Perro;
import Entidad.Persona;
import Servicio.ServicioAdopcion;
import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Ejercicio1RELACIONES {

    
    public static void main(String[] args) {
        
        ServicioAdopcion sa = new ServicioAdopcion();
        Perro p = new Perro();
        Persona pe = new Persona();
        sa.procedimiento(pe, p);
        
        
        /*Perro p1 = new Perro("Churitos", "Poodle", 2, "pequeño");
        
        Perro p2 = new Perro("Caramelito", "Poodle", 3, "Mediano");
        Persona per1 = new Persona("Carlos", "Chugcho", 30, "2300264351", p1);
        Persona per2 = new Persona("Evelin", "Zambrano", 30, "2300274806", p2);
        
        System.out.println(per1);
        System.out.println(per2);
        */
        
        
        
}
    
}
