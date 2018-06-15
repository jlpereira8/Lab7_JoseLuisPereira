/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7_joseluispereria;

import java.util.ArrayList;

/**
 *
 * @author j0c3lwiz
 */
public class Carro {
    private String nombre;
    private ArrayList<piezas>piex=new ArrayList();

    public Carro(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<piezas> getPiex() {
        return piex;
    }

    public void setPiex(ArrayList<piezas> piex) {
        this.piex = piex;
    }

    @Override
    public String toString() {
        return nombre ;
    }
    
    
    
}
