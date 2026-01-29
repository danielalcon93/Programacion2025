package Juego;

public class Monstruo {

    //Propiedades
    private String nombre;
    private int nivel = 1;
    private Double Salud = 100.0;
    private int puntosD;

    //Constructor parametrizado
    public Monstruo(String nombre, int puntosD) {
        this.nombre = nombre;
        this.puntosD = puntosD;
    }

    //Getters and setters
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

    public Double getSalud() {
        return Salud;
    }

    public void setSalud(Double salud) {
        Salud = salud;
    }

    public int getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(int puntosD) {
        this.puntosD = puntosD;
    }

    //tostring
    @Override
    public String toString() {
        return "Monstruo{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", Salud=" + Salud +
                ", puntosD=" + puntosD +
                '}';
    }

    //Metodo para subir de nivel
    public void subirNivel() {
        if(this.nivel < 10) {
            this.nivel++;
            this.Salud += Math.pow(2, nivel);
        }
    }

    //Metodo para reducir vida
    public boolean reducirVida (int puntosD) {
        this.Salud -= puntosD;
        if (this.Salud <= 0) {
            this.Salud = 0.0;
            return true;
        }
        return false;
    }

    //Metodo golpear del monstruo
    public boolean golpear (Jugador jugador) {
        return jugador.reducirVida(this.puntosD);
    }

}
