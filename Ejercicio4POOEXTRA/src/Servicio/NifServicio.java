/*
 * Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs con su
correspondiente letra (NIF). Los atributos serán el número de DNI (entero largo) y la
letra (String o char) que le corresponde. Dispondrá de los siguientes métodos:
 Métodos getters y setters para el número de DNI y la letra.
 Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la letra que le
corresponderá. Una vez calculado, le asigna la letra que le corresponde según el
resultado del calculo.
 Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un guion y la letra
en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un método que
funciona de la siguiente manera: Para calcular la letra se toma el resto de dividir el
número de DNI por 23 (el resultado debe ser un número entre 0 y 22). El método debe
buscar en un array (vector) de caracteres la posición que corresponda al resto de la
división para obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
package Servicio;

import java.util.Scanner;
import Entidad.NIF;

/**
 *
 * @author Usuario
 */
public class NifServicio {

    Scanner leer = new Scanner(System.in);

    public String crearNif(NIF ni) {

        System.out.println("Ingrese el numero de DNI");
        ni.setDNI(leer.nextLong());
        String caracteres = "TRWAGMYFPDXBNJZSQVHLCKE";
        String letra = " ";
        int l = caracteres.length();
        long indicador = (ni.getDNI() % 23);
        String[] caracter = new String[l];

        for (int i = 0; i < caracter.length; i++) {
            String aux = caracteres.substring(i, i + 1);
            caracter[i] = aux;
            if (indicador == i) {
                letra = caracter[i];
                break;
            }
        }
        ni.setLetra(letra);
        return letra;
    }

    public void mostarNif(NIF ni) {

        System.out.println(ni.getDNI() + " - " + ni.getLetra());

    }
}
