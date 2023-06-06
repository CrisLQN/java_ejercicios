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
public class HotelCuartoExtrellas extends Hotel {

    protected String gimnasio;
    protected String nombreRestaruante;
    protected int capacidadRestaurante;

    public HotelCuartoExtrellas(String gimnasio, String nombreRestaruante, int capacidadRestaurante, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.gimnasio = gimnasio;
        this.nombreRestaruante = nombreRestaruante;
        this.capacidadRestaurante = capacidadRestaurante;
    }

    

   

    public void setGimnasio(String gimnasio) {
        this.gimnasio = gimnasio;
    }

    public void setNombreRestaruante(String nombreRestaruante) {
        this.nombreRestaruante = nombreRestaruante;
    }

    public void setCapacidadRestaurante(int capacidadRestaurante) {
        this.capacidadRestaurante = capacidadRestaurante;
    }

    public String getGimnasio() {
        return gimnasio;
    }

    public String getNombreRestaruante() {
        return nombreRestaruante;
    }

    public int getCapacidadRestaurante() {
        return capacidadRestaurante;
    }
    
    

    public double sacarValorRestaurante(Hotel hotel) {
        HotelCuartoExtrellas H = (HotelCuartoExtrellas) hotel;
        if (H.getCapacidadRestaurante() < 30) {
            return 10.0;
        } else if (H.getCapacidadRestaurante() < 51) {
            return 30.0;
        } else return 50.0;
    }
    
    public double sacarValorAgregadoGimnasio(Hotel hotel){ 
        HotelCuartoExtrellas H = (HotelCuartoExtrellas) hotel;  
        if (H.getGimnasio().equalsIgnoreCase("A")) {
            return 50.0;
        } else return 30.0;
    
    }

    public double sacarPrecioUnaHabitacion (Hotel hotel){ 
    return 50.0+(1.0*hotel.getCantidadHabitaciones())+sacarValorRestaurante(hotel)+sacarValorAgregadoGimnasio(hotel);
    }
}
