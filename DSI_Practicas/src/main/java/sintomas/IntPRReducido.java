package sintomas;

public class IntPRReducido extends Sintoma {
	private static final String descripcion = "Intervalo PR reducido detectado en el ciclo ";
	public IntPRReducido(int cicloDetectado) {
		super(cicloDetectado, descripcion + cicloDetectado + " (Taquicardia) (Aleteo auricular)");
	}

}
