package Ejercicios;

import java.util.ArrayList;

public class Libreria {

    private ArrayList<Libro> libros;

    //Constructor
    public Libreria() {
        libros = new ArrayList<>(1000);
    }

    //Metodos
    public void adquirirLibro(Libro libro, double precioCompra) {
        libro.setPrecioCompra(precioCompra);
        libros.add(libro);
    }

    public void venderLibro(Libro libro, double precioVenta) {
        libro.setPrecioVenta(precioVenta);
        libro.setVendido(true);
    }

    public double calcularGanancias() {
        double ganancias = 0;

        for (Libro libro : libros) {
            if (libro.isVendido()) {
                ganancias += libro.getPrecioVenta() - libro.getPrecioCompra();
            }
        }
        return ganancias;
    }

}
