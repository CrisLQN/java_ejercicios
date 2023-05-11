/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.HashMap;
import java.util.Scanner;

/**
 *
 * @author cris-
 */
public class AplicacionServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public HashMap<String, Double> crear() {
        HashMap<String, Double> lista = new HashMap();
        lista.put("papa", 2.5);
        lista.put("cebolla", 0.5);
        lista.put("Zanahoria", 2.5);
        lista.put("papa", 4.5);
        for (HashMap.Entry entry : lista.entrySet()) {

            System.out.println("Producto= " + entry.getKey());
            System.out.println("Precio= " + entry.getValue());

        }
        return lista;
    }

    public HashMap<String, Double> modificarPrecio(HashMap<String, Double> lista) {
        System.out.println("Ingrese producto al que desea modificar su precio ");
        String producto = leer.nextLine().toLowerCase();
        Boolean check = true;
        for (HashMap.Entry entry : lista.entrySet()) {
            if (entry.getKey().equals(producto)) {
                System.out.println("Producto encontrado");
                System.out.println("Ingrese nuevo precio");
                entry.setValue(leer.nextDouble());
                leer.nextLine();
                System.out.println("El nuevo precio del producto " + entry.getKey() + " es de " + entry.getValue());
                check = false;
            }

        }
        if (check) {
            System.out.println("No se ha encontrado el producto");
        }
        return lista;
    }

    public HashMap<String, Double> eliminarProducto(HashMap<String, Double> lista) {
        System.out.println("Ingrese producto al que desea eliminar");
        String eliminar = leer.nextLine().toLowerCase();
        Boolean check = true;
        for (HashMap.Entry entry : lista.entrySet()) {
            if (entry.getKey().equals(eliminar)) {
                check = false;
            }
        }
        if (check) {
            System.out.println("No se ha encontrado el producto");
        } else {
            lista.remove(eliminar);
        }
        return lista;
    }

    public void mostrarProductos(HashMap<String, Double> lista) {
        System.out.println("Se procederá al mostrar los productos");
        for (HashMap.Entry entry : lista.entrySet()) {

            System.out.println("Producto= " + entry.getKey());
            System.out.println("Precio= " + entry.getValue());

        }

    }

}
