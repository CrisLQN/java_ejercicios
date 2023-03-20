/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import java.util.Scanner;

/**
 *
 * @author cris-
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        String genero = "w";
        while (!"H".equalsIgnoreCase(genero)&&!"M".equalsIgnoreCase(genero)&&!"O".equalsIgnoreCase(genero)) {
            System.out.println("Incorrecto por favor ingrese algo valido");
            genero = leer.nextLine();
        }

    }

}
