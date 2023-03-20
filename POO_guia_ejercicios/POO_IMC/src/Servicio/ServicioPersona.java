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
        return persona;
    }
}
