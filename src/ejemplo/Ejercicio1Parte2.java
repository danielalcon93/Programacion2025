package EjerciciosRepaso;

import java.util.Scanner;

public class Ejercicio1Parte2 {

    static void main(String[] args) {


        Scanner sc = new Scanner(System.in);
        int a;
        int b;
        int c;
        int d;

        System.out.println("Dime el valor de a: ");
        a = sc.nextInt();
        System.out.println("Dime el valor de b: ");
        b = sc.nextInt();
        System.out.println("Dime el valor de c: ");
        c = sc.nextInt();
        System.out.println("Dime el valor de d: ");
        d = sc.nextInt();

        if (a > b && a > c && a > d) {
            System.out.println(a + "Es el numero mayor");
        }
        if (b > a && b > c && b > d) {
            System.out.println(b + " Es el numero mayor");
        }
        if (c > a && c > b && c > d) {
            System.out.println(c + " Es el numero mayor");
        }
        if (d > a && d > b && d > c) {
            System.out.println(d + " Es el numero mayor");
        } else {
            System.out.println("Todos los numeros son iguales");
        }


    }
}



