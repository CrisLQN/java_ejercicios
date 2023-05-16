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
public class Vehiculo {
    private String marca;
    private String modelo;
    private int annio;
    private String numeroMotor;
    private String chasis;
    private String color;
    private String tipo;

    public Vehiculo() {
    }

    public Vehiculo(String marca, String modelo, int annio, String numeroMotor, String chasis, String color, String tipo) {
        this.marca = marca;
        this.modelo = modelo;  
        this.annio = annio;
        this.numeroMotor = numeroMotor;
        this.chasis = chasis;
        this.color = color;
        this.tipo = tipo;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnnio(int annio) {
        this.annio = annio;
    }

    public void setNumeroMotor(String numeroMotor) {
        this.numeroMotor = numeroMotor;
    }

    public void setChasis(String chasis) {
        this.chasis = chasis;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAnnio() {
        return annio;
    }

    public String getNumeroMotor() {
        return numeroMotor;
    }

    public String getChasis() {
        return chasis;
    }

    public String getColor() {
        return color;
    }

    public String getTipo() {
        return tipo;
    }
    
    
    
    
    
    
}
