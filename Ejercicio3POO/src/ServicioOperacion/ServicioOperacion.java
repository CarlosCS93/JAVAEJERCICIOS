/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioOperacion;

import Entidad.Operacion;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class ServicioOperacion {

    public Operacion crearOperacion() {
        Operacion op = new Operacion();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el primer numero");
        op.setNumero1(leer.nextInt());
        System.out.println("Ingrese el segundo numero");
        op.setNumero2(leer.nextInt());

        return op;
    }

    public void sumar(Operacion op) {

        int suma = op.getNumero1() + op.getNumero2();
        System.out.println("El resultado de la suma es: " + suma);

    }

    public void restar(Operacion op) {

        int resta = op.getNumero1() - op.getNumero2();
        System.out.println("El resultado de la resta es: " + resta);
    }

    public void multiplicar(Operacion op) {

        int multiplicacion = op.getNumero1() * op.getNumero2();
        if (multiplicacion == 0) {
            System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
            System.out.println("ERROR!! Se ingreso un numero 0");
        } else {
            System.out.println("El resultado de la multiplicacion es: " + multiplicacion);
        }

    }

    public void division(Operacion op) {
        double division = op.getNumero1() / op.getNumero2();
        if (division == 0) {
            System.out.println("El resultado de la division es: " + division);
            System.out.println("ERROR!! Se ingreso un numero 0");
        } else {
            System.out.println("El resultado de la division es: " + division);
        }

    }
}
