package Entidad;

import Servicio.CineServicio;
import java.util.ArrayList;

public class Cine {

    private ArrayList<Pelicula> cartelera;

    public Cine() {
        cartelera = new ArrayList();
    }

    public ArrayList<Pelicula> getCartelera() {
        return cartelera;
    }

    public void setCartelera(ArrayList<Pelicula> cartelera) {
        this.cartelera = cartelera;
    }

    public void cargarCartelera(Pelicula pelicula) {
        
            this.cartelera.add(pelicula);
        

    }

    @Override
    public String toString() {
        return "Cine{" + "cartelera=" + cartelera + '}';
    }
    
    
    
}
