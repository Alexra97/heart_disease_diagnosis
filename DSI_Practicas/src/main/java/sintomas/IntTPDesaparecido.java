package sintomas;

public class IntTPDesaparecido extends Sintoma {
	private static final String descripcion = "Desaparici�n del Intervalo T-P detectado en el ciclo ";
	public IntTPDesaparecido(int cicloDetectado) {
		super(cicloDetectado, descripcion + cicloDetectado + " (Aleteo auricular)");
	}

}
