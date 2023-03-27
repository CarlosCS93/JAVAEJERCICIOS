/*
 * Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará
al usuario.
*/
package Entidad;

import java.util.HashSet;
import java.util.Objects;
import java.util.Scanner;


public class Paises {

    private String nombrePais;
    private HashSet<Paises> pais ; 
    private Scanner scan;
    
    
    public Paises (){
        pais = new HashSet();
        scan= new Scanner (System.in).useDelimiter("\n");
    }

    public Paises(String nombrePais) {
        this.nombrePais = nombrePais;
    }
    

    public String getNombrePais() {
        return nombrePais;
    }

    public void setNombrePais(String nombrePais) {
        this.nombrePais = nombrePais;
    }

    public HashSet<Paises> getPais() {
        return pais;
    }

    public void setPais(HashSet<Paises> pais) {
        this.pais = pais;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 53 * hash + Objects.hashCode(this.nombrePais);
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
        final Paises other = (Paises) obj;
        if (!Objects.equals(this.nombrePais, other.nombrePais)) {
            return false;
        }
        return true;
    }

   

    
    
    @Override
    public String toString() {
        return "Paises{" + "nombrePais = " + nombrePais + '}';
    }
    
    
    
}
