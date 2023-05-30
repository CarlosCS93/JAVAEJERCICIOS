
package Persistencia;

import Entidades.Editorial;
import java.util.List;


public class EditorialDAO extends DAO <Editorial>{

    @Override
    protected void crear(Editorial editorial) {
        super.crear(editorial); 
    }
        
        public void eliminar(Long id) throws Exception {
        Editorial editorial = buscarPorDNI(id);
        super.eliminar(editorial);
    }

    public List<Editorial> listarTodos() throws Exception {
        conectar();
        List<Editorial> editoriales = em.createQuery("SELECT e FROM Editorial e ").getResultList();
        desconectar();
        return editoriales;
    }

    public Editorial buscarPorDNI(Long id) throws Exception {
        conectar();
        Editorial editorial = (Editorial) em.createQuery("SELECT e FROM Editorial e WHERE e.id LIKE :id").setParameter("id", id).getSingleResult();
        desconectar();
        return editorial;
    }
}
