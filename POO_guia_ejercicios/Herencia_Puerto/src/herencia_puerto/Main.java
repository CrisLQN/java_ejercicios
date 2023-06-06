/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_puerto;

import Entidad.Alquiler;
import Entidad.Barco;
import Entidad.BarcoMotor;
import Entidad.Velero;
import Entidad.Yate;
import Servicio.ServicioBarco;
import Servicio.ServicioBarcoMotor;
import Servicio.ServicioVelero;
import Servicio.ServicioYate;
import java.util.Date;

/**
 *
 * @author cris-
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //TODO las funciones y las relaciones ya estan listas y testeadas solo faltaria el menu para que el usuario escoja el tipo de barco
        // Barco barco = new Velero(10,123, 1, 2014);
        // Barco barco = new BarcoMotor(1, 123, 1, 2014);
        Barco barco = new Yate(100, 5,123, 3, 2014);
        Date finalAlquiler = new Date();
        Date inicioAlquiler = new Date();
        inicioAlquiler.setDate(0);
        Alquiler alquiler = new Alquiler("jose", 123, inicioAlquiler, finalAlquiler, 1, barco);
        //ServicioBarco barcoServ = new ServicioBarco();
        //ServicioVelero veleroServ=new ServicioVelero();
        // ServicioBarcoMotor motorServ = new ServicioBarcoMotor();
         ServicioYate yateServ = new ServicioYate();
        System.out.println("la cantidad a pagar es $ " + yateServ.calcularAlquiler(alquiler));

    }

}
