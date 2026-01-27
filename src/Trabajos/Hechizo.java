package AcademiaDeMagia;

public class Hechizo {

    private String nombre;
    private int energiaNecesaria;
    private int potencia;

    //Constructor
    public Hechizo(String nombre, int energiaNecesaria, int potencia) {
        this.nombre = nombre;
        this.energiaNecesaria = energiaNecesaria;
        this.potencia = potencia;
    }

    //Getters y setters
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEnergiaNecesaria() {
        return energiaNecesaria;
    }

    public void setEnergiaNecesaria(int energiaNecesaria) {
        this.energiaNecesaria = energiaNecesaria;
    }

    public int getPotencia() {
        return potencia;
    }

    public void setPotencia(int potencia) {
        this.potencia = potencia;
    }

    //toString
    @Override
    public String toString() {
        return "Hechizo{" +
                "nombre='" + nombre + '\'' +
                ", energiaNecesaria=" + energiaNecesaria +
                ", potencia=" + potencia +
                '}';
    }

    //Metodos
    public boolean esEfectivo(Prueba prueba) {
        if (this.potencia >= prueba.getNivelDificultad()) {
            return true;
        } else {
            return false;
        }
    }
}
