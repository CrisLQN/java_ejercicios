
package Entidad;

import java.util.Date;
import java.util.Scanner;

public class Persona {
    private String nombre;
    private Date fechaNacimiento;
    
    
    Scanner leer=new Scanner(System.in);

    public Persona() {
    }

    public Persona(String nombre, Date fechaNacimiento) {
        this.nombre = nombre;
        this.fechaNacimiento = fechaNacimiento;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento=fechaNacimiento;
    }
    

    public String getNombre() {
        return nombre;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }
    
    
}
