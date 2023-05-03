
package dos_arreglos;
import Servicio.ArregloService;
import java.util.Arrays;


public class Dos_arreglos {


    public static void main(String[] args) {
        ArregloService arregloServ= new ArregloService();
        double [] vector_A= new double [50];
        double [] vector_B= new double [20];
        arregloServ.inicializarA(vector_A);
        arregloServ.mostrar(vector_A);
        arregloServ.ordenar(vector_A);
        arregloServ.inicializarB(vector_A, vector_B);
        arregloServ.mostrar(vector_A);
        arregloServ.mostrar(vector_B);

    }
    
}


/*       for (int i = 0; i < 50; i++) {
            vector_A[i]=Math.random()*10;
        }
        Arrays.sort(vector_A);
        System.arraycopy(vector_A, 0, vector_B, 0, 10);
        Arrays.fill(vector_B, 10, 20, 0.5);
        System.out.println(Arrays.toString(vector_A));  
        System.out.println(Arrays.toString(vector_B));
*/