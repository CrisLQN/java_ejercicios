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
public class Asiento {
    private int fila;
    private String columna;
    private boolean ocupado;

    public Asiento(int fila, String columna) {
        this.fila = fila;
        this.columna = columna;
        this.ocupado = false;
    }

 

    public void setFila(int fila) {
        this.fila = fila;
    }

    public void setColumna(String columna) {
        this.columna = columna;
    }

    public void setOcupado(boolean ocupado) {
        this.ocupado = ocupado;
    }

    public int getFila() {
        return fila;
    }

    public String getColumna() {
        return columna;
    }

    public boolean isOcupado() {
        return ocupado;
    }

    @Override
    public String toString() {
        return "Asiento{" + "fila= " + fila + ", columna= " + columna + ", ocupado= " + ocupado + '}';
    }
    
    
    
    
}
