package Modelo;

import java.io.Serializable;

public class LibroAutor implements Serializable {
    private String codLibroAutor;
    private int codAutor;

    public LibroAutor() {

    }

    public LibroAutor(String codLibroAutor) {
        this.codLibroAutor = codLibroAutor;
    }

    public LibroAutor(int codAutor) {
        this.codAutor = codAutor;
    }

    public LibroAutor(String codLibroAutor, int codAutor) {
        this.codLibroAutor = codLibroAutor;
        this.codAutor = codAutor;
    }

    public String getCodLibroAutor() {
        return codLibroAutor;
    }

    public void setCodLibroAutor(String codLibroAutor) {
        this.codLibroAutor = codLibroAutor;
    }

    public int getCodAutor() {
        return codAutor;
    }

    public void setCodAutor(int codAutor) {
        this.codAutor = codAutor;
    }

    @Override
    public String toString() {
        return "LibroAutor{" +
                "codLibroAutor='" + codLibroAutor + '\'' +
                ", codAutor=" + codAutor +
                '}';
    }
}