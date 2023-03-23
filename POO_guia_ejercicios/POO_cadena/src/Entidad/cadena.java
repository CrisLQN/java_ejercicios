
package Entidad;

public class cadena {

    private String frase;
    private int longitud;

    public cadena() {
    }

    public cadena(String frase) {
        this.frase = frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public void setLongitud(String frase) {
        longitud = frase.length();
    }

    public String getFrase() {
        return frase;
    }

    public int getLongitud() {
        return longitud;
    }
    
    
}
