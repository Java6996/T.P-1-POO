package tpn1poo;

import java.util.LinkedList;

public class GestorEquipos{

	public GestorEquipos() {
		
	}
	private LinkedList< Equipo> supervivientes = new LinkedList< Equipo>() ;
    private Equipo zombies;

	public Equipo getZombies() {
		return zombies;
	}
	public void setZombies(Equipo zombies) {
		this.zombies = zombies;
	}
	
	
	public LinkedList<Equipo> getSupervivientes() {
		return supervivientes;
	}
	public void setSupervivientes(LinkedList<Equipo> supervivientes) {
		this.supervivientes = supervivientes;
	}
	@Override
	public String toString() {
		return "GestorEquipos [supervivientes=" + supervivientes + ", zombies=" + zombies + "]";
	}
	 public void agregarJugadorSuperviviente(Equipo equipo,Jugadores jugador) {
		 equipo.ListaJugadores(getListaJugadores());
	    }

	    public void agregarJugadorZombie(Jugadores jugador) {
	        zombies.ListaJugadores(getListaJugadores());
	    }
	    public void rotarEquipos() {
	        Equipo temp = supervivientes;
	        supervivientes = zombies;
	        zombies = temp;
	    }
	
	}
