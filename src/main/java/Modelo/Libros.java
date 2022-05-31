package Modelo;

import java.io.Serializable;

public class Libros implements Serializable {
    private String isbn;
    private String titulo;
    private int anioEdicion;
    private String rEditorial;
    private String rIdioma;
    private int numeroPaginas;
    private String rMateria;
    private double precio;
    private String sinopsis;
    private int rEstante;
    private Boolean status;

    public Libros() {

    }

    public Libros(String isbn) {
        this.isbn = isbn;
    }

    public Libros(String titulo, int anioEdicion, String rEditorial, String rIdioma, int numeroPaginas, String rMateria, double precio, String sinopsis, int rEstante, boolean status) {
        this.titulo = titulo;
        this.anioEdicion = anioEdicion;
        this.rEditorial = rEditorial;
        this.rIdioma = rIdioma;
        this.numeroPaginas = numeroPaginas;
        this.rMateria = rMateria;
        this.precio = precio;
        this.sinopsis = sinopsis;
        this.rEstante = rEstante;
        this.status = status;
    }

    public Libros(String isbn, String titulo, int anioEdicion, String rEditorial, String rIdioma, int numeroPaginas, String rMateria, double precio, String sinopsis, int rEstante, boolean status) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.anioEdicion = anioEdicion;
        this.rEditorial = rEditorial;
        this.rIdioma = rIdioma;
        this.numeroPaginas = numeroPaginas;
        this.rMateria = rMateria;
        this.precio = precio;
        this.sinopsis = sinopsis;
        this.rEstante = rEstante;
        this.status = status;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAnioEdicion() {
        return anioEdicion;
    }

    public void setAnioEdicion(int anioEdicion) {
        this.anioEdicion = anioEdicion;
    }

    public String getrEditorial() {
        return rEditorial;
    }

    public void setrEditorial(String rEditorial) {
        this.rEditorial = rEditorial;
    }

    public String getrIdioma() {
        return rIdioma;
    }

    public void setrIdioma(String rIdioma) {
        this.rIdioma = rIdioma;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getrMateria() {
        return rMateria;
    }

    public void setrMateria(String rMateria) {
        this.rMateria = rMateria;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }

    public int getrEstante() {
        return rEstante;
    }

    public void setrEstante(int rEstante) {
        this.rEstante = rEstante;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "ISBN: " + isbn +
               "\nTitulo: " + titulo +
               "\nAño Edicion: " + anioEdicion +
               "\nEditorial: " + rEditorial +
               "\nIdioma: " + rIdioma +
               "\nNumero Paginas: " + numeroPaginas +
               "\nMateria: " + rMateria +
               "\nPrecio: " + precio +
               "\nSinopsis: " + sinopsis  +
               "\nEstante: " + rEstante + "\n";
    }
}