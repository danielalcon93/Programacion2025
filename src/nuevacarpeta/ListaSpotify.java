package Spotify;

import java.util.ArrayList;

public class ListaSpotify {

    private String nombre;
    private ArrayList<Cancion> canciones;

    //Constructor parametrizado
    public ListaSpotify(String nombre, ArrayList<Cancion> canciones) {
        this.nombre = nombre;
        this.canciones = new ArrayList<>();
    }


    //Constructor copia
    public ListaSpotify(ListaSpotify listaSpotify) {
        this.nombre = listaSpotify.nombre;
        this.canciones = listaSpotify.canciones;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }


    //ToString

    @Override
    public String toString() {
        return "ListaSpotify{" +
                "nombre='" + nombre + '\'' +
                ", canciones=" + canciones +
                '}';
    }


    //Añadir canción
    public void addCancion(Cancion cancion) {
        this.canciones.add(cancion);
    }

    //Eliminar canción
    public void removeCancion(Cancion cancion) {
        this.canciones.remove(cancion);
    }
}
