/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarrayslist;

import Entidad.Auto;
import Entidad.Motor;

/**
 *
 * @author Usuario
 */
public class EjemploArraysList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Motor m = new Motor("15243", 1.6, "Gasolina");
        Auto auto = new Auto("XYZ432", "Toyota", 42323, "rojo", m);

        Auto auto2 = new Auto("XYZ432", "Toyota", 42323, "azul", m);
        
        System.out.println(m);
        System.out.println(auto);
        System.out.println(auto2);
        m.setCilindrada(2.4);
        System.out.println("===============");
        System.out.println(m);
        System.out.println(auto);
        System.out.println(auto2);

    }

}
