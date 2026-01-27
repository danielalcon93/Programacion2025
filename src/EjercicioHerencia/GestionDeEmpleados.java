package EjercicioHerencia;

public abstract class GestionDeEmpleados {

    public static final double PLUS = 300.0;

    protected String nombre;
    protected int edad;
    protected Double salario;

    //Constructor
    public GestionDeEmpleados(String nombre, int edad, Double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    //Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
    }

    //toString
    @Override
    public String toString() {
        return "GestionDeEmpleados{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", salario=" + salario +
                '}';
    }

    //metodo PLUS
    public abstract boolean plus();
}
