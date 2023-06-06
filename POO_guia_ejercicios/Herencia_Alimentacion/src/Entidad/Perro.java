/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidad;

/**
 *
 * @author cris-
 */
    public class Perro extends AbstractAnimal {

    public Perro(String nombre,String alimento,int edad,String raza) {
        super(nombre,alimento,edad,raza);
    }
    
    @Override
    public void alimentarse() {
        System.out.println("GUAU GUAU, Hola soy "+nombre+" como "+alimento+" tengo "+edad+" años y soy raza "+raza);
    }
}
