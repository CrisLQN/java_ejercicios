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
public class Camping extends ExtraHotelero{
    private int capacidadMaximaCarpas;
    private int bañosDisponibles;
    private boolean restaurante;

    public Camping(int capacidadMaximaCarpas, int bañosDisponibles, boolean restaurante, boolean privado, int cantidadMetrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(privado, cantidadMetrosCuadrados, nombre, direccion, localidad, gerente);
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
        this.bañosDisponibles = bañosDisponibles;
        this.restaurante = restaurante;
    }

    public void setCapacidadMaximaCarpas(int capacidadMaximaCarpas) {
        this.capacidadMaximaCarpas = capacidadMaximaCarpas;
    }

    public void setBañosDisponibles(int bañosDisponibles) {
        this.bañosDisponibles = bañosDisponibles;
    }

    public void setRestaurante(boolean restaurante) {
        this.restaurante = restaurante;
    }

    public void setPrivado(boolean privado) {
        this.privado = privado;
    }

    public void setCantidadMetrosCuadrados(int cantidadMetrosCuadrados) {
        this.cantidadMetrosCuadrados = cantidadMetrosCuadrados;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public void setGerente(String gerente) {
        this.gerente = gerente;
    }

    public int getCapacidadMaximaCarpas() {
        return capacidadMaximaCarpas;
    }

    public int getBañosDisponibles() {
        return bañosDisponibles;
    }

    public boolean isRestaurante() {
        return restaurante;
    }

    public boolean isPrivado() {
        return privado;
    }

    public int getCantidadMetrosCuadrados() {
        return cantidadMetrosCuadrados;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getLocalidad() {
        return localidad;
    }

    public String getGerente() {
        return gerente;
    }
    
    
    
}
