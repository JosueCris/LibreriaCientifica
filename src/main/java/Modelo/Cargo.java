package Modelo;

import java.io.Serializable;

public class Cargo implements Serializable {
    private int codCargo;
    private String nombreCargo;

    public Cargo() {

    }

    public Cargo(int codCargo) {
        this.codCargo = codCargo;
    }

    public Cargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    public Cargo(int codCargo, String nombreCargo) {
        this.codCargo = codCargo;
        this.nombreCargo = nombreCargo;
    }

    public int getCodCargo() {
        return codCargo;
    }

    public void setCodCargo(int codCargo) {
        this.codCargo = codCargo;
    }

    public String getNombreCargo() {
        return nombreCargo;
    }

    public void setNombreCargo(String nombreCargo) {
        this.nombreCargo = nombreCargo;
    }

    @Override
    public String toString() {
        return "CodCargo: " + codCargo +
               "\nNombre: " + nombreCargo + "\n";
    }
}