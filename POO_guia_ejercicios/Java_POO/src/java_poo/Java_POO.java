package java_poo;

import Entidad.Persona;
import java.util.Scanner;

public class Java_POO {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Persona primera_persona = new Persona();

        Persona segunda_persona = new Persona("jj", "gales", 20);
        System.out.println("inserte nombre primera persona");
        primera_persona.setNombre(leer.nextLine());

        System.out.println(primera_persona.getNombre());
    }

}
