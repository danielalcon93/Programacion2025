package Practica2025.Entidades;

public class RopaDeportiva extends ProductoBase {


    private String material;

    //Constructor
    public RopaDeportiva(String codigo, String nombre, Double precio, int stock, String material) {
        super(codigo, nombre, precio, stock);
        this.material = material;
    }

    //Getter y setter
    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("RopaDeportiva{");
        sb.append("material='").append(material).append('\'');
        sb.append(", Codigo='").append(Codigo).append('\'');
        sb.append(", Nombre='").append(Nombre).append('\'');
        sb.append(", precio=").append(precio);
        sb.append(", stock=").append(stock);
        sb.append('}');
        return sb.toString();
    }


    //Metodo abstracto
    public String getInfo() {
        return "Codigo: " + getCodigo() +
                "|| Nombre: " + getNombre() +
                "|| Precio: " + getPrecio() +
                "|| Stock: " + getStock() +
                "|| Material: " + getMaterial();
    }
}
