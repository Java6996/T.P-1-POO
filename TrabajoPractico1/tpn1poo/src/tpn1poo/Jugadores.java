package tpn1poo;


import javax.swing.JOptionPane;

public class Jugadores {
	private double username;
	private boolean vivo;
	private boolean eliminado;
	
	
	public Jugadores(double username, boolean vivo, boolean eliminado) {
		super();
		this.username = username;
		this.vivo = vivo;
		this.eliminado = eliminado;
	}
	public String JugadoresSupers (String username) {
		for (int i = 0; i <=3; i++) {
			username=JOptionPane.showInputDialog("Ingrese el nombre de usuario del jugador superviviente " + i);
		}
		return username;

	}
	public double getUsername() {
		return username;
	}
	public void setUsername(double username) {
		this.username = username;
	}
	public boolean isVivo() {
		return vivo;
	}
	public void setVivo(boolean vivo) {
		this.vivo = vivo;
	}
	public boolean isEliminado() {
		return eliminado;
	}
	public void setEliminado(boolean eliminado) {
		this.eliminado = eliminado;
	}
	@Override
	public String toString() {
		return "Jugadores [username=" + username + ", vivo=" + vivo + ", eliminado=" + eliminado + "]";
	}
	public double JugadoresZombies (double username) {
		for (int i = 0; i <=3; i++) {
			username=(int)(Math.random()*3+1);
		}
		return username;
	}
	public double JugadoresSupers (double username) {
		for (int i = 0; i <=3; i++) {
			username=(int)(Math.random()*3+1);
		}
		return username;
	}
	public boolean Vivo(boolean vivo) {
		return true;
	}
	public boolean Eliminado(boolean eliminado) {
		return false;
	}
	
	
}
