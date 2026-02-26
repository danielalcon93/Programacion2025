package Tema7.Conjuntos;

import java.util.Objects;

public class Jugador implements Comparable<Jugador> {

    private int id;
    private String nickname;
    private int puntos;
    private int nivel;
    private String pais;

    //Constructor
    public Jugador(int id, String nickname, String pais) {
        this.id = id;
        this.nickname = nickname;
        this.puntos = 35;
        this.nivel = 1;
        this.pais = pais;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public int getPuntos() {
        return puntos;
    }

    public void setPuntos(int puntos) {
        this.puntos = puntos;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nickname='").append(nickname).append('\'');
        sb.append(", puntos=").append(puntos);
        sb.append(", nivel=").append(nivel);
        sb.append(", pais='").append(pais).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Jugador jugador = (Jugador) o;
        return Objects.equals(id, jugador.id);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    //Metodo
    public int compareTo(Jugador jugador) {
        int puntuacion = Integer.compare(jugador.puntos, this.puntos);

        if(puntuacion == 0) {
            return this.id.compareTo(jugador.id);
        }
        return puntuacion;
    }
}
