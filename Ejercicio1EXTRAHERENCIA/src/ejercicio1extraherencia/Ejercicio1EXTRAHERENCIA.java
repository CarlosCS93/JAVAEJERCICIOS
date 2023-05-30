package ejercicio1extraherencia;

import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.Velero;
import Entidad.YateLujo;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio1EXTRAHERENCIA {

    public static void main(String[] args) throws ParseException {

        Scanner leer = new Scanner(System.in);
        int opcion = 0;
        
        do {
            System.out.println("Tipo de embarcacion ");
            System.out.println("1.VELERO");
            System.out.println("2.BARCO A MOTOR");
            System.out.println("3.YATE DE LUJO");
            System.out.println("4. SALIR");
            opcion = leer.nextInt();

            ArrayList<Barco> embarcacion = new ArrayList();

            embarcacion.add(new Velero());
            embarcacion.add(new BarcoMotor());
            embarcacion.add(new YateLujo());

            for (int i = 1; i <= embarcacion.size(); i++) {
                if (opcion == i) {
                    embarcacion.get(i - 1).caracteristicasEmbarcacion();
                    System.out.println("Precio final del alquiler es $ " + embarcacion.get(i - 1).alquilerAmarre());
                    System.out.println("");
                }
            }

        } while (opcion != 4);

        
        
        
    }

}
