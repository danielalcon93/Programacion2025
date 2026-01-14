package Tareas;

import java.util.ArrayList;

public class ListaTareas {

    private String nombre;
    private ArrayList<Tarea> tareas;

    public ListaTareas(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public void addTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    @Override
    public String toString() {
        String resultado = "Lista: " + nombre + "\n";
        for (Tarea t : tareas) {
            resultado += t + "\n";
        }
        return resultado;
    }
}


