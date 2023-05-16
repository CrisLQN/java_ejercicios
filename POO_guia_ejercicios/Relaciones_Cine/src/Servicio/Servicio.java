/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Asiento;
import Entidad.Espectador;
import Entidad.Pelicula;
import java.util.ArrayList;

/**
 *
 * @author cris-
 */
public class Servicio {

    public Asiento[][] crearSala() {

        Asiento[][] sala = new Asiento[8][6];
        int asientosLibres = 48;
        String columna = "";
        for (int f = 7; f >= 0; f--) {
            for (int c = 0; c < 6; c++) {
                switch (c) {
                    case 0:
                        columna = "A";
                        break;
                    case 1:
                        columna = "B";
                        break;
                    case 2:
                        columna = "C";
                        break;
                    case 3:
                        columna = "D";
                        break;
                    case 4:
                        columna = "E";
                        break;
                    case 5:
                        columna = "F";
                        break;
                }
                Asiento asiento = new Asiento(f + 1, columna);
                sala[f][c] = asiento;
                System.out.println(sala[f][c].toString());
            }
        }
        ArrayList<Espectador> espectadores = new ArrayList();
        for (int i = 0; i < 2; i++) {
            Espectador espectador = new Espectador("Dummy", 18, 20.5);
            espectadores.add(espectador);
        }
        Espectador espectadorprueba = new Espectador("ronaldo", 10, 5);
        espectadores.add(espectadorprueba);

        Pelicula pelicula = new Pelicula("josejose", 120, 16, "juan esteban", 10);
        for (Espectador espectador : espectadores) {

            boolean check = true;
            while (check) {
                if (espectador.getEdad() < pelicula.getEdadMinima()) {
                    System.out.println(espectador.getNombre() + " No posee la edad suficiente para ver la pelicula");
                    break;

                }
                if (espectador.getDinero() < pelicula.getPrecioEntrada()) {
                    System.out.println(espectador.getNombre() + " no posee el dinero suficiente para pagar el precio de entrada");
                    break;
                }

                int filaRandom = (int) Math.round(Math.random() * 7);
                int columnaRandom = (int) Math.round(Math.random() * 5);
                if (!sala[filaRandom][columnaRandom].isOcupado()) {
                    System.out.println("El asiento " + sala[filaRandom][columnaRandom].getFila() + sala[filaRandom][columnaRandom].getColumna() + " esta libre");
                    sala[filaRandom][columnaRandom].setOcupado(true);
                    System.out.println("El asiento fue ocupado por " + espectador.getNombre());
                    check = false;
                    asientosLibres -= 1;
                } else {
                    System.out.println("El asiento " + sala[filaRandom][columnaRandom].getFila() + sala[filaRandom][columnaRandom].getColumna() + " esta ocupado");

                    System.out.println(asientosLibres);
                    if (asientosLibres == 0) {
                        System.out.println("Ya no hay asientos disponibles");
                        check = false;
                    }

                }
            }
        }
        return sala;
    }
}
