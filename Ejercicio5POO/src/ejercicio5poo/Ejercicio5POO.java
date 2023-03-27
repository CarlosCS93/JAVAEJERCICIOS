
package ejercicio5poo;

import Servicio.CuentaServicio;
import Entidad.CuentaBancaria;
import java.util.Scanner;


public class Ejercicio5POO {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner ingresar = new Scanner(System.in);
        boolean a = true;

        CuentaServicio cs = new CuentaServicio();
        CuentaBancaria banco = cs.datosCliente();

        do {
            System.out.println("OPCIONES");
            System.out.println("1. Deposito");
            System.out.println("2. Retiro");
            System.out.println("3. Retiro Rapido");
            System.out.println("4. Consulta de Saldo");
            System.out.println("5. Consulta de datos");
            System.out.println("6. Salir");
            int opcion = ingresar.nextInt();
            switch (opcion) {
                case 1:
                    cs.ingresar(banco);
                    break;
                case 2:
                    cs.retirar(banco);
                    break;
                case 3:
                    cs.extracionRapida(banco);
                    break;
                case 4:
                    cs.mostrarSaldo(banco);
                    break;
                case 5:
                    cs.mostrarDatos(banco);
                    break;
                case 6:
                    a = false;
                    System.out.println("Gracias por usar nuestro servicio");
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }

        } while (a == true);

    }

}
