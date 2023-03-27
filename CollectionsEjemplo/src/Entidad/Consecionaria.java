/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Consecionaria {

    private String nombre;
    private ArrayList<Auto> autos;

    public Consecionaria(String nombre) {
        this.nombre = nombre;
        this.autos = new ArrayList<>();

    }

    public void agregarAuto(Auto a) {
        this.autos.add(a);
    }

    /*public void mostrarAutos (){
        if (autos.isEmpty()) { // retorna verdadero si la lista no contiene elementos es decir 0
            System.out.println("No hay autos");
            
        }else {
            /*for (int i = 0; i < autos.size(); i++) {
                Auto a= autos.get(i);
                System.out.println(a);
                System.out.println(autos.get(i)); // meodo get que recibe un indice entero como argumento i=0 y asi secusivamente
            }
            for (Auto a : autos) { // por cada auto en la variable temporal "a" de la collecion de autos quiero hacer :
                System.out.println(a);
                
            }
        }*/
    public int sumatoriaKmRecorridos() {

        int acumulador = 0;
        for (Auto auto : autos) {
            acumulador += auto.getKmRecorridos();
        }
        return acumulador;
    }

    public int cantidadAutos() {
        return autos.size();
    }

    public double promdioKmRecorridos() {

// 1. Una forma de hacer el promedio con metodos antes establecidos
//return sumatoriaKmRecorridos()/cantidadAutos(); 
//2. Otra forma utilizando el metodo size para saber la cantidad de autos directamente
//return sumatoriaKmRecorridos()/autos.size(); 
//
//Java al realizar una division de enteros retornara siempre enteros asi haya decimales retornara un entero para esos casos
// donde se requiera retornar un valor de tipo doble con sus decimales correspondientes y no truncados
//Esto es casting se antepone la variable primitiva en este caso double antes del valor para que java lo tome como un double 
// y poder retornar una operacion matematica correcta con los decimales correspondientes 

        //return (double) sumatoriaKmRecorridos() / cantidadAutos();      
        double promedio = 0;

        if (cantidadAutos() > 0) {
            promedio = (double) sumatoriaKmRecorridos() / cantidadAutos();
        }
        return promedio;
        //return (cantidadAutos()>0 ? (double) sumatoriaKmRecorridos()/cantidadAutos() : 0 ); estructura operador ternaria "?" emula un operador if y else
    }

}
