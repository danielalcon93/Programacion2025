public class Finanzas {

    private double cambio;


    //CONSTRUCTOR
    public Finanzas() {
        this.cambio = 1.36;
    }
    public Finanzas(double cambio) {
        this.cambio = cambio;
    }

    //Getters
    public double getCambio() {
        return cambio;
    }

    //Setters
    public void setCambio(double cambio) {
        this.cambio = cambio;
    }


    // Convierte dólares a euros
    public double dolaresToEuros(double dolares) {
        return dolares * cambio;
    }

    // Convierte euros a dolares
    public double eurosToDolares(double euros) {
        return euros / cambio;
    }

}

