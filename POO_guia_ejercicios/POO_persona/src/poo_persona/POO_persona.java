package poo_persona;

import Entidad.Persona;
import Servicio.PersonaServicio;

public class POO_persona {

    public static void main(String[] args) {
        Persona personaUno = new Persona();
        PersonaServicio personaServ = new PersonaServicio();
        personaUno=personaServ.crearPersona();
        System.out.println("La fecha de nacimiento de "+personaUno.getNombre()+" es "+personaUno.getFechaNacimiento());
    }

}
