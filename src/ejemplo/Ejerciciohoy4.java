package tema1.EjerciciosPracticos;

import java.util.Scanner;

public class Ejerciciohoy4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Cuantas partidas quieres jugar (tienen que ser impares)");
        int partidas = sc.nextInt();
        int victoriasC = 0;
        int victoriasH = 0;

        for (int i = 1; i <= partidas; i++) {
            System.out.println("Partida " + i + "");

            int c1 = (int) (Math.random()*13)+1;
            int c2 = (int) (Math.random()*13)+1;
            int c3 = (int) (Math.random()*13)+1;

            int h1 = (int) (Math.random()*13)+1;
            int h2 = (int) (Math.random()*13)+1;
            int h3 = (int) (Math.random()*13)+1;

            System.out.println("Cubitus: " + c1 + "," + c2 + "," + c3);
            System.out.println("Humerus: " + h1 + "," + h2 + "," + h3);

            boolean coincide = false;
            if (c1 == h1 || c1 == h2 || c1 == h3) coincide = true;
            if (c2 == h1 || c2 == h2 || c2 == h3) coincide = true;
            if (c3 == h1 || c3 == h2 || c3 == h3) coincide = true;

            if (coincide) {
                System.out.println("Coinciden valores: Gana Cubitus");
                victoriasC++;
            }  else {
                System.out.println("No hay coincidencias: Gana Humerus");
                victoriasH++;
            }
        }

        System.out.println("Resultado final");
        System.out.println("Victorias Cubitus: " + victoriasC);
        System.out.println("Victorias Humerus: " + victoriasH);
        if (victoriasC > victoriasH) {
            System.out.println("Gana Cubitus");
        }  else if (victoriasH > victoriasC) {
            System.out.println("Gana Humerus");
        }   else {
            System.out.println("Empate");
        }
    }
}
