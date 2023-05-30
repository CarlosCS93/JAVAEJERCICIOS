package ejercicio1_jpa;

import Entidades.Autor;
import Servicio.AutorServicio;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Ejercicio1_JPA {

    public static void main(String[] args) throws Exception {

        
     EntityManagerFactory EMF = Persistence.createEntityManagerFactory("Ejercicio1_JPAPU");
     EntityManager em = EMF.createEntityManager();

}
}
