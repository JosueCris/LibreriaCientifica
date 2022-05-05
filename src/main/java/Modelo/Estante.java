package Modelo;

import java.io.Serializable;

public class Estante implements Serializable {
    private int codEstante;
    private int numeroEjemplares;
    private int pasillo;

    public Estante() {

    }

    public Estante(int codEstante) {
        this.codEstante = codEstante;
    }

    public Estante(int numeroEjemplares, int pasillo) {
        this.numeroEjemplares = numeroEjemplares;
        this.pasillo = pasillo;
    }

    public Estante(int codEstante, int numeroEjemplares, int pasillo) {
        this.codEstante = codEstante;
        this.numeroEjemplares = numeroEjemplares;
        this.pasillo = pasillo;
    }

    public int getCodEstante() {
        return codEstante;
    }

    public void setCodEstante(int codEstante) {
        this.codEstante = codEstante;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getPasillo() {
        return pasillo;
    }

    public void setPasillo(int pasillo) {
        this.pasillo = pasillo;
    }

    @Override
    public String toString() {
        return "CodEstante: " + codEstante +
                "\nNumero Ejemplares: " + numeroEjemplares +
                "\nPasillo: " + pasillo + "\n";
    }
}