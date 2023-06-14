package Persistencia;

import Entidades.Autor;
import java.sql.SQLData;
import java.util.ArrayList;
import java.util.List;

public class AutorDAO extends DAO<Autor> {

    public void crear(Autor autor) {
        super.crear(autor);
    }

    public void editar(Autor autor) {
        super.editar(autor);
    }

    public void eliminarPorID(Autor autor) {
        super.eliminar(autor);
    }

    public Autor buscarPorId(Long id) throws Exception {
        super.conectar();
        Autor autor = em.createNamedQuery("Autor.unoporiD", Autor.class).setParameter("id", id).getSingleResult();
        //Autor autor = em.find(Autor.class, id);
        super.desconectar();
        return autor;
    }

    public ArrayList<Autor> listarAutores() throws Exception {
        super.conectar();
        List<Autor> auxi = em.createNamedQuery("Autor.todos").getResultList();
        //List<Autor> autores= em.createQuery("SELECT a FROM Autor a")
        ArrayList autores = new ArrayList(auxi);
        super.desconectar();
        return autores;
    }

    public void borrarTodo() {

        super.conectar();
      Autor autorborrado = (Autor) em.createNamedQuery("Autor.borrarTodo", Autor.class).setParameter("Autor", Autor.class);
        super.desconectar();
    }

}