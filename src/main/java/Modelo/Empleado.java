package Modelo;

import java.io.Serializable;

public class Empleado implements Serializable {
    private int codEmpleado;
    private String nombre;
    private String aPaterno;
    private String aMaterno;
    private String genero;
    private String fechaNacimiento;
    private String fechaContratacion;
    private String direccion;
    private String correo;
    private String telefono;
    private int eCargo;

    public Empleado() {

    }

    public Empleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
    }

    public Empleado(String nombre, String aPaterno, String aMaterno, String genero, String fechaNacimiento, String fechaContratacion, String direccion, String correo, String telefono, int eCargo) {
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContratacion = fechaContratacion;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.eCargo = eCargo;
    }

    public Empleado(int codEmpleado, String nombre, String aPaterno, String aMaterno, String genero, String fechaNacimiento, String fechaContratacion, String direccion, String correo, String telefono, int eCargo) {
        this.codEmpleado = codEmpleado;
        this.nombre = nombre;
        this.aPaterno = aPaterno;
        this.aMaterno = aMaterno;
        this.genero = genero;
        this.fechaNacimiento = fechaNacimiento;
        this.fechaContratacion = fechaContratacion;
        this.direccion = direccion;
        this.correo = correo;
        this.telefono = telefono;
        this.eCargo = eCargo;
    }

    public int getCodEmpleado() {
        return codEmpleado;
    }

    public void setCodEmpleado(int codEmpleado) {
        this.codEmpleado = codEmpleado;
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

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(String fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getFechaContratacion() {
        return fechaContratacion;
    }

    public void setFechaContratacion(String fechaContratacion) {
        this.fechaContratacion = fechaContratacion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
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

    public int geteCargo() {
        return eCargo;
    }

    public void seteCargo(int eCargo) {
        this.eCargo = eCargo;
    }

    @Override
    public String toString() {
        return "CodEmpleado" + codEmpleado +
               "\nNombre: " + nombre +
               "\nApellido Paterno: " + aPaterno +
               "\nApellido Materno: " + aMaterno +
               "\nGenero: " + genero +
               "\nFecha Nacimiento: " + fechaNacimiento +
               "\nFecha Contratacion:" + fechaContratacion +
               "\nDireccion: " + direccion +
               "\nCorreo: " + correo +
               "\nTelefono: " + telefono +
               "\nCargo: " + eCargo + "\n";
    }
}