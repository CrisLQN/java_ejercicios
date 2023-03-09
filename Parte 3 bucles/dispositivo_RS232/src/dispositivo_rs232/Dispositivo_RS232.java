package dispositivo_rs232;

import java.util.Scanner;

public class Dispositivo_RS232 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        int correcta = 0;
        int incorrecta = 0;
        System.out.println("\"Ingrese cadena de texto, para ser correcta, tiene que tener 5 caracteres de largo, primer caracter una X y la ultima una O.\"");
        System.out.println("Si quiere salir de programa y tener el informe final ingrese &&&&&");
        String cadena = leer.nextLine();
        while (!"&&&&&".equals(cadena)) {
            if (cadena.substring(0, 1).equalsIgnoreCase("x") && cadena.substring((cadena.length() - 1)).equalsIgnoreCase("o")) {
                correcta += 1;
            } else {
                incorrecta += 1;
            }
            System.out.println("Ingrese cadena de texto, recuerde que para salir ingrese &&&&&");
            cadena = leer.nextLine();
        }
        System.out.println("Al escribirse la FDE (&&&&&), se procedera a mostrar el informe");
        System.out.println("cadenas correctas = " + correcta + " cadenas incorrectas= " + incorrecta);
    }

}
