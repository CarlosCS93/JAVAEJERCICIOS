/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio1pooextra;

import Entidad.Cancion;

/**
 *
 * @author Usuario
 */
public class Ejercicio1POOEXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Cancion ca = new Cancion();
        ca.setTitulo("Violinista en mi tejado");
        ca.setAutor("Melendi");
        Cancion c = new Cancion("Mayte ", " Carlos Vives");
        c.setTitulo("Cancion bonita");
        System.out.println(ca.getAutor());
        System.out.println(ca.getTitulo());
        System.out.println(c.getTitulo()+c.getAutor());
    
    }
    
}
