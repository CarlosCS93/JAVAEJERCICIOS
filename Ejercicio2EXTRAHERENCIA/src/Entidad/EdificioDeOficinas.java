/*
 * Clase EdificioDeOficinas con sus atributos número de oficinas, cantidad de personas
por oficina y número de pisos. Esta clase implementará los dos métodos abstractos y
los atributos del padre.
De esta clase nos interesa saber cuántas personas pueden trabajar en todo el edificio, el
usuario dirá cuántas personas entran en cada oficina, cuantas oficinas y el número de piso
(suponiendo que en cada piso hay una oficina). Crear el método cantPersonas(), que muestre
cuantas personas entrarían en un piso y cuantas en todo el edificio.

 */
package Entidad;

import java.util.Random;
import java.util.Scanner;

public class EdificioDeOficinas extends Edificio {

    private int numeroOficinas;
    private int cantidadPersonas;
    private int numeroPisos;

    public EdificioDeOficinas() {
        super.getScan();
    }

    public EdificioDeOficinas(int numeroOficinas, int cantidadPersonas, int numeroPisos, int ancho, int alto, int largo, Scanner scan) {
        super(ancho, alto, largo, scan);
        this.numeroOficinas = numeroOficinas;
        this.cantidadPersonas = cantidadPersonas;
        this.numeroPisos = numeroPisos;
    }

    public void cantidadPersonas() {

        Random r = new Random();
        this.numeroOficinas = (r.nextInt(3) + 4);
        this.cantidadPersonas = (r.nextInt(20) + 5);
        this.numeroPisos = (r.nextInt(10) + 3);
        System.out.println("Numero de Oficinas " + this.numeroOficinas);
        System.out.println("Cantidad de Personas " + this.cantidadPersonas);
        System.out.println("Numero de Pisos " + this.numeroPisos);
        int canPersonas = (this.numeroOficinas * this.cantidadPersonas);
        System.out.println("Cantidad de personas por piso " + canPersonas);
        int cantiPersonasTotal = (canPersonas*this.numeroPisos);
        System.out.println("Cantidad de personas en el Edificio "+ cantiPersonasTotal);
    }

    @Override
    public void informacion() {
        super.informacion();
    }

    @Override
    public void calcularSuperficie() {
        int superficie = (super.getAncho() * super.getLargo());
        System.out.println("La superficie del Edificio es " + superficie + " m^2");
    }

    @Override
    public void calcularVolumen() {
        int volumen = (super.getAlto() * super.getAncho() * super.getLargo());

        System.out.println("El volumen del Edificio es " + volumen + " m^2");
    }

}
