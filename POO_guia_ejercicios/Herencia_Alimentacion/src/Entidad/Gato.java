/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author cris-
 */
public class Gato extends Animal {

    public Gato(String nombre, String alimento, int edad, String raza) {
        super(nombre, alimento, edad, raza);
    }

    @Override
    public void alimentarse() {
        System.out.println("MEOW MEOW, Hola soy " + nombre + " como " +alimento+ " tengo " + edad + " años y soy raza " + raza);
    }
}
