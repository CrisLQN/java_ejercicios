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
public class Polideportivo extends AbstractEdificio {

    private String nombre;
    private String tipoInstalacion;

    public Polideportivo(double largo, double ancho, double alto) {
        super(largo, ancho, alto);
    }

    public Polideportivo(String nombre, String tipoInstalacion, double largo, double ancho, double alto) {
        super(largo, ancho, alto);
        this.nombre = nombre;
        this.tipoInstalacion = tipoInstalacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipoInstalacion(String tipoInstalacion) {
        this.tipoInstalacion = tipoInstalacion;
    }

    public void setLargo(double largo) {
        this.largo = largo;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }

    public void setAlto(double alto) {
        this.alto = alto;
    }

    public String getNombre() {
        return nombre;
    }

    public String getTipoInstalacion() {
        return tipoInstalacion;
    }

    @Override
    public double getLargo() {
        return largo;
    }

    @Override
    public double getAncho() {
        return ancho;
    }

    @Override
    public double getAlto() {
        return alto;
    }

    @Override
    public double calcularSuperficie(Edificio edificio) {
        AbstractEdificio e = (AbstractEdificio) edificio;

        return e.getLargo() * e.getAncho();
    }

    @Override
    public double calcularVolumen(Edificio edificio) {
        AbstractEdificio e = (AbstractEdificio) edificio;
        return calcularSuperficie(edificio) * e.getAlto();
    }

}
