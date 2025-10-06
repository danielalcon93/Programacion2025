package tema1;

public class Ejercicio4 {

    static void main(String[] args) {

        //(3 < 7) && (7 < 7) --> Falsa, porque 3 es menor que 7 pero, 7 no es menor que 7 es igual.

        // !((–8 > 1) && (3 < 4)) --> Verdadera, porque -8 no es mayor que 1 y 3 es menor que 4.

        //“Hola” == “Hola ” --> Falsa, porque aunque es la misma palabra, el espacio en el segundo Hola hace que no sean iguales.

        //((2 < 5) && (3 > 6)) || (2 >– 1) --> Verdadera, porque con or solo se necesita que uno de los dos sea verdadero, el primer grupo es falso porque 2 es menor que 5 -
        //pero 3 no es mayor que 6, pero el segundo grupo si es verdadero porque 2 es mayor que -1 por lo tanto es verdadero.

        //((2 < 5) || (3 > 6)) && (2 > –1) --> Verdadero, porque en el grupo razonamiento OR solo necesita que uno de los dos sea verdadero, 2 es menor que 5 es verdadero -
        //y aunque 3 no es mayor a 6 ya es verdadero, en el segundo grupo tiene que ser verdadero y 2 es mayor que -1 por lo que V y V es verdadero

    }
}
