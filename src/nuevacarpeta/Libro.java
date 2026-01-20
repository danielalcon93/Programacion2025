package Ejercicios;

import java.util.Objects;

public class Libro {

    // Atributos
    private String isbn;
    private String titulo;
    private String autor;
    private Integer numPaginas;
    private Double precioCompra;
    private Double precioVenta;
    private boolean vendido;

    //Constructor
    public Libro(String isbn, String titulo, String autor, int numPaginas, boolean vendido) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPaginas = numPaginas;
        this.precioCompra = 0.0;
        this.precioVenta = 0.0;
        this.vendido = vendido;
    }

    //Getters and setters
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

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    public Double getPrecioCompra() {
        return precioCompra;
    }

    public void setPrecioCompra(Double precioCompra) {
        this.precioCompra = precioCompra;
    }

    public Double getPrecioVenta() {
        return precioVenta;
    }

    public void setPrecioVenta(Double precioVenta) {
        this.precioVenta = precioVenta;
    }

    public boolean isVendido() {
        return vendido;
    }

    public void setVendido(boolean vendido) {
        this.vendido = vendido;
    }

    //tostring
    @Override
    public String toString() {
        return "El libro " + titulo +
                " con ISBN " + isbn +
                " creado por el autor " + autor +
                " tiene " + numPaginas + " páginas";
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Libro libro = (Libro) o;
        return Objects.equals(isbn, libro.isbn);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(isbn);
    }
}
