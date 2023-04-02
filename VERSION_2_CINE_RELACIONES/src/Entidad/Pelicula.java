package Entidad;

import java.util.ArrayList;
import java.util.Random;

public class Pelicula {

    private String titulo;
    private int duracion;
    private int edadMinima;
    private double precioEntrada;
    private String[][] salaCine;
    private int num;
    private String letra;
    private String asiento;
    private ArrayList<Pelicula> carteleras;

    public Pelicula() {
        this.salaCine = new String[8][6];
        this.salaCine = crearsalaCine(); //new Pelicula[8][6];

        this.carteleras = new ArrayList();
    }

    public Pelicula(int num, String letra, String asiento) {
        this.salaCine = new String[8][6];
        this.num = num;
        this.letra = letra;
        this.asiento = asiento;

    }

    public Pelicula(String titulo, int duracion, int edadMinima, double precioEntrada, String[][] salaCine) {
        this.salaCine = new String[8][6];
        this.titulo = titulo;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.precioEntrada = precioEntrada;
        this.salaCine = crearsalaCine();
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }

    public void setPrecioEntrada(double precioEntrada) {
        this.precioEntrada = precioEntrada;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getAsiento() {
        return asiento;
    }

    public void setAsiento(String asiento) {
        this.asiento = asiento;
    }

    public String[][] crearsalaCine() {

        for (int i = 0; i < salaCine.length; i++) {
            for (int j = 0; j < salaCine[0].length; j++) {
                String[] l = {"A", "B", "C", "D", "E", "F"};
                this.letra = l[j];
                this.asiento = "";
                this.salaCine[i][j] = (salaCine.length - i + this.letra + this.asiento);
            }
        }

        return salaCine;
    }

    public void mostrarSala() {

        for (int i = 0; i < salaCine.length; i++) {
            for (int j = 0; j < salaCine[0].length; j++) {
                System.out.print("[ " + this.salaCine[i][j] + " ]");
            }
            System.out.println(" ");
        }
    }

    public void cargarPeliculas() {

        for (int i = 0; i < 10; i++) {

            Random r = new Random();

            this.carteleras.add(new Pelicula(this.titulo = ("Pelicula " + " " + (i + 1)), this.duracion = (1 + r.nextInt((3 + 1) - 1)), this.edadMinima = (12 + r.nextInt((16 + 1) - 12)), this.precioEntrada = ((int) (3.5 + r.nextDouble() * (6 + 1) - 3.5)), this.salaCine));

        }

    }

    public void mostrarPeliculas() {

        for (int i = 0; i < this.carteleras.size(); i++) {
            System.out.println(this.carteleras);
        }

    }

    @Override
    public String toString() {
        return "Pelicula{" + "titulo=" + titulo + ", duracion=" + duracion + ", edadMinima=" + edadMinima + ", precioEntrada=" + precioEntrada + ", salaCine=" + salaCine + ", num=" + num + ", letra=" + letra + ", asiento=" + asiento + ", carteleras=" + carteleras + '}';
    }

}
