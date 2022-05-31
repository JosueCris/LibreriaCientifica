package Modelo;

import java.io.Serializable;

public class NotaVenta implements Serializable {
    private int codNota;
    private String rCliente;
    private String rLibro;
    private int cantidad;
    private String tipoPago;
    private int rEmpleado;
    private String fechaCompra;
    private boolean status;

    public NotaVenta() {

    }

    public NotaVenta(int codNota) {
        this.codNota = codNota;
    }

    public NotaVenta(String rCliente, String rLibro, int cantidad, String tipoPago, int rEmpleado, String fechaCompra, boolean status) {
        this.rCliente = rCliente;
        this.rLibro = rLibro;
        this.cantidad = cantidad;
        this.tipoPago = tipoPago;
        this.rEmpleado = rEmpleado;
        this.fechaCompra = fechaCompra;
        this.status = status;
    }

    public NotaVenta(int codNota, String rCliente, String rLibro, int cantidad, String tipoPago, int rEmpleado, String fechaCompra, boolean status) {
        this.codNota = codNota;
        this.rCliente = rCliente;
        this.rLibro = rLibro;
        this.cantidad = cantidad;
        this.tipoPago = tipoPago;
        this.rEmpleado = rEmpleado;
        this.fechaCompra = fechaCompra;
        this.status = status;
    }

    public int getCodNota() {
        return codNota;
    }

    public void setCodNota(int codNota) {
        this.codNota = codNota;
    }

    public String getrCliente() {
        return rCliente;
    }

    public void setrCliente(String rCliente) {
        this.rCliente = rCliente;
    }

    public String getrLibro() {
        return rLibro;
    }

    public void setrLibro(String rLibro) {
        this.rLibro = rLibro;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public int getrEmpleado() {
        return rEmpleado;
    }

    public void setrEmpleado(int rEmpleado) {
        this.rEmpleado = rEmpleado;
    }

    public String getFechaCompra() {
        return fechaCompra;
    }

    public void setFechaCompra(String fechaCompra) {
        this.fechaCompra = fechaCompra;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "CodNota: " + codNota +
               "\nCleinte: " + rCliente +
               "\nLibro: " + rLibro +
               "\nCantidad: " + cantidad +
               "\nTipo Pago: " + tipoPago +
               "\nCodEmpleado: " + rEmpleado +
               "\nFecha Compra: " + fechaCompra + "\n";
    }
}