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
public class Televisor extends Electrodomestico {

    private int resolucion;
    private boolean TDT;

    public Televisor() {
    }

    public Televisor(int resolucion, boolean TDT) {
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public Televisor(int resolucion, boolean TDT, double precio, String color, char consumnoEnergertico, double peso) {
        super(precio, color, consumnoEnergertico, peso);
        this.resolucion = resolucion;
        this.TDT = TDT;
    }

    public int getResolucion() {
        return resolucion;
    }

    public boolean isTDT() {
        return TDT;
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

    public void setResolucion(int resolucion) {
        this.resolucion = resolucion;
    }

    public void setTDT(boolean TDT) {
        this.TDT = TDT;
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

}
