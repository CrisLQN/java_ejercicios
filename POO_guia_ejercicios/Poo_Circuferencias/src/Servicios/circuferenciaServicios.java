package Servicios;

import Entidades.circuferenciaEntidades;
import java.util.Scanner;

public class circuferenciaServicios {

    static Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
   circuferenciaEntidades radio=new circuferenciaEntidades();
        

    public circuferenciaEntidades  crearCircuferencia() {
        System.out.println("Inserte el radio");
        radio.setRadio(leer.nextFloat());
        return radio;
    }

    public double  area(circuferenciaEntidades radio) {
        double area = Math.PI * (radio.getRadio() * radio.getRadio());
        
        return area;
    }

    public double perimetro(circuferenciaEntidades radio) {
        double perimetro = 2 * Math.PI * radio.getRadio();
        return perimetro;
    }
}
