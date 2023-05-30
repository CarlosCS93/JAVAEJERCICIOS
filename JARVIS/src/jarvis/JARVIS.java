/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jarvis;

import Entidad.Armadura;
import Entidad.Botas;

/**
 *
 * @author Usuario
 */
public class JARVIS {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Armadura a = new Armadura();
        Botas b = new Botas();
        b.consumoEnergia();
        System.out.println(a);
    }

}
