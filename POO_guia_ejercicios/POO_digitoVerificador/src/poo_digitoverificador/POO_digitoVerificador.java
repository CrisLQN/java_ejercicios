package poo_digitoverificador;

import Entidad.NIF;
import Servicio.NIFServicio;

public class POO_digitoVerificador {

    public static void main(String[] args) {
        String[] tabla = new String[23];
        tabla[0] = "T";
        tabla[1] = "R";
        tabla[2] = "W";
        tabla[3] = "A";
        tabla[4] = "G";
        tabla[5] = "M";
        tabla[6] = "Y";
        tabla[7] = "F";
        tabla[8] = "P";
        tabla[9] = "D";
        tabla[10] = "X";
        tabla[11] = "B";
        tabla[12] = "N";
        tabla[13] = "J";
        tabla[14] = "Z";
        tabla[15] = "S";
        tabla[16] = "Q";
        tabla[17] = "V";
        tabla[18] = "H";
        tabla[19] = "L";
        tabla[20] = "C";
        tabla[21] = "K";
        tabla[22] = "E";

        NIFServicio NIFServ = new NIFServicio();
        NIF dniUno = NIFServ.crearNif(tabla);
        NIFServ.mostrar(dniUno);
    }

}
