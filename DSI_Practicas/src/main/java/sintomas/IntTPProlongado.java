package sintomas;

public class IntTPProlongado extends Sintoma {
	private static final String descripcion = "Intervalo T-P prolongado detectado entre los ciclos ";
	public IntTPProlongado(int cicloDetectado) {
		super(cicloDetectado, descripcion + cicloDetectado + " y " + (cicloDetectado+1) + " (Bradicardia)");
	}

}
