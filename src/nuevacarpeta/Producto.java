package Ejercicios;

import java.util.Objects;

public class Producto {

    private Integer id;
    private String descripcion;
    private Double precio;
    private Integer unidadesDisponibles;
    private Integer stockMaximo;
    private Double descuento;

    //Constructor por defecto
    public Producto() {
        this.id = 0;
        this.descuento = 0.0;
        this.stockMaximo = 0;
        this.unidadesDisponibles = 0;
        this.precio = 0.0;
        this.descripcion = "";
    }

    //Constructor parametrizado
    public Producto(Integer id, String descripcion, Double precio, Integer unidadesDisponibles, Integer stockMaximo, Double descuento) {
        this.id = id;
        this.descripcion = descripcion;
        this.precio = precio;
        this.unidadesDisponibles = unidadesDisponibles;
        this.stockMaximo = stockMaximo;
        this.descuento = descuento;
    }

    //Getters and setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Integer getUnidadesDisponibles() {
        return unidadesDisponibles;
    }

    public void setUnidadesDisponibles(Integer unidadesDisponibles) {
        this.unidadesDisponibles = unidadesDisponibles;
    }

    public Integer getStockMaximo() {
        return stockMaximo;
    }

    public void setStockMaximo(Integer stockMaximo) {
        this.stockMaximo = stockMaximo;
    }

    public Double getDescuento() {
        return descuento;
    }

    public void setDescuento(Double descuento) {
        this.descuento = descuento;
    }

    //tostring
    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", descripcion='" + descripcion + '\'' +
                ", precio=" + precio +
                ", unidadesDisponibles=" + unidadesDisponibles +
                ", stockMaximo=" + stockMaximo +
                ", descuento=" + (descuento * 100) + "%" +
                '}';
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Producto producto = (Producto) o;
        return Objects.equals(id, producto.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    //Metodos
    public boolean vender(int cantidad) {
        if (cantidad <= 0) {
            return false;
        }
        if (cantidad > unidadesDisponibles) {
            return false;
        }
        unidadesDisponibles -= cantidad;
        return true;
    }

    public int reponer() {
        int cantidadRepuesta = stockMaximo - unidadesDisponibles;
        unidadesDisponibles = stockMaximo;
        return cantidadRepuesta;
    }


}