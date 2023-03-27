/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Equipo {
    private ArrayList <Jugador> nomina;
    
    
    public Equipo (){
        nomina = new ArrayList();
    }

    public ArrayList<Jugador> getNomina() {
        return nomina;
    }

    public void setNomina(ArrayList<Jugador> nomina) {
        this.nomina = nomina;
    }

    @Override
    public String toString() {
        return "Equipo{" + "nomina=" + nomina + '}';
    }
    
    
    
    
    
}
