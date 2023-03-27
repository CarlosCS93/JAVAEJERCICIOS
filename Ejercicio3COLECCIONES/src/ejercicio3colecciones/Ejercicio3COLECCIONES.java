package ejercicio3colecciones;

import Entidad.Alumno;
import Servicio.AlumnoServicio;
import java.util.Scanner;

public class Ejercicio3COLECCIONES {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AlumnoServicio as = new AlumnoServicio();
        Alumno a = new Alumno();
        as.cargarInformacion(a);
        System.out.println("De que estudiante quiere calcular su nota final ?");
        String name = leer.next();
        System.out.println("La nota final de " + name + " es " + as.notaFinal(a, name));

    }

}
