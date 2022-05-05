package Modelo;

import java.io.Serializable;

public class NotaVenta implements Serializable {
    private int codNota;
    private int rCliente;
    private String rLibro;
    private int cantidad;
    private String tipoPago;
    private int rEmpleado;
    private String fechaCompra;

    public NotaVenta() {

    }

    public NotaVenta(int codNota) {
        this.codNota = codNota;
    }

    public NotaVenta(int rCliente, String rLibro, int cantidad, String tipoPago, int rEmpleado, String fechaCompra) {
        this.rCliente = rCliente;
        this.rLibro = rLibro;
        this.cantidad = cantidad;
        this.tipoPago = tipoPago;
        this.rEmpleado = rEmpleado;
        this.fechaCompra = fechaCompra;
    }

    public NotaVenta(int codNota, int rCliente, String rLibro, int cantidad, String tipoPago, int rEmpleado, String fechaCompra) {
        this.codNota = codNota;
        this.rCliente = rCliente;
        this.rLibro = rLibro;
        this.cantidad = cantidad;
        this.tipoPago = tipoPago;
        this.rEmpleado = rEmpleado;
        this.fechaCompra = fechaCompra;
    }

    public int getCodNota() {
        return codNota;
    }

    public void setCodNota(int codNota) {
        this.codNota = codNota;
    }

    public int getrCliente() {
        return rCliente;
    }

    public void setrCliente(int rCliente) {
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

    @Override
    public String toString() {
        return "NotaVenta{" +
                "codNota=" + codNota +
                ", rCliente=" + rCliente +
                ", rLibro='" + rLibro + '\'' +
                ", cantidad=" + cantidad +
                ", tipoPago='" + tipoPago + '\'' +
                ", rEmpleado=" + rEmpleado +
                ", fechaCompra='" + fechaCompra + '\'' +
                '}';
    }
}