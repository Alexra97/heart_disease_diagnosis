package elementosECG;

public class DatosECG {
	private int numCiclos;
	private int pulsacionesPorMin;
	
	public DatosECG(int numCiclos, int pulsacionesPorMin) {
		this.numCiclos = numCiclos;
		this.pulsacionesPorMin = pulsacionesPorMin;
	}
	public int getNumCiclos() {
		return numCiclos;
	}
	public void setNumCiclos(int numCiclos) {
		this.numCiclos = numCiclos;
	}
	public int getPulsacionesPorMin() {
		return pulsacionesPorMin;
	}
	public void setPulsacionesPorMin(int pulsacionesPorMin) {
		this.pulsacionesPorMin = pulsacionesPorMin;
	}
}
