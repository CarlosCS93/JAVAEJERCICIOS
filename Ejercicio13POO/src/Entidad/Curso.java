/*
* Un profesor particular está dando cursos para grupos de cinco alumnos y necesita un
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
package Entidad;

public class Curso {

    private String nombreCurso;
    private int cantidadHorasxDia;
    private int cantidadDiasxSemana;
    private String turno;
    private double precioxHora;
    private int cantidadAlumnos;
    private String alumnos[];

    public Curso() {
        alumnos = new String[5];
        
    }

    public Curso(String nombreCurso, int cantidadHorasxDia, int cantidadDiasxSemana, String turno, double precioxHora, int cantidadAlumnos, String[] alumnos) {
        this.nombreCurso = nombreCurso;
        this.cantidadHorasxDia = cantidadHorasxDia;
        this.cantidadDiasxSemana = cantidadDiasxSemana;
        this.turno = turno;
        this.precioxHora = precioxHora;
        this.cantidadAlumnos = cantidadAlumnos;
        this.alumnos = alumnos;
    }

    public String getNombreCurso() {
        return nombreCurso;
    }

    public void setNombreCurso(String nombreCurso) {
        this.nombreCurso = nombreCurso;
    }

    public int getCantidadHorasxDia() {
        return cantidadHorasxDia;
    }

    public void setCantidadHorasxDia(int cantidadHorasxDia) {
        this.cantidadHorasxDia = cantidadHorasxDia;
    }

    public int getCantidadDiasxSemana() {
        return cantidadDiasxSemana;
    }

    public void setCantidadDiasxSemana(int cantidadDiasxSemana) {
        this.cantidadDiasxSemana = cantidadDiasxSemana;
    }

    public String getTurno() {
        return turno;
    }

    public void setTurno(String turno) {
        this.turno = turno;
    }

    public double getPrecioxHora() {
        return precioxHora;
    }

    public void setPrecioxHora(double precioxHora) {
        this.precioxHora = precioxHora;
    }

    public int getCantidadAlumnos() {
        return cantidadAlumnos;
    }

    public void setCantidadAlumnos(int cantidadAlumnos) {
        this.cantidadAlumnos = cantidadAlumnos;
    }

    public String[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(String[] alumnos) {
        this.alumnos = alumnos;
    }

}
