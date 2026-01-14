package Tareas;

import java.util.Objects;

public class Tarea {

    private String descripcion;
    private String resultado; // como "solucion" en Incidencia
    private EstadoTareas estado;

    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.estado = EstadoTareas.ASIGNADA;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public String getResultado() {
        return resultado;
    }

    public EstadoTareas getEstado() {
        return estado;
    }

    public void iniciar() {
        this.estado = EstadoTareas.EN_PROGRESO;
    }

    public void resolver(String resultado) {
        this.resultado = resultado;
        this.estado = EstadoTareas.RESUELTA;
    }

    @Override
    public String toString() {
        return "Tarea{" +
                "descripcion='" + descripcion + '\'' +
                ", resultado='" + (resultado == null ? "Sin resultado" : resultado) + '\'' +
                ", estado=" + estado +
                '}';
    }
}

