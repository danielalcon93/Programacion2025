package Practica2024.Servicios;

import Practica2024.Entidades.Transportable;

import java.time.LocalDate;
import java.util.ArrayList;

public class Envio {

    private ArrayList<Transportable> items;
    private LocalDate fechaSalida;
    private LocalDate fechaLlegada;

    public Envio() {
        this.items = new ArrayList<>();
        this.fechaSalida = LocalDate.now();
        this.fechaLlegada = null;
    }

    public ArrayList<Transportable> getItems() {
        return items;
    }

    public void setItems(ArrayList<Transportable> items) {
        this.items = items;
    }

    public LocalDate getFechaSalida() {
        return fechaSalida;
    }

    public void setFechaSalida(LocalDate fechaSalida) {
        this.fechaSalida = fechaSalida;
    }

    public LocalDate getFechaLlegada() {
        return fechaLlegada;
    }

    public void setFechaLlegada(LocalDate fechaLlegada) {
        this.fechaLlegada = fechaLlegada;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Envio{");
        sb.append("items=").append(items);
        sb.append(", fechaSalida=").append(fechaSalida);
        sb.append(", fechaLlegada=").append(fechaLlegada);
        sb.append('}');
        return sb.toString();
    }

    public void agregarTransportable(Transportable item) {
        this.items.add(item);
    }


    public Double calcularCostoEnvio() {
        Double total = 0.0;

        for (Transportable t : this.items) {
            total += t.calcularCostoEnvio(false);
        }
        return total;
    }

    public void listarProductos() {
        for (Transportable t : this.items) {
            IO.println(t + " Coste " + t.calcularCostoEnvio(false));
        }
    }

    public long diasTrancurridos() {
        if(fechaLlegada == null) return 0;
        return java.time.temporal.ChronoUnit.DAYS.between(fechaSalida, fechaLlegada);
    }

    public void fechaLlegada() {
        this.fechaLlegada = fechaLlegada;
    }
}
