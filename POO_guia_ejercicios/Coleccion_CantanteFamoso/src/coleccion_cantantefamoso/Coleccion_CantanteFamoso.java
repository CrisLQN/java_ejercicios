/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package coleccion_cantantefamoso;

import Entidad.CantanteFamoso;
import Servicio.CantanteFamosoServicio;
import java.util.ArrayList;

/**
 *
 * @author cris-
 */
public class Coleccion_CantanteFamoso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<CantanteFamoso> lista = new ArrayList();
        CantanteFamosoServicio cantanteServ=new CantanteFamosoServicio();
        CantanteFamoso cantanteUno = new CantanteFamoso("josejose", "diamond");
        CantanteFamoso cantanteDos = new CantanteFamoso("michael", "cat");
        CantanteFamoso cantanteTres = new CantanteFamoso("vader", "darkside");
        CantanteFamoso cantanteCuatro = new CantanteFamoso("Zero", "Plate");
        CantanteFamoso cantanteCinco = new CantanteFamoso("Britnney", "Stars");
        lista.add(cantanteUno);
        lista.add(cantanteDos);
        lista.add(cantanteTres);
        lista.add(cantanteCuatro);
        lista.add(cantanteCinco);
        lista=cantanteServ.borrarCatante(lista);
        System.out.println("Se procedera al mostrar la lista de los cantantes famosos y sus discos mas vendidos");
        for (CantanteFamoso cantante : lista) {
            System.out.println("Cantante= " + cantante.getNombre());
            System.out.println("Disco mas vendido= " + cantante.getDiscoConMasVentas());
            System.out.println("----------------------------------------");
        }
        
    }
}
