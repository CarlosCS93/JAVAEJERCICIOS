/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Botas extends Armadura {

    private int tiempoCaminar;
    private Scanner scan;

    public Botas() {
        this.scan = new Scanner(System.in);
    }

    public Botas(int tiempoCaminar, Scanner scan, int consumoEnergia, int caminar, int correr, boolean propulsar, boolean volar, boolean escribir, boolean leer) {
        super(consumoEnergia, caminar, correr, propulsar, volar, escribir, leer);
        this.tiempoCaminar = tiempoCaminar;
        this.scan = new Scanner(System.in);
    }

    @Override
    public int consumoEnergia() {

        System.out.println("Modo de caminar activado, tiempo de duracion ?");
        this.tiempoCaminar = this.scan.nextInt();

        super.setConsumoEnergia(super.getConsumoEnergia()-this.tiempoCaminar);
        return super.getConsumoEnergia();

    }

}
