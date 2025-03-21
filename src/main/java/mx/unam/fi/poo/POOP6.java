/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.unam.fi.poo;

import pokemon.Pokemon;

/**
 * @author Issmael
 */
public class POOP6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Hola mundo");

        System.out.println("");

        Pokemon pokemon1 = new Pokemon("Amarillo", "Charizard", "Fuego", 6, 50);

        pokemon1.atacar();
        pokemon1.setColor("Naranja");
    }
}
