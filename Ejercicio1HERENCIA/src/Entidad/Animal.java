/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Animal {
    
    private String nombre;
    private String alimento;
    private int edad;
    private Raza razas;

    public Animal() {
    }

    public Animal(String nombre, String alimento, int edad, Raza razas) {
        this.nombre = nombre;
        this.alimento = alimento;
        this.edad = edad;
        this.razas = razas;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAlimento() {
        return alimento;
    }

    public void setAlimento(String alimento) {
        this.alimento = alimento;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Raza getRaza() {
        return razas;
    }

    public void setRaza(Raza razas) {
        this.razas = razas;
    }
    
    
    public void alimentarse (){
        System.out.println(nombre + " se alimenta con "+ alimento + " por que es de raza "+ razas);
    }

    @Override
    public String toString() {
        return "Animal{" + "nombre=" + nombre + ", alimento=" + alimento + ", edad=" + edad + ", raza=" + razas + '}';
    }
    
    
    
    
}
