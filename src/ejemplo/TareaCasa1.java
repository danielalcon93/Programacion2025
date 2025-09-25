package ejemplo;

public class TareaCasa1 {
    static void main() {
        //Me dicen la distancia a la tierra de la estrella próxima centauri, 4,24 años luz
        //Tengo que mostrar la distancia en kilometros y el tiempo en segundos
        //una nave que pudiera viajar a una velocidad cercana a la velocidad de la luz -> 299.900 km/s

        //Pista1 -> distancia en km, es pasar 4.24 años luz a kilometros
        //Pista2 -> tiempo en segundos, una vez se los km, y se la velocidad a la que voy, despejar los segundos
        //Pista3 -> Velocidad de la luz 299.900 km/s


        //ANÁLISIS
        //Constante -> VelocidadLuz
        //Entrada -> distanciaAniosluz, velocidadNave
        //Salida -> distanciaKm, TiempoSegundosNaveProxima


        //DISEÑO Primera Parte
        //Distancia en años -> 4.24 años pasar en segundos (distanciasegundos)
        //Regla de tres
        //299900km - 1s
        //? km - distanciasegundos
        //distancia = (4.24 * 365 * 60 * 60)

        final double vLuz = 299800; //Constante (Final) -> su valor no va a cambiar
        double distanciaAnios = 4.24;
        double distanciakm;
        double distanciaSegundos;

        distanciaSegundos = distanciaAnios * 365 * 24 * 60 * 60;
        distanciakm = distanciaSegundos * vLuz;

        System.out.println("Distancia en segundos luz a proxima centauri: " + distanciaSegundos);
        System.out.println("Distancia en kilometros:" + distanciakm);

        //DISEÑO Segunda Parte
        //Regla de tres
        //  Nave va a 298000 - 1s
        //  distanciaKm - ?s

        final double vNave = 298000;
        double tiempoNaveProxima;

        tiempoNaveProxima = distanciakm / vNave;
        System.out.println("La nave tardaría " + tiempoNaveProxima + " Segundos en llegar");

    }
}
