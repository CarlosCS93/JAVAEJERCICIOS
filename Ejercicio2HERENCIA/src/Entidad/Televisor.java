/**
 * Se debe crear también una subclase llamada Televisor con los siguientes atributos:
 * resolución (en pulgadas) y sintonizador TDT (booleano), además de los atributos
 * heredados.
 * Los constructores que se implementarán serán:
 * • Un constructor vacío.
 * • Un constructor con la resolución, sintonizador TDT y el resto de los atributos
 * heredados. Recuerda que debes llamar al constructor de la clase padre.
 *
 * Los métodos que se implementara serán:
 * • Método get y set de los atributos resolución y sintonizador TDT.
 * • Método crearTelevisor(): este método llama a crearElectrodomestico() de la clase
 * padre, lo utilizamos para llenar los atributos heredados del padre y después llenamos
 * los atributos del televisor.
 * • Método precioFinal(): este método será heredado y se le sumará la siguiente
 * funcionalidad. Si el televisor tiene una resolución mayor de 40 pulgadas, se
 * incrementará el precio un 30% y si tiene un sintonizador TDT incorporado, aumentará
 * $500. Recuerda que las condiciones que hemos visto en la clase Electrodomestico
 * también deben afectar al precio.
 * Finalmente, en el main debemos realizar lo siguiente:
 * Vamos a crear una Lavadora y un Televisor y llamar a los métodos necesarios para mostrar
 * el precio final de los dos electrodomésticos.
 */
package Entidad;

public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean sintonizador;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean sintonizador, double precio, char cEnergia, String gamaColor, int peso) {
        super(precio, cEnergia, gamaColor, peso);
        this.resolucion = resolucion;
        this.sintonizador = sintonizador;
    }

    public int getResolucion() {
        return resolucion;
    }

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isSintonizador() {
        return sintonizador;
    }

    public void setSintonizador(boolean sintonizador) {
        this.sintonizador = sintonizador;
    }

    @Override
    public void crearElectrodomestico() {
        super.crearElectrodomestico();

        System.out.println("Ingrese la resolucion del televisor");
        this.resolucion = super.getScan().nextInt();
        System.out.println("Desea un sintonizador TDT incorporado en su televisor");
        String respuesta = super.getScan().next().toLowerCase();
        this.sintonizador = respuesta.equals("si");
    }

    @Override
    public void precioFinal() {
        super.precioFinal();
        if (this.resolucion > 40) {
            super.setPrecio((super.getPrecio() * 1.30));
        }
        if (this.sintonizador) {
            super.setPrecio(super.getPrecio() + 500d);
        }

    }

    @Override
    public String toString() {
        return super.toString();
    }

}
