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
public class Electrodomestico {
    protected double precio;
    protected String color;
    protected char consumnoEnergertico;
    protected double peso;

    public Electrodomestico() {
    }

    public Electrodomestico(double precio, String color, char consumnoEnergertico, double peso) {
        this.precio = precio;
        this.color = color;
        this.consumnoEnergertico = consumnoEnergertico;
        this.peso = peso;
    }

    public double getPrecio() {
        return precio;
    }

    public String getColor() {
        return color;
    }

    public char getConsumnoEnergertico() {
        return consumnoEnergertico;
    }

    public double getPeso() {
        return peso;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setConsumnoEnergertico(char consumnoEnergertico) {
        this.consumnoEnergertico = consumnoEnergertico;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
    
    
    
}
