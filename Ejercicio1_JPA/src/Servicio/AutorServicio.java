package Servicio;

import Entidades.Autor;
import Persistencia.AutorDAO;

public class AutorServicio {

    AutorDAO d = new AutorDAO();
    //private final AutorDAO DAO;
    //private final String[] autores = {"Carlos Vasconcelos", "Miguel Cervantes", "Carlos Chugcho", "Gabriel Garcia Marquez", "Emanuel Tolstoy"};

    public AutorServicio() {
        this.d = d;
    }

    //Crear Autores
    public void crearAutores() throws Exception {

        try {
            //for (int i = 0; i < autores.length; i++) {

                Autor autor1 = new Autor(1l, "Miguel Cervantes", Boolean.FALSE);
                d.crear(autor1);
            

        } catch (Exception e) {
            throw new Exception("El nombre del autor no puede estar vacio");
        }

    }
    
    /*public Autor buscarAutor (Long id) {
        
        d.buscarPorId(id);
        
        return
        
    }
    
    
    public void eliminarAutoresPorDni(Long id) {
        try {
            d.eliminar(id);
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
            
        }
    }
    

    public void todoslosAutores() throws Exception {

        System.out.println(d.listarAutores());
        System.out.println("____");
        System.out.println("**********");

    }*/

}
