package festivalMusica;

public class Cantante implements Contratable{
	private String nombre;
	private String genMusical;
	private int cachetSolicitado;
	private int cancionesProgramadas;
	private String manager;
	
	public Cantante(String nombre, String genMusical, int cachetSolicitado, int cancionesProgramadas, String manager) {
		this.nombre = nombre;
		this.genMusical = genMusical;
		this.cachetSolicitado = cachetSolicitado;
		this.cancionesProgramadas = cancionesProgramadas;
		this.manager = manager;
	}
	
	public String getNombre() {
		return nombre;
	}
	public String getGenMusical() {
		return genMusical;
	}
	public int getCachetSolicitado() {
		return cachetSolicitado;
	}
	public int getCancionesProgramadas() {
		return cancionesProgramadas;
	}
	public String getManager() {
		if (manager == null) {
			throw new IllegalArgumentException("El cantante " + nombre + " no tiene manager.");
		}
		return manager;
	}
	
	@Override
	public void liquidarHonorarios(double impuestos) throws IllegalArgumentException{
		if(impuestos<0 || impuestos>cachetSolicitado) {
			throw new IllegalArgumentException("Los impuestos son mayores al cachet solicitado de " + nombre + ".");
		}
	}
	@Override
	public void asignarEscenario(String nombreEscenario, Festival festival) throws NullPointerException{
		if(festival.comprobarEscenario(nombreEscenario)) {
			throw new NullPointerException("El escenario no existe en el festival " + festival.getNombre());
		}
	}
}
