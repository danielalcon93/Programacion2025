package Entidades;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Alquiler implements Enviable {
    private static Long inc = 1L;

    private Long id;
    private Cliente cliente;
    private Coche coche;
    private LocalDate fechaInicio;
    private LocalDate fechaFin;
    private Double precioTotal;

    //Constructores
    public Alquiler(Cliente cliente, Coche coche, LocalDate fechaInicio, LocalDate fechaFin) {
        if(!coche.isDisponible()) {
            throw new IllegalArgumentException("El coche no esta disponible");
        }

        this.id = inc++;
        this.cliente = cliente;
        this.coche = coche;
        this.fechaInicio = fechaInicio;
        this.fechaFin = fechaFin;

        //Calcular los días
        long dias = ChronoUnit.DAYS.between(fechaInicio, fechaFin);

        //Calcular precio
        this.precioTotal = coche.calcularPrecioAlquiler((int) dias);

        //Marcar coche como no disponible
        coche.setDisponible(false);
    }

    //Getter y setter
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Coche getCoche() {
        return coche;
    }

    public void setCoche(Coche coche) {
        this.coche = coche;
    }

    public LocalDate getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(LocalDate fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public LocalDate getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(LocalDate fechaFin) {
        this.fechaFin = fechaFin;
    }

    public Double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(Double precioTotal) {
        this.precioTotal = precioTotal;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Alquiler{");
        sb.append(", id=").append(id);
        sb.append(", cliente=").append(cliente);
        sb.append(", coche=").append(coche);
        sb.append(", fechaInicio=").append(fechaInicio);
        sb.append(", fechaFin=").append(fechaFin);
        sb.append(", precioTotal=").append(precioTotal);
        sb.append('}');
        return sb.toString();
    }

    //Metodos
    public void cancelarAlquiler() {
        if (!coche.isDisponible()) {
            coche.setDisponible(true);
        }
    }

    @Override
    public String crearEmail() {
        return "Cliente: " + cliente.getNombre() + " " + cliente.getApellido() +
                " || Coche: " + coche.getMarca() + " " + coche.getModelo() +
                " (" + coche.getMatricula() + ")" +
                " || desde: " + fechaInicio +
                " || hasta: " + fechaFin +
                " || precio: " + precioTotal + "€";
    }
}
