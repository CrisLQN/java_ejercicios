package valor_limite_positivo;

import java.util.Scanner;

public class Valor_limite_positivo {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double suma = 0;
        System.out.println("Ingrese un numero positivo de cual sera el limite");
        double limite = leer.nextDouble();
        while (limite < 1) {
            System.out.println("Numero no valido, por favor ingrese un numero positivo");
            limite = leer.nextDouble();
        }
        do {
            System.out.println("Ingrese un numero. la suma actual es " + suma);
            suma = suma + leer.nextDouble();
        } while (suma <= limite);
        System.out.println("la suma (" + suma + ") supero el limite (" + limite + ")");
    }
}
