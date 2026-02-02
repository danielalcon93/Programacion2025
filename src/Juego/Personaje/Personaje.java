package Juego.Personaje;

public abstract class Personaje {

    protected String nombre;
    protected int nivel = 1;
    protected double salud;

    //Constructor
    public Personaje(String nombre, double salud) {
        this.nombre = nombre;
        this.salud = salud;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    //Metodos
    public boolean reducirVida (int puntosD) {
        this.salud -= puntosD;
        if (this.salud <= 0) {
            this.salud = 0;
            return true;
        }
        return false;
    }

    public void subirNivel () {
        if (this.nivel < 10){
            this.nivel++;
            this.salud += Math.pow(2.5, nivel);
        }
    }

    //Metodo abstracto
    public abstract void golpear(Personaje personaje);

}
