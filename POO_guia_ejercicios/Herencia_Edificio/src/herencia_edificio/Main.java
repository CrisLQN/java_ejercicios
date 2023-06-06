/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_edificio;

import Entidad.Edificio;
import Entidad.EdificioDeOficinas;
import Entidad.Polideportivo;
import java.util.ArrayList;

/**
 *
 * @author cris-
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //TODO las funciones y las relaciones ya estan comprobadas solo faltaria la parte de ingreso de datos por usuario
        //Recuerde que en el ingreso de datos de oficina la cantidad de oficinas no debe ser inferior a cantidad de pisos ya que se asume que 1 piso debe tener minimo 1 oficina
        Edificio poliUno = new Polideportivo("martearena", "techado", 1, 1, 1);
        Edificio poliDos = new Polideportivo("hipodormo", "abierto", 1, 1, 1);
        Edificio ofiUno = new EdificioDeOficinas(20, 3, 5, 2, 2, 2);
        Edificio ofiDos = new EdificioDeOficinas(5, 2, 5, 3, 3, 3);
        ArrayList<Edificio> edificios = new ArrayList();
        edificios.add(poliUno);
        edificios.add(ofiUno);
        edificios.add(poliDos);
        edificios.add(ofiDos);
        for (Edificio edificio : edificios) {
            System.out.println("La superficie del edificio es " + edificio.calcularSuperficie(edificio));
            System.out.println("El volumen del edificio es " + edificio.calcularVolumen(edificio));
            if (edificio instanceof Polideportivo) {
                System.out.println("El edificio es un polideportivo");
                if (((Polideportivo) edificio).getTipoInstalacion().equalsIgnoreCase("techado")) {
                    System.out.println("El polideportivo es techado");
                } else {
                    System.out.println("El polideportivo es abierto");
                }
                System.out.println("---------------------------------------");
                continue;
            }
            if (edificio instanceof EdificioDeOficinas) {
                System.out.println("El edificio es de tipo oficinista");
                ((EdificioDeOficinas) edificio).cantPersonas(edificio);
                System.out.println("-----------------------------------");
            }
        }
    }

}
