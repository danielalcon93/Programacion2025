package EjercicioPropuesto.NotificacionDeSistema;

import EjercicioPropuesto.notificacion.Notificacion;

public class NotificacionSistema extends Notificacion {

    private boolean requiereAccion;
    private TipoAlerta tipoAlerta;

    //Constructor
    public NotificacionSistema(String titulo, String mensaje, String usuario, boolean requiereAccion, TipoAlerta tipoAlerta) {
        super(titulo, mensaje, usuario);
        this.requiereAccion = requiereAccion;
        this.tipoAlerta = tipoAlerta;
    }

    public NotificacionSistema(NotificacionSistema otro) {
        super(otro);
        this.requiereAccion = otro.requiereAccion;
        this.tipoAlerta = otro.tipoAlerta;
    }

    //Getter y setter
    public boolean getRequiereAccion() {
        return requiereAccion;
    }

    public void setRequiereAccion(boolean requiereAccion) {
        this.requiereAccion = requiereAccion;
    }

    public TipoAlerta getTipoAlerta() {
        return tipoAlerta;
    }

    public void setTipoAlerta(TipoAlerta tipoAlerta) {
        this.tipoAlerta = tipoAlerta;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NotificacionSistema{");
        sb.append("requiereAccion='").append(requiereAccion).append('\'');
        sb.append(", tipoAlerta=").append(tipoAlerta);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", mensaje='").append(mensaje).append('\'');
        sb.append(", usuario='").append(usuario).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", leida=").append(leida);
        sb.append('}');
        return sb.toString();
    }

    //Metodos sobreescritos
    @Override
    public void enviar() {
        System.out.println("Alerta del sistema");
        System.out.println("Tipo : " + this.tipoAlerta);
        System.out.println("Mensaje: " + getMensaje());
        System.out.println("Requiere acción: " + (requiereAccion ? "Sí" : "No"));;
    }

    @Override
    public String getIcono() {
        switch (tipoAlerta) {
            case INFO:
                return "\u2139\uFE0F";
            case ERROR:
                return "\u274C";
            case SUCCESS:
                return "\u2705";
            default:
                return "Tipo de alerta no reconocida";
        }
    }

    @Override
    public int getPrioridad() {
        switch (tipoAlerta) {
            case ERROR:
                return 4;
            case INFO:
            case SUCCESS:
                return 2;
            default:
                return 0;
        }
    }
}
