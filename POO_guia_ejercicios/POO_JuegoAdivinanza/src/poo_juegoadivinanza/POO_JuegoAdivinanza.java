/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_juegoadivinanza;

import Entidad.Juego;
import Servicio.JuegoServicio;

/**
 *
 * @author cris-
 */
public class POO_JuegoAdivinanza {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        JuegoServicio juegoServ = new JuegoServicio();
        Juego jugadorUno = new Juego("Juan", 0, 0);
        Juego jugadorDos = new Juego("Pablo", 0, 0);
        for (int i = 0; i < 3; i++) {
            juegoServ.iniciar_juego(jugadorUno, jugadorDos);
        }
        System.out.println("Ganadas Jugador Uno" + jugadorUno.getGanadas());
        System.out.println("Ganadas Jugador Dos" + jugadorDos.getGanadas());
        System.out.println("Intentos jugador Dos " + jugadorDos.getIntentos());
    }

}
