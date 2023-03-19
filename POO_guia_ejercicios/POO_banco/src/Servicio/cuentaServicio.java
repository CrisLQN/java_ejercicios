package Servicio;

import Entidad.cuentaEntidad;
import java.util.Scanner;

public class cuentaServicio {

    Scanner leer = new Scanner(System.in);
    cuentaEntidad cuenta = new cuentaEntidad();

    public cuentaEntidad crearCuenta() {
        System.out.println("Ingrese numero de cuenta");
        cuenta.setNumeroCuenta(leer.nextInt());
        System.out.println("Ingrese DNI");
        cuenta.setDNI(leer.nextLong());
        System.out.println("Inserte Saldo actual de la cuenta " + cuenta.getNumeroCuenta());
        cuenta.setSaldoActual(leer.nextInt());
        return cuenta;
    }

    public cuentaEntidad ingresarSaldo() {
        System.out.println("Ingrese cantidad al ingresar");
        cuenta.setSaldoActual(cuenta.getSaldoActual() + leer.nextInt());
        System.out.println("Saldo Actualizado");
        return cuenta;
    }

    public cuentaEntidad retirar() {
        System.out.println("ingrese cantidad al retirar");
        int retirar = leer.nextInt();
        if (retirar > cuenta.getSaldoActual()) {
            System.out.println("La cantidad a retirar es mayor que el saldo disponible, se procederá a extraer todo el saldo");
            cuenta.setSaldoActual(0);
        } else {
            cuenta.setSaldoActual(cuenta.getSaldoActual() - retirar);
        }

        return cuenta;
    }

    public cuentaEntidad retiroRapido() {
        System.out.println("RETIRO RAPIDO= Puede retirar HASTA el 20% de su saldo actual, ingrese cantidad a retirar");
        int retirar = leer.nextInt();
        while (retirar > cuenta.getSaldoActual() * 0.2) {
            System.out.println("Ha ingresado una cantidad mayor a 20% de su saldo disponible, por favor ingrese una cantidad menor");
            retirar = leer.nextInt();
        }
        cuenta.setSaldoActual(cuenta.getSaldoActual() - retirar);
        return cuenta;
    }

    public void consultarSaldo() {
        System.out.println("El saldo de la cuenta" + cuenta.getNumeroCuenta() + " es de $" + cuenta.getSaldoActual());
    }

    public void consultarDatos() {
        System.out.println("---------DATOS DE LA CUENTA-------- -\n"
                + "Numero de cuenta= " + cuenta.getNumeroCuenta() + "\n"
                + "DNI= " + cuenta.getDNI() + "\n"
                + "Saldo Actual= $" + cuenta.getSaldoActual() + "\n"
        );
    }

}
