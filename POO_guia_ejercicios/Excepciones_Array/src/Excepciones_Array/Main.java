/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Excepciones_Array;

import java.util.Scanner;

/**
 *
 * @author cris-
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int[] numeros = new int[2];
        numeros[0] = 0;
        numeros[1] = 1;
        for (int i = 0; i < 3 ; i++) {
            try {
                System.out.println("Ingrese cuantas numeros quiere mostrar en el array");
                int cantidad = leer.nextInt();
                mostrar(numeros, cantidad);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Error: la cantidad de numeros de indice es menor a la cantidad propuesta");

            }

        }

    }

    public static void mostrar(int numeros[], int cantidad) throws ArrayIndexOutOfBoundsException {
        for (int i = 0; i < cantidad; i++) {
            System.out.println(numeros[i]);

        }

    }

}
