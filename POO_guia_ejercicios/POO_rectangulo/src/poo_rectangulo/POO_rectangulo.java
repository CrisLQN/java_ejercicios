package poo_rectangulo;

import Entidad.RectanguloEntidad;
import Servicio.RectanguloServicio;

public class POO_rectangulo {

    public static void main(String[] args) {
        RectanguloEntidad rectangulo1 = new RectanguloEntidad();
        RectanguloServicio rectanguloServ = new RectanguloServicio();
        rectangulo1 = rectanguloServ.CrearRectangulo();
        System.out.println("La superficie es " + rectanguloServ.calcularSuperficie());
        System.out.println("El perimetro es " + rectanguloServ.calcularPerimetro());
        rectanguloServ.dibujarAsterisco();
    }
}
