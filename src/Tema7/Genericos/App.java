package Tema7.Genericos;

public class App {

    static void main() {
        PilaNumerica pila = new PilaNumerica();
        pila.apilar(4);
        pila.apilar(5);
        pila.apilar(6);
        pila.apilar(7);
        pila.pintar();
        pila.desapilar();
        pila.desapilar();
        pila.desapilar();
        pila.pintar();
        pila.apilar(10);
        pila.pintar();

    }
}
