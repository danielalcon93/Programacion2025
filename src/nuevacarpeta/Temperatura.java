public class Temperatura {

    //convertir grados celsisus a Fahrenheit
    public double celsiusToFahrenheit(double celsius) {
        return (1.8 * celsius) + 32;
    }

    //Convierte grados Fahrenheit a Celsius
    public double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) / 1.8;
    }

    public static void main(String[] args) {
        Temperatura temp = new Temperatura();

        double celsius = 25;
        double farenheit = 77;

        System.out.println(celsius + " ºC = " + temp.celsiusToFahrenheit(celsius) + " ºF");
        System.out.println(farenheit + " ºF = " + temp.fahrenheitToCelsius(farenheit) + " ºC");
    }
}
