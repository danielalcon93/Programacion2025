package PracticaExamen.Servicios;

public class ParticipanteNoEncontradoException extends Exception {
    public ParticipanteNoEncontradoException(String email) {
        super("Participante no encontrado: " + email);
    }
}
