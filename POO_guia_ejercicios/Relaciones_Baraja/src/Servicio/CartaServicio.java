/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Carta;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author cris-
 */
public class CartaServicio {

    public ArrayList<Carta> barajar(ArrayList<Carta> baraja) {
        System.out.println("Se procede a cambiar la posicion de las cartas aleatoriamente");
        baraja.sort(Carta.aleatorio);
        for (Carta carta : baraja) {
            System.out.println(carta.toString());
        }
        return baraja;

    }

    public Carta siguienteCarta(ArrayList<Carta> baraja) {
        if (baraja.size() > 0) {
            return baraja.get(0);
        } else {
            System.out.println("No hay cartas disponibles");
        }
        return null;
    }

    public int cartasDisponibles(ArrayList<Carta> baraja) {
        return baraja.size();
    }

    public ArrayList<Carta> darCartas(int retiro, ArrayList<Carta> baraja) {

        if (retiro >= baraja.size()) {
            ArrayList<Carta> salida = new ArrayList();
            for (int i = 0; i < retiro; i++) {
                salida.add(baraja.get(i));

            }
            for (int i = 0; i < retiro; i++) {
                baraja.remove(i);
            }
            return salida;
        } else {
            System.out.println("La cantidad de cartas a retirar es mayor que la cantidad disponible en la baraja");
            return null;
        }
    }
    
    public void cartasMonton(ArrayList<Carta> salida){
        if (salida.size()>0) {
            for (Carta carta:salida){
                System.out.println(carta.toString());
            }
        }
    
    }
    
    public void mostrarBaraja(ArrayList<Carta> baraja){
    for (Carta carta:baraja){
        System.out.println(carta.toString());
   
    }
    
    }

}
