/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author cris-
 */
public class Juego {
    private String jugador;
    private int intentos;
    private int ganadas;

    public Juego() {
    }

    
    
    public Juego(String jugador, int intentos, int ganadas) {
        this.jugador = jugador;
        this.intentos = intentos;
        this.ganadas = ganadas;
    }

    public void setJugador(String jugador) {
        this.jugador = jugador;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public void setGanadas(int ganadas) {
        this.ganadas = ganadas;
    }

    public String getJugador() {
        return jugador;
    }

    public int getIntentos() {
        return intentos;
    }

    public int getGanadas() {
        return ganadas;
    }
           
    
    
}
