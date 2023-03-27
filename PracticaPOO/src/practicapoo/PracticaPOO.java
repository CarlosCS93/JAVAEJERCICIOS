/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicapoo;

import Entidad.Cuenta;
import Entidad.Documento;
import Entidad.Impresora;

/**
 *
 * @author Usuario
 */
public class PracticaPOO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Cuenta c1 = new Cuenta("Evelin Zambrano");
        Cuenta c2 = new Cuenta("Carlos Chugcho", 300);
        c1.ingresar(600);
        c2.ingresar(400);

        c1.retirar(500);
        c2.retirar(100);
        System.out.println(c1);
        System.out.println(c2);
        System.out.println("====================");
        System.out.println("USO Y DEPENDENCIA");
        Documento doc1 = new Documento("Prueba", "Este es un\ntexto de prueba"); // clase documento
        Impresora imp = new Impresora();// clase impresora
        imp.encender(); // metodo que prende o apaga la impresora, si se invoca el metodo prende la impresora
        imp.imprimir(doc1);// depende del metodo encender para realizar 1 u otra opcion

    }

}
