/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Date;

/**
 *
 * @author cris-
 */
public class Alquiler {
   private String nombre;
   private int documentoCliente;
   private Date fechaAlquiler;
   private Date fechaDevolucion;
   private int posicionAmarre;
   private Barco barcoOcupado;

    public Alquiler() {
    }

    public Alquiler(String nombre, int documentoCliente, Date fechaAlquiler, Date fechaDevolucion, int posicionAmarre, Barco barcoOcupado) {
        this.nombre = nombre;
        this.documentoCliente = documentoCliente;
        this.fechaAlquiler = fechaAlquiler;
        this.fechaDevolucion = fechaDevolucion;
        this.posicionAmarre = posicionAmarre;
        this.barcoOcupado = barcoOcupado;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDocumentoCliente(int documentoCliente) {
        this.documentoCliente = documentoCliente;
    }

    public void setFechaAlquiler(Date fechaAlquiler) {
        this.fechaAlquiler = fechaAlquiler;
    }

    public void setFechaDevolucion(Date fechaDevolucion) {
        this.fechaDevolucion = fechaDevolucion;
    }

    public void setPosicionAmarre(int posicionAmarre) {
        this.posicionAmarre = posicionAmarre;
    }

    public void setBarcoOcupado(Barco barcoOcupado) {
        this.barcoOcupado = barcoOcupado;
    }

    public String getNombre() {
        return nombre;
    }

    public int getDocumentoCliente() {
        return documentoCliente;
    }

    public Date getFechaAlquiler() {
        return fechaAlquiler;
    }

    public Date getFechaDevolucion() {
        return fechaDevolucion;
    }

    public int getPosicionAmarre() {
        return posicionAmarre;
    }

    public Barco getBarcoOcupado() {
        return barcoOcupado;
    }
    
    

   
   
   
}
