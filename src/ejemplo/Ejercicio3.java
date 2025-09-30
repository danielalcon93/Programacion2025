package ejemplo;

import java.util.Scanner;

public class Ejercicio3 {

    static void main(String[] args) {

        //Lee de teclado dos valores de tipo double num1,num2
        //Intercambia el valor de las variables y pintalo en pantalla


        double num1;
        double num2;
        double temp;


        Scanner sc = new Scanner(System.in);
        System.out.println("El numero 1 es ");
        num1 = sc.nextDouble();
        System.out.println("El numero 2 es ");
        num2 = sc.nextDouble();

        temp = num2;
        temp = num1;
        temp = temp;

        System.out.println("Numero 1 " + num1);
        System.out.println("Numero 2 " + num2);


    }
}
