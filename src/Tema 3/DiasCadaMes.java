package tema1.EjerciciosClase;

import java.util.Scanner;

public class DiasCadaMes {
    public static void main(String[] args) {

        //Genera un programa que pida por teclado un número de mes
        //e indique el número de días que tiene ese mes.
        //Generar un array que guarde los días que tiene cada mes.

        int [] diasMes = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        int mes = 0;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.println("Introduce el numero del mes (1-12)");
            try {
                mes = Integer.parseInt(sc.next());
            } catch (NumberFormatException ex) {
                System.out.println("Error, debes introducir un numero entero valido");
                continue;
            }

            if (mes < 1 || mes > 12) {
                System.out.println("El mes debe estar entre 1 y 12");
            }

        }   while (mes < 1 || mes > 12);
        System.out.println("El mes " + mes + " tiene " + diasMes[mes - 1] + " dias. ");
        sc.close();

    }
}
