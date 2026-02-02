package EjercicioPropuesto.Servicios;

import EjercicioPropuesto.notificacion.Notificacion;

import java.util.ArrayList;

public class SistemaNotificaciones {

    private ArrayList<Notificacion> notificaciones;

    //Constructor
    public SistemaNotificaciones() {
        this.notificaciones = new ArrayList<>();
    }

    //Getter
    public ArrayList<Notificacion> getNotificaciones() {
        return notificaciones;
    }

    //Metodos
    public void añadirNotificacion(Notificacion notificacion) {
        notificaciones.add(notificacion);
    }

    public void EliminarNotificacion(Notificacion notificacion) {
        notificaciones.remove(notificacion);
    }

    public void enviarTodas() {
        System.out.println("Se van a enviar todas las notificaciones");
        for (Notificacion n  : notificaciones) {
            n.enviar();
        }
    }

    public void pintarResumen() {
        System.out.println("Resumen de notificaciones");
        for (Notificacion n : notificaciones) {
            n.pintarResumen();
        }
    }

    public void pintarResumenPrioridad(int prioridad) {
        System.out.println("Notificaciones por prioridad: " + prioridad);
        for (Notificacion n : notificaciones) {
            if (n.getPrioridad() == prioridad) {
                n.pintarResumen();
            }
        }
    }


    public void pintarLeidas() {
        System.out.println("Notificaciones leidas");
        for (Notificacion n : notificaciones) {
            if(n.isLeida()) {
            n.pintarResumen();
            }
        }
    }

    public int numeroPendientes() {
        System.out.println("Notificaciones pendientes");
        int contador = 0;
        for (Notificacion n : notificaciones) {
            if (!n.isLeida()) {
                contador++;
            }
        }
        return contador;
    }
}
