/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Electrodomestico;

/**
 *
 * @author cris-
 */
public class ElectrodomesticoServicio {

    public char comprobarConsumoEnergetico(char letra) {
        Electrodomestico ejemplar = new Electrodomestico();
        if (letra == 'A' || letra == 'B' || letra == 'C' || letra == 'D' || letra == 'E' || letra == 'F') {
            return letra;
        } else {
            return 'F';
        }
    }

    public String comprobarColor(String color) {
        if (color.equalsIgnoreCase("blanco") || color.equalsIgnoreCase("negro") || color.equalsIgnoreCase("rojo") || color.equalsIgnoreCase("gris")) {
            return color;
        } else {
            return "blanco";
        }
    }

    public Electrodomestico crearElectrodomestico(Electrodomestico ejemplar, char letra, String color) {
        ejemplar.setPrecio(1000);
        ejemplar.setColor(comprobarColor(color));
        letra = String.valueOf(letra).toUpperCase().charAt(0);
        ejemplar.setConsumnoEnergertico(comprobarConsumoEnergetico(letra));
        ejemplar.setPeso(10);
        return ejemplar;
    }

    public Electrodomestico precioFinal(Electrodomestico ejemplar) {
        if (ejemplar.getPeso() < 20) {
            ejemplar.setPrecio(ejemplar.getPrecio() + 100);
        } else if (ejemplar.getPeso() < 50) {
            ejemplar.setPrecio(ejemplar.getPrecio() + 500);
        } else if (ejemplar.getPeso() < 80) {
            ejemplar.setPrecio(ejemplar.getPrecio() + 800);
        } else {
            ejemplar.setPrecio(ejemplar.getPrecio() + 1000);
        }

        switch (ejemplar.getConsumnoEnergertico()) {
            case 'A':
                ejemplar.setPrecio(ejemplar.getPrecio() + 1000);
                break;
            case 'B':
                ejemplar.setPrecio(ejemplar.getPrecio() + 800);
                break;
            case 'C':
                ejemplar.setPrecio(ejemplar.getPrecio() + 600);
                break;
            case 'D':
                ejemplar.setPrecio(ejemplar.getPrecio() + 500);
                break;
            case 'E':
                ejemplar.setPrecio(ejemplar.getPrecio() + 300);
                break;
            case 'F':
                ejemplar.setPrecio(ejemplar.getPrecio() + 100);
                break;

        }
        return ejemplar;
    }
}
