package poo_banco;

import Entidad.cuentaEntidad;
import Servicio.cuentaServicio;
import java.util.Scanner;

public class POO_banco {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        cuentaEntidad cuentaUno = new cuentaEntidad();
        cuentaServicio bancoservicio = new cuentaServicio();
        cuentaUno = bancoservicio.crearCuenta();
        boolean bandera=false;
        do{
        System.out.println("---------------MENU------------------\n"
                + "Bienvenido Cuenta numero " + cuentaUno.getNumeroCuenta() + "\n"
                + "1. Ingresar Saldo\n"
                + "2. Retirar\n"
                + "3. Retirar en modo RETIRO RAPIDO\n"
                + "4. Consultar Saldo\n"
                + "5. Consultar Datos\n"
                + "6. Salir\n"
                + "Elija opción:/n"
                + "------------------------------");
        int opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                cuentaUno = bancoservicio.ingresarSaldo();
                break;
            case 2:
                cuentaUno = bancoservicio.retirar();
                break;
            case 3:
                cuentaUno = bancoservicio.retiroRapido();
                break;
            case 4:
                bancoservicio.consultarSaldo();
                break;
            case 5:
                bancoservicio.consultarDatos();
                break;
            case 6:
                bandera=true;
                System.out.println("Ha elegido salir de menu.");
                break;
            default:
                System.out.println("Opcion no valida, por favor ingrese un numero valido del menu");
        }
        }while(bandera==false);
    }
}
