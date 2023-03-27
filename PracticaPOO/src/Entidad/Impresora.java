/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Impresora {
    
    private boolean estaEncendida; // por defecto es false

    public void encender() {
        estaEncendida = true;
    }

    public void imprimir(Documento doc) {
        if (estaEncendida) { // siempre sera true
            System.out.println("Imprimiendo doc " + doc.getTitulo());
            System.out.println("****************");
            System.out.println(doc.getCuerpo());
            System.out.println("****************");
        } else {
            System.out.println("Impresora apagada!");
        }
    }
}
