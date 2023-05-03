package poo_persona;

import Entidad.Persona;
import Servicio.PersonaServicio;
import java.sql.Date;

public class POO_persona {

    public static void main(String[] args) {
        java.util.Date fechaActual = new java.util.Date();
        PersonaServicio personaServ = new PersonaServicio();
        Persona personaUno = personaServ.crearPersona();
        System.out.println("La fecha de nacimiento de " + personaUno.getNombre() + " es " + personaUno.getFechaNacimiento());

        System.out.println("La edad de " + personaUno.getNombre() + " es " + personaServ.calcularEdad(personaUno.getFechaNacimiento(), fechaActual));
    }

}
