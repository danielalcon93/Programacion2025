public class Incidencia {

    private int codigo;
    private String estado; // abierta, en proceso, resuelta
    private String problema;
    private String solucion;

    private static int pendientes = 0;

    // Constructor
    public Incidencia(int codigo, String problema) {
        this.codigo = codigo;
        this.problema = problema;
        this.estado = "abierta";
        this.solucion = "";
        pendientes++;
    }

    // Metodo para resolver la incidencia
    public void resuelve(String solucion) {
        if (!estado.equals("resuelta")) {
            this.solucion = solucion;
            this.estado = "resuelta";
            pendientes--;
        }
    }

    // Metodo para obtener incidencias pendientes
    public static int getPendientes() {
        return pendientes;
    }

    // Getters y setters
    public int getCodigo() {
        return codigo;
    }

    public String getEstado() {
        return estado;
    }

    public String getProblema() {
        return problema;
    }

    public String getSolucion() {
        return solucion;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    // 🔹 toString
    @Override
    public String toString() {
        return "Incidencia " + codigo +
                " | Estado: " + estado +
                " | Problema: " + problema +
                " | Solución: " + solucion;
    }
}
