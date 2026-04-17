package tp4.poo;

public class Gerente extends Empleado{
	private float valorHoraExtra;
	
	public Gerente(String legajo, float sueldoBase, float valorHoraExtra) {
		super(legajo, sueldoBase);
		this.valorHoraExtra = valorHoraExtra;
	} //Al instanciar esta clase el objeto tendría 3 atributos totales.
	
	public float getValorHoraExtra() {
		return valorHoraExtra;
	}
	public void setValorHoraExtra(float valorHoraExtra) {
		this.valorHoraExtra = valorHoraExtra;
	}
}
