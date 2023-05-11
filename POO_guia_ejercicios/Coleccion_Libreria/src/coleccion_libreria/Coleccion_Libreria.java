/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion_libreria;

import Entidad.Libro;
import Servicio.LibroServicio;
import java.util.HashSet;

/**
 *
 * @author cris-
 */
public class Coleccion_Libreria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        LibroServicio libreriaServ=new LibroServicio();
        HashSet<Libro> libreria = new HashSet();
        Libro libroUno = new Libro("darkstories", "jose", 10, 10);
        Libro libroDos = new Libro("World of joints", "eric", 6, 6);
        Libro libroTres = new Libro("Correct Things", "chris", 10, 0);
        libreria.add(libroUno);
        
        libreria.add(libroDos);
        libreria.add(libroTres);
        if (libreriaServ.prestamo(libreria)) {
            System.out.println("Operacion exitosa");
        }else System.out.println("Operacion fallida, No se encontró el libro o no hay ejemplares disponibles para prestar ");
        if (libreriaServ.devolucion(libreria)) {
            System.out.println("Operacion exitosa");
        }else System.out.println("Operacion fallida. No SE Enccontro el libro o no hay ejemplares prestados de la misma");
        
        
        
        //boolean check = true;
        //TODO escribir el bucle de creacion de libros
        // do {
        // } while (check);
    }

}
