package Practica2025.Servicios;

import Practica2025.Entidades.Compra;
import Practica2025.Entidades.Producto;
import Practica2025.Entidades.ProductoBase;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tienda {

    private List<Producto> inventario;
    private List<Compra> historialCompras;


    //Constructor
    public Tienda() {
        this.inventario = new ArrayList<>();
        this.historialCompras = new ArrayList<>();
    }


    //getter y setter
    public List<Producto> getInventario() {
        return inventario;
    }

    public void setInventario(List<Producto> inventario) {
        this.inventario = inventario;
    }

    public List<Compra> getHistorialCompras() {
        return historialCompras;
    }

    public void setHistorialCompras(List<Compra> historialCompras) {
        this.historialCompras = historialCompras;
    }


    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Tienda{");
        sb.append("inventario=").append(inventario);
        sb.append(", historialCompras=").append(historialCompras);
        sb.append('}');
        return sb.toString();
    }


    //Metodos
    public void añadirProducto(Producto producto) {
        inventario.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        inventario.remove(producto);
    }


    public void actualizarProducto(String codigo, double nuevoPrecio, int nuevoStock) {
        for (Producto producto : inventario) {
            if (producto.getCodigo().equals(codigo)) {
                ((ProductoBase) producto).setPrecio(nuevoPrecio);
                ((ProductoBase) producto).setStock(nuevoStock);
            }
        }
    }

    public void realizarCompra(String codigo, int cantidad) throws StockInsuficienteException {
        for (Producto producto : inventario) {
            if (producto.getCodigo().equals(codigo)) {
                if (producto.getStock() < cantidad) {
                    throw new StockInsuficienteException("Stock insuficiente " + codigo);
                }

                producto.descontarStock(cantidad);

                Compra compra = new Compra(LocalDate.now(), producto, cantidad);
                historialCompras.add(compra);

                return;
            }
        }
    }

    public void mostrarInventario() {
        for (Producto producto : inventario) {
            System.out.println(producto);
        }
    }

    public void mostrarHistorialCompras() {
        for (Compra compra : historialCompras) {
            System.out.println(compra);
        }
    }

}
