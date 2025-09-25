package ejemplo;

public class Ejemplo1 {

    static void main(String[] args) {
        //String -> Tipo de dato cadena
        //miNombre -> Nombre de la variable
        //"Daniel" -> Valor que le doy a la variable
        // = -> Operador de asignación, el valor que hay en el lado derecho lo graba en la variable del lado izquierdo

        String miNombre= "Daniel";
        System.out.println(miNombre);

        int edad= 19;
        System.out.println(edad + 5);
        System.out.println(edad);
        edad = edad + 5;
        System.out.println(edad);

            //Ahora hay que imprimir el nombre y la edad
            //"Pepe tiene 24 años"
            //miNombre + " tiene " + " edad " + " años"
        System.out.println(miNombre + " tiene " + edad + " años ");

    }

}
