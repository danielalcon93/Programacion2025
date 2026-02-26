package Tema7.Genericos;

import java.util.ArrayList;

public class PilaNumerica<T extends Number> {

    private ArrayList<T> pila;

    // Constructor
    public PilaNumerica() {
        pila = new ArrayList<>();
    }

    //Get
    public ArrayList<T> getPila() {
        return pila;
    }


    // Añadir elemento
    public void apilar(T elemento) {
        pila.add(pila.size(), elemento);
    }


    // Eliminar y devolver el último elemento
    public T desapilar() {
        return pila.removeLast();
    }


    // Sumar todos los elementos
    public Double suma() {
        Double suma = 0.0;
        for (T num : pila) {
            suma += num.doubleValue();
        }
        return suma;
    }

    // Mostrar elementos
    public void pintar() {
        System.out.println("Contenido de la pila:");
        for (T num : pila) {
            System.out.println(num);
        }
    }
}