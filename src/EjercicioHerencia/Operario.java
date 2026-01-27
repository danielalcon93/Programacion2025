package EjercicioHerencia;

public abstract class Operario extends GestionDeEmpleados {

    protected boolean haceHorasExtra;

    public Operario(String nombre, int edad, Double salario, boolean haceHorasExtra) {
        super(nombre, edad, salario);
        this.haceHorasExtra = haceHorasExtra;
    }
}
