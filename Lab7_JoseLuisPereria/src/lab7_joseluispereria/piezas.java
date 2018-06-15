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
public class piezas {
    private String nombre;
    private String material;
    private double tiempo;
    private ArrayList<piezas>piex2=new ArrayList();

    public piezas(String nombre, String material, double tiempo) {
        this.nombre = nombre;
        this.material = material;
        this.tiempo = tiempo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public double getTiempo() {
        return tiempo;
    }

    public void setTiempo(double tiempo) {
        this.tiempo = tiempo;
    }

    public ArrayList<piezas> getPiex2() {
        return piex2;
    }

    public void setPiex2(ArrayList<piezas> piex2) {
        this.piex2 = piex2;
    }

    @Override
    public String toString() {
        return nombre ;
    }
   
    
    
    
    
    
    
}
