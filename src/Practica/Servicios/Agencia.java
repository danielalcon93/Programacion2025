package Servicios;

import Entidades.Alquiler;
import Entidades.Cliente;
import Entidades.Coche;
import Entidades.TipoCoche;
import Servicios.SinCochesException;

import java.time.LocalDate;
import java.util.ArrayList;

public class Agencia {

    private ArrayList<Coche> coches;
    private ArrayList<Alquiler> alquileres;

    //Constructor
    public Agencia() {
        this.coches = new ArrayList<>();
        this.alquileres = new ArrayList<>();
    }

    //Getter
    public ArrayList<Alquiler> getAlquileres() {
        return alquileres;
    }


    //Metodos
    public void addCoche(Coche coche) {
        this.coches.add(coche);
    }


    public void removeCoche(Coche coche) {
        this.coches.remove(coche);
    }


    public void listarCochesDisponibles() {
        for (Coche coche : coches) {
            if(coche.isDisponible()) {
                System.out.println(coche);
            }
        }
    }


    public void listarAlquileresActivos() {
        for (Alquiler alquiler : alquileres) {
            if(alquiler.getFechaFin().isAfter(LocalDate.now())) {
                System.out.println(alquiler);
            }
        }
    }


    public Coche buscarCocheDisponible(TipoCoche tipo) throws SinCochesException  {
        for (Coche c : coches) {
            if (c.isDisponible() && c.getTipo() == tipo) {
                return c;
            }
        }
        throw new SinCochesException ("No hay coches disponibles de ese tipo");
    }


    public boolean realizarAlquiler(Cliente cliente, TipoCoche tipo,
                                    LocalDate fechaInicio, LocalDate fechaFin) {

        try {
            Coche coche = buscarCocheDisponible(tipo);

            Alquiler alquiler = new Alquiler(cliente, coche, fechaInicio, fechaFin);

            alquileres.add(alquiler);

            return true;

        } catch (SinCochesException e) {
            return false;
        }
    }
}
