/*
Programa Nespresso. Desarrolle una clase Cafetera con los atributos capacidadMaxima
(la cantidad máxima de café que puede contener la cafetera) y cantidadActual (la
cantidad actual de café que hay en la cafetera). Implemente, al menos, los siguientes
métodos:
 Constructor predeterminado o vacío
 Constructor con la capacidad máxima y la cantidad actual

 Métodos getters y setters.
 Método llenarCafetera(): hace que la cantidad actual sea igual a la capacidad
máxima.
 Método servirTaza(int): se pide el tamaño de una taza vacía, el método recibe el
tamaño de la taza y simula la acción de servir la taza con la capacidad indicada. Si la
cantidad actual de café “no alcanza” para llenar la taza, se sirve lo que quede. El
método le informará al usuario si se llenó o no la taza, y de no haberse llenado en
cuanto quedó la taza.
 Método vaciarCafetera(): pone la cantidad de café actual en cero.
 Método agregarCafe(int): se le pide al usuario una cantidad de café, el método lo
recibe y se añade a la cafetera la cantidad de café indicada.*/
package Servicio;

import Entidad.Cafetera;

import java.util.Scanner;

public class CafeteraServicio {

    public Cafetera llenarCafetera() {
        Cafetera llenar = new Cafetera(1000, 0);

        
        System.out.println("La capacidad de la Cafetera es de " + llenar.getCapacidadMaxima() + " ml");

        return llenar;
    }

    public void llenarTaza(Cafetera llenar) {

        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la taza");
        llenar.setTamanoT(leer.nextInt());

    }

    public void servirTaza(Cafetera llenar) {

        if (llenar.getTamanoT() == 0) {
            System.out.println("Primero ingrese el tamaño de la taza");
            llenarTaza(llenar);

        } else if (llenar.getCantidadActual() > llenar.getTamanoT() && llenar.getTamanoT() != 0) {
            llenar.setCantidadActual(llenar.getCantidadActual() - llenar.getTamanoT());
            System.out.println("Se lleno su taza de cafe de " + llenar.getTamanoT() + " ml");
            System.out.println("");
        } else if (llenar.getCantidadActual() == 0) {
            System.out.println("Cafetera Vacia");
            System.out.println("Por favor rellene cafe");
            llenar.setCantidadActual(0);
            System.out.println("");
        } else {
            System.out.println("Su taza solo se lleno con " + llenar.getCantidadActual() + " ml de cafe disponible");
            System.out.println("Rellene la cafetera");
            llenar.setCantidadActual(0);
            System.out.println("");
        }
    }

    public void vaciarCafetera(Cafetera llenar) {

        llenar.setCantidadActual(0);
        System.out.println("Cafetera Vacia");
        System.out.println("");
    }

    public void agregarCafe(Cafetera llenar) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de cafe para añadir:");
        int agregar = leer.nextInt();

         if (agregar > llenar.getCapacidadMaxima() || llenar.getCantidadActual()==llenar.getCantidadActual()) {
            System.out.println("Supera la capacidad maxima");
            System.out.println("Capacidad Maxima " + llenar.getCapacidadMaxima() + " ml");
            System.out.println("");
        } else {
            llenar.setCantidadActual(llenar.getCantidadActual() + agregar);
        }
    }

    public void saldoCafe(Cafetera llenar) {

        System.out.println("Cantidad de cafe --- " + llenar.getCantidadActual());
        System.out.println("");
    }

}
