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
public class Velero extends Barco {

    private int mastiles;

    public Velero(int mastiles) {
        this.mastiles = mastiles;
    }

    public Velero(int mastiles, int matricula, int esloraMetros, int annioFabricacion) {
        super(matricula, esloraMetros, annioFabricacion);
        this.mastiles = mastiles;
    }

    public int getMastiles() {
        return mastiles;
    }

    @Override
    public int getMatricula() {
        return matricula;
    }

    @Override
    public int getEsloraMetros() {
        return esloraMetros;
    }

    @Override
    public int getAnnioFabricacion() {
        return annioFabricacion;
    }

    public void setMastiles(int mastiles) {
        this.mastiles = mastiles;
    }
    @Override
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    @Override
    public void setEsloraMetros(int esloraMetros) {
        this.esloraMetros = esloraMetros;
    }
    @Override
    public void setAnnioFabricacion(int annioFabricacion) {
        this.annioFabricacion = annioFabricacion;
    }
    
    

}
