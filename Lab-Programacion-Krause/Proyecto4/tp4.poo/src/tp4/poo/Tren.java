package tp4.poo;

public class Tren extends Unidad{
	private int cantVagones;
	
	public Tren(int idInterno, int capacidadPasajeros, int cantVagones) {
		super(idInterno, capacidadPasajeros);
		this.cantVagones = cantVagones;
	}
	
	public int getCantVagones() {
		return cantVagones;
	}
	public void setCantVagones(int cantVagones) {
		this.cantVagones = cantVagones;
	}
}
