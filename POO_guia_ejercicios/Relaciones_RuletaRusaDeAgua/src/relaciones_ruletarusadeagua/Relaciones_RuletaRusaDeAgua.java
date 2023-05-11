/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_ruletarusadeagua;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.RevolverDeAgua;
import Servicio.JuegoServicio;
import Servicio.RevolverServicio;
import java.util.ArrayList;

/**
 *
 * @author cris-
 */
public class Relaciones_RuletaRusaDeAgua {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Jugador jugadorUno = new Jugador(1);
        Jugador jugadorDos = new Jugador(2);
        Jugador jugadorTres = new Jugador(3);
        Jugador jugadorCuatro = new Jugador(4);
        Jugador jugadorCinco = new Jugador(5);
        Jugador jugadorSeis = new Jugador(6);
        ArrayList<Jugador> jugadores = new ArrayList();

        jugadores.add(jugadorUno);
        jugadores.add(jugadorDos);
        jugadores.add(jugadorTres);
        jugadores.add(jugadorCuatro);
        jugadores.add(jugadorCinco);
        jugadores.add(jugadorSeis);
        RevolverServicio revolverServ = new RevolverServicio();
        RevolverDeAgua revolver = new RevolverDeAgua();
        revolverServ.llenarRevolver(revolver);
        JuegoServicio juegoServ = new JuegoServicio();
        Juego juego = juegoServ.llenarJuego(jugadores, revolver);
        juegoServ.ronda(juego);
          
    }

}
