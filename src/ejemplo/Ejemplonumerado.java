package ejemplo;

public class Ejemplonumerado {
    static void main(String[] args) {

        //Es como definir un tipo de cadena, que solo puede tomar esos valores
        enum Notas { SOBRESALIENTE, NOTABLE, APORBADO, SUSPENSO}

        //Declaración de una variable de tipo Notas
        Notas minota= Notas.SOBRESALIENTE;

        System.out.println(minota);

        minota = Notas.NOTABLE;

        System.out.println(minota);
    }

}
