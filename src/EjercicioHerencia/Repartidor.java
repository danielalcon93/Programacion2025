package EjercicioHerencia;

public class Repartidor extends GestionDeEmpleados {

    private String zona;

    //Constructor
    public Repartidor(String nombre, int edad, Double salario, String zona) {
        super(nombre, edad, salario);
        this.zona = zona;
    }

    //Getter and setter
    public String getZona() {
        return zona;
    }

    public void setZona(String zona) {
        this.zona = zona;
    }

    //toString
    @Override
    public String toString() {
        return "Repartidor{" +
                "zona='" + zona + '\'' +
                ", nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }

    //Metodo PLUS
    public boolean plus() {
        if (edad < 25 && zona.equalsIgnoreCase("Zona 3")) {
            salario += PLUS;
            return true;
        }
        return false;
    }
}
