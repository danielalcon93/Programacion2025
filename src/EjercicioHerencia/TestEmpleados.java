package EjercicioHerencia;

public class TestEmpleados {
    public static void main(String[] args) {

            // Crear empleados
            Comercial c1 = new Comercial("Laura", 35, 1500.0, 250.0);
            Comercial c2 = new Comercial("Mario", 28, 1400.0, 300.0);

            Repartidor r1 = new Repartidor("Carlos", 22, 1200.0, "zona 3");
            Repartidor r2 = new Repartidor("Ana", 30, 1200.0, "zona 1");

            // Mostrar antes de aplicar plus
            System.out.println("Antes de aplicar el plus");
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(r1);
            System.out.println(r2);

            System.out.println();

            // Aplicar plus
            c1.plus();
            c2.plus();
            r1.plus();
            r2.plus();

            // Mostrar después de aplicar plus
            System.out.println("Despues de aplicar el plus");
            System.out.println(c1);
            System.out.println(c2);
            System.out.println(r1);
            System.out.println(r2);
        }
}


