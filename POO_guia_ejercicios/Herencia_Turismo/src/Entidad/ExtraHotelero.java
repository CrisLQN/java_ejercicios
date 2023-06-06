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
public abstract class ExtraHotelero extends Alojamiento {
    protected boolean privado;
    protected int cantidadMetrosCuadrados;

    public ExtraHotelero(boolean privado, int cantidadMetrosCuadrados, String nombre, String direccion, String localidad, String gerente) {
        super(nombre, direccion, localidad, gerente);
        this.privado = privado;
        this.cantidadMetrosCuadrados = cantidadMetrosCuadrados;
        
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
