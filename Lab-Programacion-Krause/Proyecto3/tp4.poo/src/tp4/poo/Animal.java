package tp4.poo;

public abstract class Animal {
	private String nombre;
	private String fechaNacimiento;
	
	public Animal(String nombre, String fechaNacimiento) {
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	}
	
	 public void setNombre(String nombre) {
		 this.nombre = nombre;
	 }
	 public String getNombre() {
		 return nombre;
	 }
}
