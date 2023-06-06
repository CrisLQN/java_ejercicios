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
public class BarcoMotor extends Barco{
   private int potenciaCV;

    public BarcoMotor(int potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public BarcoMotor(int potenciaCV, int matricula, int esloraMetros, int annioFabricacion) {
        super(matricula, esloraMetros, annioFabricacion);
        this.potenciaCV = potenciaCV;
    }

    public void setPotenciaCV(int potenciaCV) {
        this.potenciaCV = potenciaCV;
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

    public int getPotenciaCV() {
        return potenciaCV;
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
   
   
   
   
}
