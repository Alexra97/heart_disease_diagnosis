package sintomas;

public abstract class Sintoma {
	private int cicloDetectado;
	private String descripcion;
	
	public Sintoma(int cicloDetectado, String descripcion) {
		this.cicloDetectado = cicloDetectado;
		this.descripcion = descripcion;
	}
	public int getCicloDetectado() {
		return cicloDetectado;
	}
	public void setCicloDetectado(int cicloDetectado) {
		this.cicloDetectado = cicloDetectado;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
}
