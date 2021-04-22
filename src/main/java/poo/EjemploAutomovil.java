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
public class EjemploAutomovil {

    public static void main(String[] args) {
        Automovil honda = new Automovil("HONDA", "CIVIC", Color.NEGRO, new Motor(1.8, TipoMotor.GASOLINA), new Estanque(50), TipoAutomovil.SEDAN);
        System.out.println(honda);
    }
}
