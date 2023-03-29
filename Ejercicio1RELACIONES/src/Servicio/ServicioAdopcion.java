
package Servicio;

import Entidad.Perro;
import Entidad.Persona;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Carlos Javier Ch.
 */
public class ServicioAdopcion {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {

        Persona persona = new Persona();
        System.out.print("Nombre: ");
        persona.setNombre(leer.next());
        System.out.print("Apellido: ");
        persona.setApellido(leer.next());
        System.out.print("Edad: ");
        persona.setEdad(leer.nextInt());
        System.out.print("Identificacion: ");
        persona.setIdentificacion(leer.next());

        return persona;
    }

    public Perro crearPerro() {

        Perro p = new Perro();

        System.out.print("Nombre: ");
        p.setNombre(leer.next());
        System.out.print("Raza: ");
        p.setRaza(leer.next());
        System.out.print("Edad: ");
        p.setEdad(leer.nextInt());
        System.out.print("Tamaño: ");
        p.setTamano(leer.next());

        return p;

    }

    public void CargarInformacionPerro(Perro p) {

        boolean van;

        do {
            p.getPerros().add(crearPerro());
            System.out.println("Desea ingresar otro Perro ? s/n");
            String respuesta = leer.next().toLowerCase();
            van = respuesta.equals("s");

        } while (van);

    }

    public void mostrarPerros(Perro p) {

        for (Perro perro : p.getPerros()) {
            System.out.println(perro);
        }
    }

    public void CargarInformacionPersona(Persona p) {

        boolean van;

        do {
            p.getP().add(crearPersona());

            System.out.println("Desea ingresar otra persona ? s/n");
            String respuesta = leer.next().toLowerCase();
            van = respuesta.equals("s");

        } while (van);

    }

    public void mostrarPersonas(Persona persona) {
        for (Persona per : persona.getP()) {
            System.out.println(per);
        }
    }

    public void procedimiento(Persona persona, Perro p) {

        CargarInformacionPerro(p);
        CargarInformacionPersona(persona);
        System.out.println("PERRITOS EN ADOPCION");
        mostrarPerros(p);
        System.out.println("*************************************************");
        int aux2 = persona.getP().size();
        do {

            System.out.print("Ingrese su nombre -->");
            String nombre = leer.next();
            System.out.print("Que perrito desea adoptar: ");
            String opcion = leer.next();
            int aux = 0;

            for (int i = 0; i < persona.getP().size(); i++) {
                if (nombre.equalsIgnoreCase(persona.getP().get(i).getNombre())) {
                    aux2 -= 1;
                    aux = i;
                }
            }

            for (int j = 0; j < p.getPerros().size(); j++) {
                if (opcion.equalsIgnoreCase(p.getPerros().get(j).getNombre())) {

                    persona.getP().get(aux).setPerro(p.getPerros().get(j));
                    p.getPerros().remove(p.getPerros().get(j));

                }
            }

            System.out.println("******  PERRITOS EN ADOPCION ******");

            mostrarPerros(p);

            System.out.println("***********************************");

        } while (p.getPerros().size() > 0 && aux2 > 0);

        System.out.println("******  ADOPTANTES  ******");

        mostrarPersonas(persona);

    }

}
