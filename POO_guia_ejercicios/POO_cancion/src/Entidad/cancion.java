
package Entidad;


public class cancion {
    private String titulo;
    private String autor;

    public cancion() {
    }
    
    public cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }
    
    
    
}
