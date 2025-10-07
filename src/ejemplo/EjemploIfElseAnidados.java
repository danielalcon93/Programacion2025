package ejemplo;

import java.util.Scanner;

public class EjemploIfElseAnidados {

    static void main(String[] args) {

        int edad;
        String sexo;
        boolean amigojefe;

        //Puedes entrar a la discoteca si tienes 18 o mas años
        //Puedes entrar si tienes mas de 16 y eres mujer
        //Puedes entrar si tienes mas de 16 y eres hombre y amigo del jefe
        //No puedes entrar en otro caso

        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su edad");
        edad = sc.nextInt();

        sc.nextLine();
        System.out.println("Dime tu sexo (hombre o mujer): ");
        sexo = sc.nextLine();

        System.out.println("¿Eres amigo del jefe?");
        amigojefe = sc.nextBoolean();

        if (edad >= 18) {
            System.out.println("Puedes entrar a la discoteca");
        } else if (edad >= 16 && sexo == "mujer") {
            System.out.println("Puedes entrar a la discoteca");
        } else if (edad >= 16 && sexo == "hombre" && amigojefe) {
            System.out.println("Puedes entrar a la discoteca");
        } else {
            System.out.println("Tira a acostarte");
        }

    }
}
