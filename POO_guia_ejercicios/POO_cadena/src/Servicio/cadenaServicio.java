package Servicio;

import Entidad.cadena;
import java.util.Scanner;

public class cadenaServicio {

    cadena frase = new cadena();
    Scanner leer = new Scanner(System.in);

    public int mostrarVocales(cadena frase) {
        int vocales = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            switch (frase.getFrase().substring(i, i + 1)) {
                case "a":
                    vocales += 1;
                    break;
                case "e":
                    vocales += 1;
                    break;
                case "i":
                    vocales += 1;
                    break;
                case "o":
                    vocales += 1;
                    break;
                case "u":
                    vocales += 1;
                    break;
            }
        }
        return vocales;
    }

    public String invertirFrase(cadena frase) {
        String nuevaFrase="";
        for (int i = frase.getLongitud(); i > 0; i--) {
            nuevaFrase=nuevaFrase.concat(frase.getFrase().substring(i-1, i));
        }
        frase.setFrase(nuevaFrase);
    return frase.getFrase();
    }

    public int vecesRepetido(cadena frase, String letra) {
        int repetido = 0;
        for (int i = 0; i < frase.getLongitud(); i++) {
            if (frase.getFrase().substring(i, i + 1).equals(letra)) {
                repetido += 1;
            }
        }
        return repetido;
    }

    public String unirFrases(cadena frase, String frase2) {
        String fraseNueva = frase.getFrase().concat(frase2);
        frase.setFrase(fraseNueva);
        return fraseNueva;
    }

    public String reemplazar(cadena frase, String letra) {
        String replace = frase.getFrase().replace("a", letra);
        frase.setFrase(replace);

        return replace;
    }

    public boolean contiene(cadena frase, String letra) {

        return frase.getFrase().contains(letra);
    }

}
