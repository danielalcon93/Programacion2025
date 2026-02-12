package GranjaInteligente.app;

import GranjaInteligente.entidades.CosechadoraAutonoma;
import GranjaInteligente.entidades.DronRiego;
import GranjaInteligente.entidades.Maquina;
import GranjaInteligente.servicios.Granja;

public class Main {

    /**
     * Muestra las opciones del menú
     */
    private static void opciones() {
        IO.println("1. Imprimir datos de la granja");
        IO.println("2. Añadir una máquina");
        IO.println("3. Añadir horas de operación a una máquina");
        IO.println("4. Calcular total de horas de operación");
        IO.println("5. Listar todas las máquinas");
        IO.println("6. Buscar máquina por id");
        IO.println("7. Salir");
    }

    /**
     * Pide los datos de una nueva máquina al usuario
     */
    private static Maquina datosNuevaMaquina() throws NumberFormatException {
        IO.println("Tipo de máquina (1.Dron Riego - 2.Cosechadora Autónoma)");
        int tipo = Integer.parseInt(IO.readln());

        switch (tipo) {

            case 1 -> {
                IO.println("Modelo del dron:");
                String modelo = IO.readln();

                IO.println("Capacidad en litros:");
                int capacidad = Integer.parseInt(IO.readln());

                IO.println("Alcance en metros:");
                float alcance = Float.parseFloat(IO.readln());

                return new DronRiego(modelo, capacidad, alcance);
            }

            case 2 -> {
                IO.println("Modelo de la cosechadora:");
                String modelo = IO.readln();

                IO.println("Ancho de corte (m):");
                float ancho = Float.parseFloat(IO.readln());

                IO.println("Rendimiento (ton/h):");
                float rendimiento = Float.parseFloat(IO.readln());

                return new CosechadoraAutonoma(modelo, ancho, rendimiento);
            }

            default -> IO.println("Tipo de máquina incorrecto");
        }

        IO.println("Error introduciendo datos de la máquina");
        return null;
    }

    // ---------------------------------------------------------------------

    public static void main(String[] args) {

        int opcion = -1;
        int idMaquina;
        float horas;

        Granja granja = new Granja("Granja Inteligente", "Almería");

        do {
            try {
                opciones();
                IO.print("Introduce una opción: ");
                opcion = Integer.parseInt(IO.readln());

                switch (opcion) {

                    case 1 -> granja.imprimirDatosGranja();

                    case 2 -> {
                        try {
                            granja.addMaquina(datosNuevaMaquina());
                        } catch (Exception ex) {
                            IO.println("Error introduciendo la máquina");
                        }
                    }

                    case 3 -> {
                        IO.print("Introduce el id de la máquina: ");
                        idMaquina = Integer.parseInt(IO.readln());

                        Maquina m = granja.buscarMaquinaPorId(idMaquina);

                        if (m != null) {
                            IO.print("Introduce horas trabajadas: ");
                            horas = Float.parseFloat(IO.readln());
                            m.trabajar(horas);
                        }
                    }

                    case 4 -> {
                        granja.calcularTotalHoras();
                        IO.println("Total de horas de operación: " + granja.getTotalHorasOperacion());
                    }

                    case 5 -> granja.listarMaquinas();

                    case 6 -> {
                        IO.print("Introduce el id de la máquina: ");
                        idMaquina = Integer.parseInt(IO.readln());

                        Maquina m = granja.buscarMaquinaPorId(idMaquina);

                        if (m != null) {
                            IO.println(m.toString());
                        }
                    }

                    case 7 -> IO.println("Hasta luego");

                    default -> IO.println("Opción incorrecta (1-7)");
                }

            } catch (Exception ex) {
                IO.println("Error introduciendo datos");
            }

        } while (opcion != 7);
    }
}

