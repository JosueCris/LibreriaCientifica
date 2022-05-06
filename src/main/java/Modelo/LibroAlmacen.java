package Modelo;

import java.io.Serializable;

public class LibroAlmacen implements Serializable {
    private Libros codLibroAlmacen;
    private Almacen codRepisa;

    public LibroAlmacen() {

    }

    public LibroAlmacen(Libros codLibroAlmacen, Almacen codRepisa) {
        this.codLibroAlmacen = codLibroAlmacen;
        this.codRepisa = codRepisa;
    }

    public Libros getCodLibroAlmacen() {
        return codLibroAlmacen;
    }

    public void setCodLibroAlmacen(Libros codLibroAlmacen) {
        this.codLibroAlmacen = codLibroAlmacen;
    }

    public Almacen getCodRepisa() {
        return codRepisa;
    }

    public void setCodRepisa(Almacen codRepisa) {
        this.codRepisa = codRepisa;
    }

    @Override
    public String toString() {
        return "CodLibroAlmacen: " + codLibroAlmacen +
               "CodRepisa: " + codRepisa + "\n";
    }
}