package Entidades;

import java.time.LocalDate;

public class Cliente extends Persona {

    private String licenciaConducir;
    private LocalDate fechaObtencionLicencia;


    //Constructor
    public Cliente(String nombre, String apellido, String dni, String email, String direccion, String telefono, String licenciaConducir, LocalDate fechaObtencionLicencia) {
        super(nombre, apellido, dni, email, direccion, telefono);
        this.licenciaConducir = licenciaConducir;
        this.fechaObtencionLicencia = fechaObtencionLicencia;
    }

    //Constructor copia
    public Cliente(Cliente otro) {
        super(otro.nombre, otro.apellido, otro.dni, otro.email, otro.direccion, otro.telefono);
        this.licenciaConducir = otro.licenciaConducir;
        this.fechaObtencionLicencia = otro.fechaObtencionLicencia;
    }

    //Getter y setter
    public String getLicenciaConducir() {
        return licenciaConducir;
    }

    public void setLicenciaConducir(String licenciaConducir) {
        this.licenciaConducir = licenciaConducir;
    }

    public LocalDate getFechaObtencionLicencia() {
        return fechaObtencionLicencia;
    }

    public void setFechaObtencionLicencia(LocalDate fechaObtencionLicencia) {
        this.fechaObtencionLicencia = fechaObtencionLicencia;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Cliente{");
        sb.append("licenciaConducir='").append(licenciaConducir).append('\'');
        sb.append(", fechaObtencionLicencia=").append(fechaObtencionLicencia);
        sb.append(", id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellido='").append(apellido).append('\'');
        sb.append(", dni='").append(dni).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append(", direccion='").append(direccion).append('\'');
        sb.append(", telefono='").append(telefono).append('\'');
        sb.append('}');
        return sb.toString();
    }
}
