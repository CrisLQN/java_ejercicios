/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Electrodomestico;
import Entidad.Lavadora;

/**
 *
 * @author cris-
 */
public class LavadoraServicio extends ElectrodomesticoServicio {

    public Electrodomestico crearLavadora(char letra, String color) {
        Electrodomestico ejemplar = new Lavadora(31);
        return crearElectrodomestico(ejemplar, letra, color);
    }

    
    
    @Override
    public Electrodomestico precioFinal(Electrodomestico ejemplar) {
        Lavadora x=(Lavadora) ejemplar;
        super.precioFinal(ejemplar);
        if (x.getCarga()>30) {
            ejemplar.setPrecio(ejemplar.getPrecio()+500);
        }
        return x;
    }

}
