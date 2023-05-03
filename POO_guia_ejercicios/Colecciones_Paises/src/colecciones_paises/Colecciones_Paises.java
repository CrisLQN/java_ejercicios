/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_paises;

import Servicio.PaisServicio;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author cris-
 */
public class Colecciones_Paises {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        PaisServicio paisServ=new PaisServicio();
        HashSet<String> paises=paisServ.crear();
        ArrayList<String> paisesLista=paisServ.ordenar(paises);
        paisServ.eliminar(paisesLista);
    }
    
}
