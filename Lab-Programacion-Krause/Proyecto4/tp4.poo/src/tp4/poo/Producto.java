package tp4.poo;

public abstract class Producto {
	protected int codigo;
	private float precio;
	
	public Producto(int codigo, float precio) {
		this.codigo = codigo;
		this.precio = precio;
	}
	
	public float calcularPrecioFinal() {
		return precio + (precio*20/100);
	}
	
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getPrecio() {
		return precio;
	}
	public void setPrecio(float precio) {
		this.precio = precio;
	}
}
// No se puede crear un objeto de esta clase porque es de tipo abstracta que solo sirve como esqueleto para otras clases.