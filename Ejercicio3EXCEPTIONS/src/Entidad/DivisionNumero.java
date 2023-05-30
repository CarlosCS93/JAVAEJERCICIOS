/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class DivisionNumero {

    private String num;
    private String num2;

    public DivisionNumero() {
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }

    public String getNum2() {
        return num2;
    }

    public void setNum2(String num2) {
        this.num2 = num2;
    }

    public void division(int nume, int nume2) throws RuntimeException {

        int resultado = (nume/nume2);
        System.out.println("El resultado de la division es: " + resultado);
    }
}
