package Practica2024.Entidades;

public class Producto implements Transportable {

    protected String nombre;
    protected Double peso;

    public Producto(String nombre, Double peso) {
        this.nombre = nombre;
        this.peso = peso;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Producto{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }


    @Override
    public Double calcularCostoEnvio(boolean esInternacional) {
        Double costoEnvio = 20 + (peso * 0.2);

        if (esInternacional) {
            costoEnvio += 30;
        }
        return costoEnvio;
    }

    @Override
    public boolean esEnvioInternacional() {
        return false;
    }
}
