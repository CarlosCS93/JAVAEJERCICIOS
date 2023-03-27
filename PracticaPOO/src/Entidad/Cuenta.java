package Entidad;

import java.util.Scanner;

public class Cuenta {

    Scanner leer = new Scanner(System.in);
    private String titular;
    private double cantidad;

    public Cuenta(String titular) {
        this(titular, 0);
    }

    public Cuenta(String titular, double cantidad) {
        this.titular = titular;
        if (cantidad < 0) { // Validacion en caso que se ingrese un numero negativo y afecte la logica de operacion
            this.cantidad = 0;
        } else {
            this.cantidad = cantidad;
        }

    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    public double getCantidad() {
        return cantidad;
    }

    public void setCantidad(double cantidad) {
        this.cantidad = cantidad;
    }

    @Override
    public String toString() {
        return " El titular {" + titular + " , tiene la cantidad de = $ " + cantidad + " dolares en su cuenta";
    }

    public void ingresar(double cantidad) {

        if (cantidad > 0) {
            this.cantidad += cantidad;
        }
    }

    public void retirar(double cantidad) {

        if (this.cantidad - cantidad < 0) {
            this.cantidad = 0;
        } else {
            this.cantidad -= cantidad;
        }

    }
}
