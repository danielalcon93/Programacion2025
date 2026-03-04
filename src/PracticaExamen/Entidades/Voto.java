package PracticaExamen.Entidades;

import java.time.LocalDate;

public class Voto {
    private static Long contador = 0L;

    private Long id;
    private Participante participante;
    private Plan plan;
    private TipoVoto tipo;
    private LocalDate fechaVoto;
    private String comentario;

    public Voto(Participante participante, Plan plan, TipoVoto tipo, LocalDate fechaVoto, String comentario) {
        if (fechaVoto.isAfter(LocalDate.now())) {
            throw new IllegalArgumentException("La fecha del voto no puede ser futura.");
        }
        this.id = ++contador;
        this.participante = participante;
        this.plan = plan;
        this.tipo = tipo;
        this.fechaVoto = fechaVoto;
        this.comentario = comentario;
    }

    //Getter y setter

    public Long getId() {
        return id;
    }

    public Participante getParticipante() {
        return participante;
    }

    public void setParticipante(Participante participante) {
        this.participante = participante;
    }

    public Plan getPlan() {
        return plan;
    }

    public void setPlan(Plan plan) {
        this.plan = plan;
    }

    public TipoVoto getTipo() {
        return tipo;
    }

    public void setTipo(TipoVoto tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaVoto() {
        return fechaVoto;
    }

    public void setFechaVoto(LocalDate fechaVoto) {
        this.fechaVoto = fechaVoto;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Voto{");
        sb.append("participante=").append(participante);
        sb.append(", plan=").append(plan);
        sb.append(", fechaVoto=").append(fechaVoto);
        sb.append(", tipo=").append(tipo);
        sb.append('}');
        return sb.toString();
    }
}
