package Practica2025.Entidades;

public interface Producto {

    String getCodigo();
    String getNombre();
    Double getPrecio();
    int getStock();
    void descontarStock(int cantidad);
    String getInfo();

}
