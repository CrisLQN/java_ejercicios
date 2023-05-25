/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package relaciones_votacion;

import Entidad.Alumno;
import Servicio.Simulador;
import java.util.ArrayList;
import java.util.HashSet;

/**
 *
 * @author cris-
 */
public class Relaciones_Votacion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String []nombres ={"Adolfo","Misael","Galo","Taha","Danilo","Jeremias","Giorgio","Gaston","Leonidas","Luciano"};
        String []apellidos={"Romero","Flores","García","Perez","Garcia","Lopez","Sanchez","Silva","Diaz","Gonzales"};
        Simulador simulador=new Simulador();
        ArrayList<Alumno> alumnos=simulador.generarListaNombreAlumno(nombres, apellidos, 5);
        HashSet<Integer> dnis=simulador.generarListaDni(5);
        for (Integer num : dnis) {
            System.out.println(num+" ");
        }
        simulador.generarAlumnos(alumnos, dnis, 5);
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.getNombreCompleto());
            System.out.println(alumno.getDni());
            System.out.println("---------------");
        }
        
        
        
        
        
        /** ArrayList<Alumno> alumnos=simulador.generarLista(nombres, apellidos);
        *for (Alumno alumno : alumnos) {
        *    System.out.println(alumno.getNombreCompleto());
        }  */
    }
    
}
