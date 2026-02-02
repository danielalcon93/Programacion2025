package GranjaInteligente;

public class CosechadoraAutonoma extends Maquina {

    private float anchoCorte;
    private float rendimientoToneladasHora;

    //Constructores
    public CosechadoraAutonoma(int id, String modelo, int estado, float horasUso, float anchoCorte, float rendimientoToneladasHora) {
        super(id, modelo, estado, horasUso);
        this.anchoCorte = anchoCorte;
        this.rendimientoToneladasHora = rendimientoToneladasHora;
    }

    public CosechadoraAutonoma(CosechadoraAutonoma otra) {
        super(otra);
        this.anchoCorte = otra.anchoCorte;
        this.rendimientoToneladasHora = otra.rendimientoToneladasHora;
    }

    //Getters and setters
    public float getAnchoCorte() {
        return anchoCorte;
    }

    public void setAnchoCorte(float anchoCorte) {
        this.anchoCorte = anchoCorte;
    }

    public float getRendimientoToneladasHora() {
        return rendimientoToneladasHora;
    }

    public void setRendimientoToneladasHora(float rendimientoToneladasHora) {
        this.rendimientoToneladasHora = rendimientoToneladasHora;
    }

    //toString
    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("CosechadoraAutonoma{");
        sb.append("anchoCorte=").append(anchoCorte);
        sb.append(", rendimientoToneladasHora=").append(rendimientoToneladasHora);
        sb.append(", idMaquina=").append(idMaquina);
        sb.append(", modelo='").append(modelo).append('\'');
        sb.append(", estado=").append(estado);
        sb.append(", horasUso=").append(horasUso);
        sb.append('}');
        return sb.toString();
    }

    //Metodos
    public void imprimirTipo() {
        System.out.println("Cosechadora Autónoma");
    }


    //Metodos interface Operable
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
