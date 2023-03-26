package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
    Persona persona = new Persona();
    Date fechaNacimiento=new Date();
    Date fechaActual=new Date();
   
    public Persona crearPersona() {
        System.out.println("Ingrese nombre");
        persona.setNombre(leer.nextLine());
        System.out.println("Ingrese dia de nacimiento");
        fechaNacimiento.setDate(leer.nextInt());
        fechaNacimiento.setMonth(leer.nextInt());
        fechaNacimiento.setYear(leer.nextInt());
        persona.setFechaNacimiento(fechaNacimiento);
        return persona;
    }
    
    public int calcularEdad(){
    
    return 0;
    }
    
}
