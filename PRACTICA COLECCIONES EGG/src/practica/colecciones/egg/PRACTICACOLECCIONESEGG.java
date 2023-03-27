/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practica.colecciones.egg;

import Entidad.Objeto;
import Servicio.ObjetoServicio;

/**
 *
 * @author Usuario
 */
public class PRACTICACOLECCIONESEGG {

    public static void main(String[] args) {
        ObjetoServicio o = new ObjetoServicio();
        Objeto ob = new Objeto();
        o.agregarObjeto(ob);
        o.eliminarObjeto(ob);
    }
    
}
