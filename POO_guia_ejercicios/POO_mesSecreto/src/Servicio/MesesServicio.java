/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Meses;
import java.util.Scanner;

/**
 *
 * @author cris-
 */
public class MesesServicio {

    Meses mes = new Meses();
    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public int crearMesSecreto() {
        int aleatorio = (int) Math.round(Math.random() * 11);
        return aleatorio;
    }

    public void adivinarMes(Meses mes) {
        System.out.println("Adivina el mes secreto");
        String adivinanza = leer.nextLine();
        String mesSecreto=mes.getMes(crearMesSecreto());
        while (!adivinanza.equals(mesSecreto)) {
            System.out.println("No ha acertado, introduzca otro mes");
            adivinanza = leer.nextLine();
        }
        System.out.println("HA ACERTADO");

    }

}
