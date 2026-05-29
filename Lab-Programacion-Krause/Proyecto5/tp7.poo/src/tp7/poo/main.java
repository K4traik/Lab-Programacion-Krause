package tp7.poo;

public class main {

	public static void main(String[] args) {
		Curso curso = new Curso("5°2°");
		Estudiante estudiante1 = new Estudiante("Eric", "49003084", 7);
		Estudiante estudiante2 = new Estudiante("Facundo", "48001002", 8);
		Estudiante estudiante3 = new Estudiante("Adriano", "49001003", 5);
		curso.inscribir(estudiante1);
		curso.inscribir(estudiante2);
		curso.inscribir(estudiante3);
		System.out.println(curso.cantidadAlumnos());
		curso.darDeBaja(1);
		curso.listarAlumnos();
	}

}