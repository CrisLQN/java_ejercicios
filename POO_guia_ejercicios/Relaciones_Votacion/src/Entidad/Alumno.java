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
public class Alumno {
    private String nombreCompleto;
    private int cantidadVotos;
    private int dni;
    public Alumno() {
    }

    public Alumno(String nombreCompleto, int dni, int cantidadVotos) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
        this.cantidadVotos = cantidadVotos;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public void setCantidadVotos(int cantidadVotos) {
        this.cantidadVotos = cantidadVotos;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public int getDni() {
        return dni;
    }

    public int getCantidadVotos() {
        return cantidadVotos;
    }
    
    
    
    
    
}
