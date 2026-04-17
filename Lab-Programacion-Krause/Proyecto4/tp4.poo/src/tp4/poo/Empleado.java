package tp4.poo;

public class Empleado {
	protected String legajo;
	protected float sueldoBase;
	
	public Empleado(String legajo, float sueldoBase) {
		this.legajo = legajo;
		this.sueldoBase = sueldoBase;
	}
	
	public String getLegajo() {
		return legajo;
	}
	public void setLegajo(String legajo) {
		this.legajo = legajo;
	}
	public float getSueldoBase() {
		return sueldoBase;
	}
	public void setSueldoBase(float sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
}
