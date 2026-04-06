package tp4.poo;

public class Perro extends Animal{
	public Perro(String nombre, String fechaNacimiento) {
		super(nombre, fechaNacimiento);
	}
	
	public void ladrar() {
		System.out.println(getNombre() +" ladró");
	}
}
