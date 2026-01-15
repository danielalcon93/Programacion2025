package Videojuego;

import java.util.Objects;

public class Videojuego {
    public enum CategoriaVideojuego {
        ACCION,
        AVENTURA,
        RPG,
        CONDUCCION,
        ESTRATEGIA,
        DEPORTE,
        SIMULACION,
        MMO
    }

    public static Integer totalJuegos = 0;
    public static Double precioAlquiler = 5.0;
    public static Integer totalJuegosPrestados = 0;

    private String codigo;
    private String titulo;
    private String plataforma;
    private CategoriaVideojuego categoria;
    private boolean disponible;
    private Integer vecesAlquilado;

    //Constructor con titulo, plantaforma y categoria, lo demás lo ponéis vosotros
    public Videojuego(String titulo, String plataforma, CategoriaVideojuego categoria) {
        Videojuego.totalJuegos++;
        this.codigo = Videojuego.generarCodigo();
        this.titulo = titulo;
        this.plataforma = plataforma;
        this.categoria = categoria;
        this.disponible = true;
        this.vecesAlquilado = 0;
    }

    //Constructor copia, con código nuevo
    public Videojuego(Videojuego otro) {
        Videojuego.totalJuegos++;
        this.codigo = Videojuego.generarCodigo();
        this.titulo = otro.titulo;
        this.plataforma = otro.plataforma;
        this.categoria = otro.categoria;
        this.disponible = true;
        this.vecesAlquilado = 0;
    }


    //Getters y setters
    public String getCodigo() {
        return codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getPlataforma() {
        return plataforma;
    }

    public void setPlataforma(String plataforma) {
        this.plataforma = plataforma;
    }

    public CategoriaVideojuego getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaVideojuego categoria) {
        this.categoria = categoria;
    }

    public boolean isDisponible() {
        return disponible;
    }

    public void setDisponible(boolean disponible) {
        this.disponible = disponible;
    }

    public Integer getVecesAlquilado() {
        return vecesAlquilado;
    }

    public void setVecesAlquilado(Integer vecesAlquilado) {
        this.vecesAlquilado = vecesAlquilado;
    }

    //Getters y setters static
    public static Integer getTotalJuegos() {
        return totalJuegos;
    }

    public static void setTotalJuegos(Integer totalJuegos) {
        Videojuego.totalJuegos = totalJuegos;
    }

    public static Double getPrecioAlquiler() {
        return precioAlquiler;
    }

    public static void setPrecioAlquiler(Double precioAlquiler) {
        Videojuego.precioAlquiler = precioAlquiler;
    }

    public static Integer getTotalJuegosPrestados() {
        return totalJuegosPrestados;
    }

    public static void setTotalJuegosPrestados(Integer totalJuegosPrestados) {
        Videojuego.totalJuegosPrestados = totalJuegosPrestados;
    }

    //toString
    @Override
    public String toString() {
        return "Videojuego{" +
                "codigo='" + codigo + '\'' +
                ", titulo='" + titulo + '\'' +
                ", plataforma='" + plataforma + '\'' +
                ", categoria=" + categoria +
                ", disponible=" + disponible +
                ", vecesAlquilado=" + vecesAlquilado +
                '}';
    }

    //equals por codigo
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Videojuego that = (Videojuego) o;
        return Objects.equals(codigo, that.codigo);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(codigo);
    }

    //Metodo para generar código --> GAME-0000<totalJuegos>
    private static String generarCodigo() {
        return "GAME-" + String.format("%06d", Videojuego.totalJuegos);
    }


    //Metodo para cambiar el precio del alquiler de todos los juegos
    public static void PrecioAlquiler(double precioAlquiler) {
        Videojuego.precioAlquiler = precioAlquiler;
    }

    //Metodo para alquilar --> Si está disponible, lo pone no disponible e incrementa totalJuegosPrestados
    //                         e incrementa vecesAlquilado en 1. true si puede alquilar, false si no
    public boolean alquilar() {
        if(disponible) {
            this.disponible = false;
            Videojuego.totalJuegosPrestados++;
            this.vecesAlquilado++;
            return true;
        }
        return false;
    }


    //Metodo para devolver --> Si no está disponible, se pone disponible y se decrementa totalJuegosPrestados
    //                         true si puede devolver, false si no

    public boolean devolver() {
        if(!disponible) {
            this.disponible = true;
            Videojuego.totalJuegosPrestados--;
            return true;
        }
        return false;
    }


    //Metodo para calcular el precio del alquiler de un juego -->
    //    - Si el juego ha sido alquilado más de 20 veces, le sumamos 1€ al precio base de alquiler y devolvemos ese valor
    //    - Si el juego ha sido alquilado más de 100 veces, le sumamos 2€ al precio base del alquiler y devolvemos ese valor

    public Double calcularPrecioAlquiler() {
        if ((this.vecesAlquilado >= 20) && (this.vecesAlquilado < 100))
            return Videojuego.precioAlquiler + 1;
        if (this.vecesAlquilado >= 100) return Videojuego.precioAlquiler + 2;
        return Videojuego.precioAlquiler;
        }
}
