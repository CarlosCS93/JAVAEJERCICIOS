/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio4pooextra;

import Entidad.NIF;
import Servicio.NifServicio;

/**
 *
 * @author Usuario
 */
public class Ejercicio4POOEXTRA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        NifServicio nf = new NifServicio();
        NIF n = new NIF();
        nf.crearNif(n);
        nf.mostarNif(n);
        
    }

}
