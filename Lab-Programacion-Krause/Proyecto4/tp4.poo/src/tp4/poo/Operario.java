package tp4.poo;

public class Operario extends Empleado{
	private float bonoResponsabilidad;
	
	public Operario(String legajo, float sueldoBase, float bonoResponsabilidad) {
		super(legajo, sueldoBase);
		this.bonoResponsabilidad = bonoResponsabilidad;
	}
	
	public float getValorHoraExtra() {
		return bonoResponsabilidad;
	}
	public void setValorHoraExtra(float bonoResponsabilidad) {
		this.bonoResponsabilidad = bonoResponsabilidad;
	}
}
