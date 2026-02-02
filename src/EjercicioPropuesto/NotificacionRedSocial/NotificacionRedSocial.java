package EjercicioPropuesto.NotificacionRedSocial;

import EjercicioPropuesto.notificacion.Notificacion;

public class NotificacionRedSocial extends Notificacion {

    private String nombreUsuarioOrigen;
    private String urlPublicacion;
    private TipoInteraccion tipoInteraccion;

    //Constructor
    public NotificacionRedSocial(String titulo, String mensaje, String usuario, String nombreUsuarioOrigen, String urlPublicacion, TipoInteraccion tipoInteraccion) {
        super(titulo, mensaje, usuario);
        this.nombreUsuarioOrigen = nombreUsuarioOrigen;
        this.urlPublicacion = urlPublicacion;
        this.tipoInteraccion = tipoInteraccion;
    }

    //Constructor copia
    public NotificacionRedSocial(NotificacionRedSocial otro) {
        super(otro);
        this.nombreUsuarioOrigen = otro.nombreUsuarioOrigen;
        this.urlPublicacion = otro.urlPublicacion;
        this.tipoInteraccion = otro.tipoInteraccion;
    }

    //Getter y setter
    public String getNombreUsuarioOrigen() {
        return nombreUsuarioOrigen;
    }

    public void setNombreUsuarioOrigen(String nombreUsuarioOrigen) {
        this.nombreUsuarioOrigen = nombreUsuarioOrigen;
    }

    public String getUrlPublicacion() {
        return urlPublicacion;
    }

    public void setUrlPublicacion(String urlPublicacion) {
        this.urlPublicacion = urlPublicacion;
    }

    public TipoInteraccion getTipoInteraccion() {
        return tipoInteraccion;
    }

    public void setTipoInteraccion(TipoInteraccion tipoInteraccion) {
        this.tipoInteraccion = tipoInteraccion;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NotificacionRedSocial{");
        sb.append("nombreUsuarioOrigen='").append(nombreUsuarioOrigen).append('\'');
        sb.append(", urlPublicacion='").append(urlPublicacion).append('\'');
        sb.append(", tipoInteraccion=").append(tipoInteraccion);
        sb.append(", titulo='").append(titulo).append('\'');
        sb.append(", mensaje='").append(mensaje).append('\'');
        sb.append(", usuario='").append(usuario).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", leida=").append(leida);
        sb.append('}');
        return sb.toString();
    }

    //Metodos escritos
    @Override
    public void enviar() {
        System.out.println("Nueva interacción redes");
        System.out.println("Usuario Origen : " + this.nombreUsuarioOrigen);
        System.out.println("Tipo: " + this.tipoInteraccion);
        System.out.println("Titulo: " + getTitulo());
        System.out.println("Mensaje: " + getMensaje());
    }

    @Override
    public String getIcono() {
        return "\uD83C\uDF10" + getIconoInteraccion();
    }

    @Override
    public int getPrioridad() {
        switch (tipoInteraccion) {
            case LIKE:
                return 1;
            case COMMENT:
            case SHARE:
                return 2;
            case FOLLOW:
                return 3;
            default:
                return 0;

        }
    }

    //Metodo auxiliar
    public String getIconoInteraccion() {
        switch (tipoInteraccion) {
            case LIKE:
                return "\uD83D\uDC4D";
            case COMMENT:
                return "\uD83D\uDCAC";
            case SHARE:
                return "\u27A1\uFE0F";
            case FOLLOW:
                return "\uD83D\uDC64";
            default:
                return "Interacción desconocida";
        }
    }
}


