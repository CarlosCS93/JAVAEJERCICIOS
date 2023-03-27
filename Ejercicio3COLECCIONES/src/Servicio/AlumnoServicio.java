/*
 * Crear una clase llamada Alumno que mantenga información sobre las notas de distintos
alumnos. La clase Alumno tendrá como atributos, su nombre y una lista de tipo Integer
con sus 3 notas.
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
/*Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.*/
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class AlumnoServicio {

    Scanner leer = new Scanner(System.in);

    public Alumno pedirInformacion() {

        Alumno al = new Alumno();

        ArrayList<Integer> nots = new ArrayList();

        System.out.println("Ingrese el nombre del alumno");
        al.setNombre(leer.next());
        System.out.println("Ingrese las tres calificaciones");
        int i = 0;

        while (i != 3) {
            nots.add(leer.nextInt());
            i++;
        }

        al.setNotas(nots);
        al.getAlumnos().add(al);
        return al;
    }

    public void cargarInformacion(Alumno al) {

        //Alumno x = pedirInformacion();
        boolean ban;

        do {
            al.getAlumnos().add(pedirInformacion());
            System.out.println("Desea Ingresar otro Alumno? si/no");
            String respuesta = leer.next().toLowerCase();

            while (!respuesta.equals("si") && !respuesta.equals("no")) {
                System.out.println("respuesta incorrecta");
                respuesta = leer.next().toLowerCase();
            }
            ban = respuesta.equals("si");
        } while (ban);

        mostrarAlumnos(al);

    }

    public void mostrarAlumnos(Alumno al) {
        for (Alumno a : al.getAlumnos()) {
            System.out.println(a);
        }
    }

    public int notaFinal(Alumno al, String name) {

        int nfinal = 0;

        for (int i = 0; i < al.getAlumnos().size(); i++) {
            if (name.equals(al.getAlumnos().get(i).getNombre())) {
                //System.out.println(al.getAlumnos().get(i).getNotas());
                //System.out.println(al.getAlumnos().get(i).getNotas().size());
                for (int j = 0; j < al.getAlumnos().get(i).getNotas().size(); j++) {
                    nfinal += al.getAlumnos().get(i).getNotas().get(j);

                }  
            }
        }

        /*System.out.println(al.getAlumnos());h

        Iterator <Alumno> it = al.getAlumnos().iterator();

        while (it.hasNext()) {
            
                if (it.next().getNombre().equals(name)) {
                    for (int j = 0; j < al.getNotas().size(); j++) {
                        nfinal += it.next().getNotas().get(j); //Notas().get(i);
                    }
                }
            }*/
        int notafinal = nfinal / 3 ; //al.getAlumnos()getNotas().size();

        return notafinal;
    }
}
