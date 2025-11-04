package tema1.EjerciciosPracticos;

import java.util.Scanner;

public class Ejerciciodehoy3 {

    public static void main(String[] args) {

        int turnos;
        int cubitus = 0;
        int humerus = 0;

        Scanner sc=new Scanner(System.in);
        System.out.println("Turnos");
        turnos=sc.nextInt();

        for(int i=1;i<=turnos;i++) {
            int dc = (int) (Math.random()*6)+1;
            int dh = (int) (Math.random()*6)+1;
            System.out.println("Cubitus: " + dc);
            System.out.println("Humerus: " + dh);

            if ((dc % 2) == (dh % 2)) {
                cubitus += dc + dh;
            } else {
                humerus += dc + dh;
            }
        }
            System.out.println("Puntuación final");
            System.out.println("Puntos cubitus: " + cubitus);
            System.out.println("Puntos humerus: " + humerus);
    }
}
