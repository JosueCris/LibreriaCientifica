package Modelo;

import java.io.Serializable;

public class Almacen implements Serializable {
    private int codRepisa;
    private int numeroEjemplares;
    private int pasillosA;

    public Almacen() {

    }

    public Almacen(int codRepisa) {
        this.codRepisa = codRepisa;
    }

    public Almacen(int numeroEjemplares, int pasillosA) {
        this.numeroEjemplares = numeroEjemplares;
        this.pasillosA = pasillosA;
    }

    public Almacen(int codRepisa, int numeroEjemplares, int pasillosA) {
        this.codRepisa = codRepisa;
        this.numeroEjemplares = numeroEjemplares;
        this.pasillosA = pasillosA;
    }

    public int getCodRepisa() {
        return codRepisa;
    }

    public void setCodRepisa(int codRepisa) {
        this.codRepisa = codRepisa;
    }

    public int getNumeroEjemplares() {
        return numeroEjemplares;
    }

    public void setNumeroEjemplares(int numeroEjemplares) {
        this.numeroEjemplares = numeroEjemplares;
    }

    public int getPasillosA() {
        return pasillosA;
    }

    public void setPasillosA(int pasillosA) {
        this.pasillosA = pasillosA;
    }

    @Override
    public String toString() {
        return "CodRepisa: " + codRepisa +
                "\nNumero Ejemplares: " + numeroEjemplares +
                "\nPasillo: " + pasillosA + "\n";
    }
}
