package PracticaExamen.Entidades;

import java.time.LocalDate;

public class PlanPremium extends Plan{

    private String empresa;
    private Double suplementoPorPersona;

    //Constructor
    public PlanPremium(String titulo, String descripcion, CategoriaPlan categoria, LocalDate fechaPropuesta, LocalDate fechaRealizacion,
                       Double presupuestoEstimado, Participante proponente, String empresa, Double suplementoPorPersona) {
        super(titulo, descripcion, categoria, fechaPropuesta, fechaRealizacion, presupuestoEstimado, proponente);
        this.empresa = empresa;
        this.suplementoPorPersona = suplementoPorPersona;
    }

    //Getter y setter
    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }

    public Double getSuplementoPorPersona() {
        return suplementoPorPersona;
    }

    public void setSuplementoPorPersona(Double suplementoPorPersona) {
        this.suplementoPorPersona = suplementoPorPersona;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PlanPremium{");
        sb.append("empresa='").append(empresa).append('\'');
        sb.append(", suplementoPorPersona=").append(suplementoPorPersona);
        sb.append(", id=").append(id);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", descripcion='").append(descripcion).append('\'');
        sb.append(", categoria=").append(categoria);
        sb.append(", fechaPropuesta=").append(fechaPropuesta);
        sb.append(", fechaRealizacion=").append(fechaRealizacion);
        sb.append(", presupuestoEstimado=").append(presupuestoEstimado);
        sb.append(", estado=").append(estado);
        sb.append(", proponente=").append(proponente);
        sb.append('}');
        return sb.toString();
    }

    //Metodo
    @Override
    public String getResumenEconomico() {
        Double costoTotal = presupuestoEstimado + suplementoPorPersona;

        String resultado = "Presupuesto base: " + presupuestoEstimado +
                "|| Suplemento por persona: " + suplementoPorPersona +
                "|| Coste total: " + costoTotal +
                "|| Nombre de la empresa: " + empresa;

        return resultado;
    }
}
