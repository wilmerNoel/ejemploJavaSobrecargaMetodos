/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author wilmer
 */
public class Rueda {
    private String fabricante;
    private int aro;
    private double ancho;

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public int getAro() {
        return aro;
    }

    public void setAro(int aro) {
        this.aro = aro;
    }

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public Rueda(String fabricante, int aro, double ancho) {
        this.fabricante = fabricante;
        this.aro = aro;
        this.ancho = ancho;
    }
    
    
}
