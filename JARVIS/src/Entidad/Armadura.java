/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
En esta primera etapa con una armadura podremos: caminar, correr, propulsar, volar, escribir y
leer.
 */
package Entidad;

/**
 *
 * @author Usuario
 */
public class Armadura {

    private int consumoEnergia;
    private int caminar;
    private int correr;
    private boolean propulsar;
    private boolean volar;
    private boolean escribir;
    private boolean leer;

    public Armadura() {
        this.consumoEnergia = 100;
    }

    public Armadura(int consumoEnergia, int caminar, int correr, boolean propulsar, boolean volar, boolean escribir, boolean leer) {
        this.consumoEnergia = 100;
        this.caminar = caminar;
        this.correr = correr;
        this.propulsar = propulsar;
        this.volar = volar;
        this.escribir = escribir;
        this.leer = leer;
    }

    public int getConsumoEnergia() {
        return consumoEnergia;
    }

    public void setConsumoEnergia(int consumoEnergia) {
        this.consumoEnergia = consumoEnergia;
    }

    public int getCaminar() {
        return caminar;
    }

    public void setCaminar(int caminar) {
        this.caminar = caminar;
    }

    public int getCorrer() {
        return correr;
    }

    public void setCorrer(int correr) {
        this.correr = correr;
    }

    public boolean isPropulsar() {
        return propulsar;
    }

    public void setPropulsar(boolean propulsar) {
        this.propulsar = propulsar;
    }

    public boolean isVolar() {
        return volar;
    }

    public void setVolar(boolean volar) {
        this.volar = volar;
    }

    public boolean isEscribir() {
        return escribir;
    }

    public void setEscribir(boolean escribir) {
        this.escribir = escribir;
    }

    public boolean isLeer() {
        return leer;
    }

    public void setLeer(boolean leer) {
        this.leer = leer;
    }

    public int consumoEnergia() {

        return this.consumoEnergia;
    }

    @Override
    public String toString() {
        return "Armadura{" + "consumoEnergia=" + consumoEnergia + ", caminar=" + caminar + ", correr=" + correr + ", propulsar=" + propulsar + ", volar=" + volar + ", escribir=" + escribir + ", leer=" + leer + '}';
    }

}
