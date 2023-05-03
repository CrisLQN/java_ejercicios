/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

import java.util.Comparator;

/**
 *
 * @author cris-
 */
public class Pelicula {

    private String titulo;
    private String director;
    private double horas;

    public Pelicula() {
    }

    public Pelicula(String titulo, String director, double horas) {
        this.titulo = titulo;
        this.director = director;
        this.horas = horas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public void setHoras(double horas) {
        this.horas = horas;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getDirector() {
        return director;
    }

    public double getHoras() {
        return horas;
    }

    public static Comparator<Pelicula> compararDuracionAscendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            double delta = p1.getHoras() - p2.getHoras();
            if (delta > 0.00001) {
                return 1;
            }
            if (delta < -0.00001) {
                return -1;
            }
            return 0;
        }
    };

    public static Comparator<Pelicula> compararDuracionDescendente = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            double delta = p1.getHoras() - p2.getHoras();
            if (delta < 0.00001) {
                return 1;
            }
            if (delta > -0.00001) {
                return -1;
            }
            return 0;
        }
    };

    
    public static Comparator<Pelicula> compararTitulo = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            char char1=p1.getTitulo().charAt(0);
            char char2=p2.getTitulo().charAt(0);
            if (char1>char2) {
                return 1;
            }
            if (char1<char2) {
                return -1;
            }
            return 0;
        }
    };
    
        public static Comparator<Pelicula> compararDirector = new Comparator<Pelicula>() {
        @Override
        public int compare(Pelicula p1, Pelicula p2) {
            char char1=p1.getDirector().charAt(0);
            char char2=p2.getDirector().charAt(0);
            if (char1>char2) {
                return 1;
            }
            if (char1<char2) {
                return -1;
            }
            return 0;
        }
    };
    
    
    
    
    @Override
    public String toString() {
        return "Pelicula {" + "titulo= " + titulo + ", director= " + director + ", horas= " + horas + '}';
    }

}
