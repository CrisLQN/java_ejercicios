package cuadrado_n_numeros;

import java.util.Scanner;

public class Cuadrado_N_numeros {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese un numero entero positivo");
        int numero = leer.nextInt();
        for (int i = 1; i < numero; i++) {
            if (i == 1 || i == numero) {
                for (int j = 0; j < numero; j++) {
                    System.out.print("*");
                }
            } else {
                System.out.println("");
                for (int k = 1; k < numero + 1; k++) {
                    if (k == 1 || k == numero) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
        }
        System.out.println("");
        for (int p = 0; p < numero; p++) {
            System.out.print("*");
        }
        System.out.println("");
    }

}
