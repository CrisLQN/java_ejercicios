
package Entidad;


public class NIF {
    private long DNI;
    private String letra;

    public NIF() {
    }

    public NIF(long DNI, String letra) {
        this.DNI = DNI;
        this.letra = letra;
    }

    public void setDNI(long DNI) {
        this.DNI = DNI;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public long getDNI() {
        return DNI;
    }

    public String getLetra() {
        return letra;
    }
    
    
    
    
}
