/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herencia_calcularformasgeometricas;

import Entidad.Circulo;
import Entidad.Rectangulo;

/**
 *
 * @author cris-
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circulo circulo= new Circulo(3,10);
        System.out.println("--------Circulo----------");
        System.out.println(circulo.CalcularArea());
        System.out.println(circulo.CalcularPerimetro());
        Rectangulo rectangulo=new Rectangulo(1,3);
        System.out.println("-------Rectangulo--------");
        System.out.println(rectangulo.CalcularArea());
        System.out.println(rectangulo.CalcularPerimetro());
        
        
    }
    
}
