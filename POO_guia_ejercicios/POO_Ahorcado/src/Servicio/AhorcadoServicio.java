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

    public Ahorcado crearJuego() {
        Ahorcado partida=new Ahorcado();
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
    
    public boolean buscarLetra (Ahorcado partida, String letra){
        for (String palabra : partida.getPalabra()) {
            if (letra.equals(palabra)) {
                System.out.println("La letra pertenece a la palabra");
                return true;
            }
        }
        System.out.println("La letra no pertenece a la palabra");
        return false;
    }
    
    public boolean encontradas(Ahorcado partida, String letra){
        if (buscarLetra(partida,letra)) {
            partida.setLetrasEncontradas(partida.getLetrasEncontradas()+1);
            System.out.println("Número de letras (encontradas, faltantes): ("+partida.getLetrasEncontradas()+") ("+(partida.getPalabra().length-partida.getLetrasEncontradas())+")");
            return true;
        }else {
        System.out.println("Número de letras (encontradas, faltantes): ("+partida.getLetrasEncontradas()+") ("+(partida.getPalabra().length-partida.getLetrasEncontradas()));
        partida.setJugadasMaximas(partida.getJugadasMaximas()-1);
        return false;
        }

    }
}
