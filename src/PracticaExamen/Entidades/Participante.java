package PracticaExamen.Entidades;

import java.util.ArrayList;

public class Participante extends Persona {

    private String alias;
    private ArrayList<Voto> votosEmitidos;

    //Constructor
    public Participante(String nombre, String apellidos, String email, String alias) {
        super(nombre, apellidos, email);
        this.alias = alias;
        this.votosEmitidos = new ArrayList<>();
    }

    //Constructor copia
    public Participante(Participante otro) {
        super(otro.getNombre(), otro.getApellidos(), otro.getEmail());
        this.alias = otro.alias;
        this.votosEmitidos = new ArrayList<>(otro.votosEmitidos);
    }

    //Getter y setter
    public String getAlias() {
        return alias;
    }

    public void setAlias(String alias) {
        this.alias = alias;
    }

    public ArrayList<Voto> getVotosEmitidos() {
        return votosEmitidos;
    }

    public void setVotosEmitidos(ArrayList<Voto> votosEmitidos) {
        this.votosEmitidos = votosEmitidos;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Participante{");
        sb.append("alias='").append(alias).append('\'');
        sb.append(", votosEmitidos=").append(votosEmitidos);
        sb.append('}');
        return sb.toString();
    }

    //Metodos
    public void addVoto(Voto v) {
        this.votosEmitidos.add(v);
    }

    public int getTotalVotosEmitidos() {
        return this.votosEmitidos.size();
    }
}
