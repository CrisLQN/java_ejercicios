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
public class Lavadora extends Electrodomestico {

    private double carga;

    public Lavadora() {
    }

    public Lavadora(double carga) {
        this.carga = carga;
    }

    public Lavadora(double carga, double precio, String color, char consumnoEnergertico, double peso) {
        super(precio, color, consumnoEnergertico, peso);
        this.carga = carga;
    }

    public void setCarga(double carga) {
        this.carga = carga;
    }

    @Override
    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public void setConsumnoEnergertico(char consumnoEnergertico) {
        this.consumnoEnergertico = consumnoEnergertico;
    }

    @Override
    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getCarga() {
        return carga;
    }

    @Override

    public double getPrecio() {
        return precio;
    }

    @Override

    public String getColor() {
        return color;
    }

    @Override

    public char getConsumnoEnergertico() {
        return consumnoEnergertico;
    }

    @Override

    public double getPeso() {
        return peso;
    }

}
