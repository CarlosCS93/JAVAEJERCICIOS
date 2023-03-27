/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Auto {
    
    private String patente;
    private String color;
    private int kmRecorridos;

    public Auto(String patente, String color) {
        this.patente = patente;
        this.color = color;
    }

    public Auto(String patente, String color, int kmRecorridos) {
        this.patente = patente;
        this.color = color;
        this.kmRecorridos = kmRecorridos;
    }

    public int getKmRecorridos() {
        return kmRecorridos;
    }

        
    @Override
    public String toString() {
        return "Auto{" + "patente=" + patente + ", color=" + color + ", kmRecorridos=" + kmRecorridos + '}';
    }
    
    

    
    
    
}
