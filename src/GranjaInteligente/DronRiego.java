package GranjaInteligente;

public class DronRiego extends Maquina {

    private int capacidadLitros;
    private float alcanceMetros;

    //Constructores
    public DronRiego(int id, String modelo, int estado, float horasUso, int capacidadLitros, float alcanceMetros) {
        super(id, modelo, estado, horasUso);
        this.capacidadLitros = capacidadLitros;
        this.alcanceMetros = alcanceMetros;
    }

    public DronRiego(DronRiego otra) {
        super(otra);
        this.capacidadLitros = otra.capacidadLitros;
        this.alcanceMetros = otra.alcanceMetros;
    }

    //Getters and setters
    public int getCapacidadLitros() {
        return capacidadLitros;
    }

    public void setCapacidadLitros(int capacidadLitros) {
        this.capacidadLitros = capacidadLitros;
    }

    public float getAlcanceMetros() {
        return alcanceMetros;
    }

    public void setAlcanceMetros(float alcanceMetros) {
        this.alcanceMetros = alcanceMetros;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("DronRiego{");
        sb.append("capacidadLitros=").append(capacidadLitros);
        sb.append(", alcanceMetros=").append(alcanceMetros);
        sb.append(", idMaquina=").append(idMaquina);
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", estado=").append(estado);
        sb.append(", horasUso=").append(horasUso);
        sb.append('}');
        return sb.toString();
    }

    //Metodos
    public void imprimirTipo() {
        System.out.println("Dron de Riego");
    }


    //Metodos de interface Operable
    @Override
    public void encender() {
    }

    @Override
    public void apagar() {
    }

    @Override
    public void ponerEnMantenimiento() {
    }

}
