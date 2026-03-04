package PracticaExamen.Servicios;

public class PlanNoEncontradoException extends RuntimeException {
    public PlanNoEncontradoException(Long id) {
        super("Plan no encontrado: " + id);
    }
}
