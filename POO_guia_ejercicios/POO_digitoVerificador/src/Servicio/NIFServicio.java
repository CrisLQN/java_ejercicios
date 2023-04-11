package Servicio;

import Entidad.NIF;
import java.util.Scanner;

public class NIFServicio {

    NIF modelo = new NIF();
    Scanner leer = new Scanner(System.in);

    public NIF crearNif(String[] tabla) {
        System.out.println("Ingrese el DNI (TAMAÑO MAXIMO 9)");
        modelo.setDNI(leer.nextLong());
        while (modelo.getDNI() > 99999999) {
            System.out.println("DNI no valido, se alcanzo el tamaño maximo (9)");
            System.out.println("Ingrese el DNI");
            modelo.setDNI(leer.nextLong());
        }
        int posicion = Math.round(modelo.getDNI() % 23);
        modelo.setLetra(tabla[posicion]);
        return modelo;
    }

    public void mostrar(NIF modelo) {
        int contador = 8;
        long dni = modelo.getDNI();
        while (dni > 1) {
            dni = dni / 10;
            contador -= 1;
        }
        String NIF = "";
        for (int i = 0; i < contador; i++) {
            NIF = NIF.concat("0");
        }
        NIF = NIF.concat(String.valueOf(modelo.getDNI())).concat("-").concat(modelo.getLetra());
        System.out.println(NIF);
    }

}
