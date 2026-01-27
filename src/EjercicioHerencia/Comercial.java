package EjercicioHerencia;

public class Comercial extends GestionDeEmpleados {

    private Double comision;

    //Constructor
    public Comercial(String nombre, int edad, Double salario, Double comision) {
        super(nombre, edad, salario);
        this.comision = comision;
    }

    //Getter y setter
    public Double getComision() {
        return comision;
    }

    public void setComision(Double comision) {
        this.comision = comision;
    }

    //toString
    @Override
    public String toString() {
        return "Comercial{" +
                "salario=" + salario +
                ", edad=" + edad +
                ", nombre='" + nombre + '\'' +
                ", comision=" + comision +
                '}';
    }

    //metodo PLUS
    @Override
    public boolean plus() {
        if (edad > 30 && comision > 200) {
            salario += PLUS;
            return true;
        }
            return false;
        }
}

