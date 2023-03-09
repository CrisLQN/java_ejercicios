package par_o_impar;

import java.util.Scanner;

public class Par_o_impar {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese un numero");
        int numero = leer.nextInt();
        if (numero % 2 == 0) {
            System.out.println("El numero "+numero+" es par");
        } else {
            System.out.println("El numero "+numero+" es impar");
        }
    }

}
