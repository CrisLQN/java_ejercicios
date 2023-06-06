/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Electrodomestico;
import Entidad.Lavadora;
import Entidad.Televisor;
import Servicio.ElectrodomesticoServicio;
import Servicio.LavadoraServicio;
import Servicio.TelevisorServicio;
import java.util.ArrayList;

/**
 *
 * @author cris-
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        LavadoraServicio lavaServ = new LavadoraServicio();
        Electrodomestico lavadoraUno = lavaServ.crearLavadora('e', "gris");
        Electrodomestico lavadoraDos = lavaServ.crearLavadora('a', "blanco");

        //System.out.println("LavadoraPrecio: $ "+lavadoraUno.getPrecio());
        // System.out.println("Color lavadora= "+lavadoraUno.getColor());
        TelevisorServicio teleServ = new TelevisorServicio();
        Electrodomestico televisorUno = teleServ.crearTelevisor('a', "blanco");
        Electrodomestico televisorDos = teleServ.crearTelevisor('f', "gris");

        // System.out.println("Televisor precio : $"+televisorUno.getPrecio());
        // System.out.println("Color televisor= "+televisorUno.getColor());
        ArrayList<Electrodomestico> lista = new ArrayList();
        lista.add(lavadoraUno);
        lista.add(lavadoraDos);
        lista.add(televisorUno);
        lista.add(televisorDos);
        double precioTotalLavadoras = 0;
        double precioTotalTelevisores = 0;
        for (Electrodomestico ejemplar : lista) {
            if (ejemplar.getClass().equals(Lavadora.class)) {
                lavaServ.precioFinal(ejemplar);
                System.out.println("Lavadora precio: $ " + ejemplar.getPrecio());
                precioTotalLavadoras += ejemplar.getPrecio();
            }
            if (ejemplar.getClass().equals(Televisor.class)) {
                teleServ.precioFinal(ejemplar);
                System.out.println("Televisor precio: $ " + ejemplar.getPrecio());
                precioTotalTelevisores += ejemplar.getPrecio();
            }

        }
        System.out.println("Precio total Lavadores $" + precioTotalLavadoras);
        System.out.println("Precio total Televisores $"+precioTotalTelevisores);
        System.out.println("TOTAL a pagar $"+(precioTotalLavadoras+precioTotalTelevisores));
    }

}
