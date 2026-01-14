package Tareas;

public class TestTareas {
    public static void main(String[] args) {

        ListaTareas lista = new ListaTareas("Cosas por hacer");

        Tarea t1 = new Tarea("Estudiar Java");
        Tarea t2 = new Tarea("Hacer ejercicio");

        lista.addTarea(t1);
        lista.addTarea(t2);

        System.out.println(lista);

        t1.iniciar();
        t2.resolver("Sesión de cardio completada");

        System.out.println(lista);
    }
}

