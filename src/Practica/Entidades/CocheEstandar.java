package Entidades;

import static Entidades.TipoCoche.SEDAN;

public class CocheEstandar extends Coche {

    private boolean aireAcondicionado;

    //Constructor
    public CocheEstandar(String marca, String modelo, String matricula, int anio, TipoCombustible combustible, TipoCoche tipo, Double precioBase, boolean aireAcondicionado) {
        super(marca, modelo, matricula, anio, combustible, TipoCoche.SEDAN, precioBase);
        this.aireAcondicionado = aireAcondicionado;
    }

    //Getter y setter
    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CocheEstandar{");
        sb.append("aireAcondicionado=").append(aireAcondicionado);
        sb.append(", id=").append(id);
        sb.append(", marca='").append(marca).append('\'');
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", matricula='").append(matricula).append('\'');
        sb.append(", anio=").append(anio);
        sb.append(", combustible=").append(combustible);
        sb.append(", tipo=").append(tipo);
        sb.append(", precioBase=").append(precioBase);
        sb.append(", disponible=").append(disponible);
        sb.append('}');
        return sb.toString();
    }

    //Metodos implementados
    /**
     * Calculamos el precio base, si tiene aire acondicionado se le suma 5 por el número de días
     * @param dias
     * @return
     */
    @Override
    public double calcularPrecioAlquiler(int dias) {
        double precio = precioBase * dias;

        if(aireAcondicionado){
            precio += 5 * dias;
        }
        return precio;
    }
}
