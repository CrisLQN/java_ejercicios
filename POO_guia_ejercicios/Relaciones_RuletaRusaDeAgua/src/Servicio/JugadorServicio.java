/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Jugador;
import Entidad.RevolverDeAgua;

/**
 *
 * @author cris-
 */
public class JugadorServicio {

    public boolean disparo(Jugador jugador, RevolverDeAgua revolver) {
        RevolverServicio revolverServ = new RevolverServicio();
        if (revolverServ.mojar(revolver)) {
            jugador.setMojado(true);
            revolver.setPosicionActual((int) Math.round(Math.random() * 5));
            revolver.setPosicionAgua((int) Math.round(Math.random() * 5));
            return true;
        }
        revolverServ.siguienteChorro(revolver);
        return false;

    }
}


