/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio13poo;

import Entidad.Curso;
import Servicio.ServicioClase;

/**
 *
 * @author Usuario
 */
public class Ejercicio13POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioClase sc = new ServicioClase();
        Curso c = sc.crearCurso();
        sc.calculoGanancia(c);
        
    }
    
}
