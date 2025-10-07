package ejemplo;

public class EjercicioIf2 {
    public static void main(String[] args) {

        //Determinar si eres elegible para que te den un crédito
        //1. Tienes 5 o más años de antiguedad en el banco e ingresos mensuales de
        //   más de 2500€
        //2. Tienes una antigüedad entre 2 y 5 años, ingresos de más de 2000€ mensuales
        //   y no tienes deudas pendientes
        //3. Tienes menos de 2 años de antiguedad, un ingreso de más de 3000€ mensuales
        //   y no tienes deudas pendientes

        //V.E.: antiguedad, ingresosMensuales, deudadPendentes
        //V.S.: decir si eres elegible para que te den un crédito o no

        int antiguedad = 1;
        int ingresosMensuales = 6000;
        boolean deudasPendientes = false;


        if (antiguedad >= 5 && ingresosMensuales > 2500) {
            System.out.println("Eres elegible para un prestamo");
        } else if (antiguedad >= 2 && antiguedad <= 5 && ingresosMensuales > 2000 && !deudasPendientes) {
            System.out.println("Eres elegible para un prestamo");
        } else if (antiguedad < 2 && ingresosMensuales > 3000 && !deudasPendientes) {
            System.out.println("Eres elegible para un prestamo");
        } else {
            System.out.println("No eres elegible para un prestamo");
        }


    }
}
