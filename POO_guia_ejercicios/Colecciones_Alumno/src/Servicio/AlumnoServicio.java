/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author cris-
 */
public class AlumnoServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    String eleccion;

    public ArrayList crearAlumno() {
        ArrayList<Alumno> alumnos = new ArrayList();
        do {
            Alumno alumno = new Alumno();
            System.out.println("Ingrese nombre");
            alumno.setNombre(leer.nextLine());
            ArrayList<Integer> notas = new ArrayList();
            for (int i = 0; i < 3; i++) {
                System.out.println("Ingrese la nota numero " + (i + 1));
                notas.add(leer.nextInt());
            }
            alumno.setNotas(notas);
            alumnos.add(alumno);
            System.out.println("Desea ingresar otro alumno (S/N)");
            leer.nextLine();
            eleccion = leer.nextLine();
        } while (eleccion.equalsIgnoreCase("S"));

        return alumnos;
    }

    public int notaFinal(ArrayList<Alumno> alumnos) {
        int notaFinal = 0;
        System.out.println("Ingrese nombre del alumno a buscar");
        String nombre = leer.nextLine();
        for (Alumno alumno : alumnos) {
            if (alumno.getNombre().equalsIgnoreCase(nombre)) {
                for (Integer nota : alumno.getNotas()) {
                    notaFinal += nota;
                }
                notaFinal = notaFinal / 3;
                return notaFinal;
            }

        }
        System.out.println("No se encontró el alumno");

        return 0;
    }
}
