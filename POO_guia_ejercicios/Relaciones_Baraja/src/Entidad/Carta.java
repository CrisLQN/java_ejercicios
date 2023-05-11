/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Comparator;

/**
 *
 * @author cris-
 */
public class Carta {

    private int numero;
    private String palo;

    public Carta() {
    }

    public Carta(int numero, String palo) {
        this.numero = numero;
        this.palo = palo;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public void setPalo(String palo) {
        this.palo = palo;
    }

    public int getNumero() {
        return numero;
    }

    public String getPalo() {
        return palo;
    }

    @Override
    public String toString() {
        return "Carta{" + "numero= " + numero + ", palo= " + palo + '}';
    }

    public static Comparator<Carta> aleatorio = new Comparator<Carta>() {
        @Override
        public int compare(Carta p1, Carta p2) {
            double random=Math.random();
            
            if (random<0.33) {
                return 1;
            }
            if (random<0.66) {
                return -1;
            }
            return 0;
        }
    };

}
