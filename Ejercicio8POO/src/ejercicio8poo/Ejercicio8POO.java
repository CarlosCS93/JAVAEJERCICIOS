/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio8poo;

import Entidad.Cadena;
import Servicio.CadenaServicio;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercicio8POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        CadenaServicio cs = new CadenaServicio();
        Cadena c = new Cadena ();
        System.out.println("Ingrese una palabra o frase");
        c.setFrase(leer.nextLine());
        c.setLongitud(c.getFrase().length());
        cs.mostrarVocales(c);
        cs.invertirFrase(c);
        // cs.invertirFrase2(c);
        System.out.println("Ingrese un caracter que desee buscar");
        String frase = leer.nextLine();
        cs.vecesRepetidos(frase, c);
        System.out.println("Ingrese una nueva frase o palabra");
        String palabra = leer.nextLine();
        cs.comparaLongitud(palabra, c);
        cs.unirFrases(palabra, c);
        System.out.println("Ingrese un caracter o simbolo");
        String caracter =leer.next();
        cs.reemplazarVocal(caracter, c);
        cs.contieneLetra(frase, c);
        
        
        
    }
    
}
