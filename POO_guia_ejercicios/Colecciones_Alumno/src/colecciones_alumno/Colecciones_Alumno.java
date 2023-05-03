/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package colecciones_alumno;

import Entidad.Alumno;
import Servicio.AlumnoServicio;
import java.util.ArrayList;

/**
 *
 * @author cris-
 */
public class Colecciones_Alumno {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AlumnoServicio claseServ=new AlumnoServicio();
        ArrayList<Alumno> claseUno=claseServ.crearAlumno();
        int notaFinal=claseServ.notaFinal(claseUno);
        if (notaFinal!=0) {
            System.out.println("La nota final del alumno es "+notaFinal);
        }
    }
    
}
