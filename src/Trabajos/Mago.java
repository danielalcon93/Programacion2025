package AcademiaDeMagia;

import java.util.ArrayList;

public class Mago {

    private String nombre;
    private int energia;
    private ArrayList<Hechizo> hechizos;

    //Constructor
    public Mago(String nombre, int energia) {
        this.nombre = nombre;
        this.energia = energia;
        this.hechizos = new ArrayList<>();
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public ArrayList<Hechizo> getHechizos() {
        return hechizos;
    }

    public void setHechizos(ArrayList<Hechizo> hechizos) {
        this.hechizos = hechizos;
    }

    //toString
    @Override
    public String toString() {
        return "Mago{" +
                "nombre='" + nombre + '\'' +
                ", energia=" + energia +
                ", hechizos=" + hechizos +
                '}';
    }

    //Metodos
    public void aprenderHechizo (Hechizo hechizo) {
        this.hechizos.add(hechizo);
    }

    public Hechizo buscar (String nombreHechizo) {
        for (Hechizo hechizo : hechizos) {
            if (hechizo.getNombre().equals(nombreHechizo)) {
                return hechizo;
            }
        }
        return null;
    }

    public void lanzarHechizo (String nombreHechizo, Prueba prueba) {
        Hechizo hechizo = buscar(nombreHechizo);
        return;
    }

    public void recargarEnergia(int cantidad) {
        this.energia += cantidad;
        if (this.energia > 100) {
            this.energia = 100;
        }
    }


}