package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;

public class ServicioCircunferencia {

    public Circunferencia crearCircunferencia() {

        Circunferencia radio = new Circunferencia(0);
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el radio");
        radio.setRadio(leer.nextDouble());

        return radio;
    }

    public void calcularAea(Circunferencia radio) {
        radio.area =(Math.PI * Math.pow(radio.getRadio(), 2));
        System.out.println("El valor del area es: " + radio.area);
        
    }

    public void calcularPerimetro(Circunferencia radio) {
        radio.perimetro = (2 * Math.PI * radio.getRadio());
        System.out.println("El valor del perimetro es: " + radio.perimetro);
        System.out.println("");
    }

}
