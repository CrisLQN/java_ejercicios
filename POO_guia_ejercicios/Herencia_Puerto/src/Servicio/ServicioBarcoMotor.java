/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Barco;
import Entidad.BarcoMotor;

/**
 *
 * @author cris-
 */
public class ServicioBarcoMotor extends ServicioBarco {

    @Override
    public double obtenerValorModulo(Barco barco) {
        BarcoMotor barcoMotor = (BarcoMotor) barco;
        return super.obtenerValorModulo(barco) + barcoMotor.getPotenciaCV();
    }
}
