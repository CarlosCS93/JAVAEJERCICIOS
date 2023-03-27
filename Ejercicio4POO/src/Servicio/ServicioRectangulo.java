package Servicio;

import Entidad.Rectangulo;
import java.util.Scanner;

public class ServicioRectangulo {

    public Rectangulo crearRectangulo() {
        Rectangulo rc = new Rectangulo(0, 0);
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la base del rectangulo");
        rc.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura del rectangulo");
        rc.setAltura(leer.nextDouble());

        return rc;
    }

    public void calculoSuperficie(Rectangulo rc) {

        double superficie = (rc.getBase() * rc.getAltura());
        System.out.println("La superficie del rectangulo es: " + superficie);
    }

    public void calculoPerimetro(Rectangulo rc) {
        double perimetro = ((rc.getBase() + rc.getAltura()) * 2);
        System.out.println("El perimetro del rectangulo es: " + perimetro);
    }

    public void dibujarRectangulo(Rectangulo rc) {

        for (int i = 1; i <= rc.getAltura(); i++) {
            for (int j = 1; j <= rc.getBase(); j++) {
                if (i == 1 || i == rc.getAltura() || j == 1 || j == rc.getBase()) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }
            }
            System.out.println("");
        }
        System.out.println("");
    }

}
