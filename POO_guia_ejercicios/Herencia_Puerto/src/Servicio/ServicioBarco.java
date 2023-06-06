/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alquiler;
import Entidad.Barco;

/**
 *
 * @author cris-
 */
public class ServicioBarco {

    public double calcularAlquiler(Alquiler alquiler) {
        double inicioAlquiler = alquiler.getFechaAlquiler().getTime() / (24 * 60 * 60 * 1000);
        double finalAlquiler = alquiler.getFechaDevolucion().getTime() / (24 * 60 * 60 * 1000);
        return (finalAlquiler - inicioAlquiler)*obtenerValorModulo(alquiler.getBarcoOcupado());
    }

    public double obtenerValorModulo(Barco barco) {
        return barco.getEsloraMetros() * 10;
    }
}
