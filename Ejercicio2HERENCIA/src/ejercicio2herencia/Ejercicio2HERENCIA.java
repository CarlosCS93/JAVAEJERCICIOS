package ejercicio2herencia;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import java.util.ArrayList;

public class Ejercicio2HERENCIA {

    public static void main(String[] args) {

        Lavadora la = new Lavadora();
        la.crearLavadora();
        la.precioFinal();
        System.out.println(la);

        Televisor tv = new Televisor();
        tv.crearElectrodomestico();
        tv.precioFinal();
        System.out.println(tv);

        System.out.println("*****************************************************************");
        System.out.println("EJERCICIO N3 DE HERENCIA ES LA CONTINUACION DEL SEGUNDO EJERCICIO");
        ArrayList<Electrodomestico> listaElectrodomesticos = new ArrayList();

        Lavadora l = new Lavadora(20, 1000d, 'E', "AZUL", 30);
        Lavadora l2 = new Lavadora(40, 1000d, 'A', "ROJO", 90);
        Televisor tv2 = new Televisor(45, true, 1000d, 'B', "NEGRO", 90);
        Televisor tv3 = new Televisor(60, false, 1000d, 'A', "GRIS", 45);

        listaElectrodomesticos.add(l);
        listaElectrodomesticos.add(l2);
        listaElectrodomesticos.add(tv2);
        listaElectrodomesticos.add(tv3);

        double precioTotal = 0;

        for (Electrodomestico lista : listaElectrodomesticos) {
            lista.precioFinal();
            precioTotal += lista.getPrecio();

        }
        System.out.println("El precio final es $ " + precioTotal);
    }

}
