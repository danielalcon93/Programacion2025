public class Satelite {

    private double meridiano;
    private double paralelo;
    private double distancia_tierra;

    // Constructor con parámetros
    public Satelite(double m, double p, double d) {
        meridiano = m;
        paralelo = p;
        distancia_tierra = d;
    }

    // Constructor por defecto
    public Satelite() {
        meridiano = paralelo = distancia_tierra = 0;
    }

    // Metodo para cambiar la posición completa
    public void setPosicion(double m, double p, double d) {
        meridiano = m;
        paralelo = p;
        distancia_tierra = d;
    }

    // Metodo para imiprimir la posición
    public void printPosicion() {
        System.out.print("El satélite se encuentra en ");
        System.out.print("el paralelo " + paralelo + " meridiano " + meridiano);
        System.out.println(" a una distancia de la Tierra de " + distancia_tierra + " kms.");
    }

    // Metodo para variar la altura
    public void variaAltura(double desplazamiento) {
        distancia_tierra += desplazamiento;
    }

    // Metodo para comprobar si esta en orbita
    public boolean enOrbita() {
        return distancia_tierra > 0;
    }

    // Metodo para variar la posición
    public void variaPosicion(double variap, double variam) {
        paralelo += variap;
        meridiano += variam;
    }
}
