package EjerciciosRepaso;

public class Funciones3 {

    public static double areaTriangulo(double base, double altura) {
        return (base * altura) / 2;
    }

    public static void main(String[] args) {
        //Crea una función que  el área de un triángulo
        //Recibe dos parámetros: el valor de la base y el de la altura
        //El programa debe funcionar con este main

        double area1, area2;

        area1 = areaTriangulo(3.5,8.1);
        area2 = areaTriangulo(8.6,5.9);

        System.out.println("El área es: " + area1);
        System.out.println("El área es: " + area2);

    }
}
