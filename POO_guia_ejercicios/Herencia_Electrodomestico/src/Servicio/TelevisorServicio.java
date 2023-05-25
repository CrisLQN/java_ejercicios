/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Electrodomestico;
import Entidad.Televisor;

/**
 *
 * @author cris-
 */
public class TelevisorServicio extends ElectrodomesticoServicio {

    public Electrodomestico crearTelevisor(char letra, String color) {
        Electrodomestico ejemplar = new Televisor(41, true);
        return crearElectrodomestico(ejemplar, letra, color);

    }

    @Override
    public Electrodomestico precioFinal(Electrodomestico ejemplar) {
        Televisor x = (Televisor) ejemplar;
        super.precioFinal(ejemplar);
        if (x.getResolucion() > 40) {
            ejemplar.setPrecio(ejemplar.getPrecio() * 1.30);
        }
        if (x.isTDT()) {
            ejemplar.setPrecio(ejemplar.getPrecio() +500);
        }
        return x;
    }

}
