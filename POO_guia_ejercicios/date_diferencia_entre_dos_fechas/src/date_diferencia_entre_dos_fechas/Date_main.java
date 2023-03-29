package date_diferencia_entre_dos_fechas;

import java.util.Date;
import java.util.Scanner;

public class Date_main {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dia");
        int dia = leer.nextInt();
        System.out.println("Ingrese mes");
        int mes = leer.nextInt();
        System.out.println("Ingrese año (0-99 para 1900 , valores mas altos seran de los 2000) ");
        int anio = leer.nextInt();

        Date fecha = new Date(anio, mes, dia);
        Date fechaActual = new Date();
        System.out.println("Fecha ingresada= " + fecha);
        System.out.println("Fecha actual= " + fechaActual);
        if (fecha.getMonth() < fechaActual.getMonth()) {
            System.out.println("la diferencia entre ambos años es " + ((fechaActual.getYear() - fecha.getYear()) - 1));
        } else if (fecha.getDate() < fechaActual.getDate()) {
            System.out.println("la diferencia entre ambos años es " + ((fechaActual.getYear() - fecha.getYear()) - 1));
        }else {
        System.out.println("la diferencia entre ambos años es " + (fechaActual.getYear() - fecha.getYear()));
        }

    }

}
