package GranjaInteligente;

import java.util.ArrayList;
import java.util.List;

public class Granja {

    private String nombre;
    private String ubicacion;
    private double totalHorasOperacion;
    private List<Maquina> maquinas;

    //Constructor
    protected Granja(String nombre, String ubicacion, double totalHorasOperacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.totalHorasOperacion = totalHorasOperacion;
        this.maquinas = new ArrayList<>();
    }

    //Getter y setter
    protected String getNombre() {
        return nombre;
    }

    protected void setNombre(String nombre) {
        this.nombre = nombre;
    }

    protected String getUbicacion() {
        return ubicacion;
    }

    protected void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    protected double getTotalHorasOperacion() {
        return totalHorasOperacion;
    }

    protected void setTotalHorasOperacion(double totalHorasOperacion) {
        this.totalHorasOperacion = totalHorasOperacion;
    }

    protected List<Maquina> getMaquinas() {
        return maquinas;
    }

    protected void setMaquinas(List<Maquina> maquinas) {
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
    protected void imprimirDatosGranja() {
        System.out.println("Granja: " + nombre);
        System.out.println("Ubicacion: " + ubicacion);
        System.out.println("TotalHorasOperacion: " + totalHorasOperacion);
    }

    protected void addMaquina (Maquina maquina) {
        this.maquinas.add(maquina);
    }

    protected void calcularTotalHoras() {
        totalHorasOperacion = 0;
        for (Maquina m : maquinas) {
            totalHorasOperacion += m.getHorasUso();
        }
    }

}
