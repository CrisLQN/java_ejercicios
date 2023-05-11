/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_adopcion;

import Entidad.Perro;
import Entidad.Persona;

/**
 *
 * @author cris-
 */
public class Relaciones_Adopcion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perro perroUno= new Perro("figurais","Rowlet",5,12);
        Perro perroDos= new Perro("Paulo","silveste",2,10);
        Persona personaUno=new Persona("Juan","Augusto",18,42345678,perroUno);
        Persona personaDos=new Persona("Jose","Jose",19,39584678,perroDos);
        System.out.println(personaUno.toString());
        System.out.println(personaDos.toString());
        
    }
    
}
