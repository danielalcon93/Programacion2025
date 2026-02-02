package EjercicioPropuesto.Aplicacion;

import EjercicioPropuesto.NotificacionDeSistema.NotificacionSistema;
import EjercicioPropuesto.NotificacionDeSistema.TipoAlerta;
import EjercicioPropuesto.NotificacionRedSocial.NotificacionRedSocial;
import EjercicioPropuesto.NotificacionRedSocial.TipoInteraccion;
import EjercicioPropuesto.Servicios.SistemaNotificaciones;
import EjercicioPropuesto.notificacionEmail.NotificacionEmail;

public class App {

    public static void main(String[] args) {

        //Creamos el objeto SistemaNotificaciones
        SistemaNotificaciones n1 = new SistemaNotificaciones();

        //Creamos los objetos de cada una de las notificaciones
        NotificacionEmail e1 = new NotificacionEmail("Bienvenida", "Gracias por registrarte en la plataforma", "Pedro", "admin@correo.com");
        NotificacionEmail e2 = new NotificacionEmail("Aviso de seguridad", "Se ha detectado un nuevo inicio de sesión", "Marcos", "seguridad@correo.com");

        NotificacionRedSocial r1 = new NotificacionRedSocial("Nueva Sugerencia", "Tienes una nueva sugerencia de amistad", "Raul", "usuario123", "facebook.com", TipoInteraccion.FOLLOW);
        NotificacionRedSocial r2 = new NotificacionRedSocial("Comentario nuevo", "Tienes un nuevo comentario", "Alberto", "usuario450", "instagram.com", TipoInteraccion.COMMENT);

        NotificacionSistema s1 = new NotificacionSistema("Actualización completada", "El sistema se ha actualizado", "Alejandro", false, TipoAlerta.SUCCESS);
        NotificacionSistema s2 = new NotificacionSistema("Error en el sistema", "Fallo grave en el sistema", "Lucas", true, TipoAlerta.ERROR);

        //Añadimos las notificaciones
        n1.añadirNotificacion(e1);
        n1.añadirNotificacion(e2);
        n1.añadirNotificacion(r1);
        n1.añadirNotificacion(r2);
        n1.añadirNotificacion(s1);
        n1.añadirNotificacion(s2);

        //Enviamos las notificaciones
        n1.enviarTodas();

        //Leer dos de ellas
        e1.marcarComoLeida();
        s1.marcarComoLeida();

        //Pintar notificaciones leidas
        n1.pintarLeidas();

        //Pintar el numero de notificaciones pendientes de leer
        System.out.println("Notificaciones pendientes de leer: " + n1.numeroPendientes());

        //Pintar el resumen de todas las notificaciones
        n1.pintarResumen();

    }

}
