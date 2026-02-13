package Juego.Partida;

import Juego.Jugador.Arma;
import Juego.Jugador.Jugador;
import Juego.Monstruo.Monstruo;
import Juego.Monstruo.MonstruoFinalNivel;

import java.util.ArrayList;

public class nuevaPartida {

    private Jugador jugador;
    private ArrayList<Monstruo> monstruos;

    //Constructor
    public nuevaPartida(Jugador jugador) {
        this.jugador = jugador;
        this.monstruos = new ArrayList<>();
    }


    //Getter
    public Jugador getJugador() {
        return jugador;
    }

    public void setJugador(Jugador jugador) {
        this.jugador = jugador;
    }

    public ArrayList<Monstruo> getMonstruos() {
        return monstruos;
    }

    public void setMonstruos(ArrayList<Monstruo> monstruos) {
        this.monstruos = monstruos;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("nuevaPartida{");
        sb.append("jugador=").append(jugador);
        sb.append(", monstruos=").append(monstruos);
        sb.append('}');
        return sb.toString();
    }


    //Metodos


    public void turnoEnemigos() {
        if (monstruos.size() == 0)
            return;
        Monstruo enemigo = monstruos.get(0);

        enemigo.golpear(jugador);
        if (jugador.getSalud() <= 0) {
            return;
        }
    }
}
