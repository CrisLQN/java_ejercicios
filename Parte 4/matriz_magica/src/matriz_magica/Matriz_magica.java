package matriz_magica;

import java.util.Scanner;

public class Matriz_magica {

    public static void main(String[] args) {
        int suma = 0;
        int suma_anterior = 0;
        boolean bandera = true;
        int[][] matriz = new int[3][3];
        rellenar_matriz(matriz);
        //comprobando las sumas en las filas
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                suma = suma + matriz[f][c];
            }
            if (f > 0) {
                if (suma != suma_anterior) {
                    bandera = false;
                    break;
                }
            }
            suma_anterior = suma;
            suma = 0;
        }
        suma = 0;
        if (bandera == true) {
            //comprobando las sumas en las columnas
            for (int c = 0; c < 3; c++) {
                for (int f = 0; f < 3; f++) {
                    suma = suma + matriz[f][c];
                }
                if (c > 0) {
                    if (suma != suma_anterior) {
                        bandera = false;
                        break;
                    }
                }
                suma_anterior = suma;
                suma = 0;
            }
            if (bandera == true) {
                mostrar_matriz(matriz);
                System.out.println("La matriz es magica");
            }
        } else {
            mostrar_matriz(matriz);
            System.out.println("La matriz NO es magica");
        }

    }

    public static void rellenar_matriz(int matriz[][]) {
        Scanner leer = new Scanner(System.in);
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.println("ingrese valor del elemento de la matriz [" + f + "] [" + c + "] , debe estar entre los valores 1-9");
                matriz[f][c] = leer.nextInt();
                while (matriz[f][c] < 1 || matriz[f][c] > 9) {
                    System.out.println("valor no valido, recuerde que el valor ingresado debe ser enteros entre 1 a 9");
                    matriz[f][c] = leer.nextInt();
                }
            }
        }
    }

    public static void mostrar_matriz(int matriz[][]) {
        for (int f = 0; f < 3; f++) {
            for (int c = 0; c < 3; c++) {
                System.out.print("[" + matriz[f][c] + "] ");
            }
            System.out.println("");
        }
    }

}
