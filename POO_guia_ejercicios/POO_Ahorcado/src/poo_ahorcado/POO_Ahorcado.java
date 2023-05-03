/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_ahorcado;

import Entidad.Ahorcado;
import Servicio.AhorcadoServicio;
import java.util.Scanner;

/**
 *
 * @author cris-
 */
public class POO_Ahorcado {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        AhorcadoServicio AhorcadoServ = new AhorcadoServicio();
        Ahorcado juegoUno = AhorcadoServ.crearJuego();
        System.out.println("Elija letra");
        do {
            String letra = leer.nextLine();
            AhorcadoServ.longitud(juegoUno);
            AhorcadoServ.encontradas(juegoUno, letra);
            AhorcadoServ.intentos(juegoUno);
        } while (juegoUno.getJugadasMaximas() > 0 && juegoUno.getLetrasEncontradas() < juegoUno.getPalabra().length);
        if (juegoUno.getLetrasEncontradas() == juegoUno.getPalabra().length) {
            System.out.println("Feliciades, haz adivinado la palabra");
        } else {
            System.out.println("Lo sentimos, no hay más oportunidades");
        }

    }

}
