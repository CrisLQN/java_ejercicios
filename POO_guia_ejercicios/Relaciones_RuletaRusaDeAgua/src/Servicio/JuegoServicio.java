/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Juego;
import Entidad.Jugador;
import Entidad.RevolverDeAgua;
import java.util.ArrayList;

/**
 *
 * @author cris-
 */
public class JuegoServicio {

    public Juego llenarJuego(ArrayList<Jugador> jugadores, RevolverDeAgua revolver) {
        Juego juego = new Juego();
        juego.setJugadores(jugadores);
        juego.setRevolver(revolver);
        return juego;
    }

    public void ronda(Juego juego) {
        RevolverServicio revolverServ=new RevolverServicio();
        JugadorServicio jugadorServ = new JugadorServicio();
        ArrayList<Jugador> jugadores=juego.getJugadores();
        boolean bandera = true;
        do {
            for (Jugador jugador : jugadores) {
                 revolverServ.toString(juego.getRevolver());
                if (jugadorServ.disparo(jugador, juego.getRevolver())) {
                    System.out.println(jugador.getNombre() + " SE MOJÓ");
                    bandera=false;
                    break;
                }
                System.out.println(jugador.getNombre());
            }
        } while (bandera);
    }
}
