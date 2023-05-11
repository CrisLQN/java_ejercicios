/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion_aplicaciontienda;

import Servicio.AplicacionServicio;
import java.util.HashMap;

/**
 *
 * @author cris-
 */
public class Coleccion_AplicacionTienda {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AplicacionServicio tiendaServ = new AplicacionServicio();
        HashMap<String, Double> tiendaUno = tiendaServ.crear();
        tiendaUno = tiendaServ.eliminarProducto(tiendaUno);


    }

}
