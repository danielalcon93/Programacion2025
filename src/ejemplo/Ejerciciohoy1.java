package tema1.EjerciciosPracticos;

import java.util.Scanner;

public class Ejerciciohoy1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Turnos: ");
        int turnos = sc.nextInt();

        int cubitus = 0;
        int humerus = 0;
        int acumulado = 0;

        for (int i = 1; i <= turnos; i++) {
            int dc = (int) (Math.random() * 6) + 1;
            int dh = (int) (Math.random() * 6) + 1;
            int suma = dc + dh;

            System.out.println("Tirada de cubitus: " + dc);
            System.out.println("Tirada de humerus: " + dh);

            if (dc > dh) {
                cubitus += suma + acumulado;
                acumulado = 0;
                System.out.println("Gana Cubitus " + suma);
            } else if (dh > dc) {
                humerus += suma + acumulado;
                acumulado = 0;
                System.out.println("Gana Humerus " + suma);
            } else {
                acumulado += suma;
                System.out.println("Empate, acumulado = " + acumulado);
            }
            System.out.println("Puntos de cubitus: " + cubitus);
            System.out.println("Puntos de humerus: " + humerus);
        }
        System.out.println("Puntuación total");
        System.out.println("Cubitus: " + cubitus);
        System.out.println("Humerus: " + humerus);

        if (cubitus > humerus) {
            System.out.println("Gana Cubitus");
        }   else if (humerus > cubitus) {
            System.out.println("Gana Humerus");
        }   else {
            System.out.println("Han empatado");
        }
    }
}


