package Modelo;

import java.io.Serializable;

public class Materia implements Serializable {
    private int codMateria;
    private String nombreMateria;

    public Materia() {

    }

    public Materia(int codMateria) {
        this.codMateria = codMateria;
    }

    public Materia(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    public Materia(int codMateria, String nombreMateria) {
        this.codMateria = codMateria;
        this.nombreMateria = nombreMateria;
    }

    public int getCodMateria() {
        return codMateria;
    }

    public void setCodMateria(int codMateria) {
        this.codMateria = codMateria;
    }

    public String getNombreMateria() {
        return nombreMateria;
    }

    public void setNombreMateria(String nombreMateria) {
        this.nombreMateria = nombreMateria;
    }

    @Override
    public String toString() {
        return "CodMateria: " + codMateria +
                "\nNombre: " + nombreMateria + "\n";
    }
}