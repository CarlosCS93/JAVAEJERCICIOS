package Entidad;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Alquiler {

    private String nombre;
    private int documentoCliente;
    private Date fechaAlquiler;
    private Date fechaDevolucion;
    private int posicionAmarre;
    private Barco barcoAlquilado;
    private Scanner scan;
    private long diasAlquiler;

    public Alquiler() {
        this.fechaAlquiler = new Date();
        this.fechaDevolucion = new Date();
        this.scan = new Scanner(System.in).useDelimiter("\n");

    }

    public Alquiler(String nombre, int documentoCliente, Date fechaAlquiler, Date fechaDevolucion, int posicionAmarre, Barco barcoAlquilado) {
        this.nombre = nombre;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barcoAlquilado = barcoAlquilado;
    }

    public Scanner getScan() {
        return scan;
    }

    public void setScan(Scanner scan) {
        this.scan = scan;
    }

    public long getDiasAlquiler() {
        return diasAlquiler;
    }

    public void llenarFormulario() throws ParseException {

        System.out.println("FORMULARIO DE ALQUILER");
        System.out.println("======================");
        System.out.println("Fecha de Alquiler --> dd/MM/yyyy");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        String fechaHoy = sdf.format(fechaAlquiler);
        this.fechaAlquiler = sdf.parse(fechaHoy);
        System.out.println(fechaHoy);
        System.out.println("Nombre: ");
        this.nombre = scan.next();
        System.out.println("Identificacion");
        this.documentoCliente = scan.nextInt();
        System.out.println("Fecha de Devolucion");
        this.fechaDevolucion = sdf.parse(scan.next());
        long operacion = (this.fechaDevolucion.getTime() - this.fechaAlquiler.getTime());
        TimeUnit time = TimeUnit.DAYS;
        this.diasAlquiler = time.convert(operacion, TimeUnit.MILLISECONDS);//time.convert(operacion, TimeUnit.MILLISECONDS);
        System.out.println("Dias de alquiler " + this.diasAlquiler);

    }
}
