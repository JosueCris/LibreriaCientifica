package Modelo;

import java.io.Serializable;

public class Idioma implements Serializable {
    private int codIdioma;
    private String nombreIdioma;

    public Idioma() {

    }

    public Idioma(int codIdioma) {
        this.codIdioma = codIdioma;
    }

    public Idioma(String nombreIdioma) {
        this.nombreIdioma = nombreIdioma;
    }

    public Idioma(int codIdioma, String nombreIdioma) {
        this.codIdioma = codIdioma;
        this.nombreIdioma = nombreIdioma;
    }

    public int getCodIdioma() {
        return codIdioma;
    }

    public void setCodIdioma(int codIdioma) {
        this.codIdioma = codIdioma;
    }

    public String getNombreIdioma() {
        return nombreIdioma;
    }

    public void setNombreIdioma(String nombreIdioma) {
        this.nombreIdioma = nombreIdioma;
    }

    @Override
    public String toString() {
        return "CodIdioma: " + codIdioma +
                "\nNombre: " + nombreIdioma + "\n";
    }
}