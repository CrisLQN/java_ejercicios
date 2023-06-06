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
public class Barco {
    protected int matricula;
    protected int esloraMetros;
    protected int annioFabricacion;

    public Barco() {
    }

    public Barco(int matricula, int esloraMetros, int annioFabricacion) {
        this.matricula = matricula;
        this.esloraMetros = esloraMetros;
        this.annioFabricacion = annioFabricacion;
    }

    public int getMatricula() {
        return matricula;
    }

    public int getEsloraMetros() {
        return esloraMetros;
    }

    public int getAnnioFabricacion() {
        return annioFabricacion;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public void setEsloraMetros(int esloraMetros) {
        this.esloraMetros = esloraMetros;
    }

    public void setAnnioFabricacion(int annioFabricacion) {
        this.annioFabricacion = annioFabricacion;
    }
    
    
    
    
    
}
