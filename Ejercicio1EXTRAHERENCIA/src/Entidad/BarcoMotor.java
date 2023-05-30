package Entidad;

import java.text.ParseException;
import java.util.Scanner;

public class BarcoMotor extends Barco {

    private int potenciaCV;
    Scanner leer = new Scanner(System.in);

    public BarcoMotor() {
    }

    public BarcoMotor(int potenciaCV, int matricula, int eslora, int anioFabricacion, Alquiler alquilerAmarre) {
        super(matricula, eslora, anioFabricacion, alquilerAmarre);
        this.potenciaCV = potenciaCV;
    }

    @Override
    public void caracteristicasEmbarcacion() throws ParseException {

        System.out.println("Tipo de Embarcacion --> BARCO A MOTOR");
        super.caracteristicasEmbarcacion();
        System.out.println("Potencia del motor en CV: ");
        this.potenciaCV = leer.nextInt();
    }

    @Override
    public double alquilerAmarre() {
        double aux = (super.alquilerAmarre() + this.potenciaCV);

        return aux;
    }

}
