package tp4.poo;
import java.util.List;

public class Veterinario {
	public String nombre;
	public String dpto;
	public List<Animal> animales;
	
	public Veterinario(String nombre, String dpto) {
		this.nombre = nombre;
		this.dpto = dpto;
	}
	
	public void añadirAnimal(Animal animal) {
		animales.add(animal);
		System.out.println(animal.getNombre() +" ahora está a nombre de "+ nombre);
	}
}
