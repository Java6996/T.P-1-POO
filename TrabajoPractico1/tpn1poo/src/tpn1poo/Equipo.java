package tpn1poo;

import java.util.LinkedList;

import javax.swing.JOptionPane;

public class Equipo{
	private LinkedList<Jugadores> ListaJugadores=new LinkedList<Jugadores>();
	private int capitulos;
	
	
	
	public Equipo(int capitulos) {
		super();
		this.capitulos = capitulos;
	}

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
	
	public static double ListaJugadores(double username){
		Jugadores jugadores=new Jugadores(username, vivo, eliminado);
			
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

	//public int calcularPuntosZombies() {
	//ListaJugadores(ListaJugadores);
	//  int dañoTotal = (int) (Math.random() * 600);
	// int puntos = dañoTotal;
	// if (dañoTotal >= 500) {
	//     puntos += 25; 
	// }
// return puntos;
	//}
}	