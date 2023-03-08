package transfomar_centrigrados_fahrenheit;

import java.util.Scanner;

public class Transfomar_centrigrados_fahrenheit {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de de grados celsius al transformar");
        double celsius=leer.nextDouble();
        System.out.println("Grados Fahrenheit: "+(32+(9*celsius/5)));
    }

}
