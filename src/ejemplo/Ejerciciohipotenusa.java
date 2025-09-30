package ejemplo;

import java.util.Scanner;

public class Ejerciciohipotenusa {

    static void main(String[] args) {

        double cateto1;
        double cateto2;
        double hipotenusa;

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce la medida del cateto 1 ");
        cateto1 = sc.nextDouble();
        System.out.println("La medida del cateto 1 es: " + cateto1);

        System.out.println("Introduce la medida del cateto 2 ");
        cateto2 = sc.nextDouble();
        System.out.println("La medida del cateto 2 es: " + cateto2);

        //Calculo de la hipotenusa
        // he2 = cateto 1 e2 + cateto 2 e2
        // para hacer la raiz cuadrada usamos el "Math.sqrt"
        // para los numeros elevados usamos el "Math.pow"
        hipotenusa = Math.sqrt(Math.pow(cateto1,2) + Math.pow(cateto2,2));
        System.out.println("Muestra la hipotenusa: " + hipotenusa);


    }
}
