/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Juego;
import java.util.Scanner;

/**
 *
 * @author cris-
 */
public class JuegoServicio {

    Scanner leer = new Scanner(System.in);
    Juego JugadorUno = new Juego();
    Juego JugadorDos = new Juego();

    public Juego iniciar_juego(Juego JugadorUno, Juego JugadorDos) {
        JugadorDos.setIntentos(1);
        System.out.println("Ingrese cantidad de intentos permitidos");
        int intentos = leer.nextInt();
        leer.nextLine();
        System.out.println(JugadorUno.getJugador() + " Elija un numero");
        int numero = leer.nextInt();

        do {
            System.out.println(JugadorDos.getJugador() + " Adivine el numero. INTENTOS= " + JugadorDos.getIntentos());
            int adivinanza = leer.nextInt();
            if (adivinanza == numero) {
                System.out.println(JugadorDos.getJugador() + " Adivinó el numero al intento " + JugadorDos.getIntentos());
                JugadorDos.setGanadas(JugadorDos.getGanadas() + 1);
                return JugadorDos;

            } else if (adivinanza > numero) {
                System.out.println("No se pudo adivinar el numero, el mismo esta más bajo");
                JugadorDos.setIntentos(JugadorDos.getIntentos() + 1);
            } else if (adivinanza < numero) {
                System.out.println("No se pudo adivinar el numero, el mismo esta más alto");
                JugadorDos.setIntentos(JugadorDos.getIntentos() + 1);
            }
        } while (JugadorDos.getIntentos() <= intentos);
        System.out.println("Se acabo los intentos permitidos, jugador Uno gana");
        JugadorUno.setGanadas(JugadorUno.getGanadas() + 1);
        return JugadorDos;
    }
}
