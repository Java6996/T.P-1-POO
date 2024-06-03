package tpn1poo;

import java.util.LinkedList;

import javax.swing.JOptionPane;

class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] Opciones = {
				"Jugar partida","Salir"
				};
		int opcion =0;
		do {
			opcion = JOptionPane.showOptionDialog(null, "Elegí una opcion", null, 
					opcion, opcion, null, Opciones, Opciones[0]);
			switch (opcion) {
			case 0:
				int capitulos=Integer.parseInt(JOptionPane.showInputDialog("Ingrese cuantos capitulos tiene la campaña"));
					if (capitulos<=5) {
						JOptionPane.showMessageDialog(null, "Se puede jugar la partida.");	
				} else {
					JOptionPane.showMessageDialog(null, "No se puede jugar la partida, hay más de 5 capitulos.");
				}	
				int opcion1 =0;
				String[] Opciones1 = {
						"Zombies","Supervivientes","Salir"
						};
				do {
					opcion1= JOptionPane.showOptionDialog(null, "Elegí un equipo", null, 
							opcion1, opcion1, null, Opciones1, Opciones1[0]);
					switch (opcion1) {
					case 0:
						LinkedList<Jugadores> ListaJugadoresZom=new LinkedList<Jugadores>();
						Equipo.ListaJugadores(ListaJugadoresZom);
						
						ListaJugadoresZom.addAll(ListaJugadoresZom);
						
						break;
						
					case 1:
						LinkedList<Jugadores> ListaJugadoresSupe=new LinkedList<Jugadores>();
						Equipo.ListaJugadores(ListaJugadoresSupe);
						ListaJugadoresSupe.addAll(ListaJugadoresSupe);
						break;
					case 2:
						JOptionPane.showMessageDialog(null, "Saliendo de la partida.");
						break;
					} 
				}while (opcion1!=2);
				case 1:
					JOptionPane.showMessageDialog(null, "Saliendo del menu principal.");
				break;
				}
		} while (opcion!=1);
		
	}
		//public static LinkedList ListaJugadores(LinkedList ListaJugadores){
		//ListaJugadores.add(ListaJugadores);
		//if (ListaJugadores.size()<=4) {
		//	JOptionPane.showMessageDialog(null, "El equipo ya tiene 4 jugadores.");
		//} else {
		//JOptionPane.showMessageDialog(null, "El equipo no tiene 4 jugadores.");
		//}
		//return ListaJugadores;	
		//}
		//public boolean calcularPuntosSupervivientes() {
		//  int puntos = 0;
		//  boolean Vivos = true;
		//  boolean Eliminados = false;
		//  for (Jugadores jugador:ListaJugadores) {
		//      if (jugador.Vivo(isVivo())) {
		//        puntos += 500 / ListaJugadores.size();
		         //       } else if (jugador.Eliminado(isEliminado())) {
		//		return Eliminados=true;
		//	}
		//     }
		//  if (Vivos) {
		//      puntos += 100;
		//  }
		//  return puntos;
	        
	 //  }

//public int calcularPuntosZombies() {
//	ListaJugadores(ListaJugadores);
// int dañoTotal = (int) (Math.random() * 600);
//   int puntos = dañoTotal;
//  if (dañoTotal >= 500) {
//      puntos += 25; 
// }
// return puntos;
//  }

	 //}
}