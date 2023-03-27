/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplopoo;

/**
 *
 * @author Usuario
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Auto a = new Auto();

        System.out.println(a.patente + " " + a.color + " " + a.kms + " " + a.conAire);
        a.patente = "ABC123";
        a.color = "Azul Marino";
        a.kms = 552;
        a.conAire = true;
        System.out.println(a.patente + " " + a.color + " " + a.kms + " " + a.conAire);

        Auto a2 = new Auto();
        System.out.println(a2.patente + " " + a2.color + " " + a2.kms + " " + a2.conAire);
        a2.patente = "DEF456";
        a2.color = "Rojo";
        a2.kms = 222;

        System.out.println(a2.patente + " " + a2.color + " " + a2.kms + " " + a2.conAire);

        // IDENTIDAD 
        
        Auto otroAuto;
        otroAuto=a;
        
        System.out.println(a.color);
        otroAuto.color="Amarillo";
        System.out.println(a.color);
        
        
    }

}
