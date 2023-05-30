/*
 * Escribir un programa en Java que juegue con el usuario a adivinar un número. La computadora
debe generar un número aleatorio entre 1 y 500, y el usuario tiene que intentar adivinarlo. Para
ello, cada vez que el usuario introduce un valor, la computadora debe decirle al usuario si el
número que tiene que adivinar es mayor o menor que el que ha introducido el usuario. Cuando
consiga adivinarlo, debe indicárselo e imprimir en pantalla el número de veces que el usuario
ha intentado adivinar el número. Si el usuario introduce algo que no es un número, se debe
controlar esa excepción e indicarlo por pantalla. En este último caso también se debe contar el
carácter fallido como un intento.

 */
package Entidad;

import java.util.ArrayList;

public class Usuario {

    private ArrayList<Integer> intentos;
    private int intento;
    private int numeroComputadora;

    public Usuario() {
        intentos = new ArrayList();
    }

    public Usuario(ArrayList<Integer> intentos, int intento, int numeroComputadora) {
        this.intentos = intentos;
        this.intento = intento;
        this.numeroComputadora = numeroComputadora;
    }

    public ArrayList<Integer> getIntentos() {
        return intentos;
    }

    public void setIntentos(ArrayList<Integer> intentos) {
        this.intentos = intentos;
    }

    public int getIntento() {
        return intento;
    }

    public void setIntento(int intento) {
        this.intento = intento;
    }

    public int getNumeroComputadora() {
        return numeroComputadora;
    }

    public void setNumeroComputadora(int numeroComputadora) {
        this.numeroComputadora = numeroComputadora;
    }

    @Override
    public String toString() {
        return "Usuario{" + "intentos=" + intentos + ", intento=" + intento + ", numeroComputadora=" + numeroComputadora + '}';
    }

    
    
}
