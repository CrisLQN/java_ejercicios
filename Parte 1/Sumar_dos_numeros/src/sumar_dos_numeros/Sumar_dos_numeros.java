

package sumar_dos_numeros;
import java.util.Scanner;
public class Sumar_dos_numeros {
    
    public static void main(String[] args) {
    Scanner leer= new Scanner(System.in);
    System.out.println("ingrese el primer numero");
    int num1=leer.nextInt();
    System.out.println("ingrese el segundo numero");
    int num2=leer.nextInt();
    System.out.println("la suma de "+num1+" y de "+num2+" es "+(num1+num2));
    }
    
}
