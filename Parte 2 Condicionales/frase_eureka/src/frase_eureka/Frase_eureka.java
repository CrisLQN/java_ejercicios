package frase_eureka;

import java.util.Scanner;

public class Frase_eureka {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese la palabra *eureka*, no importara las mayusculas ni minusculas.");
        String frase=leer.nextLine();
        if (frase.equalsIgnoreCase("EUREKA")) {
            System.out.println("Correcto");
        }else{
            System.out.println("Incorrecto");
        }
    }
}
