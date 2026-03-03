package Practica2025.Entidades;

public abstract class ProductoBase implements Producto {

    protected String Codigo;
    protected String Nombre;
    protected Double precio;
    protected int stock;

    public ProductoBase(String codigo, String nombre, Double precio, int stock) {
        Codigo = codigo;
        Nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }

    public String getCodigo() {
        return Codigo;
    }

    public void setCodigo(String codigo) {
        Codigo = codigo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ProductoBase{");
        sb.append("Codigo=").append(Codigo);
        sb.append(", Nombre='").append(Nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", stock=").append(stock);
        sb.append('}');
        return sb.toString();
    }


    //Metodos
    @Override
    public void descontarStock(int cantidad) {
        stock -= cantidad;
    }

    //Metodos abstractos
    @Override
    public abstract String getInfo();

}

