/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author cris-
 */
public class AhorcadoServicio {

    Scanner leer = new Scanner(System.in);

    public Ahorcado crearJuego(Ahorcado partida ) {
        System.out.println("Ingrese la palabra");
        String palabra=leer.nextLine();
        String [] palabraVector=new String[palabra.length()];
        for (int i = 0; i < palabra.length(); i++) {
            palabraVector[i]=palabra.substring(i, i+1);
        }
        partida.setPalabra(palabraVector);
        System.out.println("Ingrese cantidad de jugadas maxima");
        partida.setJugadasMaximas(leer.nextInt());
        partida.setLetrasEncontradas(0);
        return partida;
    }
    
    public void longitud(Ahorcado partida){
        System.out.println("La longitud de la palabra es "+partida.getPalabra().length+" letras");
    }
    
    public void intentos(Ahorcado partida){
        System.out.println("Numero de oportunidades restantes: "+partida.getJugadasMaximas());
    }
}
