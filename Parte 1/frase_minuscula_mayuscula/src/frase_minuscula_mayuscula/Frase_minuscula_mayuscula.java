package frase_minuscula_mayuscula;

import java.util.Scanner;

public class Frase_minuscula_mayuscula {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese frase para mostrarla en mayuscula y minuscula");
        String frase = leer.nextLine();
        System.out.println("Frase en mayuscula: " + frase.toUpperCase());
        System.out.println("Frase en minuscula: "+frase.toLowerCase());
    }

}
