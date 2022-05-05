package Modelo;

import java.io.Serializable;

public class LibroAlmacen implements Serializable {
    private String codLibroAlmacen;
    private int codRepisa;

    public LibroAlmacen() {

    }

    public LibroAlmacen(String codLibroAlmacen) {
        this.codLibroAlmacen = codLibroAlmacen;
    }

    public LibroAlmacen(int codRepisa) {
        this.codRepisa = codRepisa;
    }

    public LibroAlmacen(String codLibroAlmacen, int codRepisa) {
        this.codLibroAlmacen = codLibroAlmacen;
        this.codRepisa = codRepisa;
    }

    public String getCodLibroAlmacen() {
        return codLibroAlmacen;
    }

    public void setCodLibroAlmacen(String codLibroAlmacen) {
        this.codLibroAlmacen = codLibroAlmacen;
    }

    public int getCodRepisa() {
        return codRepisa;
    }

    public void setCodRepisa(int codRepisa) {
        this.codRepisa = codRepisa;
    }

    @Override
    public String toString() {
        return "LibroAlmacen{" +
                "codLibroAlmacen='" + codLibroAlmacen + '\'' +
                ", codRepisa=" + codRepisa +
                '}';
    }
}