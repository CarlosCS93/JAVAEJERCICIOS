package ejercicio11poo;

import java.util.Date;
import java.util.Scanner;

public class Ejercicio11POO {

    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el dia");
        int dia = leer.nextInt();
        System.out.println("Ingrese el mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese el anio");
        int anio = leer.nextInt();
        int var = 2002;
        int var2 = 1900;
        System.out.println(var - var2);
        Date usuariofecha = new Date(anio - 1900, mes - 1, dia);
        System.out.println(usuariofecha);

        Date fechaActual = new Date();
        System.out.println(fechaActual);
        int diferencia = (fechaActual.getYear() - usuariofecha.getYear());
        System.out.println("La diferencia de años entre las fechas es: " + diferencia + " años");
    }

}
