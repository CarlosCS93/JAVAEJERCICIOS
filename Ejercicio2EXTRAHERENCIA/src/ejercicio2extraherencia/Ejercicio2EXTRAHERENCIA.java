package ejercicio2extraherencia;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;

public class Ejercicio2EXTRAHERENCIA {

    public static void main(String[] args) {

        Polideportivo pd = new Polideportivo();
        Polideportivo pd2 = new Polideportivo();
        EdificioDeOficinas eo = new EdificioDeOficinas();
        EdificioDeOficinas eo2 = new EdificioDeOficinas();
        
        
        ArrayList<Edificio> edificios = new ArrayList();
        edificios.add(pd);
        edificios.add(pd2);
        edificios.add(eo);
        edificios.add(eo2);

        for (Edificio edificio : edificios) {

            edificio.informacion();
            edificio.calcularSuperficie();
            edificio.calcularVolumen();

        }

        System.out.println("****************************");

        do {
        
            pd.cantidadDeTechados();

            
        } while (true);
        
    }

}
