/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Carta;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/**
 *
 * @author cris-
 */
public class CartaServicio {

    public ArrayList<Carta> barajar(ArrayList<Carta> baraja) {
        System.out.println("Se procede a cambiar la posicion de las cartas aleatoriamente");
        Collections.shuffle(baraja);
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
        ArrayList<Carta> salida = new ArrayList();
        if (retiro <= baraja.size()) {
            System.out.println("Se procede a retirar " + retiro + " cartas");
            for (int i = 0; i < retiro; i++) {
                salida.add(baraja.get(i));
            }
            Iterator iteraccion = baraja.iterator();
            for (int i = 0; i < retiro; i++) {
                iteraccion.next();
                iteraccion.remove();
            }

        } else {
            System.out.println("La cantidad de cartas a retirar es mayor que la cantidad disponible en la baraja");
        }
        return salida;

    }

    public void cartasMonton(ArrayList<Carta> salida) {
        for (Carta carta : salida) {
            System.out.println(carta.toString());
        }

    }

    public void mostrarBaraja(ArrayList<Carta> baraja) {
        for (Carta carta : baraja) {
            System.out.println(carta.toString());

        }

    }

}
