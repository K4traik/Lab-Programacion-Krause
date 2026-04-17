package actividadDiagrama;

public class Cliente {
	private int IDCliente;
	private int telefono;
	private String nombre;
	private String apellido;
	private String direccion;
	private CarritoCompra carrito;
	
	public Cliente(int IDCliente, int telefono, String nombre, String apellido, String direccion, CarritoCompra carrito) {
		this.IDCliente = IDCliente;
		this.telefono = telefono;
		this.nombre = nombre;
		this.apellido = apellido;
		this.direccion = direccion;
		this.carrito = carrito;
	}
	
	public void setCarrito(CarritoCompra carrito) {
		this.carrito = carrito;
	}
	public CarritoCompra getCarrito() {
		return carrito;
	}
}
