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
public class HotelCincoExtrellas extends HotelCuartoExtrellas {
    
    private int cantidadSalonConferencia;
    private int cantidadSuites;
    private int cantidadLimosinas;

    public HotelCincoExtrellas(int cantidadSalonConferencia, int cantidadSuites, int cantidadLimosinas, String gimnasio, String nombreRestaruante, int capacidadRestaurante, int cantidadHabitaciones, int numeroCamas, int cantidadPisos, double precioHabitaciones, String nombre, String direccion, String localidad, String gerente) {
        super(gimnasio, nombreRestaruante, capacidadRestaurante, cantidadHabitaciones, numeroCamas, cantidadPisos, precioHabitaciones, nombre, direccion, localidad, gerente);
        this.cantidadSalonConferencia = cantidadSalonConferencia;
        this.cantidadSuites = cantidadSuites;
        this.cantidadLimosinas = cantidadLimosinas;
    }



    public void setCantidadSalonConferencia(int cantidadSalonConferencia) {
        this.cantidadSalonConferencia = cantidadSalonConferencia;
    }

    public void setCantidadSuites(int cantidadSuites) {
        this.cantidadSuites = cantidadSuites;
    }

    public void setCantidadLimosinas(int cantidadLimosinas) {
        this.cantidadLimosinas = cantidadLimosinas;
    }

    public int getCantidadSalonConferencia() {
        return cantidadSalonConferencia;
    }

    public int getCantidadSuites() {
        return cantidadSuites;
    }

    public int getCantidadLimosinas() {
        return cantidadLimosinas;
    }
    
    @Override
 public double sacarPrecioUnaHabitacion (Hotel hotel){ 
     HotelCincoExtrellas hotelcinco=(HotelCincoExtrellas) hotel;
    return super.sacarPrecioUnaHabitacion(hotel)+(15.0*hotelcinco.getCantidadLimosinas());
 
 }
 
 
}
