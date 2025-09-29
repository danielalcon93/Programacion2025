package tema1;

public class EjercicioCasa2 {
    public static void main(String[] args) {

        //Un conductor de coche quiere saber cuánta gasolina consume en un viaje.
        //Su coche consume 5.8 litros de gasolina cada 100km
        //Cuantos litros consume en un viaje de 750km

        //Ahora haz el mismo ejercicio pero pensando que el coche es híbrido y
        //tiene una batería cargada completamente de 120km

        //Muestra con un operador condicional, si el gasto en litros de gasolina
        //es mayor en el primer coche o en el segundo


        //Resolución primera parte
        double consumo100km = 5.8;
        double distanciatotal = 750;

        double consumolitros = (distanciatotal / 100) * consumo100km;
        System.out.println("El coche de gasolina consume en un viaje de 750km = " + consumolitros);




        //Resolución segunda parte
        double consumoalos100 = 5.8;
        double distanciagasolina = 630;
        double bateria = 120;

        double consumo = (distanciagasolina / 100) * consumoalos100;
        System.out.println("El coche hibrido consume en un viaje de 750km = " + consumo);


        //Resolución tercera parte
        double cochegasolina = 43.5;
        double cochehibrido = 36.54;

        boolean cualconsumemas = cochegasolina >= cochehibrido;
        System.out.println("¿El coche de gasolina consume más? " + cualconsumemas);


    }
}
