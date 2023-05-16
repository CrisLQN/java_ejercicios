/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_baraja;

import Entidad.Carta;
import Servicio.CartaServicio;
import java.util.ArrayList;

/**
 *
 * @author cris-
 */
public class Relaciones_Baraja {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int palo = 0;
        ArrayList<Carta> baraja = new ArrayList();
        do {
            for (int i = 0; i < 12; i++) {
                if (i == 7 || i == 8) {
                    continue;
                }
                Carta carta = new Carta(i + 1);
                switch (palo) {
                    case 0:
                        carta.setPalo("espadas");
                        baraja.add(carta);
                        break;
                    case 1:
                        carta.setPalo("bastos");
                        baraja.add(carta);
                        break;
                    case 2:
                        carta.setPalo("oros");
                        baraja.add(carta);
                        break;
                    case 3:
                        carta.setPalo("copas");
                        baraja.add(carta);
                        break;
                }
            }
            palo++;

        } while (palo < 4);

        System.out.println("TAMAÑO " + baraja.size());
        CartaServicio barajaServ = new CartaServicio();

        //barajaServ.mostrarBaraja(baraja);
        barajaServ.barajar(baraja);
        barajaServ.mostrarBaraja(baraja);
        ArrayList<Carta> salida = barajaServ.darCartas(39, baraja);
        if (salida.isEmpty()) {
            System.out.println("No ha salido ninguna carta");
        } else {
            System.out.println("Se procede a mostrar las cartas que ha salido");
            //barajaServ.cartasMonton(salida);
        }
        if (baraja.isEmpty()) {
            System.out.println("No hay cartas en la baraja");
        } else {
            System.out.println("Se procede a mostrar la baraja actual");
            barajaServ.mostrarBaraja(baraja);
        }

    }

}
