package Practica2025;

public interface Producto {

    String getCodigo();
    String getNombre();
    Double getPrecio();
    int getStock();
    void descontarStock(int cantidad);
    String getInfo();

}
