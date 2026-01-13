public class TestIncidencia {

    public static void main(String[] args) {

        Incidencia i1 = new Incidencia(1, "Ascensor no funciona");
        Incidencia i2 = new Incidencia(2, "Fuga de agua en el garaje");
        Incidencia i3 = new Incidencia(3, "Luces del portal fundidas");
        Incidencia i4 = new Incidencia(4, "Puerta rota");
        Incidencia i5 = new Incidencia(5, "Problema con el timbre");

        // Resolver algunas incidencias
        i1.resuelve("Reparado el motor del ascensor");
        i3.resuelve("Cambiadas las bombillas");
        i5.resuelve("Sustituido el timbre");

        // Mostrar incidencias
        System.out.println(i1);
        System.out.println(i2);
        System.out.println(i3);
        System.out.println(i4);
        System.out.println(i5);

        // Mostrar pendientes
        System.out.println("Incidencias pendientes: " + Incidencia.getPendientes());
        }
    }

}
