package tp4.poo;

import java.util.List;

public class Socio {
	private int nroSocio;
	private String nombre;
	private List<Reserva> historial;
	
	public Socio(int nroSocio, String nombre) {
		this.nroSocio = nroSocio;
		this.nombre = nombre;
	}
	
	public void añadirReserva(Reserva reserva) { //Este es el método para añadir reservas al historial de un Socio.
		historial.add(reserva);
		System.out.println("Se ha añadido una reserva a nombre de " + nombre + ".");
	}
	
	public int getNroSocio() {
		return nroSocio;
	}
	public void setNroSocio(int nroSocio) {
		this.nroSocio = nroSocio;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
