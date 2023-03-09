package frase_comienza_con_a;

import java.util.Scanner;

public class Frase_comienza_con_a {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una frase que comience con *A*, no tomara en cuenta minuscula");
        String frase = leer.nextLine();
        if (frase.substring(0, 1).equalsIgnoreCase("A")) {
            System.out.println("Correcto");
        } else {
            System.out.println("Incorrecto");
        }
    }
}
