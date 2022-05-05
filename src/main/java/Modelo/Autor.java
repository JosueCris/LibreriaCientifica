package Modelo;

import java.io.Serializable;

public class Autor implements Serializable {
    private int codAutor;
    private String nombreCompleto;

    public Autor() {

    }

    public Autor(int codAutor) {
        this.codAutor = codAutor;
    }

    public Autor(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public Autor(int codAutor, String nombreCompleto) {
        this.codAutor = codAutor;
        this.nombreCompleto = nombreCompleto;
    }

    public int getCodAutor() {
        return codAutor;
    }

    public void setCodAutor(int codAutor) {
        this.codAutor = codAutor;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    @Override
    public String toString() {
        return "CodAutor: " + codAutor +
                "\nNombre Completo: " + nombreCompleto + "\n";
    }
}