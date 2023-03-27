/*
 * Realizar un programa para que una Persona pueda adoptar un Perro. Vamos a contar de dos
clases. Perro, que tendrá como atributos: nombre, raza, edad y tamaño; y la clase Persona con
atributos: nombre, apellido, edad, documento y Perro.
Ahora deberemos en el main crear dos Personas y dos Perros. Después, vamos a tener que
pensar la lógica necesaria para asignarle a cada Persona un Perro y por ultimo, mostrar desde
la clase Persona, la información del Perro y de la Persona.

 */
package Entidad;

import java.util.ArrayList;

public class Persona {

    private String nombre;
    private String apellido;
    private int edad;
    private String identificacion;
    private Perro perro;
    private ArrayList<Persona> p;

    public Persona() {
        p = new ArrayList();
    }

    public Persona(String nombre, String apellido, int edad, String identificacion, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.identificacion = identificacion;
        this.perro = perro;
    }

    public ArrayList<Persona> getP() {
        return p;
    }

    public void setP(ArrayList<Persona> p) {
        this.p = p;
    }

    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public Perro getPerro() {
        return perro;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    @Override
    public String toString() {
        return "Persona {" + "Nombre=" + nombre + ", Apellido=" + apellido + ", Edad=" + edad + " años, Identificacion=" + identificacion + ", Mascota = " + perro + '}';
    }

    public void mostrarInformacion() {

    }

}
