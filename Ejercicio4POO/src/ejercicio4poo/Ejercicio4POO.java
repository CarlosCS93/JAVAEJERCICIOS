/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4poo;

import Entidad.Rectangulo;
import Servicio.ServicioRectangulo;

/**
 *
 * @author Usuario
 */
public class Ejercicio4POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ServicioRectangulo sr = new ServicioRectangulo();
        Rectangulo rc = sr.crearRectangulo();
        sr.calculoSuperficie(rc);
        sr.calculoPerimetro(rc);
        sr.dibujarRectangulo(rc);
    }
    
}
