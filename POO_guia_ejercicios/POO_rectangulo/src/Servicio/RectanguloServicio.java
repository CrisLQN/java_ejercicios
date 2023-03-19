package Servicio;

import Entidad.RectanguloEntidad;
import java.util.Scanner;

public class RectanguloServicio {

    Scanner leer = new Scanner(System.in);
    RectanguloEntidad Rectangulo = new RectanguloEntidad();

    public RectanguloEntidad CrearRectangulo() {
        System.out.println("Ingrese base");
        Rectangulo.setBase(leer.nextFloat());
        System.out.println("Ingrese altura");
        Rectangulo.setAltura(leer.nextFloat());
        return Rectangulo;
    }

    public float calcularSuperficie() {
        float superficie = Rectangulo.getAltura() * Rectangulo.getBase();
        return superficie;
    }

    public float calcularPerimetro() {
        float perimetro = (Rectangulo.getAltura() + Rectangulo.getBase()) * 2;
        return perimetro;
    }

    public void dibujarAsterisco() {
        for (int a = 0; a < Rectangulo.getAltura(); a++) {
            for (int b = 0; b < Rectangulo.getBase(); b++) {
                System.out.print("*");
            }
            System.out.println("");
        }
    }
}
