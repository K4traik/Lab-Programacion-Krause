package tp4.poo;

public class Reserva {
	private String fecha;
	private String tipoDeporte;
	
	public Reserva(String fecha, String tipoDeporte) {
		this.fecha = fecha;
		this.tipoDeporte = tipoDeporte;
	}
	
	public String getNroSocio() {
		return fecha;
	}
	public void setNroSocio(String fecha) {
		this.fecha = fecha;
	}
	public String getNombre() {
		return tipoDeporte;
	}
	public void setNombre(String tipoDeporte) {
		this.tipoDeporte = tipoDeporte;
	}
}
