package tp4.poo;

public abstract class Herramienta {
	protected int codigo;
	protected String marca;
	
	public Herramienta(int codigo, String marca) {
		this.codigo = codigo;
		this.marca = marca;
	}
	
	public void usar() {
		System.out.println("Herramienta de código "+ codigo +" usada");
	}
	public void devolver() {
		System.out.println("Herramienta de código "+ codigo +" devuelta");
	}
}
