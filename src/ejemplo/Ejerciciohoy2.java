package tema1.EjerciciosPracticos;

public class Ejerciciohoy2 {

    public static void main(String[] args) {

        //Humerus
        int dh1= (int) (Math.random()*6)+1;
        int dh2= (int) (Math.random()*6)+1;
        int dh3= (int) (Math.random()*6)+1;
        int dh4= (int) (Math.random()*6)+1;
        int dh5= (int) (Math.random()*6)+1;

        System.out.println("Tiradas de humerus");
        System.out.println("Primera tirada de humerus: " + dh1);
        System.out.println("Segunda tirada de humerus: " + dh2);
        System.out.println("Tercera tirada de humerus: " + dh3);
        System.out.println("Cuarta tirada de humerus: " + dh4);
        System.out.println("Quinta tirada de humerus: " + dh5);

        int minH = 6;
        int maxH = 1;

        if (dh1 < minH) {
            minH = dh1;
        } if (dh2 < minH) {
            minH = dh2;
        } if (dh3 < minH) {
            minH = dh3;
        } if (dh4 < minH) {
            minH = dh4;
        } if (dh5 < minH) {
            minH = dh5;
        } if (dh1 > maxH) {
            maxH = dh1;
        } if (dh2 > maxH) {
            maxH = dh2;
        } if (dh3 > maxH) {
            maxH = dh3;
        } if (dh4 > maxH) {
            maxH = dh4;
        } if (dh5 > maxH) {
            maxH = dh5;
        }

        int puntosH = 0;
        if (dh1 != minH && dh1 != maxH) {
            puntosH += dh1;
        } if (dh2 != minH && dh2 != maxH) {
            puntosH += dh2;
        } if (dh3 != minH && dh3 != maxH) {
            puntosH += dh3;
        } if (dh4 != minH && dh4 != maxH) {
            puntosH += dh4;
        } if (dh5 != minH && dh5 != maxH) {
            puntosH += dh5;
        }

        System.out.println("Min: " + minH);
        System.out.println("Max: " + maxH);
        System.out.println("Puntos Humerus: " + puntosH);

        //Cubitus
        int dc1= (int) (Math.random()*6)+1;
        int dc2= (int) (Math.random()*6)+1;
        int dc3= (int) (Math.random()*6)+1;
        int dc4= (int) (Math.random()*6)+1;
        int dc5= (int) (Math.random()*6)+1;

        System.out.println("Tiradas de Cubitus");
        System.out.println("Primera tirada de Cubitus: " + dc1);
        System.out.println("Segunda tirada de Cubitus: " + dc2);
        System.out.println("Tercera tirada de Cubitus: " + dc3);
        System.out.println("Cuarta tirada de Cubitus: " + dc4);
        System.out.println("Quinta tirada de Cubitus: " + dc5);

        int minC = 6;
        int maxC = 1;

        if (dc1 < minC) {
            minC = dc1;
        } if (dc2 < minC) {
            minC = dc2;
        } if (dc3 < minC) {
            minC = dc3;
        } if (dc4 < minC) {
            minC = dc4;
        } if (dc5 < minC) {
            minC = dc5;
        } if (dc1 > maxC) {
            maxC = dc1;
        } if (dc2 > maxC) {
            maxC = dc2;
        } if (dc3 > maxC) {
            maxC = dc3;
        } if (dc4 > maxC) {
            maxC = dc4;
        } if (dc5 > maxC) {
            maxC = dc5;
        }

        int puntosC = 0;
        if (dc1 != minC && dc1 != maxC) {
            puntosC += dc1;
        } if (dc2 != minC && dc2 != maxC) {
            puntosC += dc2;
        } if (dc3 != minC && dc3 != maxC) {
            puntosC += dc3;
        } if (dc4 != minC && dc4 != maxC) {
            puntosC += dc4;
        } if (dc5 != minC && dc5 != maxC) {
            puntosC += dc5;
        }
        System.out.println("Min: " + minC);
        System.out.println("Max: " + maxC);
        System.out.println("Puntos cubitus: " + puntosC);
        if (puntosC > puntosH) {
            System.out.println("Cubitus gana la partida");
        } else if (puntosC < puntosH) {
            System.out.println("Humerus gana la partida");
        } else {
            System.out.println("Han empatado");
        }
    }
}
