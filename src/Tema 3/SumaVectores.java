package tema1.EjerciciosClase;

import java.util.Scanner;

public class SumaVectores {

    public static int[] sumarVectores(int[] vector1, int[] vector2) {
        //Crear array del mismo tamaño que el original
        int[] resultado = new int[vector1.length];

        for(int i=0; i < vector1.length; i++) {
            resultado[i] = vector1[i] + vector2[i];
        }

        return resultado;
    }

    public static void imprimirArray(int[] array) {
        for(int i=0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Genera un programa que dados dos vectores de enteros, calcule su suma.
        //Debes almacenarla en un tercer vector de enteros.

        System.out.println("Introduce el tamaño de los vectores: ");
        int tam = sc.nextInt();

        //Crear Vectores
        int[] vector1 = new int[tam];
        int[] vector2 = new int[tam];

        //Rellenar el primer Vector
        System.out.println("Introduce los valores del primer vector: ");
        for (int i=0; i < tam; i++) {
            vector1[i] = sc.nextInt();
        }

        //Rellenar el segundo Vector
        System.out.println("Introduce los valores del segundo vector: ");
        for (int i=0; i < tam; i++) {
            vector2[i] = sc.nextInt();
        }

        //Sumar los Vectores
        int[] suma = sumarVectores(vector1, vector2);

        //Mostrar resultado
        System.out.println("Vector resultante: ");
        imprimirArray(suma);

        sc.close();

    }
}
