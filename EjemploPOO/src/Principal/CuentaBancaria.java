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
public class CuentaBancaria {

    String CBU;
    String alias;
    double saldo;

    void mostrarDatos() { // metodo void para mostrar por consola no devuelve ningun valor para algun calculo

        System.out.println(CBU + " " + alias + " " + saldo);
    }

    double obtenerSaldo() { // metodo devuelve un valor distinto de vacio (void)

        return saldo;

    }

    void depositar(double monto) { // parametro es un valor alojado en una variable
        if (monto > 0) {  // Cuando recibimos un valor de fuera se recomienda una validacion para no perder logica en el metodo
            saldo += monto;
        }

    }

    boolean saldoDisponible(double monto) { // metodo que recibe un parametro y devuelve un resultado en base a ese tipo de dato

        return saldo >= monto;

    }

    void extraer(double monto) {
        // if (saldo >= monto ) { puedo reemplazar logica que se repite por metodos de la misma clase
        if (saldoDisponible(monto)) {
            saldo -= monto;
        }

    }

}

