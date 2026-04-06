package tp4.poo;

import java.util.List;

public class Vendedor {
	public String nombre;
	public int legajo;
	public List<Vehiculo> vehiculos;
	
	public Vendedor(String nombre, int legajo) {
		this.nombre = nombre;
		this.legajo = legajo;
	}
	
	public void añadirVehiculos(Vehiculo vehiculo) {
		vehiculos.add(vehiculo);
		System.out.println("Vehículo "+ vehiculo.getPatente() +" de patente añadido al vendedor "+ nombre);
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getNombre() {
		return nombre;
	}
	public void setLegajo(int legajo) {
		this.legajo = legajo;
	}
	public int getLegajo() {
		return legajo;
	}
}
