package actividadDiagrama;

public class LineaProducto {
	private int IDLinea;
	private String nombre;
	private Producto producto;
	
	public LineaProducto(int IDLinea, String nombre, Producto producto) {
		this.IDLinea = IDLinea;
		this.nombre = nombre;
		this.producto = producto;
	}
	
	public void setProducto(Producto producto) {
		this.producto = producto;
	}
	public Producto getProducto() {
		return producto;
	}
}
