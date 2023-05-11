/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cris-
 */
public class CantanteFamosoServicio {

    Scanner leer = new Scanner(System.in);

    public ArrayList<CantanteFamoso> agregarCantante(ArrayList<CantanteFamoso> lista) {
        System.out.println("Ingrese cantante al agregar");
        CantanteFamoso cantante = new CantanteFamoso();
        cantante.setNombre(leer.nextLine());
        System.out.println("Ingrese disco mas vendido del cantante");
        cantante.setDiscoConMasVentas(leer.nextLine());
        lista.add(cantante);
        System.out.println("Cantante agregado a la lista");
        return lista;
    }

    public ArrayList<CantanteFamoso> borrarCatante(ArrayList<CantanteFamoso> lista) {
        System.out.println("Ingrese cantante al eliminar");
        String eliminar = leer.nextLine().toLowerCase();
        Boolean check = true;
        for (CantanteFamoso cantante : lista) {
            if (cantante.getNombre().equalsIgnoreCase(eliminar)) {
                lista.remove(cantante);
                System.out.println("Cantante encontrado y eliminado");
                check = false;
                break;
            }
        }
        if (check) {
            System.out.println("El cantante no fue encontrado");
        }

        return lista;
    }
}
