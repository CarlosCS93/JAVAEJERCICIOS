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
public class Contraseña {

    private int longitud;
    private String contrasena;

    public Contraseña() {
        longitud = 8;
    }

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public String getContrasena() {
        return contrasena;
    }

    public Contraseña(int longitud) {
        this.longitud = longitud;
    }
}
