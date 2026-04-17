package actividadDiagrama;

public class Pedido {
	private int IDPedido;
	private int cantidad;
	private LineaProducto lineaProducto;
	
	public Pedido(int IDPedido, int cantidad, LineaProducto lineaProducto) {
		this.IDPedido = IDPedido;
		this.cantidad = cantidad;
		this.lineaProducto = lineaProducto;
	}
	
	public void setProducto(LineaProducto lineaProducto) {
		this.lineaProducto = lineaProducto;
	}
	public LineaProducto getProducto() {
		return lineaProducto;
	}
}
