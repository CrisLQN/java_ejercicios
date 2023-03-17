package poo_libros;

import Libreria.Libro;
import java.util.Scanner;

public class POO_Libros {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in).useDelimiter("\n");
        Libro PrimerLibro = new Libro();
        System.out.println("Inserte ISBN");
        PrimerLibro.setISBN(Leer.nextInt());
        System.out.println("Inserte Titulo");
        PrimerLibro.setTitulo(Leer.next());
        System.out.println("Inserte Autor");
        PrimerLibro.setAutor(Leer.next());
        System.out.println("Inserte Paginas");
        PrimerLibro.setPaginas(Leer.nextInt());
        System.out.println(PrimerLibro.toString());
    }

}
