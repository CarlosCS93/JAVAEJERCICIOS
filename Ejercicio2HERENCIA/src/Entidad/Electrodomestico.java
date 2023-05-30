/*
 * Crear una superclase llamada Electrodoméstico con los siguientes atributos: precio, color,
consumo energético (letras entre A y F) y peso.
Los constructores que se deben implementar son los siguientes:
• Un constructor vacío.
• Un constructor con todos los atributos pasados por parámetro.

Los métodos a implementar son:
• Métodos getters y setters de todos los atributos.
• Método comprobarConsumoEnergetico(char letra): comprueba que la letra es correcta,
sino es correcta usara la letra F por defecto. Este método se debe invocar al crear el
objeto y no será visible.
• Método comprobarColor(String color): comprueba que el color es correcto, y si no lo es,
usa el color blanco por defecto. Los colores disponibles para los electrodomésticos son
blanco, negro, rojo, azul y gris. No importa si el nombre está en mayúsculas o en
minúsculas. Este método se invocará al crear el objeto y no será visible.

 */
package Entidad;

import java.util.Scanner;

public class Electrodomestico {

    private double precio;
    private char cEnergia;
    private String gamaColor;
    private static char[] consumoEnergetico = {'A', 'B', 'C', 'D', 'E', 'F'};
    private static String[] color = {"BLANCO", "NEGRO", "AZUL", "ROJO", "GRIS"};
    private int peso;
    private Scanner scan;

    public Electrodomestico() {
        this.scan = new Scanner(System.in).useDelimiter("\n");
    }

    public Electrodomestico(double precio, char cEnergia, String gamaColor, int peso) {
        this.precio = precio;
        this.cEnergia = cEnergia;
        this.gamaColor = gamaColor;
        this.peso = peso;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public char getcEnergia() {
        return cEnergia;
    }

    public void setcEnergia(char cEnergia) {
        this.cEnergia = cEnergia;
    }

    public String getGamaColor() {
        return gamaColor;
    }

    public void setGamaColor(String gamaColor) {
        this.gamaColor = gamaColor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public static char[] getConsumoEnergetico() {
        return consumoEnergetico;
    }

    public static void setConsumoEnergetico(char[] consumoEnergetico) {
        Electrodomestico.consumoEnergetico = consumoEnergetico;
    }

    public static String[] getColor() {
        return color;
    }

    public static void setColor(String[] color) {
        Electrodomestico.color = color;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    private char comprobarConsumoEnergetico(char letra) {

        int x = 0;
        for (int i = 0; i < consumoEnergetico.length; i++) {
            if (this.cEnergia == consumoEnergetico[i]) {
                x++;
            }
        }
        if (x == 0) {
            this.cEnergia = 'F';
        }

        return letra;
    }

    private String colorIngresado(String colores) {

        int x = 0;
        for (int i = 0; i < color.length; i++) {

            if (this.gamaColor.equalsIgnoreCase(color[i])) {
                x++;
            }
        }
        if (x == 0) {
            this.gamaColor = "BLANCO";
        }
        return colores;
    }

    /*Metodo crearElectrodomestico(): le pide la información al usuario y llena el
electrodoméstico, también llama los métodos para comprobar el color y el consumo. Al
precio se le da un valor base de $1000.*/
    public void crearElectrodomestico() {

        System.out.println("ELECTRODOMESTICOS LA GANGA");
        System.out.println("Ingrese el color");
        this.gamaColor = scan.next();
        colorIngresado(gamaColor);
        System.out.println("Ingrese el Consumo Energetico");
        this.cEnergia = scan.next().charAt(0);
        comprobarConsumoEnergetico(cEnergia);
        this.precio = 1000d;
        System.out.println("Ingrese el peso del electrodomestico");
        this.peso = scan.nextInt();

    }

    private void validacionPeso() {
        
        if (this.peso >= 1 && this.peso <= 19) {
            this.precio += 100d;
        } else if (this.peso >= 20 && this.peso <= 49) {
            this.precio += 500;
        } else if (this.peso >= 50 && this.peso <= 79) {
            this.precio += 800;
        } else if (this.peso >= 80) {
            this.precio += 1000;
        }
    }

    public void precioFinal() {

        if (this.cEnergia == 'A') {
            this.precio += 1000d;
        } else if (this.cEnergia == 'B') {
            this.precio += 800d;
        } else if (this.cEnergia == 'C') {
            this.precio += 600d;
        } else if (this.cEnergia == 'D') {
            this.precio += 500d;
        } else if (this.cEnergia == 'E') {
            this.precio += 300d;
        } else if (this.cEnergia == 'F') {
            this.precio += 100d;
        }
        validacionPeso();
    }

    @Override
    public String toString() {
        return "Electrodomestico{" + "Precio= $" + precio + ", Consumo de Energia= " + cEnergia + ", Gama de Color= " + gamaColor + ", Peso= " + peso + '}';
    }

}
