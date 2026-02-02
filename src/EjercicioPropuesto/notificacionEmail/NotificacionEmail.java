package EjercicioPropuesto.notificacionEmail;

import EjercicioPropuesto.notificacion.Notificacion;

public class NotificacionEmail extends Notificacion {

    private String remitente;
    private boolean tieneAdjuntos;

    //Constructor
    public NotificacionEmail(String titulo, String mensaje, String usuario, String remitente) {
        super(titulo, mensaje, usuario);
        this.remitente = remitente;
        this.tieneAdjuntos = false;
    }

    //Constructor copia
    public NotificacionEmail(NotificacionEmail otro) {
        super(otro);
        this.remitente = otro.remitente;
        this.tieneAdjuntos = otro.tieneAdjuntos;
    }

    //Getter
    public String getRemitente() {
        return remitente;
    }

    public boolean getTieneAdjuntos() {
        return tieneAdjuntos;
    }

    //Setter
    public void setRemitente(String remitente) {
        this.remitente = remitente;
    }

    public void setTieneAdjuntos(boolean tieneAdjuntos) {
        this.tieneAdjuntos = tieneAdjuntos;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NotificacionEmail{");
        sb.append("remitente='").append(remitente).append('\'');
        sb.append(", tieneAdjuntos='").append(tieneAdjuntos).append('\'');
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", mensaje='").append(mensaje).append('\'');
        sb.append(", usuario='").append(usuario).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", leida=").append(leida);
        sb.append('}');
        return sb.toString();
    }

    //Metodos
    @Override
    public void enviar() {
        System.out.println("Tipo formato email");
        System.out.println("De: " + this.remitente);
        System.out.println("Asunto: " + this.titulo);
        System.out.println("Mensaje: " + this.mensaje);
        System.out.println("Adjuntos: " + (this.tieneAdjuntos ? "Si" : "No"));
    }

    @Override
    public String getIcono() {
        return "\uD83D\uDCE7";
    }

    @Override
    public int getPrioridad() {
        if (tieneAdjuntos) {
            return 2;
        }
        return 1;
    }
}
