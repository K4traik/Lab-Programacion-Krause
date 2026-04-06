package tp4.poo;

public class HerramientaElectrica extends Herramienta{
	private int voltaje;
	
	public HerramientaElectrica(int codigo, String marca, int voltaje){
		super(codigo, marca);
		this.voltaje = voltaje;
	}
	
	public void conectar() {
		System.out.println("Herramienta de código "+ codigo +" conectada");
	}
	
	public void setVoltaje(int voltaje) {
		this.voltaje = voltaje;
	}
	public int getVoltaje() {
		return voltaje;
	}
}
