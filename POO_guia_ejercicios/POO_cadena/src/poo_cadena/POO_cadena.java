package poo_cadena;

import Entidad.cadena;
import Servicio.cadenaServicio;
import java.util.Scanner;

public class POO_cadena {

    public static void main(String[] args) {
        cadenaServicio cadenaServ = new cadenaServicio();
        cadena frase = new cadena();
        Scanner leer = new Scanner(System.in);
        System.out.println("Inserte frase");
        frase.setFrase(leer.nextLine());
        frase.setLongitud(frase.getFrase());
        System.out.println("Frase invertida "+cadenaServ.invertirFrase(frase));
        
        
        
        
        System.out.println("La cantidad de vocales presente en la frase es " + cadenaServ.mostrarVocales(frase));

        System.out.println("Ingrese caracter");
        String letra = leer.nextLine();
        System.out.println("La cantidad de veces que la letra " + letra + " se repite en la frase " + frase.getFrase() + " es " + cadenaServ.vecesRepetido(frase, letra));

        System.out.println("Ingrese frase a sumar con la anterior");
        String fraseDos = leer.nextLine();
        System.out.println("La frase nueva es " + cadenaServ.unirFrases(frase, fraseDos));

        System.out.println("Inserte letra con el cual reemplazara las *a*");
        String caracter = leer.nextLine();
        System.out.println("Con las A reemplazadas la frase es " + cadenaServ.reemplazar(frase, caracter));

        System.out.println("Ingrese letra para verificar si esta presente en la frase");
        letra = leer.nextLine();
        if (cadenaServ.contiene(frase, letra)) {
            System.out.println(letra + " esta dentro de la frase");
        } else {
            System.out.println(letra + " NO esta dentro de la frase");
        }

    }

}
