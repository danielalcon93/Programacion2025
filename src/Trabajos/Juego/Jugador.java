package Juego;

import java.time.Month;

public class Jugador {

    //Propiedades
    private String nombre;
    private int nivel = 1;
    private int experiencia = 0;
    private double salud = 200.0;
    private Clase clase;
    private Arma armaDerecha = null;
    private Arma armaIzquierda = null;

    //Constructor parametrizado, menos nivel que será por defecto 1, salud por defecto 200,
    //experiencia 0 por defecto, ni las armas que serán null.
    public Jugador(String nombre, Clase clase) {
        this.nombre = nombre;
        this.clase = clase;
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

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public double getSalud() {
        return salud;
    }

    public void setSalud(double salud) {
        this.salud = salud;
    }

    public Clase getClase() {
        return clase;
    }

    public void setClase(Clase clase) {
        this.clase = clase;
    }

    public Arma getArmaDerecha() {
        return armaDerecha;
    }

    public void setArmaDerecha(Arma armaDerecha) {
        this.armaDerecha = armaDerecha;
    }

    public Arma getArmaIzquierda() {
        return armaIzquierda;
    }

    public void setArmaIzquierda(Arma armaIzquierda) {
        this.armaIzquierda = armaIzquierda;
    }


    //tostring
    @Override
    public String toString() {
        return "Jugador{" +
                "nombre='" + nombre + '\'' +
                ", nivel=" + nivel +
                ", experiencia=" + experiencia +
                ", salud=" + salud +
                ", clase=" + clase +
                ", armaDerecha=" + armaDerecha +
                ", armaIzquierda=" + armaIzquierda +
                '}';
    }

    //Metodo para subir de nivel
    public void subirNivel() {
        if (this.nivel < 10){
            this.nivel++;
            this.salud += Math.pow(2.5, nivel);
        }
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

    //Metodo para reducir la vida
    public boolean reducirVida (int puntosD) {
        this.salud -= puntosD;
        if (this.salud <= 0) {
            this.salud = 0;
            return true;
        }
        return false;
    }

    //Metodo para golpear
    public void golpear(Monstruo monstruo) {
        if (this.getArmaDerecha() != null) {
            monstruo.reducirVida(this.getArmaDerecha().getPuntosD());
            if (!this.getArmaDerecha().isDosManos()) {
                if (this.getArmaIzquierda() != null) {
                    monstruo.reducirVida(this.getArmaIzquierda().getPuntosD());
                }
            }
        }
    }

    //Metodo para comprobar si lo has matado
    public boolean comprobarMuerte (Monstruo monstruo) {
        return monstruo.getSalud() == 0;
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
