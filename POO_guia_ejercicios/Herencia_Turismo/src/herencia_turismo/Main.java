/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_turismo;

import Entidad.Alojamiento;
import Entidad.Camping;
import Entidad.Hotel;
import Entidad.HotelCincoExtrellas;
import Entidad.HotelCuartoExtrellas;
import Entidad.Residencia;
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
        //TODO las funciones de los hoteles 4* y 5* y todo respecto a extrahoteleros  ya estan verificadas 
        //solo faltaria la el modulo de clasificacion de hoteles por precios y el modulo de mostrar todos los alojamientos

     
        ArrayList <Alojamiento> alojamientos=new ArrayList();
        alojamientos.add(new Camping (1,1,true,true,200,"San lorenzo","las molles 457","Salta","jose"));
        alojamientos.add(new Residencia (1,true,true,true,200,"Grand Zone","Avenida Azul 678","Jujuy","Juan"));
        
        
          /**
           * PARA SABER SI UNA RESIDENCIA TIENE DESCUENTOS PARA GREMIOS
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Residencia) {
                Residencia residencia = (Residencia) alojamiento;
                if (residencia.isDescuentoGremio()) {
                    System.out.println(residencia.getNombre()+" posee descuentos para gremios");
                }
            }
            
        }
         */
        
        /**
         * PARA SABER SI UN CAMPING TIENE RESTAURANTE
        for (Alojamiento alojamiento : alojamientos) {
            if (alojamiento instanceof Camping) {
                Camping camp=(Camping)alojamiento;
                if (camp.isRestaurante()) {
                    System.out.println(alojamiento.getNombre()+" posee restaurante");
                }
            }
        }
        */
    }

}
