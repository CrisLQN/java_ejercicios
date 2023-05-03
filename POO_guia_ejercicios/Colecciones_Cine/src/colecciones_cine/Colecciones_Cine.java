/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_cine;

import Entidad.Pelicula;
import Servicio.PeliculaServicio;
import java.util.ArrayList;

/**
 *
 * @author cris-
 */
public class Colecciones_Cine {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PeliculaServicio cineServ=new PeliculaServicio();
        ArrayList<Pelicula> peliculas=cineServ.crear();
        cineServ.mostrarAlfabeticamenteDirector(peliculas);
    }
    
}
