package Servicio;

import Entidad.Arreglo;
import java.util.Arrays;

public class ArrayServicio {

    public Arreglo llenarA() {

        Arreglo arreglo = new Arreglo();
        
        double[] aux = new double[50];
        
        System.out.println("Arreglo Base");
        for (int i = 0; i < aux.length; i++) {
            aux[i] = (int) (Math.random() * (10));
            arreglo.setA(aux);
        }

        mostrarA(arreglo);

        return arreglo;
    }

    private void mostrarA(Arreglo arreglo) {

        for (double a : arreglo.getA()) {
            System.out.print("[" + a + "]");
        }
        System.out.println("");
    }

    public void ordenarA(Arreglo arreglo) { // se importa los metodos Arrays (import java.util.Arrays;)
        System.out.println("Arreglo ordenado de menor a mayor");
        
        Arrays.sort(arreglo.getA()); // Manera de ordenar de menor a mayor un arreglo (Arrays.sort(Arreglo);

        for (double n : arreglo.getA()) { // Manera de expresar el for mejorado

            System.out.print("[" + n + "]");

        }
        System.out.println("");
    }

    public void copiaryrellenarB(Arreglo arreglo) {
        System.out.println("Arreglo con los primeros 10 datos del primer arreglo y rellenado con 0,5");
        /*Manera de copiar los valores de un array desde un punto a otro punto segun la necesidad*/

        arreglo.setB(Arrays.copyOfRange(arreglo.getA(), 0, 20));
        Arrays.fill(arreglo.getB(), 10, 20, 0.5); //Manera de rellenar con un valor especifico desde un punto a otro

        for (double d : arreglo.getB()) { // for mejorado
            System.out.print("[" + d + "]");
        }
        System.out.println("");
    }

}
