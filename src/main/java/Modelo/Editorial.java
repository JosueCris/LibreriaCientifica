package Modelo;

import java.io.Serializable;

public class Editorial implements Serializable {
    private int codEditorial;
    private String nombreEditorial;
    private String contacto;
    private String telefono;
    private String correo;
    private String direccion;
    private String ciudad;
    private String pais;
    private boolean status;

    public Editorial() {

    }

    public Editorial(int codEditorial) {
        this.codEditorial = codEditorial;
    }

    public Editorial(String nombreEditorial, String contacto, String telefono, String correo, String direccion, String ciudad, String pais, boolean status) {
        this.nombreEditorial = nombreEditorial;
        this.contacto = contacto;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.status = status;
    }

    public Editorial(int codEditorial, String nombreEditorial, String contacto, String telefono, String correo, String direccion, String ciudad, String pais, boolean status) {
        this.codEditorial = codEditorial;
        this.nombreEditorial = nombreEditorial;
        this.contacto = contacto;
        this.telefono = telefono;
        this.correo = correo;
        this.direccion = direccion;
        this.ciudad = ciudad;
        this.pais = pais;
        this.status = status;
    }

    public int getCodEditorial() {
        return codEditorial;
    }

    public void setCodEditorial(int codEditorial) {
        this.codEditorial = codEditorial;
    }

    public String getNombreEditorial() {
        return nombreEditorial;
    }

    public void setNombreEditorial(String nombreEditorial) {
        this.nombreEditorial = nombreEditorial;
    }

    public String getContacto() {
        return contacto;
    }

    public void setContacto(String contacto) {
        this.contacto = contacto;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CodRepisa: " + codEditorial +
               "\nNombre Editorial: " + nombreEditorial +
               "\nContacto: " + contacto +
               "\nTelefono: " + telefono +
               "\nCorreo: " + correo +
               "\nDireccion: " + direccion +
               "\nCiudad: " + ciudad +
               "\nPais: " + pais + "\n";
    }
}