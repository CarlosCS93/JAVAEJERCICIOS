
package Entidad;


public class Array {
    
    private int [] numeros;

    public Array() {
        this.numeros = new int [4];
    }

    public void llenarNumeros(){
        
        for (int i = 0; i <= this.numeros.length; i++) {
            this.numeros [i] = 9;
        }
        
    }
    
    public void mostrarNumeros (){
        
        for (int i = 0; i < this.numeros.length; i++) {
            System.out.print("["+this.numeros [i]+ "]");
        }
        
    }
    
}
