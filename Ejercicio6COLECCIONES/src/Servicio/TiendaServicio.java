/*
 * Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la
aplicación cuente con las funciones básicas.
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio,
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio.
Realizar un menú para lograr todas las acciones previamente mencionadas.

 */
package Servicio;

import Entidad.Tienda;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;

public class TiendaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    /**
     *
     * @return ************************************************************
     *
     * public String nombreProducto() {
     *
     *
     */
    public Tienda crearProducto() {

        Tienda t = new Tienda();

        System.out.println("Ingrese el precio del producto");
        t.setPrecio(leer.nextDouble());
        System.out.println("");

        return t;
    }

    /**
     *
     * @param t ************************************************************+
     */
    public void agregarProdutos(Tienda t) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("****************************************");
        System.out.println("Ingrese el nombre del producto");
        String nProducto = leer.nextLine();
        boolean ban = false;

        Iterator<Map.Entry<String, Tienda>> tienda = t.getAplicacion().entrySet().iterator();

        while (tienda.hasNext()) {

            Map.Entry<String, Tienda> p = tienda.next();

            if (p.getKey().equals(nProducto)) {
                ban = true;
            }
        }

        if (ban) {
            System.out.println("Producto existente en la base de datos");
        } else {
            t.getAplicacion().put(nProducto, crearProducto());
            System.out.println("****************************************");
            System.out.println("     Producto agregado correctamente    ");
            System.out.println("****************************************");

        }
    }

    /**
     *
     * @param t
     * **********************************************************************
     */
    public void modificarPrecio(Tienda t) {
        System.out.println("****************************************");
        int opcion;
        int x = 0;
        Scanner leeer = new Scanner(System.in).useDelimiter("\n");

        Iterator<Map.Entry<String, Tienda>> cambio = t.getAplicacion().entrySet().iterator();

        do {
            System.out.println("********************************");
            System.out.println(" <> Que parametro quiere modificar ? ");
            System.out.println("1. Nombre");
            System.out.println("2. Precio");
            System.out.println("3. Regresar al menu principal");
            System.out.println("Ingrese una opcion");
            opcion = leer.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Nombre del producto");

                    String nombre = leeer.nextLine();
                    //System.out.println("Producto = " + t.getAplicacion().g + ", Precio = $ " + getValue());

                    //for (Map.Entry<String, Tienda> entry : t.getAplicacion().entrySet()) {
                    //  System.out.println("Producto = " + entry.getKey() + ", Precio = $ " + entry.getValue());
                    //if (entry.getKey().equals(nombre)) {
                    //  System.out.println(entry.hashCode());
                    //System.out.println("Ingrese el nuevo nombre");
                    //String nn = leeer.nextLine();
                    //System.out.println("Producto = " + entry.getKey() + ", Precio = $ " + entry.getValue());
                    //}
                    while (cambio.hasNext()) {
                        Map.Entry<String, Tienda> tienda2 = cambio.next();
                        if (tienda2.getKey().equals(nombre)) {
                            System.out.println("Ingrese el nuevo nombre");
                            String nn = leeer.nextLine();
                            System.out.println(tienda2.hashCode());
                            t.setAplicacion(t.getAplicacion());
                            x++;
                            System.out.println("** Modificacion exitosa **");
                        }
                    }

                    break;

                case 2:
                    System.out.println("Nombre del producto");
                    String nproducto = leer.next();

                    while (cambio.hasNext()) {

                        Map.Entry<String, Tienda> tienda2 = cambio.next();

                        if (tienda2.getKey().equals(nproducto)) {
                            System.out.println("Ingrese el nuevo precio");
                            tienda2.getValue().setPrecio(leer.nextDouble());
                            x++;
                            System.out.println("Se modifico el precio del producto seleccionado");

                        }
                    }

                    break;
                case 3:
                    x++;
                    break;
            }
        } while (opcion != 3);

        if (x
                == 0) {
            System.out.println("Producto no encontrado o mal escrito");
        }

        System.out.println(
                "****************************************");
    }

    /**
     *
     * @param t
     * *******************************************************************************
     */
    public void eliminarProducto(Tienda t) {
        System.out.println("****************************************");

        Iterator<Map.Entry<String, Tienda>> tienda = t.getAplicacion().entrySet().iterator();

        System.out.println("Que producto quiere eliminar ? ");

        String nproducto = leer.next();
        int x = 0;
        while (tienda.hasNext()) {

            Map.Entry<String, Tienda> tienda2 = tienda.next();

            if (tienda2.getKey().equals(nproducto)) {
                tienda.remove();
                x++;
                System.out.println("Producto eliminado");
            }
        }
        if (x == 0) {
            System.out.println("Producto no encontrado o mal escrito");
        }

        System.out.println("");
        System.out.println("****************************************");
    }

    /**
     *
     * @param t *****************************************************
     */
    public void mostrarProductos(Tienda t) {
        System.out.println("****************************************");
        System.out.println("******INVENTARIO SUPER LA ECONOMIA******");
        System.out.println("****************************************");
        for (Map.Entry<String, Tienda> entry : t.getAplicacion().entrySet()) {

            System.out.println(" O Producto = " + entry.getKey() + ", Precio = $ " + entry.getValue());
        }
        System.out.println("****************************************");
    }

    /**
     *
     * @param t ******************************************************* @param
     * @param contrasena
     */
    public void borrarInformacion(Tienda t, String contrasena) {

        System.out.println("****************************************");
        System.out.println("Esta seguro que desea eliminar toda la informacion almacenada (si/no)?");
        String resp = leer.next();
        if (resp.equals("si")) {
            System.out.println("Ingrese la clave de seguridad para proceder con la accion :");
            String clave = leer.next();
            if (clave.equals(contrasena)) {
                t.getAplicacion().clear();
                System.out.println("*****ELIMINACION COMPLETA*****");

            } else {
                System.out.println("Clave incorrecta");
            }
        }
        System.out.println("****************************************");
    }

    public void menuAplicacion(Tienda t) {
        int opcion;
        boolean ban = false;
        System.out.println("INGRESE SU USUARIO");
        String usuario = leer.nextLine();
        System.out.println("Ingrese su contraseña de acceso");
        String contrasena = leer.next();

        do {
            System.out.println("");
            System.out.println("**SUPER DESPENSA LA ECONOMIA**");
            System.out.println("1. Ingresar Producto");
            System.out.println("2. Modificar Producto");
            System.out.println("3. Borrar Producto");
            System.out.println("4. Mostrar Inventario");
            System.out.println("5. Eliminar Informacion");
            System.out.println("6. Salir");
            System.out.println("Ingrese una opcion");
            opcion = leer.nextInt();

            while (opcion <= 0 || opcion > 6) {
                System.out.println("Ingrese una opcion correcta");
                opcion = leer.nextInt();
            }

            switch (opcion) {

                case 1:
                    agregarProdutos(t);
                    ban = true;
                    break;
                case 2:
                    if (ban == false || t.getAplicacion().isEmpty()) {
                        System.out.println("*****************************************");
                        System.out.println("*******Ingrese primero un producto*******");
                        System.out.println("*****************************************");

                    } else {
                        modificarPrecio(t);
                    }
                    break;
                case 3:

                    if (ban == false || t.getAplicacion().isEmpty()) {
                        System.out.println("*****************************************");
                        System.out.println("*******Ingrese primero un producto*******");
                        System.out.println("*****************************************");
                    } else {
                        eliminarProducto(t);
                    }
                    break;

                case 4:

                    if (ban == false || t.getAplicacion().isEmpty()) {
                        System.out.println("*****************************************");
                        System.out.println("*******Ingrese primero un producto*******");
                        System.out.println("*****************************************");
                    } else {
                        mostrarProductos(t);
                    }
                    break;

                case 5:
                    if (ban == false || t.getAplicacion().isEmpty()) {
                        System.out.println("*****************************************");
                        System.out.println("************Inventario Vacio*************");
                        System.out.println("*****************************************");
                    } else {
                        borrarInformacion(t, contrasena);
                    }
                    break;
                case 6:
                    System.out.println("Aplicacion Finalizada");
                    break;

            }
        } while (opcion != 6);
    }
}
