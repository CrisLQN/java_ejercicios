package javaapplication16;

public class JavaApplication16 {

    public static void main(String[] args) {
        int[] vector = new int[101];
        System.out.println("Orden descendente");
        rellenar(vector);
        for (int i = 100; i > -1; i--) {
            System.out.println(vector[i]);
        }

    }

    public static void rellenar(int vector[]) {
        for (int i = 0; i < 101; i++) {
            vector[i] = i;
        }
    }

}
