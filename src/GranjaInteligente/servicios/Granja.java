package GranjaInteligente.servicios;

import GranjaInteligente.entidades.Maquina;

import java.util.ArrayList;
import java.util.List;

public class Granja {

    private String nombre;
    private String ubicacion;
    private double totalHorasOperacion;
    private List<Maquina> maquinas;

    //Constructor
    public Granja(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.totalHorasOperacion = 0;
        this.maquinas = new ArrayList<>();
    }

    //Getter y setter
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public double getTotalHorasOperacion() {
        return totalHorasOperacion;
    }

    public void setTotalHorasOperacion(double totalHorasOperacion) {
        this.totalHorasOperacion = totalHorasOperacion;
    }

    public List<Maquina> getMaquinas() {
        return maquinas;
    }

    public void setMaquinas(List<Maquina> maquinas) {
        this.maquinas = maquinas;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Granja{");
        sb.append("nombre='").append(nombre).append('\'');
        sb.append(", ubicacion='").append(ubicacion).append('\'');
        sb.append(", totalHorasOperacion=").append(totalHorasOperacion);
        sb.append(", maquinas=").append(maquinas);
        sb.append('}');
        return sb.toString();
    }

    //Metodos
    public void imprimirDatosGranja() {
        System.out.println("Granja: " + nombre);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("TotalHorasOperacion: " + totalHorasOperacion);
    }


    public void addMaquina (Maquina maquina) {
        this.maquinas.add(maquina);
    }


    public void calcularTotalHoras() {
        totalHorasOperacion = 0;
        for (Maquina m : maquinas) {
            totalHorasOperacion += m.getHorasUso();
        }
    }


    public void listarMaquinas() {
        for (Maquina maquina : maquinas) {
            IO.println(maquina.getIdMaquina() + " (" + maquina.getModelo() + ")");
        }
    }


    public Maquina buscarMaquinaPorId(Integer id) {
        for (Maquina maquina : maquinas) {
            if (maquina.getIdMaquina().equals(id)) {
                return maquina;
            }
        }
        IO.println("Maquina no encontrada");
        return null;
    }

}
