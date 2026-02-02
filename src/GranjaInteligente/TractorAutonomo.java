package GranjaInteligente;

public class TractorAutonomo extends Maquina {

    private float potenciaCV;
    private float consumoPorHora;

    //Constructores
    public TractorAutonomo(int id, String modelo, int estado, float horasUso, float potenciaCV, float consumoPorHora) {
        super(id, modelo, estado, horasUso);
        this.potenciaCV = potenciaCV;
        this.consumoPorHora = consumoPorHora;
    }

    public TractorAutonomo(TractorAutonomo otra) {
        super(otra);
        this.potenciaCV = otra.potenciaCV;
        this.consumoPorHora = otra.consumoPorHora;
    }

    //Getters and setters
    public float getPotenciaCV() {
        return potenciaCV;
    }

    public void setPotenciaCV(float potenciaCV) {
        this.potenciaCV = potenciaCV;
    }

    public float getConsumoPorHora() {
        return consumoPorHora;
    }

    public void setConsumoPorHora(float consumoPorHora) {
        this.consumoPorHora = consumoPorHora;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("TractorAutonomo{");
        sb.append("potenciaCV=").append(potenciaCV);
        sb.append(", consumoPorHora=").append(consumoPorHora);
        sb.append(", idMaquina=").append(idMaquina);
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", estado=").append(estado);
        sb.append(", horasUso=").append(horasUso);
        sb.append('}');
        return sb.toString();
    }

    //Metodo abstracto
    @Override
    public void imprimirTipo() {
        System.out.println("Tractor Autonomo");
    }

    //Metodos de la interface Operable
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
