package Juego.Monstruo;

import Juego.Personaje.Personaje;

public class MonstruoFinalNivel extends Monstruo {

    private int golpeEspecial;
    private int usosGolpeEspecial = 3;

    //Constructor
    public MonstruoFinalNivel(String nombre, int puntosD, int golpeEspecial) {
        super(nombre, puntosD);
        this.golpeEspecial = golpeEspecial;
    }

    //Getter
    public int getUsosGolpeEspecial() {
        return usosGolpeEspecial;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("MonstruoFinalNivel{");
        sb.append("golpeEspecial=").append(golpeEspecial);
        sb.append(", usosGolpeEspecial=").append(usosGolpeEspecial);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append('}');
        return sb.toString();
    }

    //Metodo golpear
    @Override
    public void golpear(Personaje personaje) {
        if (usosGolpeEspecial > 0) {
            personaje.reducirVida(golpeEspecial);
            usosGolpeEspecial--;
        } else {
            super.golpear(personaje);
        }
    }

}
