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
public class Meses {
    private String[] meses= {"enero","febrero","marzo","abril","mayo","junio","julio","agosto","septiembre","octubre","noviembre","diciembre"};

    public Meses() {
    }


    public void setMeses(String[] meses) {
        this.meses = meses;
    }

    public String getMes(int mes) {
        return meses[mes];
    }

    
    
    
    
    
}
