/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Libro;
import java.util.HashSet;
import java.util.Scanner;

/**
 *
 * @author cris-
 */
public class LibroServicio {

    Scanner leer = new Scanner(System.in);

    public boolean prestamo(HashSet<Libro> libreria) {
        System.out.println("Que titulo desea recibir un ejemplar como prestamo?");
        String pedido = leer.nextLine();
        for (Libro libro : libreria) {
            if (libro.getTitulo().equalsIgnoreCase(pedido) && libro.getEjemplaresPrestados() < libro.getEjemplares()) {
                System.out.println("Se ha encontrado un ejemplar de " + libro.getTitulo() + " y se procedio a prestar y actualizar el inventario");
                libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() + 1);
                System.out.println(libro.toString());
                return true;
            }
        }
        return false;
    }

    public boolean devolucion(HashSet<Libro> libreria) {
        System.out.println("Que titulo desea devolver un ejemplar?");
        String devolver = leer.nextLine();
        for (Libro libro : libreria) {
            if (libro.getTitulo().equalsIgnoreCase(devolver) && libro.getEjemplaresPrestados() > 0) {
                System.out.println("Se ha encontrado el inventario de " + libro.getTitulo() + " y se procedio a devolver y actualizar");
                libro.setEjemplaresPrestados(libro.getEjemplaresPrestados() - 1);
                System.out.println(libro.toString());
                return true;
            }
        }
        return false;
    }

}
