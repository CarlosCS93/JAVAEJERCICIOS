package ejemploherencia;

import Entidad.Animal;

import Entidad.Gato;
import Entidad.Perro;
import java.util.ArrayList;

public class EjemploHERENCIA {

    public static void main(String[] args) {

        Animal a = new Animal();
        Animal ab = new Perro();
        Animal abc = new Gato();

        ArrayList<Animal> listaAnimales = new ArrayList();

        listaAnimales.add(a);
        listaAnimales.add(ab);
        listaAnimales.add(abc);

        for (Animal lista : listaAnimales) {
            lista.hacerRuido();
        }

    }

}
