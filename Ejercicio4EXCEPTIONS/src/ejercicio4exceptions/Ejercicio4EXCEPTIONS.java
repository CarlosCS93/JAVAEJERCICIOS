/**
 * Todas estas operaciones puede tirar excepciones a manejar, el ingreso por teclado puede
 * causar una excepción de tipo InputMismatchException, el método Integer.parseInt() si la cadena
 * no puede convertirse a entero, arroja una NumberFormatException y además, al dividir un
 * número por cero surge una ArithmeticException. Manipule todas las posibles excepciones
 * utilizando bloques try/catch para las distintas excepciones
 */
package ejercicio4exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Ejercicio4EXCEPTIONS {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese un numero");
        try {
            int nume = leer.nextInt();
            System.out.println("Numero " + nume);
        } catch (InputMismatchException i) {
            System.out.println("Valor incorrecto segun el tipo de dato");
            System.out.println(i.getMessage());
        }

        try {
            int numero = Integer.parseInt("q");

        } catch (NumberFormatException n) {
            System.out.println("No se puede convertir a entero");
            System.out.println(n.getMessage());
        }

        try {
            int resultado = (20 / 0);

        } catch (ArithmeticException a) {
            System.out.println("Division por cero");
            System.out.println(a.getMessage());
        }

    }

}
