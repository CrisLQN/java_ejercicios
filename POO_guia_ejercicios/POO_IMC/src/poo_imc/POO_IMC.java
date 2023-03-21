package poo_imc;

import Entidad.Persona;
import Servicio.ServicioPersona;

public class POO_IMC {

    public static void main(String[] args) {
        double pesoBajo = 0;
        double pesoIdeal = 0;
        double sobrePeso = 0;
        double mayorEdad = 0;
        double menorEdad = 0;
        Persona personaUno = new Persona();
        Persona personaDos = new Persona();
        Persona personaTres = new Persona();
        Persona personaCuatro = new Persona();
        ServicioPersona personaServicio = new ServicioPersona();
        System.out.println("Primera Persona");
        personaUno = personaServicio.crearPersona();
        switch (personaServicio.calcularIMC(personaUno)) {
            case -1:
                System.out.println(personaUno.getNombre() + " esta debajo de su peso ideal");
                pesoBajo += 1;
                break;
            case 0:
                System.out.println(personaUno.getNombre() + " esta dentro de su peso ideal");
                pesoIdeal += 1;
                break;
            default:
                System.out.println(personaUno.getNombre() + " esta en sobrepeso");
                sobrePeso += 1;
                break;
        }
        if (personaServicio.esMayorDeEdad(personaUno)) {
            System.out.println(personaUno.getNombre() + " es mayor de edad");
            mayorEdad += 1;
            System.out.println(mayorEdad);
        } else {
            System.out.println(personaUno.getNombre() + " es menor de edad");
            menorEdad += 1;
            System.out.println(menorEdad);
        }

        System.out.println("Segunda Persona");
        personaDos = personaServicio.crearPersona();
        switch (personaServicio.calcularIMC(personaDos)) {
            case -1:
                System.out.println(personaDos.getNombre() + " esta debajo de su peso ideal");
                pesoBajo += 1;
                break;
            case 0:
                System.out.println(personaDos.getNombre() + " esta dentro de su peso ideal");
                pesoIdeal += 1;
                break;
            default:
                System.out.println(personaDos.getNombre() + " esta en sobrepeso");
                sobrePeso += 1;
                break;
        }
        if (personaServicio.esMayorDeEdad(personaDos)) {
            System.out.println(personaDos.getNombre() + " es mayor de edad");
            mayorEdad += 1;
            System.out.println(mayorEdad);
        } else {
            System.out.println(personaDos.getNombre() + " es menor de edad");
            menorEdad += 1;
            System.out.println(menorEdad);
        }

        System.out.println("Tercera Persona");
        personaTres = personaServicio.crearPersona();
        switch (personaServicio.calcularIMC(personaTres)) {
            case -1:
                System.out.println(personaTres.getNombre() + " esta debajo de su peso ideal");
                pesoBajo += 1;
                break;
            case 0:
                System.out.println(personaTres.getNombre() + " esta dentro de su peso ideal");
                pesoIdeal += 1;
                break;
            default:
                System.out.println(personaTres.getNombre() + " esta en sobrepeso");
                sobrePeso += 1;
                break;
        }
        if (personaServicio.esMayorDeEdad(personaTres)) {
            System.out.println(personaTres.getNombre() + " es mayor de edad");
            mayorEdad += 1;
            System.out.println(mayorEdad);
        } else {
            System.out.println(personaTres.getNombre() + " es menor de edad");
            menorEdad += 1;
            System.out.println(menorEdad);
        }

        System.out.println("Cuarta Persona");
        personaCuatro = personaServicio.crearPersona();
        switch (personaServicio.calcularIMC(personaCuatro)) {
            case -1:
                System.out.println(personaCuatro.getNombre() + " esta debajo de su peso ideal");
                pesoBajo += 1;
                break;
            case 0:
                System.out.println(personaCuatro.getNombre() + " esta dentro de su peso ideal");
                pesoIdeal += 1;
                break;
            default:
                System.out.println(personaCuatro.getNombre() + " esta en sobrepeso");
                sobrePeso += 1;
                break;
        }
        if (personaServicio.esMayorDeEdad(personaCuatro)) {
            System.out.println(personaCuatro.getNombre() + " es mayor de edad");
            mayorEdad += 1;
            System.out.println(mayorEdad);
        } else {
            System.out.println(personaCuatro.getNombre() + " es menor de edad");
            menorEdad += 1;
            System.out.println(menorEdad);
        }
        System.out.println("El porcentaje de personas que estan en bajo peso es %" + (pesoBajo / 4) * 100);
        System.out.println("El porcentaje de personas que estan en peso ideal es %" + (pesoIdeal / 4) * 100);
        System.out.println("El porcentaje de personas que estan en sobrepeso es %" + (sobrePeso / 4) * 100);
        System.out.println("El porcentaje de personas que son mayores de edad es %" + (mayorEdad / 4) * 100);
        System.out.println("El porcentaje de personas que son menores de edad es %" + (menorEdad / 4) * 100);

    }

}
