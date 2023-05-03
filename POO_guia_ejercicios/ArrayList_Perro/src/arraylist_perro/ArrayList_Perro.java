/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist_perro;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

/**
 *
 * @author cris-
 */
public class ArrayList_Perro {

    Scanner leer = new Scanner(System.in);

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String desicion;
        Scanner leer = new Scanner(System.in);
        ArrayList<String> perros = new ArrayList();
        do {
            System.out.println("Ingrese raza de nuevo perro");
            perros.add(leer.nextLine().toLowerCase());
            System.out.println("Raza agregada");
            System.out.println("Desea agregar un perro? Y/N ");
            desicion = leer.nextLine();
        } while (desicion.equalsIgnoreCase("Y"));
        System.out.println("Se mostrara la lista de razas");
        for (String perro : perros) {

            System.out.println(perro);
        }
        Iterator iteraccion = perros.iterator();
        System.out.println("Ingrese raza de perro al eliminar");
        String eliminar = leer.nextLine().toLowerCase();
        while (iteraccion.hasNext()) {
            if (iteraccion.next().equals(eliminar)) {
                iteraccion.remove();
                System.out.println("Raza encontrada y eliminada");
            }
           
        }
        perros.sort(comparar);
        System.out.println("Se mostrará la lista ordenada");
        for (String perro:perros){
            System.out.println(perro);
        }
    }

    public static Comparator<String> comparar = new Comparator<String>() {
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

}
