/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio9poo;

import Entidad.Matematica;
import Servicio.MatematicaServicio;

/**
 *
 * @author Usuario
 */
public class Ejercicio9POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MatematicaServicio ms = new MatematicaServicio();
        Matematica m = new Matematica();
        m.setNum1(Math.random() * 9 + 1);
        m.setNum2(Math.random() * 9 + 1);
        System.out.println(m.getNum1() + "--" + m.getNum2());

        ms.devolverMayor(m);
        ms.calcularPotencia(m);
        ms.calcularRaiz(m);

    }

}
