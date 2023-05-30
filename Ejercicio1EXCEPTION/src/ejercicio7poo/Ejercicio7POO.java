package ejercicio7poo;

import Entidad.Persona;
import Servicio.PersonaServicio;

public class Ejercicio7POO {

    public static void main(String[] args) {

        PersonaServicio ps = new PersonaServicio();
        Persona p1 = null;
        //ps.edadM(p1);
        try {
            //Se intenta llamar el metodo edadM con un objeto incializado con null (p1).
            ps.edadM(p1);

        } catch (NullPointerException n) {
            // Si la invocacion del metodo da error el programa avanza al bloque catch y se ejecuta el codigo catch
            System.out.println("Error: Objeto inicializado como null");
            System.out.println("Error: " + n.getMessage()); // devuelve una descripcion de la excepcion
            System.out.println("Error: "+ n); //Devuelve un objeto String que contiene la descripcion completa de la excepcion
            System.out.println(n.fillInStackTrace()); // Devuelve un objeto Throwable que contiene un seguimiento de pila completo
            System.out.println(n.toString()); //Devuelve un objeto String que contiene la descripcion completa de la excepcion
        }

    }

}
