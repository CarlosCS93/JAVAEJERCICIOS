package ejercicio3pooextra;

import Entidad.Raices;
import Servicio.RaicesServicio;

public class Ejercicio3POOEXTRA {

    public static void main(String[] args) {

        RaicesServicio rs = new RaicesServicio();

        Raices rc = new Raices(1, 4, 4);
        System.out.println("*");

        System.out.println("El discrimiante es: " + rs.discriminante(rc));
        //System.out.println(rs.tieneRaices(rc));
        //System.out.println(rs.tieneRaiz(rc));
        rs.calcular(rc);

        Raices rr = new Raices(2, 9, 2);

        System.out.println("El discrimiante es: " + rs.discriminante(rr));
        //System.out.println(rs.tieneRaices(rr));
        //System.out.println(rs.tieneRaiz(rr));
        rs.calcular(rr);

    }

}
