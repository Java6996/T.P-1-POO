package tpn1poo;

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
				String[] Opciones1 = {
						"Zombies","Supervivientes","Salir"
						};
				int opcion1 =0;
				do {
					//GestorEquipos gestor = new GestorEquipos(null,null,null);
					//Jugadores jugadores=new Jugadores(null, null, null);
					
					opcion1= JOptionPane.showOptionDialog(null, "Elegí un equipo", null, 
							opcion1, opcion1, null, Opciones1, Opciones1[0]);
					switch (opcion1) {
					case 0:
						Equipo.ListaJugadores(null);
						String username;
							for (int i = 0; i <=7; i++) {
								username=JOptionPane.showInputDialog("Ingrese el nombre de usuario del jugador " + i);
							}
						break;
						
					case 1:
						Equipo.ListaJugadores(null);
						
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
		//gestor.agregarJugadorSuperviviente(new Jugadores("Survivor1","",""));
		//gestor.agregarJugadorSuperviviente(new Jugadores("Survivor2","",""));
		//gestor.agregarJugadorSuperviviente(new Jugadores("Survivor3","",""));
		//gestor.agregarJugadorSuperviviente(new Jugadores("Survivor4","",""));
		//gestor.agregarJugadorZombie(new Jugadores("Zombie1","",""));
		//gestor.agregarJugadorZombie(new Jugadores("Zombie2","",""));
		//gestor.agregarJugadorZombie(new Jugadores("Zombie3","",""));
		//gestor.agregarJugadorZombie(new Jugadores("Zombie4","",""));
		//int puntosSupervivientes = 0;
		//int puntosZombies = 0;
		//for (int capitulo = 1; capitulo <= 5; capitulo++) {
		//System.out.println("Capítulo " + capitulo);
		//puntosSupervivientes += gestor.getSupervivientes().calcularPuntosSupervivientes();
		// puntosZombies += gestor.getZombies().calcularPuntosZombies();
		//gestor.rotarEquipos();
		//}
		//System.out.println("Puntos finales del equipo de Supervivientes: " + puntosSupervivientes);
		//System.out.println("Puntos finales del equipo de Zombies: " + puntosZombies);

		//if (puntosSupervivientes > puntosZombies) {
		//  System.out.println("El equipo de Supervivientes gana la partida!");
		// } else if (puntosZombies > puntosSupervivientes) {
		//    System.out.println("El equipo de Zombies gana la partida!");
		//} else {
		//    System.out.println("La partida termina en empate!");
		// }
        

	}
}