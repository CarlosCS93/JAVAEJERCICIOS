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
public class Objeto {
    
    private String nombre;
    private ArrayList<Objeto> razas;
    
    public Objeto (){
        razas = new ArrayList();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Objeto> getRazas() {
        return razas;
    }

    public void setRazas(ArrayList<Objeto> razas) {
        this.razas = razas;
    }

    @Override
    public String toString() {
        return "Objeto{" + "nombre=" + nombre + '}';
    }
    
    
    
    
}
