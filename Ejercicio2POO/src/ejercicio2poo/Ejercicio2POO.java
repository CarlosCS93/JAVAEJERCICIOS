/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicio2poo;

import Entidad.Circunferencia;
import Servicio.ServicioCircunferencia;

public class Ejercicio2POO {

   
    public static void main(String[] args) {
        
        ServicioCircunferencia sc = new ServicioCircunferencia();
        Circunferencia C = sc.crearCircunferencia();
        sc.calcularAea(C);
        sc.calcularPerimetro(C);
        
    }
    
}
