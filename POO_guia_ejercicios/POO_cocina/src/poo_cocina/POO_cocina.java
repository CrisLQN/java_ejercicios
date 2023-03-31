/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo_cocina;

import Entidad.Receta;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author cris-
 */
public class POO_cocina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        
        Receta recetaUno=new Receta();
        recetaUno.agregarReceta(recetaUno);
        System.out.println(recetaUno.getNombre());
        System.out.println(Arrays.toString(recetaUno.getIngredientes()));
    }

}
