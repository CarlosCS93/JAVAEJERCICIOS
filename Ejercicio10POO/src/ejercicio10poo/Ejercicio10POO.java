package ejercicio10poo;

import Entidad.Arreglo;
import Servicio.ArrayServicio;
import java.util.Arrays;

public class Ejercicio10POO {

    public static void main(String[] args) {
        ArrayServicio array = new ArrayServicio();

        Arreglo ar = array.llenarA();
        array.ordenarA(ar);
        array.copiaryrellenarB(ar);

       /*int[][] prueba = new int[3][3];
        int[] aux = new int[prueba.length * prueba.length];
        int[] auxi = new int[prueba.length];
        for (int i = 0; i < prueba.length; i++) {
            for (int j = 0; j < prueba.length; j++) {
                prueba[i][j] = (int) (Math.random() * 10);
                auxi[i + j] = prueba[i][j];

            }

        }
        
        for (int []ma : prueba) {
            System.out.print(ma);
            System.out.println("");
        }
        
        for (int i : auxi) {
            System.out.print(i);
        }
        System.out.println("");
    }*/
}
}


