package GranjaInteligente.entidades;

import GranjaInteligente.servicios.Operable;

import java.util.Objects;

public abstract class Maquina implements Operable {
    private static int inc = 1000;

    protected Integer idMaquina;
    protected String modelo;
    protected int estado;
    protected float horasUso;

    //Constructor
    public Maquina(String modelo) {
        this.idMaquina = inc++;
        this.modelo = modelo;
        this.estado = APAGADA;
        this.horasUso = 0;
    }


    //Getter y setter
    public Integer getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(Integer idMaquina) {
        this.idMaquina = idMaquina;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public float getHorasUso() {
        return horasUso;
    }

    public void setHorasUso(float horasUso) {
        this.horasUso = horasUso;
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Maquina maquina = (Maquina) o;
        return Objects.equals(idMaquina, maquina.idMaquina);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(idMaquina);
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Maquina{");
        sb.append("idMaquina=").append(idMaquina);
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", estado=").append(estado);
        sb.append(", horasUso=").append(horasUso);
        sb.append('}');
        return sb.toString();
    }

    //Metodos
    public void trabajar (float horas) {
        if (this.estado == ENCENDIDA) {
          this.horasUso += horas;
        }
    }

    //Metodo abstracto
    public abstract void imprimirTipo();

}
