
package ejercicio1herencia;


import Entidad.Caballo;
import Entidad.Gato;
import Entidad.Perro;
import Entidad.Raza;



public class Ejercicio1HERENCIA {

    
    public static void main(String[] args) {
        
        Perro p = new Perro("Churito", "Procan", 5, Raza.POODLE);
        Gato g = new Gato("Micha", "Michu", 3, Raza.GATO);
        Caballo c = new Caballo("Spirit", "Pasto", 5, Raza.FINO);
        p.alimentarse();
        g.alimentarse();
        c.alimentarse();
        
    }
    
}
