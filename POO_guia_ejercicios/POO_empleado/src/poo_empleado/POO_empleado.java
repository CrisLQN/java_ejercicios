/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_empleado;

import Entidad.Empleado;
import Servicio.EmpleadoServicio;

/**
 *
 * @author cris-
 */
public class POO_empleado {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EmpleadoServicio empleadoServ = new EmpleadoServicio();
        Empleado empleadoUno = new Empleado("Juan", 25, 120.5);
        System.out.println("El viejo salario de "+empleadoUno.getNombre()+"es "+empleadoUno.getSalario());
        empleadoUno=empleadoServ.calcular_aumento(empleadoUno);
        System.out.println("El nuevo salario de "+empleadoUno.getNombre()+"es "+empleadoUno.getSalario());
    }

}
