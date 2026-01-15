package Videojuego;

import org.w3c.dom.ls.LSOutput;

import java.sql.SQLOutput;

public class TestJuego {
    static void main() {


        //Test:
        // 1. Crear 4 juegos
        // 2. Pintar los juegos
        // 3. Alquilar uno 3 veces (hay que devolverlo tras cada alquiler)
        // y pintar su precio de alquiler en cada alquiler
        // 4. Cambiar precio de alquiler a 6€
        // 5. Alquilar un juego 22 veces (hay que devolverlo tras cada alquiler)
        // y pintar su precio de alquiler en cada alquiler

        Videojuego dota = new Videojuego("dota", "PC", Videojuego.CategoriaVideojuego.MMO);
        Videojuego LOL = new Videojuego("LoL", "PC", Videojuego.CategoriaVideojuego.MMO);
        Videojuego dotaPS5 = new Videojuego(dota);
        dotaPS5.setPlataforma("PS5");

        System.out.println(dota);
        System.out.println(LOL);
        System.out.println(dotaPS5);

        for (int i = 0; i < 3; i++) {
            dota.alquilar();
            dota.devolver();
        }
        System.out.println(dota.calcularPrecioAlquiler()); //5

        for (int i = 0; i < 22; i++) {
            dota.alquilar();
            dota.devolver();
        }
        System.out.println(dota.calcularPrecioAlquiler()); //6
    }
}
