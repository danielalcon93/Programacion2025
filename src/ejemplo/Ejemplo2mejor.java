package ejemplo;

public class Ejemplo2mejor {
    static void main(String[] args) {

        // Declara una variable de tipo double llamada precio
        // Asigna el valor 99.99
        // Pinta por pantalla el precio
        // Pinta por pantalla el precio con el IVA (21%)

        double precio = 99.99;
        System.out.println("Precio sin IVA: " + precio);

        double iva = 0.21;
        double precioConIVA = precio * (1 + iva);
        System.out.println("Precio con IVA: " + precioConIVA);
        }
    }
