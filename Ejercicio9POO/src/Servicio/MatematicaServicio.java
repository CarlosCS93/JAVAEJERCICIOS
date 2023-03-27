/*
Realizar una clase llamada Matemática que tenga como atributos dos números reales con
los cuales se realizarán diferentes operaciones matemáticas. La clase deber tener un
constructor vacío, parametrizado y get y set. En el main se creará el objeto y se usará el
Math.random para generar los dos números y se guardaran en el objeto con su
respectivos set. Deberá además implementar los siguientes métodos:

a) Método devolverMayor() para retornar cuál de los dos atributos tiene el mayor valor
b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
elevado al menor número. Previamente se deben redondear ambos valores.
c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.*/
package Servicio;

import Entidad.Matematica;

/**
 *
 * @author Usuario
 */
public class MatematicaServicio {

    Matematica ma = new Matematica();

    public void devolverMayor(Matematica ma) {

        double nummayor = (Math.max(ma.getNum1(), ma.getNum2()));
        System.out.println("El numero mayor es: " + nummayor);

    }

    public void calcularPotencia(Matematica ma) {

        int max = (int) (Math.max(ma.getNum1(), ma.getNum2()));
        int min = (int) (Math.min(ma.getNum1(), ma.getNum2()));
        int potencia = (int) Math.pow(max, min);

        System.out.println("La potencia del primer numero elevado al segundo numero es: " + potencia);
    }
    
    public double calcularRaiz (Matematica ma){
        
        int min = (int) (Math.min(ma.getNum1(), ma.getNum2()));
        int ab = (Math.abs(min));
        System.out.println("El numero absoluto es:"+ab);
        
        double rc = (Math.sqrt(ab));
        
        System.out.println("La raiz cuadrada del munero menor es:"+ rc);
        
        return rc;
    }
}
