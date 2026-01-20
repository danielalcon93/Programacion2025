package Ejercicios;

public class testLibro {

    public static void main(String[] args) {

    Libreria libreria = new Libreria();

        Libro l1 = new Libro("0000000001", "Libro 1", "Autor 1", 100, false);
        Libro l2 = new Libro("0000000002", "Libro 2", "Autor 2", 120, false);
        Libro l3 = new Libro("0000000003", "Libro 3", "Autor 3", 150, false);
        Libro l4 = new Libro("0000000004", "Libro 4", "Autor 4", 200, false);
        Libro l5 = new Libro("0000000005", "Libro 5", "Autor 5", 180, false);
        Libro l6 = new Libro("0000000006", "Libro 6", "Autor 6", 220, false);
        Libro l7 = new Libro("0000000007", "Libro 7", "Autor 7", 90, false);
        Libro l8 = new Libro("0000000008", "Libro 8", "Autor 8", 300, false);
        Libro l9 = new Libro("0000000009", "Libro 9", "Autor 9", 250, false);
        Libro l10 = new Libro("0000000010", "Libro 10", "Autor 10", 175, false);

        //Adquirir libros
        libreria.adquirirLibro(l1, 10.0);
        libreria.adquirirLibro(l2, 12.0);
        libreria.adquirirLibro(l3, 8.0);
        libreria.adquirirLibro(l4, 15.0);
        libreria.adquirirLibro(l5, 11.0);
        libreria.adquirirLibro(l6, 20.0);
        libreria.adquirirLibro(l7, 7.0);
        libreria.adquirirLibro(l8, 25.0);
        libreria.adquirirLibro(l9, 18.0);
        libreria.adquirirLibro(l10, 14.0);

        //Vender Libros
        libreria.venderLibro(l1, 18.0);
        libreria.venderLibro(l2, 20.0);
        libreria.venderLibro(l3, 16.0);
        libreria.venderLibro(l4, 20.0);
        libreria.venderLibro(l5, 15.0);
        libreria.venderLibro(l6, 25.0);
        libreria.venderLibro(l7, 10.0);
        libreria.venderLibro(l8, 30.0);
        libreria.venderLibro(l9, 20.0);
        libreria.venderLibro(l10, 22.0);

        //Calcular y mostrar ganancias
        System.out.println("Ganancias totales: " + libreria.calcularGanancias() + " €");
    }
}
