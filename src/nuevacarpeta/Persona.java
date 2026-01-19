package Ejercicios;

import java.util.Objects;

public class Persona {

    public enum Sexo {
        H, //Hombre
        M, //Mujer
        O //Otro
    }

    private String nombre;
    private int edad;
    private String dni;
    private Double peso;
    private Double altura;
    private Sexo sexo;

    //Constructor

    public Persona() {
        this.nombre = "";
        this.edad = 0;
        this.dni = "";
        this.sexo = Sexo.H;
        this.peso = 0.0;
        this.altura = 0.0;
    }

    // Un constructor con el nombre, edad, dni, sexo, y el resto por defecto.
    public Persona(String nombre, int edad, String dni, Sexo sexo) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.altura = 0.0;
        this.peso = 0.0;
    }

    //Un constructor con todos los miembros como parámetro.
    public Persona(String nombre, int edad, String dni, Sexo sexo, Double peso, Double altura) {
        this.nombre = nombre;
        this.edad = edad;
        this.dni = dni;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }

    //Constructor copia
    public Persona(Persona p) {
        this.nombre = p.nombre;
        this.edad = p.edad;
        this.dni = p.dni;
        this.peso = p.peso;
        this.altura = p.altura;
        this.sexo = p.sexo;
    }

    //Metodos
    public int calcularIMC() {
        if (this.altura <= 0 || this.peso <= 0) {
            return 0;
        }

        double imc = this.peso / Math.pow(this.altura, 2);

        if (imc < 20) {
            return 1;
        } else if (imc >= 20 && imc <= 25) {
            return 0;
        } else {
            return -1;
        }
    }

    public boolean esMayorDeEdad() {
        return this.edad >= 18;
        }

    //tostring
    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                ", dni='" + dni + '\'' +
                ", peso=" + peso +
                ", altura=" + altura +
                ", sexo=" + sexo +
                '}';
    }

    //Getters and setters
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

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Sexo getSexo() {
        return sexo;
    }

    public void setSexo(Sexo sexo) {
        this.sexo = sexo;
    }

    //equals
    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Persona persona = (Persona) o;
        return Objects.equals(dni, persona.dni);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(dni);
    }

}
