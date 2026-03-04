package PracticaExamen.Servicios;

import PracticaExamen.Entidades.*;

import java.time.LocalDate;
import java.util.ArrayList;

public class GrupoPlanes {

    private String nombreGrupo;
    private ArrayList<Participante> participantes;
    private ArrayList<Plan> planes;
    private ArrayList<Voto> votos;

    public GrupoPlanes(String nombreGrupo) {
        this.nombreGrupo = nombreGrupo;
        this.participantes = new ArrayList<>();
        this.planes = new ArrayList<>();
        this.votos = new ArrayList<>();
    }

    //Metodos
    public void addParticipante(Participante p) {
        this.participantes.add(p);
    }

    public void addPlan(Plan p) {
        this.planes.add(p);
    }

    public void listarPlanes(){
        IO.print("----Listado de planes----");
        for (Plan p : this.planes){
            IO.println(p);
        }
    }

    public void listarPlanesPorCategoria(CategoriaPlan cat) {
        for (Plan p : this.planes){
            if(p.getCategoria().equals(cat)){
                IO.println(p);
            }
        }
    }

    public Participante buscarParticipantePorEmail(String email) throws ParticipanteNoEncontradoException {
        for (Participante p : this.participantes) {
            if (p.getEmail().equals(email)) {
                return p;
            }
        }   throw new ParticipanteNoEncontradoException(email);
    }

    public Plan buscarporId(Long id) throws PlanNoEncontradoException {
        for (Plan p : this.planes) {
            if (p.getId().equals(id)) {
                return p;
            }
        }   throw new PlanNoEncontradoException(id);
    }

    public boolean registrarVoto(Long idPlan, String emailParticipante, TipoVoto tipo, String comentario) {
        try {
            Plan plan = buscarporId(idPlan);
            Participante p = buscarParticipantePorEmail(emailParticipante);

            if(plan.getEstado() != EstadoPlan.ABIERTO) {
                return false;
            }
            for (Voto v : this.votos) {
                if(v.getPlan().equals(plan) && v.getParticipante().equals(p)) {
                    return false;
                }
            }

            Voto voto = new Voto(p, plan, tipo, LocalDate.now(), comentario);
            votos.add(voto);
            p.addVoto(voto);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public String getResultadoVotacion(Long idPlan) {
        int favor = 0;
        int contra = 0;
        int abstencion = 0;
        for (Voto v : this.votos) {
            if(v.getPlan().equals(idPlan)) {

                if(v.getTipo().equals(TipoVoto.A_FAVOR)) {
                    favor++;
                } else if (v.getTipo().equals(TipoVoto.EN_CONTRA)) {
                    contra++;
                } else if (v.getTipo().equals(TipoVoto.ABSTENCION)) {
                    abstencion++;
                }
            }
        }
        return  "A favor " + favor +
                "|| En contra" + contra +
                "|| Abstenciones" + abstencion;
    }

    public Plan getPlanGanador() {

        Plan ganador = null;
        int maxVotos = -1;

        for (Plan p : this.planes) {

            if (p.getEstado() == EstadoPlan.ABIERTO) {

                int votosFavor = 0;

                for (Voto v : this.votos) {
                    if (v.getPlan().equals(p) && v.getTipo() == TipoVoto.A_FAVOR) {
                            votosFavor++;
                        }
                    }

                if (votosFavor > maxVotos) {
                        maxVotos = votosFavor;
                        ganador = p;
                    }
                }
            }

            return ganador;
        }

    public void cerrarVotacionYElegirGanador() {

        Plan ganador = getPlanGanador();

        if (ganador == null) return;

        for (Plan p : this.planes) {

            if (p.getEstado() == EstadoPlan.ABIERTO) {

                if (p.equals(ganador)) {
                    p.setEstado(EstadoPlan.ELEGIDO);
                } else {
                    p.setEstado(EstadoPlan.CERRADO);
                }

            }
        }
    }

    public ArrayList<Voto> getVotosDeUnPlan(Long idPlan) {

        ArrayList<Voto> resultado = new ArrayList<>();

        for (Voto v : this.votos) {
            if (v.getPlan().getId().equals(idPlan)) {
                resultado.add(v);
            }
        }

        return resultado;
    }
}





