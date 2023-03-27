/*
 *Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de
String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese
una frase que puede ser una palabra o varias palabras separadas por un espacio en
blanco y a través de los métodos set, se guardará la frase y la longitud de manera
automática según la longitud de la frase ingresada. Deberá además implementar los
siguientes métodos:
a) Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la
frase ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena
con una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar
la frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra que
ingresa el usuario y devuelve verdadero si la contiene y falso si no.*/
package Servicio;

import Entidad.Cadena;

/**
 *
 * @author Usuario
 */
public class CadenaServicio {

    Cadena ca = new Cadena();

    public void mostrarVocales(Cadena ca) {
        int v = 0;
        for (int i = 0; i < ca.getLongitud(); i++) {
            String vocal = ca.getFrase().substring(i, i + 1);
            if (vocal.equals("a") || vocal.equals("e") || vocal.equals("i") || vocal.equals("o") || vocal.equals("u")) {
                v++;
            }
        }
        System.out.println("La cantidad de vocales presentes es: " + v);
    }

    /*public void invertirFrase2 (Cadena ca){ // Otra forma de invertir cadenas 
         
        StringBuilder opc= new StringBuilder(ca.getFrase());
        ca.setFrase(opc.reverse().toString());
        System.out.println(ca.getFrase());
         
         
     }*/
    public void invertirFrase(Cadena ca) {
        String vocal2;
        System.out.println("Entrada: " + ca.getFrase());
        System.out.print("Salida: ");

        for (int i = ca.getLongitud(); i > 0; i--) {
            vocal2 = ca.getFrase().substring(i - 1, i);
            System.out.print(vocal2);
        }
        System.out.println("");

    }

    public int vecesRepetidos(String letra, Cadena ca) {

        int x = 0;
        for (int i = 0; i < ca.getLongitud(); i++) {
            String vocal3 = ca.getFrase().substring(i, i + 1);
            if (vocal3.equals(letra)) {
                x++;
            }
        }
        if (x == 1) {
            System.out.println("El caracter no se repite se encuentra " + x + " unica vez dentro de la palabra");
        } else if (x > 1) {
            System.out.println("El caracter ingresado se repite " + x + " veces");
        } else {
            System.out.println("Caracter no encontrado");
        }

        return x;
    }

    public int comparaLongitud(String frase, Cadena ca) {

        int l = frase.length();
        if (l == ca.getLongitud()) {
            System.out.println("Las palabras ingresadas tienen la misma longitud");
            System.out.println(ca.getFrase() + " = " + ca.getLongitud());
            System.out.println(frase + " = " + l);
        } else {
            System.out.println("No tienen la misma longitud");
            System.out.println(ca.getFrase() + " = " + ca.getLongitud());
            System.out.println(frase + " = " + l);
        }

        return (l);
    }

    public String unirFrases(String frase, Cadena ca) {

        String frase3 = ca.getFrase().concat(frase);
        System.out.println(frase3);

        return frase3;
    }

    public String reemplazarVocal(String caracter, Cadena ca) {

        /*for (int i = 0; i < ca.getLongitud(); i++) {
            String vocal4 = ca.getFrase().substring(i, i + 1);
            switch (vocal4) {
                case "a":
                    System.out.print(caracter);
                    break;
                default:
                    System.out.print(vocal4);
            }
        }*/
 /*if (vocal4.equals("a")) {
                System.out.print(caracter);
                
            }else {
                System.out.print(vocal4);
            }*/
        String palabra = ca.getFrase().replace("a", caracter);
        System.out.println(palabra);
        System.out.println("");
        return palabra;

    }

    public boolean contieneLetra(String letra, Cadena ca) {

        boolean c = false;
        System.out.println(letra);
        for (int i = 0; i < ca.getLongitud(); i++) {
            String vocal5 = ca.getFrase().substring(i, i + 1);
            if (vocal5.equals(letra)) {
                c = true;
            }
        }
        System.out.println(c);

        return c;

    }

}
