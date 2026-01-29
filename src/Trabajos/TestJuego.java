package AcademiaDeMagia;

public class TestJuego {

    public static void main(String[] args) {

        //Crear mago
        Mago n1 = new Mago("Henry", 100);

        //Crear hechizos
        Hechizo h1 = new Hechizo("bola de fuego", 20, 7);
        Hechizo h2 = new Hechizo("escudo mágico", 15, 5);
        Hechizo h3 = new Hechizo("rayo eléctrico", 25, 9);

        //Aprender hechizos
        n1.aprenderHechizo(h1);
        n1.aprenderHechizo(h2);
        n1.aprenderHechizo(h3);

        //Crear pruebas
        Prueba p1 = new Prueba("romper muro", 5, 10);
        Prueba p2 = new Prueba("derrotar orco", 8, 15);
        Prueba p3 = new Prueba("derrotar elfo oscuro", 10, 20);

        //Estado inicial
        System.out.println("Energía inicial: " + n1.getEnergia());

        //Enfrentarse a las pruebas
        n1.lanzarHechizo("bola de fuego", p1);
        System.out.println("Energía actual: " + n1.getEnergia());

        n1.lanzarHechizo("rayo eléctrico", p2);
        System.out.println("Energía actual: " + n1.getEnergia());

        n1.lanzarHechizo("rayo eléctrico", p3);
        System.out.println("Energía actual: " + n1.getEnergia());

        //Comprobación final, para ver si el mago tiene energia o no
        if (n1.getEnergia() <= 0) {
            System.out.println("Energia insuficiente");
        } else {
            System.out.println("El mago ha podido realizar todos los hechizos");
        }
    }
}
