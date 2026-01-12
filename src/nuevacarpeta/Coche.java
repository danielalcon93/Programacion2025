public class Coche {

    private int velocidad; //Atributo
    Coche() { velocidad = 0;
    }

    //Devuelve la velocidad actual
    public int getVelocidad() {
        return velocidad;
    }

    //Aumenta la velocidad
    public void acelera(int velocidad) {
        this.velocidad += velocidad;
    }

    //Disminuye la velocidad
    public void frena (int frenos) {
        this.velocidad -= frenos;
    }


    public static void main(String[] args) {
        Coche coche = new Coche();

        coche.acelera(50);
        System.out.println("Velocidad: " + coche.getVelocidad());

        coche.frena(15);
        System.out.println("Velocidad: " + coche.getVelocidad());
    }
}

