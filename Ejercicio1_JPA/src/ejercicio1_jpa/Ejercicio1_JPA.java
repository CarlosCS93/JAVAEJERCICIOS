package ejercicio1_jpa;

import Entidades.Autor;
import Servicio.AutorServicio;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Ejercicio1_JPA {

    public static void main(String[] args) throws Exception {

        AutorServicio as = new AutorServicio();
        //as.crearAutor();
        as.mostrarAutores();
        as.borrarTodo();
        //as.crearAutor(autor1);
        //as.crearAutor(autor2);
        //as.crearAutor(autor3);
//        as.mostrarAutores();
//        as.eliminarPorAutor(autor1);
//        as.eliminarPorAutor(autor2);
//        as.eliminarPorAutor(autor3);
//        as.mostrarAutores();
    }
}
