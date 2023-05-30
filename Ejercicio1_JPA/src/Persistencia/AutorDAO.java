package Persistencia;

import Entidades.Autor;
import java.util.List;

public class AutorDAO extends DAO<Autor> {

    
    public void crear(Autor autor) {
        super.crear(autor);
    }

    
    public void editar(Autor autor) {
        super.editar(autor);
    }

    public void eliminar(Long id) throws Exception {
        Autor autor = buscarPorId(id);
        super.eliminar(autor);
    }

    public Autor buscarPorId(Long id) throws Exception {
        super.conectar();
        Autor autor = em.createNamedQuery("Autor.unoporiD", Autor.class).setParameter("id", id).getSingleResult();
        //Autor autor = em.find(Autor.class, id);
        super.desconectar();
        return autor;
    }

    public List<Autor> listarAutores() throws Exception {
        super.conectar();
        List<Autor> autores = em.createNamedQuery("Autor.todos").getResultList();
        //List<Autor> autores= em.createQuery("SELECT a FROM Autor a")

        super.desconectar();
        return autores;
    }
    
    

}