package Ejercicios;

public class testProducto {
    public static void main(String[] args) {

        Producto producto = new Producto();

        //Integer id, String descripcion, Double precio, Integer unidadesDisponibles, Integer stockMaximo, Double descuento
        Producto n1 = new Producto(150,"Cacahuetes", 2.80, 30, 50, 0.10);
        Producto n2 = new Producto(120,"Macarrones", 1.00, 22, 60, 0.05);
        Producto n3 = new Producto(100,"Patatas", 1.80, 18, 75, 0.10);
        Producto n4 = new Producto(70,"Bebida", 0.40, 60, 100, 0.05);
        Producto n5 = new Producto(50,"Cerveza", 1.00, 25, 100, 0.20);
        Producto n6 = new Producto(30,"Tomate Triturado", 0.60, 25, 55, 0.10);

        //Vender producto
        n1.vender(25);
        n2.vender(20);
        n3.vender(10);
        n4.vender(20);
        n5.vender(10);
        n6.vender(20);

        System.out.println(n1);
        System.out.println(n2);
        System.out.println(n3);
        System.out.println(n4);
        System.out.println(n5);
        System.out.println(n6);

        //Reponer producto
        System.out.println("Reponiendo productos...");
        System.out.println("n1 repuesto: " + n1.reponer());
        System.out.println("n2 repuesto: " + n2.reponer());
        System.out.println("n3 repuesto: " + n3.reponer());
        System.out.println("n4 repuesto: " + n4.reponer());
        System.out.println("n5 repuesto: " + n5.reponer());
        System.out.println("n6 repuesto: " + n6.reponer());
    }
}
