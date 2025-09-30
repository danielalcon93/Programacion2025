package ejemplo;

import java.util.Scanner;

public class Ejercicio2 {
    static void main(String[] args) {

        //Un alumno del modulo de programación quiere saber la nota final. Esta consta de:
        //55% de tres notas parciales (media aritmetica de las tres)
        //30% calificacion examen final
        //15% calificacion trabajo final
        //Pide los valores de entrada y muestra la nota final

        double nota1;
        double nota2;
        double nota3;
        double MediaNotas;
        double NotaExamenFinal;
        double TrabajoFinal;
        double notafinal;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la nota1 ");
        nota1 = sc.nextDouble();


        System.out.println("Introduce la nota2 ");
        nota2 = sc.nextDouble();


        System.out.println("Introduce la nota3 ");
        nota3 = sc.nextDouble();


        System.out.println("Introduce la nota del examen final ");
        NotaExamenFinal = sc.nextDouble();


        System.out.println("Introduce la nota del trabajo final ");
        TrabajoFinal = sc.nextDouble();


        notafinal = (nota1+nota2+nota3 * 0.55) ;















    }
}
