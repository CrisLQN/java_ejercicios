/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Cuenta;
import java.util.Scanner;

/**
 *
 * @author cris-
 */
public class CuentaServicio {

    Scanner leer = new Scanner(System.in);
    Cuenta cuenta = new Cuenta();

    public Cuenta retirar_dinero(Cuenta cuenta) {
        System.out.println("Ingrese cantidad de saldo a retirar");
        double retirar = leer.nextDouble();
        while (retirar > cuenta.getSaldo()) {
            System.out.println("La cantidad de saldo es mayor al saldo disponible, por favor ingrese una cantidad igual o menor al saldo disponible");
            retirar = leer.nextDouble();
        }
        cuenta.setSaldo(cuenta.getSaldo()-retirar);

        return cuenta;
    }
}
