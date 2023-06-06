/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Barco;
import Entidad.Yate;

/**
 *
 * @author cris-
 */
public class ServicioYate extends ServicioBarco{

    @Override
    public double obtenerValorModulo(Barco barco) {
        Yate yate = (Yate) barco;
        return super.obtenerValorModulo(barco) + yate.getPotenciaCV()+yate.getCamarotes();
    }
}
