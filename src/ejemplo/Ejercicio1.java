package tema1;

public class Ejercicio1 {
    static void main(String[] args) {

        int a = 6;
        int b = 2;
        int c = 3;

        int resultadoa;
        int resultadob;
        int resultadoc;
        int resultadod;
        int resultadoe;

        resultadoa =(a * b) % c;
        resultadob =  a * b / c;
        resultadoc = c % b + c * b;
        resultadod = a % ( a * b * c / (b + c) );
        resultadoe = b * b + c - b * (a % b );

        System.out.println(resultadoa);
        System.out.println(resultadob);
        System.out.println(resultadoc);
        System.out.println(resultadod);
        System.out.println(resultadoe);

    }
}
