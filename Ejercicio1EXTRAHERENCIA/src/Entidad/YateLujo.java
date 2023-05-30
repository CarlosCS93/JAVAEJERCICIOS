package Entidad;

import java.text.ParseException;
import java.util.Scanner;

public class YateLujo extends Barco {

    private int potenciaCV;
    private int numeroCamarotes;

    Scanner leer = new Scanner(System.in);

    public YateLujo() {
    }

    public YateLujo(int potenciaCV, int numeroCamarotes, int matricula, int eslora, int anioFabricacion, Alquiler alquilerAmarre) {
        super(matricula, eslora, anioFabricacion, alquilerAmarre);
        this.potenciaCV = potenciaCV;
        this.numeroCamarotes = numeroCamarotes;
    }

    @Override
    public void caracteristicasEmbarcacion() throws ParseException {
        System.out.println("Tipo de Embarcacion --> YATE");
        super.caracteristicasEmbarcacion();
        System.out.println("Potencia del motor en CV: ");
        this.potenciaCV = leer.nextInt();
        System.out.println("Cantidad de camarotes: ");
        this.numeroCamarotes = leer.nextInt();

    }

    @Override
    public double alquilerAmarre() {
        double aux = (super.alquilerAmarre() + this.potenciaCV + this.numeroCamarotes);

        return aux;
    }

}
