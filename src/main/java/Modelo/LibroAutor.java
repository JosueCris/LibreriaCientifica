package Modelo;

import java.io.Serializable;

public class LibroAutor implements Serializable {
    private Libros codLibroAutor;
    private Autor codAutor;

    public LibroAutor() {

    }

    public LibroAutor(Libros codLibroAutor, Autor codAutor) {
        this.codLibroAutor = codLibroAutor;
        this.codAutor = codAutor;
    }

    public Libros getCodLibroAutor() {
        return codLibroAutor;
    }

    public void setCodLibroAutor(Libros codLibroAutor) {
        this.codLibroAutor = codLibroAutor;
    }

    public Autor getCodAutor() {
        return codAutor;
    }

    public void setCodAutor(Autor codAutor) {
        this.codAutor = codAutor;
    }

    @Override
    public String toString() {
        return "CodLibroAutor: " + codLibroAutor +
               "\nCodAutor: " + codAutor + "\n";
    }
}