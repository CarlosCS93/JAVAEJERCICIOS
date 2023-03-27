package Servicio;

import Entidad.BuscaminasCJ;

public class BuscaminasServicio {

    public BuscaminasCJ llenarBuscaminas() {
        BuscaminasCJ b = new BuscaminasCJ();
        int[][] bu = new int[5][5];
        for (int i = 0; i < b.getA().length; i++) {
            
            for (int j = 0; j < b.getA().length; j++) {
                bu [i][j]=j;
                if ( j>0) {
                    bu[i][j] = 0;
                } else {
                    bu[i][j] = i;
                }

                b.setA(bu);
            }
        }
        return b;
    }

    public void mostartablero(BuscaminasCJ b) {

        for (int i = 0; i < b.getA().length; i++) {
            for (int j = 0; j < b.getA().length; j++) {
                System.out.print(b.getA()[i][j]);
            }
            System.out.println("");
        }

    }
}


