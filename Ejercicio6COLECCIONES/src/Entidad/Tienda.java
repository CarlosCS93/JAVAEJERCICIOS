/*
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.

 */
package Entidad;

import java.util.HashMap;
import java.util.Objects;

public class Tienda {

    private HashMap<String, Tienda> aplicacion;
    private Double precio;

    public Tienda() {
        aplicacion = new HashMap();
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public HashMap<String, Tienda> getAplicacion() {
        return aplicacion;
    }

    public void setAplicacion(HashMap<String, Tienda> aplicacion) {
        this.aplicacion = aplicacion;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 11 * hash + Objects.hashCode(this.aplicacion);
        hash = 11 * hash + Objects.hashCode(this.precio);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Tienda other = (Tienda) obj;
        if (!Objects.equals(this.aplicacion, other.aplicacion)) {
            return false;
        }
        if (!Objects.equals(this.precio, other.precio)) {
            return false;
        }
        return true;
    }

    
    
    
    @Override
    public String toString() {
        return "{" + precio + '}';
    }

    

}
