package Entidad;

import java.util.Random;
import java.util.Scanner;

public class Polideportivo extends Edificio {

    private boolean techo;

    public Polideportivo() {
        super.getScan();
        
    }

    public Polideportivo(boolean techo, int ancho, int alto, int largo, Scanner scan) {
        super(ancho, alto, largo, scan);
        this.techo = techo;
    }

    public boolean techado() {
        Random r = new Random();
        String[] opcion = {"si", "no"};
        System.out.println("El polideportivo tiene Techado ?");
        String respuesta = opcion[r.nextInt(1)];
        System.out.println(respuesta);
        return this.techo = respuesta.equals("si");

    }

    public void cantidadDeTechados() {

        
        int contador = 0;
        int contador2 = 0;
        
        do {
            
        if (techado()) {
            contador++;
        } else {
            contador2++;
        }
            
        } while (techo);
        
        System.out.println("Cantidad de polideportivo con techado "+ contador);
        System.out.println("Cantidad de Polideportivo sin techado "+ contador2);
    }

    @Override
    public void informacion() {
        super.informacion();
    }

    @Override
    public void calcularSuperficie() {

        int superficie = (super.getAncho() * super.getLargo());
        System.out.println("La superficie del Polideportivo es " + superficie + " m^2");

    }

    @Override
    public void calcularVolumen() {

        int volumen = (super.getAlto() * super.getAncho() * super.getLargo());

        System.out.println("El volumen del PoliDeportivo es " + volumen + " m^2");
    }

}
