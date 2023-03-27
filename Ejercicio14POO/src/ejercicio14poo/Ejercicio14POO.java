package ejercicio14poo;

import Servicio.MovilServicio;
import Entidad.Movil;

public class Ejercicio14POO {

    public static void main(String[] args) {
        
        MovilServicio ms = new MovilServicio();
        Movil ce = new Movil();
        ms.llenarBase(ce);
        ms.mostrarBase(ce);
        



















        
        
        
        
        
        
        
        /*Movil a[] = new Movil[2];

        for (int i = 0; i < a.length; i++) {
            System.out.println("Ingrese la marca del telefono");
            ce.setMarca(leer.next());
            System.out.println("Ingrese el precio del telefono");
            ce.setPrecio(leer.nextDouble());
            System.out.println("Ingrese el modelo del telefono");
            ce.setModelo(leer.next());
            System.out.println("Ingrese el tamaño de la memoria ram");
            ce.setMemoriaRam(leer.nextInt());
            System.out.println("Ingrese la capacidad de almacenamiento del telefono");
            ce.setAlmacenamiento(leer.nextInt());
        a[i] = ms.cargarCelular();//new Movil(ce.getMarca(),ce.getPrecio(),ce.getModelo(),ce.getMemoriaRam(),ce.getAlmacenamiento());
    }

    for (Movil a1 : a) {
            System.out.println("[" + a1.getMarca() + " " + a1.getPrecio() + " " + a1.getModelo() + " " + a1.getMemoriaRam() + " " + a1.getAlmacenamiento() + "]");
    }*/



    }

}
