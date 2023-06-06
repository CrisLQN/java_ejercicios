/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Barco;
import Entidad.Velero;

/**
 *
 * @author cris-
 */
public class ServicioVelero extends ServicioBarco {

    @Override
    public double obtenerValorModulo(Barco barco) {
        Velero velero=(Velero) barco;
        return super.obtenerValorModulo(barco)+velero.getMastiles();
    }
}
