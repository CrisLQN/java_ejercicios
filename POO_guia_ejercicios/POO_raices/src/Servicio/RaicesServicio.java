/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Servicio;

import Entidad.Raices;

/**
 *
 * @author cris-
 */
public class RaicesServicio {

    Raices ecuacion = new Raices();

    public double getDiscriminante(Raices ecuacion) {
        double discriminante = (ecuacion.getB() * ecuacion.getB()) - 4 * ecuacion.getA() * ecuacion.getC();
        return discriminante;
    }

    public boolean tieneRaices(double discriminante) {
        return discriminante > 0;
    }
    
    public boolean tieneRaiz(double discriminante) {
        return discriminante == 0;
    }
    
    public void obtenerRaices(Raices ecuacion){
        if (tieneRaices(getDiscriminante(ecuacion))==true) {
            System.out.println("Las raices de la ecuacion son = "+(-ecuacion.getB()+Math.sqrt(ecuacion.getB()*ecuacion.getB()-4*ecuacion.getA()*ecuacion.getC()))/(2*ecuacion.getA()));
            System.out.println((-ecuacion.getB()-Math.sqrt(ecuacion.getB()*ecuacion.getB()-4*ecuacion.getA()*ecuacion.getC()))/(2*ecuacion.getA()));
        }
    }
    
    public void obtenerRaiz(Raices ecuacion){
        if (tieneRaiz(getDiscriminante(ecuacion))==true) {
            System.out.println("Las raiz de la ecuacion es = "+(-ecuacion.getB()+Math.sqrt(ecuacion.getB()*ecuacion.getB()-4*ecuacion.getA()*ecuacion.getC()))/(2*ecuacion.getA()));
        }
    }
    
    public void calcular(Raices ecuacion){
        if (tieneRaices(getDiscriminante(ecuacion))) {
            System.out.println("La raiz tiene dos soluciones ");
            obtenerRaices(ecuacion);
        }else if (tieneRaiz(getDiscriminante(ecuacion))) {
            System.out.println("La raiz tiene solucion doble");
            obtenerRaiz(ecuacion);
        }else{
            System.out.println("La raiz no tiene solucion");
        }
    }
    
    
    

    
}
