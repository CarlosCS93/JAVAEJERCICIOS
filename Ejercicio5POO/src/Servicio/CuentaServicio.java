/* Realizar una clase llamada Cuenta (bancaria) que debe tener como mínimo los atributos:
numeroCuenta (entero), el DNI del cliente (entero largo) y el saldo actual (entero).
Las operaciones asociadas a dicha clase son:
a) Constructor por defecto y constructor con DNI, saldo, número de cuenta e interés.
b) Agregar los métodos getters y setters correspondientes
c) Metodo para crear un objeto Cuenta, pidiéndole los datos al usuario.
d) Método ingresar(double ingreso): el método recibe una cantidad de dinero a ingresar
y se la sumara a saldo actual.
e) Método retirar(double retiro): el método recibe una cantidad de dinero a retirar y se
la restará al saldo actual. Si la cuenta no tiene la cantidad de dinero a retirar, se
pondrá el saldo actual en 0.
f) Método extraccionRapida(): le permitirá sacar solo un 20% de su saldo. Validar que el
usuario no saque más del 20%.
g) Método consultarSaldo(): permitirá consultar el saldo disponible en la cuenta.
h) Método consultarDatos(): permitirá mostrar todos los datos de la cuenta
 */
package Servicio;

import Entidad.CuentaBancaria;
import java.util.Scanner;

public class CuentaServicio {

    public CuentaBancaria datosCliente() {
        CuentaBancaria bc = new CuentaBancaria();
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        System.out.println("--BANCO INTERNACIONAL PEPITO EC--");
        System.out.println("=================================");
        System.out.println("Ingrese su DNI");
        bc.setDNI(leer.nextLong());
        System.out.println("Ingrese su numero de cuenta");
        bc.setNumCuenta(leer.nextLong());
        System.out.println("");
        System.out.println("");
        return bc;
    }

    public void ingresar(CuentaBancaria bc) {
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        System.out.println("SISTEMA DE DEPOSITOS EN EFECTIVO");
        System.out.println("Ingrese la cantidad de dinero a depositar");
        int ingreso = leer.nextInt();
        bc.setSaldoActual(bc.getSaldoActual() + ingreso);
        System.out.println("La cantidad de dinero ingresado es --- $ " + ingreso);
        System.out.println("");
    }

    public void retirar(CuentaBancaria bc) {
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        System.out.println("SISTEMA DE RETIRO DE DINERO");
        System.out.println("Ingrese la cantidad de dinero que desea retirar");
        int retiro = leer.nextInt();
        if (bc.getSaldoActual() == 0 || retiro > bc.getSaldoActual()) {
            System.out.println("Fondos Insuficientes");

        } else {

            bc.setSaldoActual(bc.getSaldoActual() - retiro);

            System.out.println("La cantidad de dinero retirado de su cuenta es --- $" + retiro);
        }
        System.out.println("");
    }

    public void extracionRapida(CuentaBancaria bc) {
        Scanner leer = new Scanner(System.in);
        System.out.println("");
        System.out.println("SISTEMA DE EXTRACION RADIDA DE DINERO");
        System.out.println("Ingrese la cantidad de dinero que desea retirar");
        int extraccion = leer.nextInt();
        double porcentaje = (bc.getSaldoActual() * (0.20));
        
        if (bc.getSaldoActual() == 0 || porcentaje > bc.getSaldoActual()) {
            System.out.println("Fondos Insuficientes");

        } else if (extraccion > porcentaje) {
            System.out.println("No se puede ejecutar el retiro");
            System.out.println("Cantidad permitida --- $ "+porcentaje+ " equivalente al (20%)");

        } else {
            bc.setSaldoActual(bc.getSaldoActual() - extraccion);
            System.out.println("La cantidad de dinero retirado de su cuenta es ---- $" + extraccion);
        }
        System.out.println("");
    }

    public void mostrarSaldo(CuentaBancaria bc) {

        System.out.println("El saldo de su cuenta es --- $ " + bc.getSaldoActual());
        System.out.println("");
    }

    public void mostrarDatos(CuentaBancaria bc) {

        System.out.println("BANCO INTERNACIONAL PEPITO EC");
        System.out.println("Informacion del cliente:");
        System.out.println("DNI: " + bc.getDNI());
        System.out.println("Numero de cuenta: " + bc.getNumCuenta());
        System.out.println("");

    }

}
