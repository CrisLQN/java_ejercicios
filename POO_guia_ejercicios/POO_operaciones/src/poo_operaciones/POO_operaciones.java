package poo_operaciones;

import entidad.Operacion;
import servicio.operacionServicio;

public class POO_operaciones {

    public static void main(String[] args) {
        Operacion operandos = new Operacion();
        operacionServicio OP = new operacionServicio();
        operandos = OP.crearOperacion();
        int suma = OP.sumar();
        System.out.println("La suma es = " + suma);
        int resta = OP.restar();
        System.out.println("La resta es = " + resta);
        int multiplicacion = OP.multiplicar();
        System.out.println("resultado multiplicacion= " + multiplicacion);
        int division = OP.dividir();
        System.out.println("resultado division= " + division);
    }

}
