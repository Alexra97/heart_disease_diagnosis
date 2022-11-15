package sintomas;

public class ComplejoQRSReducido extends Sintoma {
	private static final String descripcion = "Reducci�n del Complejo QRS detectado en el ciclo ";
	public ComplejoQRSReducido(int cicloDetectado) {
		super(cicloDetectado, descripcion + cicloDetectado + " (Contracci�n ventricular prematura)");
	}

}