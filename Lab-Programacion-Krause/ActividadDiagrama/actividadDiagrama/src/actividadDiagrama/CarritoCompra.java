package actividadDiagrama;
import java.util.List;

public class CarritoCompra {
	private int IDCarrito;
	private Pago pago;
	private List<Pedido> pedidos;
	
	public CarritoCompra(int IDCarrito, Pago pago) {
		this.IDCarrito = IDCarrito;
		this.pago = pago;
	}
	
	public void añadirPedidos(Pedido pedido) {
		pedidos.add(pedido);
	}
	public List<Pedido> getPedidos() {
		return pedidos;
	}
	public void setPago(Pago pago) {
		this.pago = pago;
	}
	public Pago getPago() {
		return pago;
	}
}
