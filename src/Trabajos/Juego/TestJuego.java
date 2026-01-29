package Juego;

public class TestJuego {

    public static void main(String[] args) {
        //Crear jugador
        Jugador jugador = new Jugador("Arthas", Clase.CABALLERO);

        //Crear armas
        Arma espada = new Arma("Espada larga", 25, false, Tipo.ESPADA);
        Arma hacha = new Arma("Hacha de guerra", 30, false, Tipo.HACHA);

        //Equipar armas
        jugador.equipar(espada);
        jugador.equipar(hacha);

        System.out.println("Jugador inicial:");
        System.out.println(jugador);
        System.out.println("-----------------------");

        //Crear monstruos (algunos fáciles)
        Monstruo goblin = new Monstruo("Goblin", 5);
        goblin.setNivel(1);

        Monstruo fantasma = new Monstruo("Fantasma", 7);
        fantasma.setNivel(2);

        Monstruo troll = new Monstruo("Troll", 20);
        troll.setNivel(5);

        Monstruo demonio = new Monstruo("Demonio", 35);
        demonio.setNivel(8);

        //Combates
        combatir(jugador, goblin);
        combatir(jugador, fantasma);
        combatir(jugador, troll);
        combatir(jugador, demonio);

        //Estado final
        System.out.println("Estado final del jugador:");
        System.out.println(jugador);
        }

        //Método de combate
        public static void combatir(Jugador jugador, Monstruo monstruo) {

        System.out.println("Combate contra " + monstruo.getNombre());
        System.out.println(monstruo);

        while (jugador.getSalud() > 0 && monstruo.getSalud() > 0) {

        // Ataca el jugador
            jugador.golpear(monstruo);

            if (jugador.comprobarMuerte(monstruo)) {
                System.out.println(monstruo.getNombre() + " ha sido derrotado");
                jugador.subirExperiencia(monstruo);
                System.out.println("Experiencia: " + jugador.getExperiencia());
                System.out.println("Nivel: " + jugador.getNivel());
                return;
                }

        // Ataca el monstruo
        monstruo.golpear(jugador);

        if (jugador.getSalud() <= 0) {
            System.out.println("El jugador ha muerto");
            return;
            }
        }
        }
}
