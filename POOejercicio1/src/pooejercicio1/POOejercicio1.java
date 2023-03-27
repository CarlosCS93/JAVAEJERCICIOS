/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooejercicio1;
import Entidad.Personas;
import java.util.Scanner;
/**
 *
 * @author Usuario
 */
public class POOejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        Scanner leer = new Scanner(System.in);
        /* Personas p1 = new Personas();Asi se escribe para llamar al constructor
        - Personas p1 = new Personas(nombre, apellido, 0); Asi se ve el constructor invocado aplastando ctrl + spacio
        Se puede escribir directamente sobre  los argumentos del constructor o pedir informacion por teclado
        Ejemplo:
        nombre reemplazo por "Carlos
        nombre reemplazo por leer.next (); dependiendo del tipo de argumento en este caso es un String */ 
        Personas p1 = new Personas("Carlos", leer.next(), leer.nextInt(), leer.next());// 
        
        p1.setNombre("Evelin");
        
        System.out.println(p1.getNombre()+" "+p1.getApellido()+" "+p1.getEdad()+" "+p1.getGenero());
               
    }
}

    