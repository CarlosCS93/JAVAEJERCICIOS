
package Entidad;




public class Personas {
    //Los metodos pueden ser public, private
    //Los metodos public pueden ser llamados sin ningun problema
    //Los metodos private para ser llamados y modificados se necesita un sett y un get
    private String nombre;
    private String apellido;
    private int edad;
    private String genero;
    
    public Personas(){ // Constructor vacio , Constructor Implicito
        
    }
    public Personas (String nombre, String apellido, int edad, String genero){ // Constructor con parametros, Constructor Explicito
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        if (genero.equals ("Hombre") || genero.equals("Mujer") ) { //Se puede agregar logica dentro del constructor            
            this.genero = genero;
        }
        
    }
    
    
    public String getNombre (){ // Metodo Getter //Permite ir a la clase y llevar el atributo al metodo main
        
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public String getGenero() {
        return genero;
    }
    
    
    public  void setNombre (String nombre){ // Metodo Setter
        this.nombre=nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
    
}
