
package entero_doble_triple_cuadrado;
import java.util.Scanner;
public class Entero_doble_triple_cuadrado {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("ingrese un numero entero");
        int entero=leer.nextInt();
        System.out.println("El doble del numero es = "+entero*2);
        System.out.println("El triple del numero es = "+entero*3);
        System.out.println("La raiz cuadrada del numero es = "+Math.sqrt(entero));
    }
}
