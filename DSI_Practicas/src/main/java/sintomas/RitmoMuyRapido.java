package sintomas;

public class RitmoMuyRapido extends Sintoma {
	private static final String descripcion = "Ritmo cardíaco de muy alta frecuencia detectado ";
	public RitmoMuyRapido(int cicloDetectado) {
		super(cicloDetectado, descripcion + " (Aleteo auricular)");
	}

}
