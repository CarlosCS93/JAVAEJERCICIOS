package Entidad;

import java.text.ParseException;
import java.util.Scanner;

public class Velero extends Barco {

    private int numeroMastiles;

    Scanner leer = new Scanner(System.in);

    public Velero() {
    }

    public Velero(int numeroMastiles, int matricula, int eslora, int anioFabricacion, Alquiler alquilerAmarre) {
        super(matricula, eslora, anioFabricacion, alquilerAmarre);
        this.numeroMastiles = numeroMastiles;
    }

    @Override
    public void caracteristicasEmbarcacion() throws ParseException {
        System.out.println("Tipo de Embarcacion --> VELERO ");
        super.caracteristicasEmbarcacion();
        System.out.println("Numero de mastiles de la embarcacion");
        this.numeroMastiles = leer.nextInt();

    }

    @Override
    public double alquilerAmarre() {
        double aux = (super.alquilerAmarre() + this.numeroMastiles);

        return aux;
    }

    @Override
    public String toString() {
        return "Velero{" + "numeroMastiles=" + numeroMastiles + '}';
    }

}
