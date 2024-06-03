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
        

	}
}