package Juego.App;

import Juego.Jugador.Clase;
import Juego.Jugador.Jugador;
import Juego.Partida.nuevaPartida;

public class TestJuego {

    public static void main(String[] args) {

        //Creamos al jugador
        Jugador jugador = new Jugador("Stanislav", Clase.CABALLERO);

        //Creamos la partida
        nuevaPartida partida = new nuevaPartida(jugador);


        int enemigosEliminados = 0;
        boolean victoria = false;
        boolean derrota = false;

        // 30 turnos alternando jugador y enemigos
        for (int i = 0; i < 30; i++) {
        // Turnos pares → jugador
        if (i % 2 == 0) {
            victoria = partida.turnoJugador();

        if (victoria) {
            break;
            }
        enemigosEliminados++;
        }
            // Turnos impares → enemigos
        else {
            derrota = partida.turnoEnemigos();

        if (derrota) {
            break;
            }
        }
    }

        // Resultado final
        if (victoria) {
            IO.println("El jugador ha ganado la partida.");
        } else if (derrota) {
            IO.println("El jugador ha perdido la partida.");
        } else {
            IO.println("La partida terminó tras 30 turnos.");
        }

        IO.println("Enemigos eliminados: " + enemigosEliminados);
    }
}
