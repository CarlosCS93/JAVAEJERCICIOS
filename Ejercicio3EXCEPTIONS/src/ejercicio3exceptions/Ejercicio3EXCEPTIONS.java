package ejercicio3exceptions;

import Entidad.DivisionNumero;
import java.util.Scanner;

public class Ejercicio3EXCEPTIONS {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        DivisionNumero dn = new DivisionNumero();
        System.out.println("Ingrese el primer numero");
        dn.setNum(leer.next());
        System.out.println("Ingrese el segundo numero");
        dn.setNum2(leer.next());
        //dn.division(dn.getNum(), dn.getNum2());
        try {
            dn.division(dn.getNum(), dn.getNum2());
        } catch (RuntimeException e) {
            System.out.println("Se intenta hacer una division con cadena de caracteres");
        } finally {
            System.out.println("Transformando de cadena de caracter a numero entero......");
            int nume = Integer.parseInt(dn.getNum());
            int nume2 = Integer.parseInt(dn.getNum2());
            dn.division(nume, nume2);

        }

    }

}
