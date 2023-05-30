package Entidad;

import java.text.ParseException;
import java.util.Random;

public class Barco {

    private int matricula;
    private int eslora;
    private int anioFabricacion;
    private Alquiler alquilerAmarre = new Alquiler();

    public Barco() {

    }

    public Barco(int matricula, int eslora, int anioFabricacion, Alquiler alquilerAmarre) {
        this.matricula = matricula;
        this.eslora = eslora;
        this.anioFabricacion = anioFabricacion;
        this.alquilerAmarre = alquilerAmarre;
    }

    public Alquiler getAlquilerAmarre() {
        return alquilerAmarre;
    }

    public void setAlquilerAmarre(Alquiler alquilerAmarre) {
        this.alquilerAmarre = alquilerAmarre;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public int getEslora() {
        return eslora;
    }

    public void setEslora(int eslora) {
        this.eslora = eslora;
    }

    public int getAnioFabricacion() {
        return anioFabricacion;
    }

    public void setAnioFabricacion(int anioFabricacion) {
        this.anioFabricacion = anioFabricacion;
    }

    public void matriculaBarco() {

        Random r = new Random();
        this.matricula = (r.nextInt(450000) + 20000);
        System.out.println("MATRICULA: " + this.matricula);
    }

    public void anioFabricacion() {
        Random rc = new Random();
        this.anioFabricacion = (rc.nextInt(122) + 1900);
        System.out.println("ANIO FABRICACION: " + this.anioFabricacion);
    }

    public void esloraBarco() {

        Random rcc = new Random();
        this.eslora = (rcc.nextInt(12) + 8);
        System.out.println("ESLORA: " + this.eslora);
    }

    public void caracteristicasEmbarcacion() throws ParseException {
        alquilerAmarre.llenarFormulario();
        matriculaBarco();
        esloraBarco();
        anioFabricacion();
    }

    public double alquilerAmarre() {

        double alquiler = (alquilerAmarre.getDiasAlquiler() * (this.eslora * 10));

        return alquiler;
    }

}
