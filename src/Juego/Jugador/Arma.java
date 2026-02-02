package Juego.Jugador;

public class Arma {

    //Propiedades
    private String nombre;
    private int puntosD;
    private boolean dosManos;
    private Tipo tipo;

    //Constructor parametrizado con todas las propiedades
    public Arma(String nombre, int puntosD, boolean dosManos, Tipo tipo) {
        this.nombre = nombre;
        this.puntosD = puntosD;
        this.dosManos = dosManos;
        this.tipo = tipo;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(int puntosD) {
        this.puntosD = puntosD;
    }

    public boolean isDosManos() {
        return dosManos;
    }

    public void setDosManos(boolean dosManos) {
        this.dosManos = dosManos;
    }

    public Tipo getTipo() {
        return tipo;
    }

    public void setTipo(Tipo tipo) {
        this.tipo = tipo;
    }


    //tostring
    @Override
    public String toString() {
        return "Arma{" +
                "nombre='" + nombre + '\'' +
                ", puntosD=" + puntosD +
                ", dosManos=" + dosManos +
                ", tipo=" + tipo +
                '}';
    }


}
