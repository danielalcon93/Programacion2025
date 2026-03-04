package PracticaExamen.Entidades;

import java.time.LocalDate;

public class PlanEstandar extends Plan{

    private Integer numMaxParticipantes;
    private boolean incluyeAlojamiento;

    //Constructor
    public PlanEstandar(String titulo, String descripcion, CategoriaPlan categoria, LocalDate fechaPropuesta, LocalDate fechaRealizacion,
                        Double presupuestoEstimado, Participante proponente, Integer numMaxParticipantes, boolean incluyeAlojamiento) {
        super(titulo, descripcion, categoria, fechaPropuesta, fechaRealizacion, presupuestoEstimado, proponente);
        this.numMaxParticipantes = numMaxParticipantes;
        this.incluyeAlojamiento = incluyeAlojamiento;
    }

    //Getter y setter
    public Integer getNumMaxParticipantes() {
        return numMaxParticipantes;
    }

    public void setNumMaxParticipantes(Integer numMaxParticipantes) {
        this.numMaxParticipantes = numMaxParticipantes;
    }

    public boolean isIncluyeAlojamiento() {
        return incluyeAlojamiento;
    }

    public void setIncluyeAlojamiento(boolean incluyeAlojamiento) {
        this.incluyeAlojamiento = incluyeAlojamiento;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("PlanEstandar{");
        sb.append("numMaxParticipantes=").append(numMaxParticipantes);
        sb.append(", incluyeAlojamiento=").append(incluyeAlojamiento);
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
        Double costoPersona = presupuestoEstimado / numMaxParticipantes;

        String resultado = "Presupuesto total: " + presupuestoEstimado +
                "|| Coste por persona: " + costoPersona;

        if(incluyeAlojamiento){
            resultado += ("Alojamiento incluído");
        }
        return resultado;
    }

}
