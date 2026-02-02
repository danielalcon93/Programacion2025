package Juego.Jugador;


import Juego.Monstruo.Monstruo;
import Juego.Personaje.Personaje;

public class Jugador extends Personaje {

    //Propiedades
    private int experiencia = 0;
    private Clase clase;
    private Arma armaDerecha = null;
    private Arma armaIzquierda = null;

    //Constructor
    public Jugador(String nombre,Clase clase) {
        super(nombre, 200.0);
        this.clase = clase;
    }

    //Getters and setters
    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }


    //tostring
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Jugador{");
        sb.append("experiencia=").append(experiencia);
        sb.append(", clase=").append(clase);
        sb.append(", armaDerecha=").append(armaDerecha);
        sb.append(", armaIzquierda=").append(armaIzquierda);
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", nivel=").append(nivel);
        sb.append(", salud=").append(salud);
        sb.append('}');
        return sb.toString();
    }


    //Metodo equipar armas
    public boolean equipar(Arma arma) {
        if (arma.isDosManos()) {
            if (this.armaDerecha == null && this.armaIzquierda == null) {
                this.armaDerecha = arma;
                this.armaIzquierda = arma;
                return true;
            } else {
                return false;
            }
        }

        if (this.armaDerecha == null) {
            this.armaDerecha = arma;
            return true;
        }

        if (this.armaIzquierda == null) {
            this.armaIzquierda = arma;
            return true;
        }

        return false;
    }

    //Metodo para tomar pocion
    public void tomarPocion(int puntosS) {
        this.salud += puntosS;
        if (this.salud > 10000) {
            this.salud = 10000;
        }
    }

    //Metodo para golpear
    @Override
    public void golpear(Personaje personaje) {
        if (armaDerecha != null) {
        personaje.reducirVida(armaDerecha.getPuntosD());

        if (!armaDerecha.isDosManos() && armaIzquierda != null) {
        personaje.reducirVida(armaIzquierda.getPuntosD());
            }
        }
    }

    //Subir la experiencia y el nivel si corresponde
    public void subirExperiencia(Monstruo monstruo) {
        this.experiencia += 10 * monstruo.getNivel();

        if (this.experiencia > 1000) {
            this.experiencia = 1000;
        }

        while (this.nivel < (this.experiencia / 100) + 1) {
            subirNivel();
        }
    }

}
