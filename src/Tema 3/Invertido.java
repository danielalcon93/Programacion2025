package tema1.EjerciciosClase;

public class Invertido {
    public static void main(String[] args) {
        //Crea un programa que dado un array de números, guarde ese array en un
        //array nuevo invertido.

        //Array original
        int [] numeros = {1,2,3,4,5,6,7,8,9,10};

        //Array invertido
        int[] invertido = new int[numeros.length];

        //rellenar array invertido
        for(int i=0; i < numeros.length; i++) {
            invertido[i] = numeros[numeros.length - 1 - i];
        }

        //Mostrar array Original
        System.out.println("Array original");
        for(int n : numeros){
            System.out.println(n + "");
        }

        //Mostrar array Invertido
        System.out.println("Array invertido");
        for(int n : invertido){
            System.out.println(n + "");
        }

    }
}
