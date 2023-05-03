/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Estudiante;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author cris-
 */
public class EstudianteServicio {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Estudiante[] crearEscuela() {
        Estudiante estudiantesVector[] = new Estudiante[8];
        String estudiantes[] = new String[8];
        int notaVector[] = new int[8];
        for (int i = 0; i < 8; i++) {
            System.out.println("Ingrese nombre del estudiante " + (i + 1));
            estudiantes[i] = leer.nextLine();
            System.out.println("Ingrese nota del estudiante " + estudiantes[i]);
            notaVector[i] = leer.nextInt();
            leer.nextLine();
        }
        for (int i = 0; i < 8; i++) {
            estudiantesVector[i].setNombre(estudiantes[i]);
            estudiantesVector[i].setNota(notaVector[i]);
        }

        return estudiantesVector;
    }

    public int sacarPromedio(Estudiante[] estudiantesVector) {
        int promedio = 0;
        for (int i = 0; i < 8; i++) {
            promedio += estudiantesVector[i].getNota();
        }
        return promedio;
    }

}
