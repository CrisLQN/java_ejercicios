package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

public class PersonaServicio {

    Scanner leer = new Scanner(System.in);
    
    Date fechaNacimiento = new Date();
    Date fechaActual = new Date();

    public Persona crearPersona() {
        Persona persona = new Persona();
        System.out.println("Ingrese nombre");
        persona.setNombre(leer.nextLine());
        System.out.println("Ingrese dia de nacimiento");
        fechaNacimiento.setDate(leer.nextInt());
         System.out.println("Ingrese mes de nacimiento");
        fechaNacimiento.setMonth(leer.nextInt());
         System.out.println("Ingrese año de nacimiento (del siglo)");
        fechaNacimiento.setYear(leer.nextInt());
        persona.setFechaNacimiento(fechaNacimiento);
        return persona;
    }

    public int calcularEdad(Date fechaNacimiento, Date fechaActual) {
        if (fechaNacimiento.getMonth() < fechaActual.getMonth()) {
            System.out.println("aquid");
            return (fechaActual.getYear() - fechaNacimiento.getYear()) - 1;
        } else if (fechaNacimiento.getMonth() == fechaActual.getMonth()&&fechaNacimiento.getDate() < fechaActual.getDate()) {
            return (fechaActual.getYear() - fechaNacimiento.getYear()) - 1;
        }else {
            return fechaActual.getYear() - fechaNacimiento.getYear();
        }
    }

}
