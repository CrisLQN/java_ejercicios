/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_cuenta;

import Entidad.Cuenta;
import Servicio.CuentaServicio;

/**
 *
 * @author cris-
 */
public class POO_Cuenta {

    
    public static void main(String[] args) {
        CuentaServicio cuentaServ=new CuentaServicio();
        Cuenta cuentaUno=new Cuenta("jose",125);
        cuentaUno=cuentaServ.retirar_dinero(cuentaUno);
        System.out.println(cuentaUno.getTitular());
        System.out.println("Saldo disponible "+cuentaUno.getSaldo());
    }
    
}
