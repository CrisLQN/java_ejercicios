package Entidad;

import java.util.Scanner;

/**
 *
 * @author cris-
 */
public class Receta {

    public String nombre;
    public String[] ingredientes;

  

    public Receta() {
    }

    public Receta(String nombre, String[] ingredientes) {
        this.nombre = nombre;
        this.ingredientes = ingredientes;
    }
   

    public Receta agregarReceta(Receta receta) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese nombre");
        receta.setNombre(leer.nextLine());
        System.out.println("Ingrese cantidad de  ingredientes");
        int cantidad=leer.nextInt();
        String[] ingrediente=new String[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Inserte ingrediente numero "+(i+1));
            ingrediente[i]=leer.nextLine();
            leer.next();
            
        }
        receta.setIngredientes(ingrediente);
        return receta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setIngredientes(String[] ingredientes) {
        this.ingredientes = ingredientes;
    }

    public String getNombre() {
        return nombre;
    }

    public String[] getIngredientes() {
        return ingredientes;
    }

 
    
    

}
