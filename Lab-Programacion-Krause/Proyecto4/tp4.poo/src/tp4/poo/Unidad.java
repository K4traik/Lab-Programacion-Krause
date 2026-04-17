package tp4.poo;

public class Unidad {
	private int idInterno;
	private int capacidadPasajeros;
	
	public Unidad(int idInterno, int capacidadPasajeros) {
		this.idInterno = idInterno;
		this.capacidadPasajeros = capacidadPasajeros;
	}
	
	public void arrancar() {
		System.out.println(idInterno +" arrancó su vehículo.");
	}
	public void frenar() {
		System.out.println(idInterno +" frenó su vehículo.");
	}
	
	public int getIdInterno() {
		return idInterno;
	}
	public void setIdInterno(int idInterno) {
		this.idInterno = idInterno;
	}
	public int getCapacidadPasajeros() {
		return capacidadPasajeros;
	}
	public void setCapacidadPasajeros(int capacidadPasajeros) {
		this.capacidadPasajeros = capacidadPasajeros;
	}
}
