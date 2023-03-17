package Servicios;

import Entidades.circuferenciaEntidades;
import java.util.Scanner;

public class circuferenciaServicios {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
   circuferenciaEntidades radio1=new circuferenciaEntidades();
        

    public circuferenciaEntidades  crearCircuferencia() {
        System.out.println("Inserte el radio");
        
        return radio1;
    }

    public static double  area(float radio) {
        double area = Math.PI * (radio * radio);
        return area;
    }

    public static double perimetro(float radio) {
        double perimetro = 2 * Math.PI * radio;
        return perimetro;
    }
}
