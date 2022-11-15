package sintomas;

public class RitmoLento extends Sintoma {
	private static final String descripcion = "Ritmo cardíaco anormalmente lento detectado ";
	public RitmoLento(int cicloDetectado) {
		super(cicloDetectado, descripcion + " (Bradicardia)");
	}

}
