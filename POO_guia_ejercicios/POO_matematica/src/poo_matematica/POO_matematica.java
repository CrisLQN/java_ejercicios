package poo_matematica;

import Entidad.Matematica;
import Servicio.MatematicaServicio;

public class POO_matematica {

    public static void main(String[] args) {
        Matematica conjuntoUno = new Matematica();
        MatematicaServicio conjuntoServicio = new MatematicaServicio();
        conjuntoUno.setNumeroRealUno(Math.random()*10);
        conjuntoUno.setNumeroRealDos(Math.random()*10);
        System.out.println("Numero uno = " + conjuntoUno.getNumeroRealUno() + " || Numero dos = " + conjuntoUno.getNumeroRealDos());
        System.out.println("El numero mayor es "+conjuntoServicio.devolverMayor(conjuntoUno));
        System.out.println("El numero mayor elevado al numero menor es "+conjuntoServicio.calcularPotencia(conjuntoUno));
        System.out.println("La raiz del numero menor es "+conjuntoServicio.calcularRaiz(conjuntoUno));
    }

}
