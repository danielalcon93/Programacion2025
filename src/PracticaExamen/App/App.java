package PracticaExamen.App;

import PracticaExamen.Entidades.*;
import PracticaExamen.Servicios.*;

import java.time.LocalDate;

public class App {

    static void main() {

        GrupoPlanes grupo = new GrupoPlanes("Grupo Amigos");

        try {

            // PARTICIPANTES
            grupo.addParticipante(new Participante("Ana","Lopez","ana@mail.com","Ana"));
            grupo.addParticipante(new Participante("Luis","Perez","luis@mail.com","Luis"));
            grupo.addParticipante(new Participante("Carlos","Ruiz","carlos@mail.com","Carlos"));
            grupo.addParticipante(new Participante("Maria","Diaz","maria@mail.com","Maria"));

            // PLANES
            grupo.addPlan(new PlanEstandar(
                    "Cena Italiana",
                    "Cena en restaurante",
                    CategoriaPlan.GASTRONOMIA,
                    LocalDate.now(),
                    LocalDate.now().plusDays(5),
                    120.0,
                    grupo.buscarParticipantePorEmail("ana@mail.com"),
                    10,
                    true
            ));

            grupo.addPlan(new PlanPremium(
                    "Viaje a Roma",
                    "Viaje cultural",
                    CategoriaPlan.VIAJE,
                    LocalDate.now(),
                    LocalDate.now().plusDays(30),
                    1000.0,
                    grupo.buscarParticipantePorEmail("luis@mail.com"),
                    "Viajes SL",
                    100.0
            ));

        } catch (Exception e) {
            IO.println("Error inicializando datos");
        }

        // MENU
        int opcion = 0;

        do {

            IO.println("--- GRUPO PLANES ---");
            IO.println("1. Listar todos los planes");
            IO.println("2. Listar planes por categoria");
            IO.println("3. Votar un plan");
            IO.println("4. Ver resultado votacion");
            IO.println("5. Ver plan ganador");
            IO.println("6. Cerrar votacion");
            IO.println("7. Salir");
            IO.println("Introduce opcion");

            try {

                opcion = Integer.parseInt(IO.readln());

                switch (opcion) {

                    case 1 -> grupo.listarPlanes();

                    case 2 -> {
                        IO.println("Introduce categoria:");
                        CategoriaPlan cat = CategoriaPlan.valueOf(IO.readln());
                        grupo.listarPlanesPorCategoria(cat);
                    }

                    case 3 -> {
                        IO.println("ID del plan:");
                        Long id = Long.parseLong(IO.readln());

                        IO.println("Email del participante:");
                        String email = IO.readln();

                        IO.println("Tipo voto (A_FAVOR / EN_CONTRA / ABSTENCION):");
                        TipoVoto tipo = TipoVoto.valueOf(IO.readln());

                        IO.println("Comentario:");
                        String comentario = IO.readln();

                        boolean ok = grupo.registrarVoto(id,email,tipo,comentario);

                        if(ok) IO.println("Voto registrado");
                        else IO.println("No se pudo registrar el voto");
                    }

                    case 4 -> {
                        IO.println("ID del plan:");
                        Long id = Long.parseLong(IO.readln());

                        IO.println(grupo.getResultadoVotacion(id));
                    }

                    case 5 -> {
                        Plan ganador = grupo.getPlanGanador();

                        if(ganador != null)
                            IO.println("Plan ganador: " + ganador);
                        else
                            IO.println("No hay planes abiertos");
                    }

                    case 6 -> {
                        IO.println("¿Estas seguro? S/N");

                        String confirm = IO.readln();

                        if(confirm.equalsIgnoreCase("S")){
                            grupo.cerrarVotacionYElegirGanador();
                            IO.println("Votacion cerrada");
                        }
                    }

                    case 7 -> IO.println("Hasta pronto");

                }

            } catch (Exception e) {
                IO.println("ERROR: " + e.getMessage());
            }

        } while (opcion != 7);

    }
}
