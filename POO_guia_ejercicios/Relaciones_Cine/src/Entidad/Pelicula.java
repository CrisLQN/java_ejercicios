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
public class Pelicula {
    private String nombre;
    private int duracion;
    private int edadMinima;
    private String director;
    private double precioEntrada;

    public Pelicula() {
    }

    public Pelicula(String nombre, int duracion, int edadMinima, String director,double precioEntrada) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.edadMinima = edadMinima;
        this.director = director;
        this.precioEntrada=precioEntrada;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public String getDirector() {
        return director;
    }

    public double getPrecioEntrada() {
        return precioEntrada;
    }
    
    
    
}
