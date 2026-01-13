package Spotify;

import java.util.Objects;

public class Cancion {

    private String titulo;
    private String artista;
    private Integer duracion;

    //Constructor parametrizado

    public Cancion(String titulo, String artista, Integer duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.duracion = duracion;
    }

    //Constructor copia
    public Cancion(Cancion cancion) {
        this.titulo = cancion.titulo;
        this.artista = cancion.artista;
        this.duracion = cancion.duracion;
    }

    //Getters y setters

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }

    public Integer getDuracion() {
        return duracion;
    }

    public void setDuracion(Integer duracion) {
        this.duracion = duracion;
    }


    //ToString

    @Override
    public String toString() {
        return "Cancion{" +
                "titulo='" + titulo + '\'' +
                ", artista='" + artista + '\'' +
                ", duracion=" + duracion +
                '}';
    }


    //Equals con titulo y artista


    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Cancion cancion = (Cancion) o;
        return Objects.equals(titulo, cancion.titulo) && Objects.equals(artista, cancion.artista);
    }

    @Override
    public int hashCode() {
        return Objects.hash(titulo, artista);
    }
}
