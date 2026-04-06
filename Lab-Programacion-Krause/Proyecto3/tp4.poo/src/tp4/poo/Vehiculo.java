package tp4.poo;

public abstract class Vehiculo {
	private String patente;
	private String modelo;
	
	public Vehiculo(String patente, String modelo) {
		this.patente = patente;
		this.modelo = modelo;
	}
	
	public void setPatente(String patente) {
		this.patente = patente;
	}
	public String getPatente() {
		return patente;
	}
}
