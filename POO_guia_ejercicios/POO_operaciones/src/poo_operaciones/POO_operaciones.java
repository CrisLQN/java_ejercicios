package poo_operaciones;

import entidad.Operacion;
import servicio.OperacionServicio;

public class POO_operaciones {

    public static void main(String[] args) {
        OperacionServicio OP = new OperacionServicio();
        Operacion operandoUno = OP.crearOperacion();
        System.out.println("La suma es = "+OP.sumar(operandoUno) );
        System.out.println("La resta es = " + OP.restar(operandoUno));
        System.out.println("resultado multiplicacion= " + OP.multiplicar(operandoUno));
        System.out.println("resultado division= " + OP.dividir(operandoUno));
    }

}
