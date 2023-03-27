/* Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
programa para organizar la información de cada curso. Para ello, crearemos una clase
entidad llamada Curso, cuyos atributos serán: nombreCurso, cantidadHorasPorDia,
cantidadDiasPorSemana, turno (mañana o tarde), precioPorHora y alumnos. Donde
alumnos es un arreglo de tipo String de dimensión 5 (cinco), donde se alojarán los
nombres de cada alumno. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 método cargarAlumnos(): este método le permitirá al usuario ingresar los alumnos
que asisten a las clases. Nosotros nos encargaremos de almacenar esta información
en un arreglo e iterar con un bucle, solicitando en cada repetición que se ingrese el
nombre de cada alumno.
 Método crearCurso(): el método crear curso, le pide los valores de los atributos al
usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Curso. En este método invocaremos al método cargarAlumnos() para asignarle valor
al atributo alumnos
 Método calcularGananciaSemanal(): este método se encarga de calcular la ganancia
en una semana por curso. Para ello, se deben multiplicar la cantidad de horas por
día, el precio por hora, la cantidad de alumnos y la cantidad de días a la semana que
se repite el encuentro.
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

public class ServicioClase {

    Scanner leer = new Scanner(System.in);
    int contador = 0;

    public Curso crearCurso() {

        Curso c = new Curso ();

        System.out.println("Ingrese el nombre del Curso");
        c.setNombreCurso(leer.next());
        System.out.println("Ingrese la cantidad de horas por dia");
        c.setCantidadHorasxDia(leer.nextInt());
        System.out.println("Ingrese la cantidad de dias a la semana");
        c.setCantidadDiasxSemana(leer.nextInt());
        System.out.println("Ingrese en que turno (mañana o tarde)");
        c.setTurno(leer.next());
        System.out.println("Ingrese el precio de la hora $");
        c.setPrecioxHora(leer.nextInt());
        
        cargarAlumnos(c);
        
        return c;
    }
    
    public void cargarAlumnos(Curso c) {

        for (int i = 0; i < c.getAlumnos().length; i++) {
            contador += 1;
            System.out.println("Ingrese el nombre del alumno " + (i + 1));
            String alumno = leer.next();
            String nombre[] = new String[5];
            nombre[i] = alumno;
            c.setAlumnos(nombre);
            System.out.println("Desea ingresar otro alumno si /no");
            String opcion = leer.next();
            if (opcion.equals("no")) {
                System.out.println("Cantidad de alumnos " + (i + 1));
                break; 
            }

        }
    c.setCantidadAlumnos(contador);
    }

    

    public void calculoGanancia(Curso c) {

        double ganancia = (c.getCantidadHorasxDia() * c.getPrecioxHora() * c.getCantidadAlumnos() * c.getCantidadDiasxSemana());

        System.out.println("La ganancia semanal es $ " + ganancia);
    }

}
