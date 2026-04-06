package tp4.poo;

public class HerramientaManual extends Herramienta{
	private String tipoEmpuñadura;
	
	public HerramientaManual(int codigo, String marca, String tipoEmpuñadura) {
		super(codigo, marca);
		this.tipoEmpuñadura = tipoEmpuñadura;
	}
}
