/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_raices;

import Entidad.Raices;
import Servicio.RaicesServicio;

/**
 *
 * @author cris-
 */
public class POO_raices {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        RaicesServicio raizServ = new RaicesServicio();
        Raices raizUno = new Raices(1, -4, 4);
        raizServ.calcular(raizUno);
    }

}
