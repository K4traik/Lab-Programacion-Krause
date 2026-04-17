package tp4.poo;

public class Colectivo extends Unidad {
	private int nroLinea;
	
	public Colectivo(int idInterno, int capacidadPasajeros, int nroLinea) {
		super(idInterno, capacidadPasajeros);
		this.nroLinea = nroLinea;
	} //Así se vería el método constructor.
	
	public int getNroLinea() {
		return nroLinea;
	}
	public void setNroLinea(int nroLinea) {
		this.nroLinea = nroLinea;
	}
}
