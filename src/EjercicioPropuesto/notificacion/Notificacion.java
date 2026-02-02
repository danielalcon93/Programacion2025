package EjercicioPropuesto.notificacion;

import EjercicioPropuesto.interfaz.Notificable;

import java.time.LocalDateTime;
import java.util.Objects;

public abstract class Notificacion implements Notificable {

    protected String titulo;
    protected String mensaje;
    protected String usuario;
    protected LocalDateTime fecha;
    protected boolean leida;

    //Constructor
    public Notificacion(String titulo, String mensaje, String usuario) {
        this.titulo = titulo;
        this.mensaje = mensaje;
        this.usuario = usuario;
        this.fecha = LocalDateTime.now();
        this.leida = false;
    }

    //Constructor copia
    public Notificacion(Notificacion otro) {
        this.titulo = otro.titulo;
        this.mensaje = otro.mensaje;
        this.usuario = otro.usuario;
        this.fecha = otro.fecha;
        this.leida = otro.leida;
    }

    //Getter
    public String getTitulo() {
        return titulo;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getUsuario() {
        return usuario;
    }

    public LocalDateTime getFecha() {
        return fecha;
    }

    public boolean isLeida() {
        return leida;
    }

    //Setter
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }


    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Notificion{");
        sb.append("titulo='").append(titulo).append('\'');
        sb.append(", mensaje='").append(mensaje).append('\'');
        sb.append(", usuario='").append(usuario).append('\'');
        sb.append(", fecha=").append(fecha);
        sb.append(", leida=").append(leida);
        sb.append('}');
        return sb.toString();
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Notificacion that = (Notificacion) o;
        return Objects.equals(titulo, that.titulo) && Objects.equals(usuario, that.usuario) && Objects.equals(fecha, that.fecha);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, usuario, fecha);
    }

    //Metodos propios
    public void marcarComoLeida() {
        this.leida = true;
    }

    public void pintarResumen() {
        System.out.println("Titulo: " + this.titulo + " fecha: " + this.fecha + " Estado: " + this.leida + " usuario: " + this.usuario);
    }

    //Metodos abstractos
    public abstract void enviar();

    public abstract String getIcono();

    public abstract int getPrioridad();


}
