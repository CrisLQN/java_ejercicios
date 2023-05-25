/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import Entidad.Electrodomestico;
import Servicio.ElectrodomesticoServicio;
import Servicio.LavadoraServicio;
import Servicio.TelevisorServicio;

/**
 *
 * @author cris-
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LavadoraServicio lavaServ=new LavadoraServicio();
        Electrodomestico lavadoraUno=lavaServ.crearLavadora('a', "gris");
        lavaServ.precioFinal(lavadoraUno);
        System.out.println("LavadoraPrecio: $ "+lavadoraUno.getPrecio());
        System.out.println("Color lavadora= "+lavadoraUno.getColor());
        TelevisorServicio teleServ=new TelevisorServicio();
        Electrodomestico televisorUno=teleServ.crearTelevisor('a', "blanco");
        teleServ.precioFinal(televisorUno);
        System.out.println("Televisor precio : $"+televisorUno.getPrecio());
        System.out.println("Color televisor= "+televisorUno.getColor());
        
    }
    
}
