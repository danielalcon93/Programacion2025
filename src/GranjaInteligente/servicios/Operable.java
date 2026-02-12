package GranjaInteligente.servicios;

public interface Operable {

    int APAGADA = 0;
    int ENCENDIDA = 1;
    int MANTENIMIENTO = 2;
    void encender();
    void apagar();
    void ponerEnMantenimiento();
}

