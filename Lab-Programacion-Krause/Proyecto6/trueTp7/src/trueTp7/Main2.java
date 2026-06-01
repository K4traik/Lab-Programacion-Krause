package trueTp7;

public class Main2 {
	public static void  main(String[] args) {
		Biblioteca biblioteca1 = new Biblioteca();
		
		String[][] datos = {
				{"El Principito", "9789504000044", "3200"},
				{"Donde viven los monstruos", "9789877381501", "2800"},
				{"Matilda", "9788420432885", "4500"},
				{"Charlie y la fábrica de chocolate", "9788420432878", "4500"},
				{"El árbol generoso", "9789877380125", "2600"},
				{"Harriet, la espía", "9788420401164", "5100"},
				{"El ratón que se comió la luna", "9788416648931", "2200"},
				{"Las aventuras de Pippi Mediaslargas", "9788420400891", "3900"},
				{"El mago de Oz", "9789504000815", "3500"},
				{"El hobbit", "9788445000687", "6200"}
				};
		
		Libro[] libros = new Libro[datos.length];
		for(int i = 0; i < datos.length; i++) {
			libros[i] = new Libro(datos[i][0], datos[i][1], Integer.parseInt(datos[i][2]));
		}
		for(Libro l:libros) {
			biblioteca1.añadirLibro(l);
		}
		
		biblioteca1.listarLibros();
		biblioteca1.cantidadLibros();
		biblioteca1.pagLibroPorIndice(5);
	}
}
