/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author cris-
 */
public class PaisServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public HashSet<String> crear() {
        HashSet<String> paises = new HashSet();
        paises.add("Venezuela");
        paises.add("Zelanda");
        paises.add("Francia");
        paises.add("Argentina");
        paises.add("Francia");
        for (String pais : paises) {
            System.out.println(pais.toString());
        }
        return paises;

    }

    public static Comparator<String> compararAlfabeto = new Comparator<String>() {
        @Override
        public int compare(String p1, String p2) {
            char char1 = p1.charAt(0);
            char char2 = p2.charAt(0);
            if (char1 > char2) {
                return 1;
            }
            if (char1 < char2) {
                return -1;
            }
            return 0;
        }
    };

    public ArrayList<String> ordenar(HashSet<String> paises) {
        System.out.println("Ordenando los paises alfabeticamente");
        ArrayList<String> paisesLista = new ArrayList(paises);
        paisesLista.sort(compararAlfabeto);
        for (String pais : paisesLista) {
            System.out.println(pais.toString());
        }
        return paisesLista;
    }

    public ArrayList<String> eliminar(ArrayList<String> paisesLista) {
        System.out.println("Ingrese pais al eliminar");
        String eliminar = leer.nextLine();
        eliminar=eliminar.replaceFirst(eliminar.substring(0, 1), eliminar.substring(0, 1).toUpperCase());
        
        Iterator iteraccion = paisesLista.iterator();
        System.out.println("Paises= ");
        boolean check = true;
        while (iteraccion.hasNext()) {
            if (iteraccion.next().equals(eliminar)) {
                System.out.println("Pais encontrado y eliminado");
                iteraccion.remove();
                check = false;
            }
            
        }
        if (check)  System.out.println("Pais no encontrado");
        for (String pais:paisesLista){
            System.out.println(pais);
        }
        return paisesLista;
    }
}
