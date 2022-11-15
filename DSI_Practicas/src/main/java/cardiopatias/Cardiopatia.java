package cardiopatias;

public abstract class Cardiopatia {
	private String nombre;
	
	public Cardiopatia(String nombre) {
		this.nombre = nombre;
	}
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
