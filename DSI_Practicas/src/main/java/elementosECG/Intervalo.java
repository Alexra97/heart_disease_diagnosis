package elementosECG;

public class Intervalo {
	
	private int ciclo;
	private float comienzo;
	private float fin;
	
	public Intervalo(int ciclo, float comienzo, float fin) {
		this.ciclo = ciclo;
		this.comienzo = comienzo;
		this.fin = fin;
	}
	public Intervalo() {}
	
	public int getCiclo() {
		return ciclo;
	}
	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}
	public float getComienzo() {
		return comienzo;
	}
	public void setComienzo(float comienzo) {
		this.comienzo = comienzo;
	}
	public float getFin() {
		return fin;
	}
	public void setFin(float fin) {
		this.fin = fin;
	}

	
}
