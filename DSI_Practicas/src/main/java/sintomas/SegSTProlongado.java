package sintomas;

public class SegSTProlongado extends Sintoma {
	private static final String descripcion = "Segmento ST prolongado detectado en el ciclo ";
	public SegSTProlongado(int cicloDetectado) {
		super(cicloDetectado, descripcion + cicloDetectado + " (Hipocalcemia)");
	}

}
