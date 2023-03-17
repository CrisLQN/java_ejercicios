package matriz_4x4_transpuesta;

public class Matriz_4x4_transpuesta {

    public static void main(String[] args) {
        int[][] matriz = new int[4][4];
        int[][] transpuesta = new int[4][4];
        rellenar_matriz(matriz);
        System.out.println("matriz transpuesta ");
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                transpuesta[f][c] = matriz[c][f];
                System.out.print("[" + transpuesta[f][c] + "] ");
            }
            System.out.println("");
        }
    }

    public static void rellenar_matriz(int matriz[][]) {
        System.out.println("matriz a transponer");
        for (int f = 0; f < 4; f++) {
            for (int c = 0; c < 4; c++) {
                matriz[f][c] = (int) (Math.random() * 10);
                System.out.print("[" + matriz[f][c] + "] ");
            }
            System.out.println("");
        }
    }
}
