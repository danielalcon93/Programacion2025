package Tema7.Conjuntos;

public class Main {
    static void main() {

        //Crear una instancia de ranking
        Ranking ranking = new Ranking();

        //Creamos 7 jugadores
        Jugador n1 = new Jugador(1, "Ronaldo", "Brasil");
        Jugador n2 = new Jugador(2, "Pepe", "Portugal");
        Jugador n3 = new Jugador(3, "Zizou", "Francia");
        Jugador n4 = new Jugador(4, "Manolo", "España");
        Jugador n5 = new Jugador(5, "Patri", "España");
        Jugador n6 = new Jugador(6, "Mohamed", "Marruecos");
        Jugador n7 = new Jugador(7, "Cabron", "España");

        //Mostrar el ranking
        IO.println("Ranking actual");
        ranking.mostrarRanking();

        //Eliminar jugador
        ranking.eliminarJugador(n4);
        ranking.eliminarJugador(n7);

        //Mostrar ranking
        IO.println("Ranking actual");
        ranking.mostrarRanking();

        //Modificar puntuacion de un jugador (*, qué pasa en el TreeSet?)
        n1.setPuntos(350);

        //Mostrar ranking
        IO.println("Ranking actual");
        ranking.mostrarRanking();

        //Mostrar top 3
        IO.println("Top 3");
        for (Jugador j : ranking.)
    }
}
