package Practica2025.App;

import Practica2025.Entidades.Equipamiento;
import Practica2025.Entidades.Producto;
import Practica2025.Entidades.RopaDeportiva;
import Practica2025.Servicios.StockInsuficienteException;
import Practica2025.Servicios.Tienda;

public class Aplicacion {

    private static void opciones() {
        IO.println("1. Mostrar el inventario");
        IO.println("2. Añadir producto");
        IO.println("3. Realizar Compra");
        IO.println("4. Mostrar historial de compras");
        IO.println("5. Salir");
    }

    private static Producto datosNuevoProducto()  throws NumberFormatException {

        IO.println("Tipo de producto (1. Equipamiento - 2.Ropa)");
        int tipo = Integer.parseInt(IO.readln());

        switch (tipo) {
            case 1 -> {
                IO.println("Codigo");
                String codigo = IO.readln();

                IO.println("Nombre");
                String nombre = IO.readln();

                IO.println("Precio");
                double precio = Double.parseDouble(IO.readln());

                IO.println("Stock");
                Integer stock = Integer.parseInt(IO.readln());

                IO.println("Deporte");
                String deporte = IO.readln();

                return new Equipamiento(codigo, nombre, precio, stock, deporte);
            }

            case 2 -> {
                IO.println("Codigo:");
                String codigo = IO.readln();

                IO.println("Nombre:");
                String nombre = IO.readln();

                IO.println("Precio:");
                double precio = Double.parseDouble(IO.readln());

                IO.println("Stock:");
                int stock = Integer.parseInt(IO.readln());

                IO.println("Material:");
                String material = IO.readln();

                return new RopaDeportiva(codigo, nombre, precio, stock, material);
            }

            default -> IO.println("Tipo incorrecto");
        }
        return null;
    }

    public static void main(String[] args) {

        int opcion = -1;

        Tienda tienda = new Tienda();

        //Precargamos articulos
        tienda.añadirProducto(new Equipamiento("E1", "Balon", 20.0, 15, "Futbol"));
        tienda.añadirProducto(new RopaDeportiva("R1", "Camiseta", 15.0, 20, "Algodon"));
        tienda.añadirProducto(new Equipamiento("E2", "Pala de Padel", 100.0, 10, "Padel"));
        tienda.añadirProducto(new RopaDeportiva("R2", "Pantalon de padel", 25.0, 15, "Poliester"));

        do {
            try {
                opciones();
                IO.println("Ingrese una opcion que desea realizar");
                opcion = Integer.parseInt(IO.readln());

                switch (opcion) {
                    case 1 -> tienda.mostrarInventario();
                case 2 -> {
                    try {
                        Producto p = datosNuevoProducto();
                        if (p != null) {
                            tienda.añadirProducto(p);
                        }
                    } catch (Exception e) {
                        IO.println("Error introduciendo datos del producto");
                    }
                }

                case 3 -> {
                    try {
                        IO.println("Codigo del producto:");
                        String codigo = IO.readln();

                        IO.println("Cantidad:");
                        int cantidad = Integer.parseInt(IO.readln());

                        tienda.realizarCompra(codigo, cantidad);
                    } catch (StockInsuficienteException e) {
                        IO.println(e.getMessage());
                    }
                }

                case 4 -> tienda.mostrarHistorialCompras();
                case 5 -> IO.println("Hasta luego");
                default -> IO.println("Opcion no permitida");
            }
            } catch (Exception e) {
                IO.println("Error introduciendo datos");
            }

        } while (opcion != 5);
    }
}
