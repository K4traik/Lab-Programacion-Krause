package tp4.poo;

public class Papeleria extends Producto {
	private String tipoMaterial;
	
	public Papeleria(int codigo, float precio, String tipoMaterial) {
		super(codigo, precio);
		this.tipoMaterial = tipoMaterial;
	}
	
	public String getTipoMaterial() {
		return tipoMaterial;
	}
	public void setTipoMaterial(String tipoMaterial) {
		this.tipoMaterial = tipoMaterial;
	}
}
