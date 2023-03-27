/*
 * Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo String. El
programa pedirá una raza de perro en un bucle, el mismo se guardará en la lista y
después se le preguntará al usuario si quiere guardar otro perro o si quiere salir. Si decide
salir, se mostrará todos los perros guardados en el ArrayList.*/
package Entidad;

import java.util.ArrayList;

public class Raza {

    private String razas;
    private ArrayList<String> raza;

    public Raza() {

    raza = new ArrayList();
        
    }

    public String getRazas() {
        return razas;
    }

    public void setRazas(String razas) {
        this.razas = razas;
    }

    public ArrayList<String> getRaza() {
        return raza;
    }

    public void setRaza(ArrayList<String> raza) {
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "Raza{" + "razas=" + razas + ", raza=" + raza + '}';
    }

    
    
    
    
}
