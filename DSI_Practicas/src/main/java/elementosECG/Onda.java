package elementosECG;

public abstract class Onda {

	private int ciclo;
	private float comienzo;
	private float fin;
	private float puntoMax;
	
	public Onda(int ciclo, float comienzo, float fin, float puntoMax) {
		this.ciclo = ciclo;
		this.comienzo = comienzo;
		this.fin = fin;
		this.puntoMax = puntoMax;
	}
	
	public Onda() {}

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

	public float getPuntoMax() {
		return puntoMax;
	}

	public void setPuntoMax(float puntoMax) {
		this.puntoMax = puntoMax;
	}
	
	public String toString() {
		return "tipoOnda"+"("+comienzo+", "+fin+", "+puntoMax+")";
	}
}
