package tpn1poo;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Equipo extends Jugadores{
	public Equipo(String username, String vivo, String eliminado) {
		super(username, vivo, eliminado);
		// TODO Auto-generated constructor stub
	}
	private LinkedList<Jugadores> ListaJugadores=new LinkedList<Jugadores>();
	private int capitulos;
	
	public LinkedList<Jugadores> getListaJugadores() {
		return ListaJugadores;
	}

	public void setListaJugadores(LinkedList<Jugadores> ListaJugadores) {
		this.ListaJugadores = ListaJugadores;
	}

	public int getCapitulos() {
		return capitulos;
	}

	public int setCapitulos(int capitulos) {
		return this.capitulos = capitulos;
	}
	@Override
	public String toString() {
		return "Equipo [ListaJugadores=" + ListaJugadores + ", capitulos=" + capitulos + "]";
	}
	
	public static String ListaJugadores(String username){
		Jugadores jugadores=new Jugadores(username, null, null);
		
		if (username<=4) {
			JOptionPane.showMessageDialog(null, "El equipo ya tiene 4 jugadores.");
        } else {
        	JOptionPane.showMessageDialog(null, "El equipo no tiene 4 jugadores.");
        }
		return username;	
	}
	 //public boolean calcularPuntosSupervivientes() {
		 // int puntos = 0;
        // boolean Vivos = true;
        //boolean Eliminados = false;
        //for (Jugadores jugador:ListaJugadores) {
        	 //  if (jugador.Vivo(isVivo())) {
            	 //     puntos += 500 / ListaJugadores.size();
                // } else if (jugador.Eliminado(isEliminado())) {
            	 //	return Eliminados=true;
				 //}
            //  }
        //if (Vivos) {
        //   puntos += 100;
        //}
        //return puntos;
        
	 //}

    public int calcularPuntosZombies() {
    	ListaJugadores(ListaJugadores);
        int dañoTotal = (int) (Math.random() * 600);
        int puntos = dañoTotal;
        if (dañoTotal >= 500) {
            puntos += 25; 
        }
        return puntos;
    }
}	