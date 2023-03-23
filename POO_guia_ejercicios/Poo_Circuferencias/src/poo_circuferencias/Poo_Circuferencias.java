package poo_circuferencias;

import Entidades.circuferenciaEntidades;
import Servicios.circuferenciaServicios;

public class Poo_Circuferencias {

    public static void main(String[] args) {

        circuferenciaServicios circuferenciaServ = new circuferenciaServicios();
        circuferenciaEntidades circuferencia = circuferenciaServ.crearCircuferencia();
        System.out.println("La area es " + circuferenciaServ.area(circuferencia));
        System.out.println("El perimetro es "+circuferenciaServ.perimetro(circuferencia));
    }

}
