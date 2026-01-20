package Ejercicios;

import java.util.Random;

public class Password {

    // Atributos
    private int longitud;
    private String contraseña;

    // Constructor por defecto
    public Password() {
        this.longitud = 8;
        generarPassword();
    }

    // Constructor con longitud
    public Password(int longitud) {
        this.longitud = longitud;
        generarPassword();
    }

    // Constructor copia
    public Password(Password p) {
        this.longitud = p.longitud;
        this.contraseña = p.contraseña;
    }

    // Metodo que genera contraseña
    public void generarPassword() {
        String mayusculas = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String minusculas = "abcdefghijklmnopqrstuvwxyz";
        String numeros = "0123456789";
        String simbolos = "!@#$%&*";

        String todos = mayusculas + minusculas + numeros + simbolos;

        Random random = new Random();
        contraseña = "";

        for (int i = 0; i < longitud; i++) {
            contraseña += todos.charAt(random.nextInt(todos.length()));
        }
    }

    // Método esFuerte
    public boolean esFuerte() {
        int contMay = 0;
        int contMin = 0;
        int contNum = 0;
        int contSim = 0;

        for (int i = 0; i < contraseña.length(); i++) {
            char c = contraseña.charAt(i);

            if (c >= 'A' && c <= 'Z') {
                contMay++;
            } else if (c >= 'a' && c <= 'z') {
                contMin++;
            } else if (c >= '0' && c <= '9') {
                contNum++;
            } else {
                contSim++;
            }
        }

        return contraseña.length() >= 8 &&
                contMay >= 1 &&
                contMin > 2 &&
                contNum > 2 &&
                contSim >= 1;
    }

    // Getters
    public int getLongitud() {
        return longitud;
    }

    public String getContraseña() {
        return contraseña;
    }

    // Setter SOLO de longitud
    public void setLongitud(int longitud) {
        this.longitud = longitud;
        generarPassword(); // regenerar contraseña
    }
}
