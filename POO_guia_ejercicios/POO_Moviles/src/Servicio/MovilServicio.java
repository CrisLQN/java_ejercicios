package Servicio;

import Entidad.Movil;
import java.util.Scanner;

public class MovilServicio {

    Movil movil = new Movil();
    Scanner leer = new Scanner(System.in);

    public int[] ingresarCodigo() {
        System.out.println("Ahora se procedera a ingresar cada numero del codigo del movil");
        int[] codigo = new int[7];
        for (int i = 0; i < 7; i++) {
            System.out.println("posicion numero " + i);
            codigo[i] =leer.nextInt();
        }
        return codigo;
    }
}
