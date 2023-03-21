package Servicio;

import Entidad.Persona;
import java.util.Scanner;

public class ServicioPersona {

    Persona persona = new Persona();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Persona crearPersona() {
        System.out.println("Ingrese nombre");
        persona.setNombre(leer.nextLine());
        System.out.println("Ingrese edad");
        persona.setEdad(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese sexo (H para hombre, M para mujer, O para otro (minusculas seran validos)");
        persona.setSexo(leer.nextLine());
        while (!"H".equalsIgnoreCase(persona.getSexo()) && !"M".equalsIgnoreCase(persona.getSexo()) && !"O".equalsIgnoreCase(persona.getSexo())) {
            System.out.println("Ingreso invalido, por favor ingrese H para hombre, M para mujer o O para otro");
            persona.setSexo(leer.nextLine());
        }
        System.out.println("Ingrese peso en kg");
        persona.setPeso(leer.nextDouble());
        System.out.println("Ingrese altura");
        persona.setAltura(leer.nextDouble());
        leer.nextLine();
        return persona;
    }

    public int calcularIMC(Persona persona) {
        double IMC = persona.getPeso() / (persona.getAltura() * persona.getAltura());
        if (IMC < 20) {
            return -1;
        } else if (IMC >= 20 && IMC <= 25) {
            return 0;
        } else {
            return 1;
        }
    }

    public boolean esMayorDeEdad(Persona persona) {
        return persona.getEdad() >= 18;

    }

}
