package Servicio;

import Entidad.Empleado;

/**
 *
 * @author cris-
 */
public class EmpleadoServicio {

    Empleado empleado = new Empleado();

    public Empleado calcular_aumento(Empleado empleado) {
        if (empleado.getEdad() > 30) {
            System.out.println("Mayor de 30 años: Aumento de 10%");
            empleado.setSalario(empleado.getSalario() * 1.10);
        } else {
            System.out.println("Menor de 30 años: Aumento de 5%");
            empleado.setSalario(empleado.getSalario() * 1.05);
        }
        return empleado;
    }
}
