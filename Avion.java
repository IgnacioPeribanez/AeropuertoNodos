package aeropuerto;

import java.util.ArrayList;

public class Avion {
	private int idAvion;
	private ArrayList<Pasajero> pasajeros;
	
	public Avion (int idAvion) {
		this.idAvion = idAvion;
		this.pasajeros = new ArrayList<Pasajero>();
	}

	public int getIdAvion() {
		return idAvion;
	}

	public void setIdAvion(int idAvion) {
		this.idAvion = idAvion;
	}

	public ArrayList<Pasajero> getPasajeros() {
		return pasajeros;
	}

	public void setPasajeros(ArrayList<Pasajero> pasajeros) {
		this.pasajeros = pasajeros;
	}
	
}
