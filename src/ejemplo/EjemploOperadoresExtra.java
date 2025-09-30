package ejemplo;

public class EjemploOperadoresExtra {

    static void main(String[] args) {

        long numero = 6;

        //num++ --> primera evalua num, y al final de la operacion le suma 1
        // ++num--> primero le suma uno, luego evalua el valor

        System.out.println(numero++); //--> Pinta 6, luego suma 1
        System.out.println(numero); //--> Pinta 7

        System.out.println(++numero); //--> Pinta 7, luego le suma 1
        System.out.println(numero); //--> Pinta 8

        int turno = 14;
        turno++; // turno = turno + 1   turno +=1

        System.out.println(turno);

        //Ejemplo de aplicación
        while (turno > 0) {
            System.out.println(turno);
            turno--;
        }

    }
}
