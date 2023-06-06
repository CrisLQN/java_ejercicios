/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author cris-
 */
public class EdificioDeOficinas extends AbstractEdificio {

    private int numeroOficinas;
    private int personasPorOficina;
    private int pisos;

    public EdificioDeOficinas(int numeroOficinas, int personasPorOficina, int pisos, double largo, double ancho, double alto) {
        super(largo, ancho, alto);
        this.numeroOficinas = numeroOficinas;
        this.personasPorOficina = personasPorOficina;
        this.pisos = pisos;
    }

    public void setNumeroOficinas(int numeroOficinas) {
        this.numeroOficinas = numeroOficinas;
    }

    public void setPersonasPorOficina(int personasPorOficina) {
        this.personasPorOficina = personasPorOficina;
    }

    public void setPisos(int pisos) {
        this.pisos = pisos;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public int getNumeroOficinas() {
        return numeroOficinas;
    }

    public int getPersonasPorOficina() {
        return personasPorOficina;
    }

    public int getPisos() {
        return pisos;
    }

    @Override
    public double getLargo() {
        return largo;
    }

    @Override
    public double getAncho() {
        return ancho;
    }

    @Override
    public double getAlto() {
        return alto;
    }

    @Override
    public double calcularSuperficie(Edificio edificio) {
        AbstractEdificio e = (AbstractEdificio) edificio;

        return e.getLargo() * e.getAncho();
    }

    @Override
    public double calcularVolumen(Edificio edificio) {
        AbstractEdificio e = (AbstractEdificio) edificio;
        return calcularSuperficie(edificio) * e.getAlto();
    }

    Scanner leer = new Scanner(System.in);

    public void cantPersonas(Edificio edificio) {
        EdificioDeOficinas edOficinas = (EdificioDeOficinas) edificio;
        int piso;
        do {
            System.out.println("escoja el piso del edificio, recuerde que no debe ser superior al total del pisos del edificio");
            piso = leer.nextInt();
        } while (piso > edOficinas.getPisos());
        int cantOficinas;
        do {
            System.out.println("Cuantas oficinas hay en el piso");
            cantOficinas = leer.nextInt();
        } while (cantOficinas > (edOficinas.getNumeroOficinas() / edOficinas.getPisos()));
        System.out.println("La cantidad de personas que pueden trabjar en el piso " + piso + " es de " + cantOficinas * edOficinas.getPersonasPorOficina());
        System.out.println("La cantidad TOTAL de personas que pueden trabajar en el edificio de oficinas es de " + edOficinas.getPersonasPorOficina() * edOficinas.getNumeroOficinas());

    }

}
