package tp4.poo;

public class Gerente extends Empleado{
	private float valorHoraExtra;
	
	public Gerente(String legajo, float sueldoBase, float valorHoraExtra) {
		super(legajo, sueldoBase);
		this.valorHoraExtra = valorHoraExtra;
	}
	
	public float getValorHoraExtra() {
		return valorHoraExtra;
	}
	public void setValorHoraExtra(float valorHoraExtra) {
		this.valorHoraExtra = valorHoraExtra;
	}
}
