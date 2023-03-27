
package Entidad;

public class Objeto {
    
    private String nombre;
    private String apellido;
    
    
    public Objeto (String nombre, String apellido){
        this.nombre = nombre ;
        this.apellido = apellido ;
    }

    @Override
    public String toString() {
        return "Objeto{" + "nombre=" + nombre + ", apellido=" + apellido + '}';
    }
    
    
}
