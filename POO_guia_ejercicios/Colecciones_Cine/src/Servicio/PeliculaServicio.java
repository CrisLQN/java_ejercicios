/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author cris-
 */
public class PeliculaServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public ArrayList crear() {
        ArrayList<Pelicula> peliculas = new ArrayList();
        String desicion;
        do {
            System.out.println("Creando registro de pelicula nueva");
            Pelicula pelicula = new Pelicula();
            System.out.println("Ingrese titulo");
            pelicula.setTitulo(leer.nextLine());
            System.out.println("Ingrese director");
            pelicula.setDirector(leer.nextLine());
            System.out.println("Ingrese duracion en horas");
            pelicula.setHoras(leer.nextDouble());
            leer.nextLine();
            peliculas.add(pelicula);
            System.out.println("La pelicula ha ingresado correctamente al registro general");
            System.out.println("Desea ingresar otra pelicula? S/N");
            desicion = leer.nextLine();

        } while (desicion.equalsIgnoreCase("S"));
        return peliculas;
    }

    public void mostrarTodas(ArrayList<Pelicula> peliculas) {
        System.out.println("Se procedera al mostrar rodas las peliculas ");
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }

    public void mostrarMayorHora(ArrayList<Pelicula> peliculas) {
        System.out.println("Se procedera al mostrar todas las peliculas mayor al hora");
        for (Pelicula pelicula : peliculas) {
            if (pelicula.getHoras() > 1) {
                System.out.println(pelicula.toString());
            }
        }
    }

    public void mostrarAscendente(ArrayList<Pelicula> peliculas) {
        System.out.println("Se proceder al mostrar todas las peliculas por orden ascendente");

        peliculas.sort(Pelicula.compararDuracionAscendente);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }

    public void mostrarDescendente(ArrayList<Pelicula> peliculas) {
        System.out.println("Se proceder al mostrar todas las peliculas por orden descendente");
        peliculas.sort(Pelicula.compararDuracionDescendente);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }

    public void mostrarAlfabeticamenteTitulo(ArrayList<Pelicula> peliculas) {
        System.out.println("Se proceder al mostrar todas las peliculas por orden alfabetico del TITULO");
        peliculas.sort(Pelicula.compararTitulo);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }

    public void mostrarAlfabeticamenteDirector(ArrayList<Pelicula> peliculas) {
        System.out.println("Se proceder al mostrar todas las peliculas por orden alfabetico del DIRECTOR");
        peliculas.sort(Pelicula.compararDirector);
        for (Pelicula pelicula : peliculas) {
            System.out.println(pelicula.toString());
        }
    }

}
