/*
 * Ha llegado el momento de poner de prueba tus conocimientos. Para te vamos a contar que te
ha contratado “La Tercera Seguros”, una empresa aseguradora que brinda a sus clientes
coberturas integrales para vehículos.
Luego de un pequeño relevamiento, te vamos a pasar en limpio los requerimientos del sistema
que quiere realizar la empresa.


a. Gestión Integral de clientes. En este módulo vamos a registrar la información personal de
cada cliente que posea pólizas en nuestra empresa. Nombre y apellido, documento, mail,
domicilio, teléfono.
 */
package Entidad;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Cliente {

    private String nombre;
    private String apellido;
    private ArrayList<Integer> identificacion;
    private String mail;
    private String direccion;
    private String telefono;
    private ArrayList<Cliente> clientes;

    public Cliente() {
        clientes = new ArrayList();
    }

    public Cliente(String nombre, String apellido, ArrayList identificacion, String mail, String direccion, String telefono) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.identificacion = identificacion;
        this.mail = mail;
        this.direccion = direccion;
        this.telefono = telefono;
    }

    Random r = new Random();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public void listadoClientes() {

        String[] nombre = {"CARLOS", "EVELIN", "ILIANA", "JAVIER", "INES", "OSWALDO", "FERNANDO", "CRISTHIAN", "ROSA", "LUNA"};
        String[] apellido = {"CHUGCHO", "SILVA", "ZAMBRANO", "MOREIRA", "PAREDES", "LINDO", "SILVA", "CHUGCHO", "MOREIRA", "LINDO"};
        int i = r.nextInt(10);
        int j = r.nextInt(10);

        this.nombre = nombre[i];
        this.apellido = apellido[j];

        System.out.println("Nombre: " + this.nombre);
        System.out.println("Apellido: " + this.apellido);

    }

    public ArrayList identificacion() {

        
        for (int i = 0; i < 10; i++) {
            this.identificacion.add( r.nextInt(10));
        }

        return identificacion;
    }

    public void ingresarMail() {

        System.out.println("Ingrese su Mail");
        this.mail = leer.next();

    }

    public void ingresarTelefono() {

        System.out.println("Ingrese su numero de telefono");
        this.telefono = leer.next();

    }

    public ArrayList clientesEmpresa() {

        return null;
    }

    public void registroClientes() {

        boolean salida;
        do {
            listadoClientes();
            identificacion();
            ingresarMail();
            ingresarTelefono();

            System.out.print("Desea ingresar otro cliente (si / no) ... ");
            String opcion = leer.next().toLowerCase();
            salida = opcion.equals("si");

            while (!opcion.equals("si") && !opcion.equals("no")) {
                System.out.println("Ingrese un opcion correcta");
                opcion = leer.next().toLowerCase();
            }

        } while (salida);

    }

}
