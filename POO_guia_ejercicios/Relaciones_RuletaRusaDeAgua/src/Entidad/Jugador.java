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
public class Jugador {
    private long id;
    private String nombre;
    private boolean mojado=false;

    public Jugador() {
    }

    public Jugador(long id) {
        this.id = id;
        this.nombre="Jugador "+id;
    }

    public void setMojado(boolean mojado) {
        this.mojado = mojado;
    }

    
    
    public void setId(long id) {
        this.id = id;
    }

    public long getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public boolean isMojado() {
        return mojado;
    }
    
    
    
    
    
}
