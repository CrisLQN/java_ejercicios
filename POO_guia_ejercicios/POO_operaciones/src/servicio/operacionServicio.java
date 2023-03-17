package servicio;

import entidad.Operacion;
import java.util.Scanner;

public class operacionServicio {

    Operacion operar = new Operacion();
    Scanner leer = new Scanner(System.in);
    
    public Operacion crearOperacion() {
        System.out.println("Ingrese el primer numero");
        operar.setNumero1(leer.nextInt());
        operar.setNumero2(leer.nextInt());
        return operar;
    }

    public int  sumar() {
        int suma = operar.getNumero1() + operar.getNumero2();
        return suma;
    }

    public int restar() {
        int restar = operar.getNumero1() - operar.getNumero2();
        return restar;
    }

    public int multiplicar() {
        if (operar.getNumero1() == 0 || operar.getNumero2() == 0) {
            System.out.println("Uno de los numeros ingresados es 0, por lo tanto no se puede realizar la operacion.");
            return 0;
        } else {
            int multplicar = operar.getNumero1() * operar.getNumero2();
            return multplicar;
        }
    }

    public int dividir() {
        if (operar.getNumero1() == 0 || operar.getNumero2() == 0) {
            System.out.println("Uno de los numeros ingresados es 0, por lo tanto no se puede realizar la operacion.");
            return 0;
        } else {
            int dividir = operar.getNumero1() / operar.getNumero2();
            return dividir;
        }
    }

}
