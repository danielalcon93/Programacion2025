package EjerciciosRepaso;

public class CryptoBroConverter {


    public static void main(String[] args) {
        //Hacer una aplicación que te permita saber cuántos euros son:
        //x monedas de una criptomoneda sabiendo su cambio:
        //1. Bitcoin -> 115375 dólares
        //2. Ethereum -> 4206 dólares
        //3. Dogecoin -> 0.2044 dólares
        //4. XRP -> 2.68 dólares
        //
        // Cambio 1 dólar -> 0.86 euros
        // El programa será un menú que te permita elegir el tipo de criptomoneda
        // luego te preguntará la cantidad de monedas (double) y te mostrará
        // el resultado en euros
        // Se valora el uso de funciones y control de excepciones

        public static void pintarMenu() {
            System.out.println("1. Bitcoin en Euros");
            System.out.println("2. Ethereum en Euros");
            System.out.println("3. Dogecoin en Euros");
            System.out.println("4. XRP en euros");
            System.out.println("5. Salir");
        }

        public static double tipoMoneda(double valor1, double valor2, String tipo) {
            switch (tipoMoneda) {
                    case "Bitcoin":
                        return (valor1, valor2);
                    case "Ethereum":
                        return calcAreaCuadrado(valor1);
                    case "Dogecoin":
                        return calcAreaRectangulo(valor1, valor2);
                    case "XRP":
                        return
                    default:
                        return 0;
                }
            }

            public static double calcEurosBitcoin(double euros, double tipoCambio)
            {
                return euros * tipoCambio
            }

            public static double calcEurosEthereum(double euros, double tipoCambio)
            {
                return euros * tipoCambio;
            }

            public static double calcEurosDogecoin(double euros, double tipoCambio)
            {
                return euros * tipoCambio;
            }

            public static double calcEurosXRP(double euros, double tipoCambio)
            {
            return euros * tipoCambio;
            }



    }
}
