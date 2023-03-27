/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercico6poo;

import Servicio.CafeteraServicio;
import Entidad.Cafetera;
import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Ejercico6POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        CafeteraServicio cs = new CafeteraServicio();
        Cafetera cf = cs.llenarCafetera();

        boolean a = true;
        
        do {

            System.out.println("SISTEMA EXPRESS CAFE");
            System.out.println("1. Tamaño de taza");
            System.out.println("2. Servir cafe");
            System.out.println("3. Vaciar Cafetera");
            System.out.println("4. Agregar cafe");
            System.out.println("5. Cantidad Actual");
            System.out.println("6. Salir");
            System.out.println("Seleccione la opcion");
            int opcion = leer.nextInt();
            switch (opcion) {
                case 1:
                    cs.llenarTaza(cf);
                    break;
                case 2:
                    cs.servirTaza(cf);
                    break;
                case 3:
                    cs.vaciarCafetera(cf);
                    break;
                case 4:
                    cs.agregarCafe(cf);
                    break;
                case 5:
                    cs.saldoCafe(cf);
                    break;
                case 6:
                    a = false;
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
                    break;
            }

        } while (a == true);

    }

}
