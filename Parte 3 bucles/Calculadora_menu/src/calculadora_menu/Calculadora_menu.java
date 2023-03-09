package calculadora_menu;

import java.util.Scanner;

public class Calculadora_menu {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el primer numero entero positivo");
        int numero_1 = leer.nextInt();
        while (numero_1 < 1) {
            System.out.println("Numero invalido, recuerde que debe ingresar solo enteros positivos.");
            System.out.println("Ingrese el primer numero entero positivo");
            numero_1 = leer.nextInt();
        }
        System.out.println("ingrese el segundo numero entero positivo");
        int numero_2 = leer.nextInt();
        while (numero_2 < 1) {
            System.out.println("Numero invalido, recuerde que debe ingresar solo enteros positivos.");
            System.out.println("Ingrese el segundo numero entero positivo");
            numero_2 = leer.nextInt();
        }
        boolean bandera = false;
        do {
            System.out.println("---------------MENU------------------\n"
                    + "1. Sumar\n"
                    + "2. Restar\n"
                    + "3. Multiplicar\n"
                    + "4. Dividir\n"
                    + "5. Salir\n"
                    + "Elija opción:/n"
                    + "------------------------------");
            int eleccion = leer.nextInt();
            switch (eleccion) {
                case 1:
                    System.out.println("La suma de ambos numeros es " + (numero_1 + numero_2));
                    break;
                case 2:
                    System.out.println("La resta de ambos numeros es " + (numero_1 - numero_2));
                    break;
                case 3:
                    System.out.println("La multiplicacion de ambos numeros es " + (numero_1 * numero_2));
                    break;
                case 4:
                    System.out.println("La division de ambos numeros es " + (numero_1 / numero_2));
                    break;
                case 5:
                    System.out.println("¿Esta seguro que desea salir de programa(S/N?)");
                    String confirmar = leer.next();
                    if (confirmar.equalsIgnoreCase("S")) {
                        bandera = true;
                    }
                    break;

                default:
                    System.out.println("Opcion no valida. Regresando al menu");
            }
        } while (bandera == false);
    }
}
