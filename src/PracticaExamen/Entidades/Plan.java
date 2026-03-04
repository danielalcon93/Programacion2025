package PracticaExamen.Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Objects;

public abstract class Plan {
    private static Long contador = 0L;

    protected Long id;
    protected String titulo;
    protected String descripcion;
    protected CategoriaPlan categoria;
    protected LocalDate fechaPropuesta;
    protected LocalDate fechaRealizacion;
    protected Double presupuestoEstimado;
    protected EstadoPlan estado = EstadoPlan.ABIERTO;
    protected Participante proponente;

    //Constructor
    public Plan(String titulo, String descripcion, CategoriaPlan categoria, LocalDate fechaPropuesta, LocalDate fechaRealizacion, Double presupuestoEstimado, Participante proponente) {
        if (fechaRealizacion.isBefore(fechaPropuesta)) {
            throw new IllegalArgumentException("La fecha de realización no puede ser anterior a la de propuesta.");
        }
        this.id = ++contador;
        this.titulo = titulo;
        this.descripcion = descripcion;
        this.categoria = categoria;
        this.fechaPropuesta = fechaPropuesta;
        this.fechaRealizacion = fechaRealizacion;
        this.presupuestoEstimado = presupuestoEstimado;
        this.proponente = proponente;
    }

    //Getter y setter


    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public CategoriaPlan getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaPlan categoria) {
        this.categoria = categoria;
    }

    public LocalDate getFechaPropuesta() {
        return fechaPropuesta;
    }

    public void setFechaPropuesta(LocalDate fechaPropuesta) {
        this.fechaPropuesta = fechaPropuesta;
    }

    public LocalDate getFechaRealizacion() {
        return fechaRealizacion;
    }

    public void setFechaRealizacion(LocalDate fechaRealizacion) {
        this.fechaRealizacion = fechaRealizacion;
    }

    public Double getPresupuestoEstimado() {
        return presupuestoEstimado;
    }

    public void setPresupuestoEstimado(Double presupuestoEstimado) {
        this.presupuestoEstimado = presupuestoEstimado;
    }

    public EstadoPlan getEstado() {
        return estado;
    }

    public void setEstado(EstadoPlan estado) {
        this.estado = estado;
    }

    public Participante getProponente() {
        return proponente;
    }

    public void setProponente(Participante proponente) {
        this.proponente = proponente;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Plan{");
        sb.append("id=").append(id);
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

    //Equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Plan plan = (Plan) o;
        return Objects.equals(id, plan.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    //Metodo
    public int getDiasHastaRealizacion() {
        return (int) ChronoUnit.DAYS.between(LocalDate.now(), fechaRealizacion);
    }

    //Metodo abstracto
    public abstract String getResumenEconomico();

}
