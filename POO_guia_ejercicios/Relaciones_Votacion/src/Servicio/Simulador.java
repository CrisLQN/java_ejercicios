/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/**
 *
 * @author cris-
 */
public class Simulador {

    public ArrayList<Alumno> generarListaNombreAlumno(String[] nombres, String[] apellidos, int cantidad) {
        ArrayList<Alumno> lista = new ArrayList();
        for (int i = 0; i < cantidad; i++) {
            Alumno alumno = new Alumno();
            alumno.setNombreCompleto(nombres[(int) (Math.random() * 9)].concat(" ".concat(apellidos[(int) (Math.random() * 9)])));
            lista.add(alumno);
        }
        return lista;
    }

    public HashSet<Integer> generarListaDni(int cantidad) {
        HashSet<Integer> dnis = new HashSet();
        int generados = 0;
        int min = 10000000;
        int max = 50000000;
        do {
            int random = (int) Math.floor(Math.random() * (max - min + 1) + min);
            System.out.println("Numero random generado " + random);
            dnis.add(random);
            generados++;
            System.out.println("Tamaño del conjunto " + dnis.size());
            if (dnis.size() != generados) {
                generados--;
            }
        } while (generados != cantidad);

        return dnis;
    }

    public ArrayList<Alumno> generarAlumnos(ArrayList<Alumno> alumnos, HashSet<Integer> dnis, int cantidad) {  
        Iterator iteraccion=dnis.iterator();
        int index=0;
        while (iteraccion.hasNext()) {
            alumnos.get(index).setDni((int)iteraccion.next());
            index++;
        }
        
        return alumnos;
    }

}
