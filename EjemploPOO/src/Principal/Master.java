/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author Usuario
 */
public class Master {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        CuentaBancaria cb = new CuentaBancaria();
        cb.mostrarDatos();
        
        // System.out.println(cb.CBU+" "+cb.alias+" "+cb.saldo);
        cb.CBU = "23002643510010021234";
        cb.alias = "Carlos93";
        // System.out.println(cb.CBU+" "+cb.alias+" "+cb.saldo);
        
        cb.mostrarDatos();
        
        cb.obtenerSaldo(); // si lo invoco asi no mostrara nada por pantalla porque devuelvo un dato o valor
        
        System.out.println(cb.obtenerSaldo()); // de esta manera puedo mostrar por pantalla el valor de retorno
        
        cb.depositar(200);
        
        System.out.println(cb.obtenerSaldo());
        
        cb.depositar(-50); // al depositar no tiene logica que el saldo disminuya o se reste por el valor introducido
        
        System.out.println(cb.obtenerSaldo()); // se resto el valor del saldo algo que no tiene logica en su comportamiento
    
         cb.depositar(200);
        
        System.out.println(cb.obtenerSaldo());
        
        //System.out.println(cb.saldoDisponible(200));
        //System.out.println(cb.saldoDisponible(300));
    
        cb.extraer(300); // realiza el retiro debido a que el saldo anterior era 400
        System.out.println(cb.obtenerSaldo()); // se muestra por pontalla el saldo disponible 100
        cb.extraer(500); // no realiza el retiro porque el saldo despues del primer retiro es 100
        System.out.println(cb.obtenerSaldo()); // se muestra nuevamente el saldo disponible de 100
    
    }
    
}
