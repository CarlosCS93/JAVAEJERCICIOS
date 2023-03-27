package ejercicio1colecciones;

import Entidad.Raza;
import Servicio.RazaServicio;
import java.util.ArrayList;
import java.util.Iterator;

public class Ejercicio1COLECCIONES {

    public static void main(String[] args) {

        RazaServicio rs = new RazaServicio();
        Raza rz = rs.pedirRaza();
        rs.eliminarRaza(rz);

    }
}
