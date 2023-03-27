/*
 *Implemente la clase Persona. Una persona tiene un nombre y una fecha de nacimiento
(Tipo Date), constructor vacío, constructor parametrizado, get y set. Y los siguientes
métodos:
 Agregar un método de creación del objeto que respete la siguiente firma:
crearPersona(). Este método rellena el objeto mediante un Scanner y le pregunta al
usuario el nombre y la fecha de nacimiento de la persona a crear, recordemos que la
fecha de nacimiento debe guardarse en un Date y los guarda en el objeto.
 Escribir un método calcularEdad() a partir de la fecha de nacimiento ingresada. Tener
en cuenta que para conocer la edad de la persona también se debe conocer la fecha
actual.
 Agregar a la clase el método menorQue(int edad) que recibe como parámetro otra
edad y retorna true en caso de que el receptor tenga menor edad que la persona que
se recibe como parámetro, o false en caso contrario.
 Metodo mostrarPersona(): este método muestra la persona creada en el método
anterior.
*/
package Servicio;
import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {
    
    public Persona crearPersona (){
        Scanner leer = new Scanner (System.in);
        Persona p = new Persona();
        System.out.println("Ingrese su nombre");
        p.setNombre(leer.next());
        System.out.println("Ingrese su dia de nacimiento");
        int dia = leer.nextInt();
        System.out.println("Ingrese su mes de nacimiento");
        int mes = leer.nextInt();
        System.out.println("Ingrese el anio de nacimiento");
        int anio = leer.nextInt();
        Date fecha = new Date(anio-1900, mes-1, dia);
        p.setFechaNacimiento(fecha);
        
        return p;
    }
    
    public void calcularEdad (Persona p){
        
        Date fechaActual = new Date ();
        int edad = (fechaActual.getYear() - p.getFechaNacimiento().getYear());
        System.out.println("Su edad es :" + edad+ " años");
        
    }
}
