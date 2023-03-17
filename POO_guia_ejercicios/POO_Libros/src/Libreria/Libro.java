package Libreria;

public class Libro {

    private int ISBN;
    private String Titulo;
    private String Autor;
    private int Paginas;

    public Libro() {
    }

    public Libro(int ISBN, String Titulo, String Autor, int Paginas) {
        this.ISBN = ISBN;
        this.Titulo = Titulo;
        this.Autor = Autor;
        this.Paginas = Paginas;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public void setAutor(String Autor) {
        this.Autor = Autor;
    }

    public void setPaginas(int Paginas) {
        this.Paginas = Paginas;
    }

    @Override
    public String toString() {
        return "Libro{" + "ISBN=" + ISBN + ", Titulo=" + Titulo + ", Autor=" + Autor + ", Paginas=" + Paginas + '}';
    }

}
