package Practica2024.Entidades;

public class ProductoRefrigerado extends Producto {

    private Integer nivelRefrigeracion; //1 o 2

    public ProductoRefrigerado(String nombre, Double peso, Integer nivelRefrigeracion) {
        super(nombre, peso);
        this.nivelRefrigeracion = nivelRefrigeracion;
    }

    public Integer getNivelRefrigeracion() {
        return nivelRefrigeracion;
    }

    public void setNivelRefrigeracion(Integer nivelRefrigeracion) {
        this.nivelRefrigeracion = nivelRefrigeracion;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ProductoRefrigerado{");
        sb.append("nivelRefrigeracion=").append(nivelRefrigeracion);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Double calcularCostoEnvio(boolean esInternacional) {
        Double costoEnvio = super.calcularCostoEnvio(esInternacional);
        if (nivelRefrigeracion == 1) {
            costoEnvio += 10;
        } else if (nivelRefrigeracion == 2) {
            costoEnvio += 30;
        }
        return costoEnvio;
    }
}
