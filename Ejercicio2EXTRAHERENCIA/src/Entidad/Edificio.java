package Entidad;

import java.util.Scanner;



public abstract class Edificio {

    private int ancho;
    private int alto;
    private int largo;
    private Scanner scan;

    public Edificio() {
    }

    public Edificio(int ancho, int alto, int largo, Scanner scan) {
        this.ancho = ancho;
        this.alto = alto;
        this.largo = largo;
        this.scan = new Scanner (System.in).useDelimiter("\n");
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getLargo() {
        return largo;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public Scanner getScan() {
        return scan = new Scanner (System.in).useDelimiter("\n");
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public void informacion (){
        System.out.print("Ancho: ");
        this.ancho = this.scan.nextInt();
        System.out.print("Alto: ");
        this.alto = this.scan.nextInt();
        System.out.print("Largo:");
        this.largo = this.scan.nextInt();
    }
    
    
    public abstract void calcularSuperficie();

    public abstract void calcularVolumen();

    @Override
    public String toString() {
        return "Edificio{" + "ancho=" + ancho + ", alto=" + alto + ", largo=" + largo + '}';
    }

}
