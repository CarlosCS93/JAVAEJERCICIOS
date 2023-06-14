/**
 * AutorServicio
 * Esta clase tiene la responsabilidad de llevar adelante las funcionalidades necesarias para
 * administrar autores (consulta, creación, modificación y eliminación).
 */
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

    public void crearAutor() {

        Autor autor = new Autor();
        
        for (int i = 1; i < 11; i++) {
            autor.setId(null);
            autor.setNombre("Autor"+ i);
            autor.setAlta(Boolean.TRUE);
            d.crear(autor);
        }

        
    }

    public Autor buscarAutorPorID(Long id) throws Exception {

        try {
            Autor auxi = new Autor();
            auxi = d.buscarPorId(id);
            return auxi;
        } catch (Exception e) {
            System.out.println("ID invalido");
        }
        return null;

    }

    public void eliminarPorAutor(Autor autor) throws Exception {

        try {
            if (autor != null) {
                d.eliminarPorID(autor);
            } else {
                System.out.println("El autor no puede estar vacio");
            }

        } catch (IllegalArgumentException i) {
            throw i;
        }

    }
    
    public void borrarTodo (){
        d.borrarTodo();
        
    }

    public void mostrarAutores() throws Exception {

        System.out.println(d.listarAutores());
    }
}
