package ejemplo;

import java.util.Scanner;

public class EjemploRadio {
    static void main() {
        //Leer el radio de un calculo y calcular e imprimir su area y longitud

        //ANÁLISIS
        //Datos de entrada; Radio de la circunsferencia
        //Datos de salida: Área y longitud de la circunsferencia

        //DISEÑO
        //área = PI * Radio * Radio
        //Longitud = PI * 2 * Radio

        //1.Declaración de Variables
        double radio;
        double area, longitud;

        //2. Leer Datos de Entrada
        Scanner sc = new Scanner(System.in); //* Crea el objeto para leer el teclado
        System.out.println("Ingrese el radio: ");
        radio = sc.nextDouble(); //* Leer el teclado con un decimal
        System.out.println("El radio es " + radio);

        //3. Hacer Cálculos
        area = 3.1415 * radio * radio; //PI*r2
        longitud = 2 * 3.1415 * radio; //2 * PI * r

        //4. Mostrar resultados
        System.out.println("El area es: " + area);
        System.out.println("La longitud es: " + longitud);

    }
}
