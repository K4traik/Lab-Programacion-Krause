package festivalMusica;

public interface Contratable {
	public void liquidarHonorarios(double impuestos) throws IllegalArgumentException;
	public void asignarEscenario(String nombreEscenario, Festival festival) throws NullPointerException;
}
