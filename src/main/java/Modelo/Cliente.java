package Modelo;

import java.io.Serializable;

public class Cliente implements Serializable {
    private int codCliente;
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String correo;
    private String telefono;
    private boolean status;

    public Cliente() {

    }

    public Cliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public Cliente(String nombre, String aPaterno, String aMaterno, String correo, String telefono, boolean status) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.correo = correo;
        this.telefono = telefono;
        this.status = status;
    }

    public Cliente(int codCliente, String nombre, String aPaterno, String aMaterno, String correo, String telefono, boolean status) {
        this.codCliente = codCliente;
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.correo = correo;
        this.telefono = telefono;
        this.status = status;
    }

    public int getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(int codCliente) {
        this.codCliente = codCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getaPaterno() {
        return aPaterno;
    }

    public void setaPaterno(String aPaterno) {
        this.aPaterno = aPaterno;
    }

    public String getaMaterno() {
        return aMaterno;
    }

    public void setaMaterno(String aMaterno) {
        this.aMaterno = aMaterno;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CodCliente: " + codCliente +
               "\nNombre: " + nombre +
               "\nApellido Paterno: " + aPaterno +
               "\nApellido Materno: " + aMaterno +
               "\nCorreo: " + correo +
               "\nTelefono: " + telefono + "\n";
    }
}