package matriz_antisimetrica;

import java.util.Scanner;

public class Matriz_antisimetrica {

    public static void main(String[] args) {
        int[][] matriz = new int[3][3];
        int[][] transpuesta = new int[3][3];
        rellenar_matriz(matriz);
        System.out.println("matriz transpuesta ");
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                transpuesta[f][c] = matriz[c][f];
                System.out.print("[" + transpuesta[f][c] + "] ");
            }
            System.out.println("");
        }
        boolean bandera = true;
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                if (matriz[f][c] != transpuesta[f][c] * (-1)) {
                    bandera = false;
                    break;
                }
            }
        }
        if (bandera == true) {
            System.out.println("La matriz es antisimetrica");
        } else {
            System.out.println("La matriz NO es antisimetrica");
        }
    }

    public static void rellenar_matriz(int matriz[][]) {
        System.out.println("matriz a transponer");
        Scanner leer = new Scanner(System.in);
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("Ingrese numero para la posicion (" + f + ") (" + c + ")");
                matriz[f][c] = leer.nextInt();
            }
        }
    }
}
