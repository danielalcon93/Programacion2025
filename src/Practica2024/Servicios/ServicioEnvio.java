package Practica2024.Servicios;

import java.util.ArrayList;

public class ServicioEnvio {

    private ArrayList<Envio> envios;

    public ServicioEnvio() {
        this.envios = new ArrayList<>();
    }

    public ArrayList<Envio> getEnvios() {
        return envios;
    }

    public void setEnvios(ArrayList<Envio> envios) {
        this.envios = envios;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("ServicioEnvio{");
        sb.append("envios=").append(envios);
        sb.append('}');
        return sb.toString();
    }

    public void agregarEnvio(Envio envio) {
        this.envios.add(envio);
    }

    public void generarInformeEnvio() {
        for (Envio e : this.envios) {
            e.listarProductos();
            IO.println("Total: " + e.calcularCostoEnvio());
            IO.println("Dias: " + e.diasTrancurridos());
            IO.println("--------------");
        }
    }
}
