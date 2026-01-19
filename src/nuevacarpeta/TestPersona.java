package Ejercicios;

import java.util.Scanner;

public class TestPersona {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Introduce el nombre:");
        String nombre = sc.nextLine();

        System.out.println("Introduce la edad:");
        int edad = sc.nextInt();
        sc.nextLine();

        System.out.println("Introduce el DNI:");
        String dni = sc.nextLine();

        System.out.println("Introduce el sexo (H/M/O):");
        Persona.Sexo sexo = Persona.Sexo.valueOf(sc.nextLine().toUpperCase());

        System.out.println("Introduce el peso:");
        double peso = sc.nextDouble();

        System.out.println("Introduce la altura:");
        double altura = sc.nextDouble();

        // Crear persona
        Persona p1 = new Persona(nombre, edad, dni, sexo, peso, altura);

        // Mayor de edad
        if (p1.esMayorDeEdad()) {
            System.out.println("Es mayor de edad");
        } else {
            System.out.println("Es menor de edad");
        }

        // IMC
        int imc = p1.calcularIMC();
        if (imc == 1) {
            System.out.println("Está en su peso ideal");
        } else if (imc == 0) {
            System.out.println("Está por debajo de su peso ideal");
        } else {
            System.out.println("Tiene sobrepeso");
        }

        // Mostrar datos
        System.out.println(p1);

        // Segunda persona (mismo DNI)
        Persona p2 = new Persona("Otra", 40, dni, Persona.Sexo.M, 80.0, 1.70);

        // Equals
        if (p1.equals(p2)) {
            System.out.println("Las personas son iguales");
        } else {
            System.out.println("Las personas son distintas");
        }

        sc.close();
    }
}

