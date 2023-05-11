/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.RevolverDeAgua;

/**
 *
 * @author cris-
 */
public class RevolverServicio {

    public RevolverDeAgua llenarRevolver(RevolverDeAgua revolver) {
        revolver.setPosicionActual((int) Math.round(Math.random() * 5));
        revolver.setPosicionAgua((int) Math.round(Math.random() * 5));
        System.out.println("El agua ha sido puesto en una ranura de revolver y la misma ha rotado");
        return revolver;

    }

    public boolean mojar(RevolverDeAgua revolver) {
        return revolver.getPosicionActual() == revolver.getPosicionAgua();
    }

    public RevolverDeAgua siguienteChorro(RevolverDeAgua revolver) {
        if (revolver.getPosicionActual() < 5) {
            revolver.setPosicionActual(revolver.getPosicionActual() + 1);
        } else {
            revolver.setPosicionActual(0);
        }
        return revolver;
    }
    
    public void toString(RevolverDeAgua revolver){
        System.out.println("La posicion actual de la recamara de disparo es "+revolver.getPosicionActual());
        System.out.println("La posicion del recamara del agua es  "+revolver.getPosicionAgua());
    }

}
