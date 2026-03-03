package Practica2024.Entidades;

public class ProductoFragil extends Producto {

    private Integer nivelFragil; //1 o 2

    public ProductoFragil(String nombre, Double peso, Integer nivelFragil) {
        super(nombre, peso);
        this.nivelFragil = nivelFragil;
    }

    public Integer getNivelFragil() {
        return nivelFragil;
    }

    public void setNivelFragil(Integer nivelFragil) {
        this.nivelFragil = nivelFragil;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ProductoFragil{");
        sb.append("nivelFragil=").append(nivelFragil);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", peso=").append(peso);
        sb.append('}');
        return sb.toString();
    }

    @Override
    public Double calcularCostoEnvio(boolean esInternacional) {
        Double costoEnvio = super.calcularCostoEnvio(esInternacional);
        if (nivelFragil == 1) {
            costoEnvio += 20;
        } else if (nivelFragil == 2) {
            costoEnvio += 50;
        }
        return costoEnvio;
    }
}
