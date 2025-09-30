package ejemplo;

import java.util.Scanner;

public class Ejemplodedatos {

    static void main(String[] args) {

        long num;
        double decimal;
        String cadena;

        Scanner sc = new Scanner(System.in); //System.in hace referencia al teclado
        num = sc.nextLong();
        System.out.println("El número introducido es: " + num);

        //Leer Número decimal
        System.out.println("Dime un decimal: ");
        decimal = sc.nextDouble();
        System.out.println("El numero introducido es " + decimal);

        sc.nextLine(); //Para leer el "enter" tras escribir el decimal

        //Leer cadenas
        System.out.println("Dime una cadena: ");
        cadena = sc.nextLine();
        System.out.println("El numero introducido es " + cadena);

        //Hay un pequeño defecto: Cuando lees uan cadena despues de un entero o un double
        //El enter despues de esciribir el numero lo toma como la cadena a leer

        //Solución 1 --> Poner un sc.line()


    }


    }
