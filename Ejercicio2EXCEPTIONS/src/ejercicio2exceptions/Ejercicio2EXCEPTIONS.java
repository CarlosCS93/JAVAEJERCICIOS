package ejercicio2exceptions;

import Entidad.Array;

public class Ejercicio2EXCEPTIONS {

    public static void main(String[] args) {

        Array a = new Array();

        try {
            a.llenarNumeros();
        } catch (ArrayIndexOutOfBoundsException aiobe) {

            System.out.println("Error: " + aiobe.getMessage());
            System.out.println(aiobe);
            System.out.println("Error: " + aiobe.fillInStackTrace());
            a.mostrarNumeros();
            System.out.println("");
        }

    }

}
