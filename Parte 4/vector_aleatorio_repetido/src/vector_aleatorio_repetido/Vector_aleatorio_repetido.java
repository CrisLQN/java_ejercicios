
package vector_aleatorio_repetido;

import java.util.Scanner;

public class Vector_aleatorio_repetido {

 
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Ingrese un entero para el tamaño del vector");
        int N=leer.nextInt();
        int [] vector=new int[N];
        rellenar(vector,N);
        System.out.println("Ingrese que numero desea buscar en el vector");
        int buscar=leer.nextInt();
        boolean encontrar=false;
        int contador=0;
        for (int i = 0; i < N; i++) {
            if (vector[i]==buscar) {
                System.out.println("el numero "+buscar+" se encuentra en posicion ["+i+"] del vector");
                encontrar=true;
                contador+=1;
            }
        }
        if (encontrar==false) {
            System.out.println("el numero "+buscar+" no se encuentra en el vector");
        }else if(contador>1){
            System.out.println("el numero "+buscar+" se ha repetido "+(contador)+" veces");
        }
    }
    
    
    
    
    public static void rellenar(int vector[], int N){
        for (int i = 0; i < N; i++) {
            vector[i]=(int)(Math.random()*10);
        }
    }
}
