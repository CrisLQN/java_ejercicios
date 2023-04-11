/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_messecreto;

import Entidad.Meses;
import Servicio.MesesServicio;

/**
 *
 * @author cris-
 */
public class POO_mesSecreto {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        MesesServicio mesServ=new MesesServicio();
        Meses mesUno=new Meses();
        mesServ.adivinarMes(mesUno);
    }
    
}
