package Juego.Monstruo;

import Juego.Personaje.Personaje;

public class Monstruo extends Personaje {

    //Propiedades
    private int puntosD;

    //Constructor parametrizado
    public Monstruo(String nombre, int puntosD) {
        super(nombre, 100.0);
        this.puntosD = puntosD;
    }

    //Getters and setters
    public int getPuntosD() {
        return puntosD;
    }

    public void setPuntosD(int puntosD) {
        this.puntosD = puntosD;
    }

    //tostring
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Monstruo{");
        sb.append("puntosD=").append(puntosD);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append('}');
        return sb.toString();
    }

    //Metodo golpear del monstruo
    @Override
    public void golpear(Personaje personaje) {
        personaje.reducirVida(puntosD);
    }

}
