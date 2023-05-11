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
public class Persona {
    private String nombre;
    private String apellido;
    private int edad;
    private long documento;
    private Perro perro;

    public Persona() {
    }

    public Persona(String nombre, String apellido, int edad, long documento, Perro perro) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.documento = documento;
        this.perro = perro;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setDocumento(long documento) {
        this.documento = documento;
    }

    public void setPerro(Perro perro) {
        this.perro = perro;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public int getEdad() {
        return edad;
    }

    public long getDocumento() {
        return documento;
    }

    public Perro getPerro() {
        return perro;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre= " + nombre + ", apellido= " + apellido + ", edad= " + edad + ", documento= " + documento +  '}'+  "Perro{" + "nombre= " + perro.getNombre() + ", raza= " + perro.getRaza() + ", edad= " + perro.getEdad() + ", tamanio= " + perro.getTamanio() + '}';
    }
    
    
    
            
}
