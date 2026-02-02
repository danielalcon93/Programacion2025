package Juego.Partida;

import Juego.Jugador.Jugador;
import Juego.Monstruo.Monstruo;

import java.util.ArrayList;

public class nuevaPartida {

    private Jugador jugador;
    private ArrayList<Monstruo> monstruos;

    //Constructor
    public nuevaPartida(Jugador jugador) {
        this.jugador = jugador;
        this.monstruos = new ArrayList<>();
        iniciarPartida();
    }

    //Getter


}
