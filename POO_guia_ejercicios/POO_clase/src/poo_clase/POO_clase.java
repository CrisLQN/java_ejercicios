package poo_clase;

import Entidad.Curso;
import Servicio.CursoServicio;

public class POO_clase {

    public static void main(String[] args) {
        Curso cursoUno = new Curso();
        CursoServicio cursoServ = new CursoServicio();
        cursoServ.crearCurso(cursoUno);
        System.out.println("la cantidad de ganancia semanal es "+cursoServ.calcularGananciaSemanal(cursoUno));
        System.out.println("turno = "+cursoUno.getTurno());
    }

}
