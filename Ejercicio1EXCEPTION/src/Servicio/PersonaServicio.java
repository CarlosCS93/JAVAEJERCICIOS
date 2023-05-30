/* 
Realizar una clase llamada Persona que tenga los siguientes atributos: nombre, edad,
sexo ('H' hombre, 'M' mujer, 'O' otro), peso y altura. Si el alumno desea añadir algún otro
atributo, puede hacerlo. Los métodos que se implementarán son:
 Un constructor por defecto.
 Un constructor con todos los atributos como parámetro.
 Métodos getters y setters de cada atributo.
 Metodo crearPersona(): el método crear persona, le pide los valores de los atributos
al usuario y después se le asignan a sus respectivos atributos para llenar el objeto
Persona. Además, comprueba que el sexo introducido sea correcto, es decir, H, M o
O. Si no es correcto se deberá mostrar un mensaje
 Método calcularIMC(): calculara si la persona está en su peso ideal (peso en
kg/(altura^2 en mt2)). Si esta fórmula da por resultado un valor menor que 20,
significa que la persona está por debajo de su peso ideal y la función devuelve un -1.
Si la fórmula da por resultado un número entre 20 y 25 (incluidos), significa que la
persona está en su peso ideal y la función devuelve un 0. Finalmente, si el resultado
de la fórmula es un valor mayor que 25 significa que la persona tiene sobrepeso, y la
función devuelve un 1.
 Método esMayorDeEdad(): indica si la persona es mayor de edad. La función
devuelve un booleano.
A continuación, en la clase main hacer lo siguiente:
Crear 4 objetos de tipo Persona con distintos valores, a continuación, llamaremos todos
los métodos para cada objeto, deberá comprobar si la persona está en su peso ideal,
tiene sobrepeso o está por debajo de su peso ideal e indicar para cada objeto si la
persona es mayor de edad.
Por último, guardaremos los resultados de los métodos calcularIMC y esMayorDeEdad en
distintas variables, para después en el main, calcular un porcentaje de esas 4 personas

cuantas están por debajo de su peso, cuantas en su peso ideal y cuantos, por encima, y
también calcularemos un porcentaje de cuantos son mayores de edad y cuantos menores */
package Servicio;

import java.util.Scanner;
import Entidad.Persona;


public class PersonaServicio {

    public Persona crearPersona() {

        Persona p = new Persona();
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        p.setNombre(leer.nextLine());
        System.out.println("Ingrese su edad");
        p.setEdad(leer.nextInt());
        System.out.println("Ingrese su sexo: (H)Hombre (M)Mujer (O)Otro ");
        boolean a = true;
        p.setSexo(leer.next().charAt(0));

        do {

            if (p.getSexo() == 'H' || p.getSexo() == 'M' || p.getSexo() == 'O') {
                a = false;
            } else {
                System.out.println("Respuesta Incorrecta, Ingrese nuevamente: ");
                p.setSexo(leer.next().charAt(0));
            }
        } while (a == true);

        System.out.println("Ingrese su peso (KG)");
        p.setPeso(leer.nextInt());
        System.out.println("Ingrese su altura (m)");
        p.setAltura(leer.nextDouble());

        return p;
    }

    public void calcularICM(Persona p) {

        int calculo = (int) (p.getPeso() / (Math.pow(p.getAltura(), 2)));
        System.out.println("El resultado del IMC es: " + calculo);
        if (calculo < 20) {
            System.out.println("-1");
            System.out.println("Debajo del peso ideal");
        } else if (calculo > 20 || calculo < 25) {
            System.out.println("0");
            System.out.println("Peso ideal");
        } else if (calculo > 25) {
            System.out.println("1");
            System.out.println("Sobrepeso");
        }

    }

    public boolean edadM(Persona p)  {

        return p.getEdad() >= 18;
    }
}
