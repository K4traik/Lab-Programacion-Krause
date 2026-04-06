package tp4.poo;

public class Main {

	public static void main(String[] args) {
		HerramientaManual martillo = new HerramientaManual(0, "Stanley", "Madera");
		HerramientaElectrica taladro = new HerramientaElectrica(1, "MacTools", 10);
		HerramientaElectrica sierra = new HerramientaElectrica(2, "MacTools", 15);
		HerramientaManual cerrucho = new HerramientaManual(3, "Pretul", "Madera");
		HerramientaManual destornillador = new HerramientaManual(4, "Pretul", "Plástico");
		
		Socio socio1 = new Socio(0, "Matías");
		Socio socio2 = new Socio(1, "Eric");
		Socio socio3 = new Socio(2, "María");
		
		Libro libro1 = new Libro(0, "La Bella y La Bestia");
		Libro libro2 = new Libro(1, "La Bella y La Bestia");
		Libro libro3 = new Libro(2, "Principito");
		Libro libro4 = new Libro(3, "Principito");
		Libro libro5 = new Libro(4, "Principito");
		Libro libro6 = new Libro(5, "La Bella y La Bestia");
		Libro libro7 = new Libro(6, "Viaje al Centro de la Tierra");
		Libro libro8 = new Libro(7, "Viaje al Centro de la Tierra");
		Libro libro9 = new Libro(8, "Viaje al Centro de la Tierra");
		Libro libro10 = new Libro(9, "Vuelta al Mundo en 80 Días");
		Libro libro11 = new Libro(10, "Vuelta al Mundo en 80 Días");
		Libro libro12 = new Libro(11, "Vuelta al Mundo en 80 Días");
		Libro libro13 = new Libro(12, "Don Quijote");
		Libro libro14 = new Libro(13, "Don Quijote");
		Libro libro15 = new Libro(14, "Don Quijote");
		
		socio1.añadirLibro(libro1);
		socio2.añadirLibro(libro2);
		socio3.añadirLibro(libro6);
		socio1.añadirLibro(libro3);
		socio2.añadirLibro(libro4);
		socio3.añadirLibro(libro5);
		socio1.añadirLibro(libro7);
		socio2.añadirLibro(libro8);
		socio3.añadirLibro(libro9);
		socio1.añadirLibro(libro10);
		socio2.añadirLibro(libro11);
		socio3.añadirLibro(libro12);
		socio1.añadirLibro(libro13);
		socio2.añadirLibro(libro14);
		socio3.añadirLibro(libro15);
		
		Auto auto1 = new Auto("FY201GJ", "Deportivo");
		Auto auto2 = new Auto("AZ606ZZ", "Sedan");
		Moto moto3 = new Moto("TU376VI", "Motocross");
		Auto auto4 = new Auto("TU352MO", "Convertible");
		Auto auto5 = new Auto("KL338KY", "Van");
		Moto moto6 = new Moto("QF254AN", "Scooter");
		Auto auto7 = new Auto("MN559HJ", "Deportivo");
		Auto auto8 = new Auto("XU489MI", "Limusina");
		Moto moto9 = new Moto("SD317KF", "Estándar");
		Auto auto10 = new Auto("AB188BA", "Sedan");
		
		Vendedor vendedor1 = new Vendedor("Eric", 0);
		Vendedor vendedor2 = new Vendedor("Adriana", 1);
		Vendedor vendedor3 = new Vendedor("Martín", 2);
		
		vendedor1.añadirVehiculos(auto1);
		vendedor2.añadirVehiculos(auto2);
		vendedor3.añadirVehiculos(moto3);
		vendedor1.añadirVehiculos(auto4);
		vendedor2.añadirVehiculos(auto5);
		vendedor3.añadirVehiculos(moto6);
		vendedor1.añadirVehiculos(auto7);
		vendedor2.añadirVehiculos(auto8);
		vendedor3.añadirVehiculos(moto9);
		vendedor1.añadirVehiculos(auto10);
		
		Veterinario veterinario1 = new Veterinario("Eric", "1");
		Veterinario veterinario2 = new Veterinario("Mateo", "2");
		Veterinario veterinario3 = new Veterinario("Lucía", "3");
		
		Perro perro1 = new Perro("Messi", "20/12/2022");
		Gato gato2 = new Gato("Trueno", "12/1/2024");
		Perro perro3 = new Perro("Queso", "27/7/2023");
		Gato gato4 = new Gato("Simba", "26/6/2019");
		Perro perro5 = new  Perro("Luna", "16/9/2020");
		Gato gato6 = new Gato("Mochi", "20/2/2022");
		Perro perro7 = new Perro("Oliver", "21/10/2021");
		
		veterinario1.añadirAnimal(perro1);
		veterinario2.añadirAnimal(gato2);
		veterinario3.añadirAnimal(perro3);
		veterinario1.añadirAnimal(gato4);
		veterinario2.añadirAnimal(perro5);
		veterinario3.añadirAnimal(gato6);
		veterinario1.añadirAnimal(perro7);
		veterinario2.añadirAnimal(perro7);
		veterinario3.añadirAnimal(perro7);
		
	}

}
