package GranjaInteligente;

import java.util.Objects;

public abstract class Maquina implements Operable {

    protected int idMaquina;
    protected String modelo;
    protected int estado;
    protected float horasUso;

    //Constructor
    public Maquina(int id, String modelo, int estado, float horasUso) {
        this.idMaquina = idMaquina;
        this.modelo = modelo;
        this.estado = 0;
        this.horasUso = 0;
    }

    //Constructor copia
    public Maquina(Maquina otra) {
        this.idMaquina = otra.idMaquina;
        this.modelo = otra.modelo;
        this.estado = 0;
        this.horasUso = 0;
    }

    //Getter y setter
    public int getIdMaquina() {
        return idMaquina;
    }

    public void setIdMaquina(int idMaquina) {
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
        return idMaquina == maquina.idMaquina;
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
          this.horasUso ++;
        }
    }

    //Metodo abstracto
    public abstract void imprimirTipo();

}
