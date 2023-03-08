
package nombre_variable_mostrar;
import java.util.Scanner;

public class Nombre_variable_mostrar {

   
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingresa tu nombre");
        String nombre=leer.nextLine();
        System.out.println("Tu nombre es "+nombre);
    }
    
}
