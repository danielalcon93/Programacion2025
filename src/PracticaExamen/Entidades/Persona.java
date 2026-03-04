package PracticaExamen.Entidades;

import java.util.Objects;
import java.util.UUID;

public abstract class Persona {

    protected String id;
    private String nombre;
    private String apellidos;
    private String email;

    //Constructor
    public Persona(String nombre, String apellidos, String email) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.email = email;
        this.id = UUID.randomUUID().toString();
    }

    //getter y setter
    public String getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("persona{");
        sb.append("id='").append(id).append('\'');
        sb.append(", nombre='").append(nombre).append('\'');
        sb.append(", apellidos='").append(apellidos).append('\'');
        sb.append(", email='").append(email).append('\'');
        sb.append('}');
        return sb.toString();
    }

    //Equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(email, persona.email);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(email);
    }
}
