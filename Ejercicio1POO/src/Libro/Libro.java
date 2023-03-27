package Libro;
import java.util.Scanner;

public class Libro {

    private int ISBN;
    private String titulo;
    private String autor;
    private int numeroPagina;

    public Libro() {

    }

    public Libro(int ISBN, String titulo, String autor, int numeroPagina) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.numeroPagina = numeroPagina;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumeroPagina() {
        return numeroPagina;
    }

    public void setNumeroPagina(int numeroPagina) {
        this.numeroPagina = numeroPagina;
    }
    public Libro llenarDatos (){
        Libro l = new Libro();
        Scanner leer = new Scanner (System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero de ISBN");
        l.setISBN(leer.nextInt());
        System.out.println("Ingrese el titulo del libro");
        l.setTitulo(leer.next());
        System.out.println("Ingrese el nombre del autor");
        l.setAutor(leer.next());
        System.out.println("Ingrese el numero de paginas del libro");
        l.setNumeroPagina(leer.nextInt());
        
    return l;
    }
    
    
    public void mostrarLibro (Libro l){
        System.out.println("El libro "+ l.getTitulo()+" del autor "+l.getAutor()+" con "+l.getNumeroPagina()+" paginas pertenece al ISBN # "+l.getISBN());
       
    }
    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", titulo=" + titulo + ", autor=" + autor + ", numeroPagina=" + numeroPagina + '}';
    }
       
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    

}
