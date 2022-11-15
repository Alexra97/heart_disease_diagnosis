package sintomas;

public class RitmoRapido extends Sintoma {
	private static final String descripcion = "Ritmo cardíaco anormalmente rápido detectado";
	public RitmoRapido(int cicloDetectado) {
		super(cicloDetectado, descripcion + " (Taquicardia)");
	}

}
