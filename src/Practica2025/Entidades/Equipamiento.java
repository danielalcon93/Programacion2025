package Practica2025.Entidades;

public class Equipamiento extends ProductoBase {

    private String deporte;

    //Constructor
    public Equipamiento(String codigo, String nombre, Double precio, Integer stock, String deporte) {
        super(codigo, nombre, precio, stock);
        this.deporte = deporte;
    }

    //Getter y setter
    public String getDeporte() {
        return deporte;
    }

    public void setDeporte(String deporte) {
        this.deporte = deporte;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Equipamiento{");
        sb.append("deporte='").append(deporte).append('\'');
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
                "|| Deporte: " + getDeporte();
    }

}
