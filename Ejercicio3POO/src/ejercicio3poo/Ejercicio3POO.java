/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio3poo;

import Entidad.Operacion;
import ServicioOperacion.ServicioOperacion;

/**
 *
 * @author Usuario
 */
public class Ejercicio3POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioOperacion sp = new ServicioOperacion();
        Operacion op = sp.crearOperacion();
        sp.sumar(op);
        sp.restar(op);
        sp.multiplicar(op);
        sp.division(op);
        
    }
    
}
