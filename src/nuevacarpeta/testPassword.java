package Ejercicios;

public class testPassword {
    public static void main(String[] args) {

    Password n1 = new Password();
    Password n2 = new Password(12);

        System.out.println("Contraseña 1 (por defecto): " + n1.getContraseña());
        System.out.println("Es fuerte? " + (n1.esFuerte() ? "si" : "no"));
        System.out.println("Contraseña 2 (longitud 12): " + n2.getContraseña());
        System.out.println("Es fuerte? " + (n2.esFuerte() ? "si" : "no"));
    }
}
