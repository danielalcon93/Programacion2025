package Entidades;

public class CochePremium extends Coche {

    private boolean gps;
    private boolean seguroExtra;

    //Constructor
    public CochePremium(String marca, String modelo, String matricula, int anio, TipoCombustible combustible, TipoCoche tipo, Double precioBase, boolean gps, boolean seguroExtra) {
        super(marca, modelo, matricula, anio, combustible, TipoCoche.DEPORTIVO, precioBase);
        this.gps = gps;
        this.seguroExtra = seguroExtra;
    }

    //Getter y setter
    public boolean isGps() {
        return gps;
    }

    public void setGps(boolean gps) {
        this.gps = gps;
    }

    public boolean isSeguroExtra() {
        return seguroExtra;
    }

    public void setSeguroExtra(boolean seguroExtra) {
        this.seguroExtra = seguroExtra;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CochePremium{");
        sb.append("gps=").append(gps);
        sb.append(", seguroExtra=").append(seguroExtra);
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

    //Metodo implementado
    @Override
    public double calcularPrecioAlquiler(int dias) {
        double precio = precioBase * dias;

        //20% premium
        precio *= 1.20;

        //Extras
        if (this.gps) {
            precio += 10 * dias;
        }
        if (this.seguroExtra) {
            precio += 15 * dias;
        }
        return precio;
    }
}
