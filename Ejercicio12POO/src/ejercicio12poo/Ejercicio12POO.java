/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio12poo;

import Servicio.PersonaServicio;
import Entidad.Persona;

public class Ejercicio12POO {

    
    public static void main(String[] args) {
        PersonaServicio ps = new PersonaServicio();
        
        Persona pe = ps.crearPersona();
        ps.calcularEdad(pe);
    }
    
}
