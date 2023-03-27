/*
 * Una tienda que vende teléfonos móviles quiere tener registro de cada producto que
posee en un sistema computacional. Para ello, crearemos un programa donde se pueda
almacenar cada producto con su información. Crear una entidad Movil con los atributos
marca, precio, modelo, memoriaRam, almacenamiento y codigo. El atributo código será
un arreglo numérico de dimensión 7 (siete) donde cada subíndice alojará un número
correspondiente al código. A continuación, se implementarán los siguientes métodos:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Método cargarCelular(): se solicita al usuario que ingrese los datos necesarios para
instanciar un objeto Celular y poder cargarlo en nuestro programa.
 Método ingresarCodigo(): este método permitirá ingresar el código completo de siete
números de un celular. Para ello, puede utilizarse un bucle repetitivo
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

public class MovilServicio {

    Scanner leer = new Scanner(System.in);

    private Movil cargarCelular() {

        Movil celular = new Movil();

        System.out.println("Ingrese la marca del telefono");
        celular.setMarca(leer.next());
        System.out.println("Ingrese el precio del telefono");
        celular.setPrecio(leer.nextDouble());
        System.out.println("Ingrese el modelo del telefono");
        celular.setModelo(leer.next());
        System.out.println("Ingrese el tamaño de la memoria ram");
        celular.setMemoriaRam(leer.nextInt());
        System.out.println("Ingrese la capacidad de almacenamiento del telefono");
        celular.setAlmacenamiento(leer.nextInt());

        celular.setCodigo(ingresarCodigo());

        return celular;
    }

    public void llenarBase(Movil celular) {

        System.out.println("Ingrese la cantidad de dispositivos que desea ingresar");
        Movil a[] = new Movil[leer.nextInt()];

        for (int i = 0; i < a.length; i++) {
            a[i] = cargarCelular();
            celular.setBd(a);
        }

    }

    public int[] ingresarCodigo() {

        System.out.print("Ingrese el codigo de 7 numeros correspondiente al celular : ");
        int[] c = new int[7];

        for (int i = 0; i < c.length; i++) {
            c[i] = leer.nextInt();
        }

        return c;
    }

    public void mostrarBase(Movil celular) {

        System.out.println("Desea mostrar la informacion ingresada");
        String respuesta = leer.next().toLowerCase();
        if (respuesta.equals("si")) {
            for (Movil a1 : celular.getBd()) {
                System.out.print("[ " + a1.getMarca() + " ] [ " + a1.getPrecio() + " ] [ " + a1.getModelo() + " ] [ " + a1.getMemoriaRam() + " ] [ " + a1.getAlmacenamiento() + "]" + "  CODIGO ");
                for (int i = 0; i < celular.getCodigo().length; i++) {
                    System.out.print("[" + a1.getCodigo()[i] + "]");
                }
                System.out.println("");
            }
        }
        
        System.out.println("Desea ingresar mas informacion al sistema");
        String opcion = leer.next().toLowerCase();
        if (opcion.equals("si")) {
            llenarBase(celular);
            mostrarBase(celular);
            
        }else 
            System.out.println("Hasta pronto");

        System.out.println("");
    }
}
