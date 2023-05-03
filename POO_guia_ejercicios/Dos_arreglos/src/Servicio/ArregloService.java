/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import java.util.Arrays;

/**
 *
 * @author cris-
 */
public class ArregloService {

    public void inicializarA(double[] vectorA) {

        for (int i = 0; i < 50; i++) {
            vectorA[i] = Math.random() * 10;
        }
    }

    public void mostrar(double[] vector) {
        System.out.println(Arrays.toString(vector));
    }

    public void ordenar(double[] vector) {
        Arrays.sort(vector);
    }

    public void inicializarB(double[] vector_A, double[] vector_B) {
        System.arraycopy(vector_A, 0, vector_B, 0, 10);
        Arrays.fill(vector_B, 10, 20, 0.5);
    }

}
