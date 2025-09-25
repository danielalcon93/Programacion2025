package ejemplo;

import java.util.Scanner;

public class EjemploClase {
    static void main() {
        //EJERCICIO DE CLASE
        //Tenemos que diseñar un programa que pida por teclado tres temperaturas
        //Tiene que mostrar como salida la temperatura media de esas tres
        //Realizar análisis, diseño y codificación

        //ANALISIS
        //Datos de entrada: Tres temperaturas tipo double
        //Datos de salida: Temperatura media tipo double

        //DISEÑO
        // Temperatura = temp1, temp2, temp3
        // TemperaturaMedia= (temp1 + temp2 + temp3) /3

        //CODIFICACIÓN
        //1.DECLARACIÓN DE VARIABLES
        double temp1;
        double temp2;
        double temp3;
        double tempMedia;

        //2.ENTRADA DE TECLADO
        Scanner sc = new Scanner(System.in); //* Crea el objeto para leer el teclado
        System.out.println("Ingresa la temperatura 1: ");
        temp1 = sc.nextDouble(); //* Leer el teclado
        System.out.println("Ingresa la temperatura 2: ");
        temp2 = sc.nextDouble(); //* Leer el teclado
        System.out.println("Ingresa la temperatura 3: ");
        temp3 = sc.nextDouble(); //* Leer el teclado


        //3.CÁLCULO DE OPERACIÓN
        tempMedia = (temp1 + temp2 + temp3) /3;

        //4.MOSTRAR LOS RESULTADOS
        System.out.println("La temperatura media es: " + tempMedia);


    }
}
