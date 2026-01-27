package AcademiaDeMagia;

public class Prueba {

    private String descripcion;
    private int nivelDificultad;
    private int recompensa;

    //Constructor
    public Prueba(String descripcion, int nivelDificultad, int recompensa) {
        this.descripcion = descripcion;
        this.nivelDificultad = nivelDificultad;
        this.recompensa = recompensa;
    }

    //Getter y setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getNivelDificultad() {
        return nivelDificultad;
    }

    public void setNivelDificultad(int nivelDificultad) {
        this.nivelDificultad = nivelDificultad;
    }

    public int getRecompensa() {
        return recompensa;
    }

    public void setRecompensa(int recompensa) {
        this.recompensa = recompensa;
    }

    //toString
    @Override
    public String toString() {
        return "Prueba{" +
                "descripcion='" + descripcion + '\'' +
                ", nivelDificultad=" + nivelDificultad +
                ", recompensa=" + recompensa +
                '}';
    }

    //Metodos
    public boolean resolver (Hechizo hechizo) {
        if (this.nivelDificultad <= hechizo.getPotencia()) {
            return true;
        } else {
            return false;
        }
    }

}
