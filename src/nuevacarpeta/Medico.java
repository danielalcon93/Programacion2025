package tema4;

public class Medico {

    /**
     * Crear clase Medico
     * Propiedades:
     * - nombre
     * - especialidad (enum Especialidad ->
     *     GENERAL, DIGESTIVO, OTORRINO, CARDIOLOGIA, NEUROLOGIA, TRAUMATOLOGIA)
     * - edad
     * - email
     * - telefono
     * - estado (enum Estado -> ACTIVO, INACTIVO)
     *
     * Constructor con todo menos 'estado'. El estado por defecto es ACTIVO.
     * Getters de todo
     * Setters de todo menos 'estado'
     * ToString
     * Metodos propios:
     * - baja() -> pone el estado en INACTIVO
     * - alta() -> pone el estado en ACTIVO
     *
     * En un main crea dos médicos, pon uno de baja y pinta los dos
     */

    //Propiedades o atributos
    private String nombre;
    private Especialidad especialidad;
    private Integer edad;
    private String email;
    private Integer telefono;
    private Estado estado;

    //Constructor
    public Medico(String nombre, Especialidad especialidad, int edad, String email, int telefono) {
        this.nombre = nombre;
        this.especialidad = especialidad;
        this.edad = edad;
        this.email = email;
        this.telefono = telefono;
        this.estado = Estado.Activo;
    }

    //Getters
    public String getNombre() {
        return nombre;
    }

    public Especialidad getEspecialidad() {
        return especialidad;
    }

    public int getEdad() {
        return edad;
    }

    public String getEmail() {
        return email;
    }

    public int getTelefono() {
        return telefono;
    }

    public Estado getEstado() {
        return estado;
    }


    //Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEspecialidad(Especialidad especialidad) {
        this.especialidad = especialidad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", especialidad=" + especialidad +
                ", edad=" + edad +
                ", email='" + email + '\'' +
                ", telefono=" + telefono +
                ", estado=" + estado +
                '}';
    }

    //Metodos propios
    public void baja() {
        this.estado = Estado.Inactivo;
    }

    public void alta() {
        this.estado = Estado.Activo;
    }

}
