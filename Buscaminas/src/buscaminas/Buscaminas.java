/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buscaminas;

import Entidad.BuscaminasCJ;
import Servicio.BuscaminasServicio;

/**
 *
 * @author Usuario
 */
public class Buscaminas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BuscaminasServicio bs = new BuscaminasServicio();
        BuscaminasCJ b = bs.llenarBuscaminas();
        bs.mostartablero(b);
    }

}
