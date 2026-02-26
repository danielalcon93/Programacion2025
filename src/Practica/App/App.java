package App;

import Entidades.*;
import Servicios.Agencia;

import java.time.LocalDate;

public class App {

    private static void opciones() {
        IO.println("1. Listar coches disponibles");
        IO.println("2. Listar alquileres activos");
        IO.println("3. Realizar alquiler");
        IO.println("4. Mostrar ingresos totales");
        IO.println("5. Salir");
    }

    //--------------------------------------------------------------------------------

    public static void main(String[] args) {

        int opcion = -1;

        Agencia agencia = new Agencia();

        // Crear coches
        for (int i = 0; i < 10; i++) {
            agencia.addCoche(new CocheEstandar(
                    "Marca" + i,
                    "Modelo" + i,
                    "MAT" + i,
                    2020 + i,
                    TipoCombustible.GASOLINA,
                    TipoCoche.SEDAN,
                    50.0 + i,
                    true
            ));
        }

        for (int i = 10; i < 20; i++) {
            agencia.addCoche(new CochePremium(
                    "Marca" + i,
                    "Modelo" + i,
                    "MAT" + i,
                    2020 + i,
                    TipoCombustible.DIESEL,
                    TipoCoche.DEPORTIVO,
                    80.0 + i,
                    true,
                    true
            ));
        }

        do {
            try {
                opciones();
                IO.print("Introduce una opción: ");
                opcion = Integer.parseInt(IO.readln());

                switch (opcion) {

                    case 1 -> agencia.listarCochesDisponibles();

                    case 2 -> agencia.listarAlquileresActivos();

                    case 3 -> {
                        try {
                            IO.println("Nombre:");
                            String nombre = IO.readln();

                            IO.println("Apellidos:");
                            String apellido = IO.readln();

                            IO.println("DNI:");
                            String dni = IO.readln();

                            IO.println("Email:");
                            String email = IO.readln();

                            IO.println("Direccion:");
                            String direccion = IO.readln();

                            IO.println("Telefono:");
                            String telefono = IO.readln();

                            IO.println("Licencia:");
                            String licencia = IO.readln();

                            IO.println("Fecha licencia (YYYY-MM-DD):");
                            LocalDate fechaLicencia = LocalDate.parse(IO.readln());

                            Cliente cliente = new Cliente(
                                    nombre, apellido, dni, email,
                                    direccion, telefono, licencia, fechaLicencia
                            );

                            IO.println("Tipo coche (SEDAN, SUV, FURGONETA, DEPORTIVO):");
                            TipoCoche tipo = TipoCoche.valueOf(IO.readln().toUpperCase());

                            IO.println("Fecha inicio (YYYY-MM-DD):");
                            LocalDate inicio = LocalDate.parse(IO.readln());

                            IO.println("Fecha fin (YYYY-MM-DD):");
                            LocalDate fin = LocalDate.parse(IO.readln());

                            boolean alquilerRealizado = agencia.realizarAlquiler(cliente, tipo, inicio, fin);

                            if (alquilerRealizado) {
                                IO.println("Alquiler realizado correctamente");
                            } else {
                                IO.println("No hay coches disponibles");
                            }

                        } catch (Exception e) {
                            IO.println("Error introduciendo datos");
                        }
                    }

                    case 4 -> {
                        double total = 0;

                        for (Alquiler a : agencia.getAlquileres()) {
                            if (a.getFechaFin().isBefore(LocalDate.now())) {
                                total += a.getPrecioTotal();
                            }
                        }

                        IO.println("Ingresos totales: " + total + "€");
                    }

                    case 5 -> IO.println("Hasta luego");

                    default -> IO.println("Opción incorrecta");
                }

            } catch (Exception e) {
                IO.println("Error general");
            }

        } while (opcion != 5);
    }
}