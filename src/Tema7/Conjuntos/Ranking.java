package Tema7.Conjuntos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Ranking {

    private final Set<Jugador> jugadores = new HashSet<>();
    private final Set<Jugador> jugadoresOrdenados = new TreeSet<>(
            Comparator.comparing(Jugador::getPuntos).reversed().thenComparing(Jugador::getId));

    //Getter
    public Set<Jugador> getJugadores() {
        return jugadores;
    }

    public Set<Jugador> getJugadoresOrdenados() {
        return jugadoresOrdenados;
    }

    //Metodos
    public void mostrarJugadores() {
        IO.println("Jugadores disponibles:");
        for(Jugador j : jugadores){
            IO.println(j);
        }
    }


    public void mostrarRanking() {
        IO.println("Ranking:");
        for(Jugador j : jugadoresOrdenados){
            IO.println(j);
        }
    }


    public void registrarJugador(Jugador j) {
        jugadores.add(j);
        jugadoresOrdenados.add(j);
    }


    public void eliminarJugador(Jugador j) {
        jugadores.remove(j);
        jugadoresOrdenados.remove(j);
    }


}
