package Servicio;

import Entidad.Matematica;

public class MatematicaServicio {

    Matematica conjunto = new Matematica();

    public double devolverMayor(Matematica conjunto) {
      return Math.max(conjunto.getNumeroRealUno(), conjunto.getNumeroRealDos());
    }
    
    public double calcularPotencia(Matematica conjunto){
    return Math.pow(Math.round(conjunto.getNumeroRealUno()), Math.round(conjunto.getNumeroRealDos()));
    }
    
    public double calcularRaiz(Matematica conjunto){
    return Math.sqrt(Math.abs(Math.min(conjunto.getNumeroRealUno(), conjunto.getNumeroRealDos())));
    }
    
    
}
