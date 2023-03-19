package Servicio;

import Entidad.Cafetera;
import java.util.Scanner;

public class ServicioCafetera {
    
    Scanner leer = new Scanner(System.in);
    Cafetera cafetera = new Cafetera();
    
    public Cafetera crearCafetera() {
        System.out.println("Construyendo Nueva cafetera");
        System.out.println("Ingrese Capacidad Maxima de la cafetera");
        cafetera.setCapacidadMaxima(leer.nextInt());
        System.out.println("Ingrese Cantidad actual de la cafetera");
        cafetera.setCantidadActual(leer.nextInt());
        while (cafetera.getCantidadActual() > cafetera.getCapacidadMaxima()) {
            System.out.println("Cantidad no valida= La cantidad actual de la cafetera no deberia estar sobrepasando la capacidad maxima");
            System.out.println("Ingrese una cantidad igual o menor a " + cafetera.getCapacidadMaxima());
            cafetera.setCantidadActual(leer.nextInt());
        }
        return cafetera;
    }
    
    public Cafetera llenarCafetera() {
        System.out.println("Se procedera a llenar la cafetera");
        cafetera.setCantidadActual(cafetera.getCapacidadMaxima());
        return cafetera;
    }
    
    public Cafetera servirTaza() {
        System.out.println("Ingrese la capacidad de la taza");
        int taza = leer.nextInt();
        if (taza > cafetera.getCantidadActual()) {
            System.out.println("No se lleno la taza al haber menor cantidad de cafe que la capacidad de la taza");
            System.out.println("La taza se relleno en un " + ((cafetera.getCantidadActual() / taza) * 100) + "%");
            cafetera.setCantidadActual(0);
            return cafetera;
        }
        System.out.println("La taza se ha rellenado por completo, disfruta!");
        cafetera.setCantidadActual(cafetera.getCantidadActual() - taza);
        return cafetera;
    }
    
    public Cafetera vaciarCafetera() {
        System.out.println("Vaciando cafetera!");
        cafetera.setCantidadActual(0);
        return cafetera;
    }
    
    public Cafetera agregarCafe(){
        System.out.println("Ingrese cantidad de cafe al ingresar en la cafetera");
        int cafe=leer.nextInt();
        while(cafe>cafetera.getCapacidadMaxima()){
            System.out.println("Demasiado cafe! por favor ingrese una cantidad menor o igual a "+cafetera.getCapacidadMaxima());
            cafe=leer.nextInt();
        }
        cafetera.setCantidadActual(cafe);
        return cafetera;
    }
    
}
