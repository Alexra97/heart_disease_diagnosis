package sintomas;

public class RitmoRapido extends Sintoma {
	private static final String descripcion = "Ritmo card�aco anormalmente r�pido detectado";
	public RitmoRapido(int cicloDetectado) {
		super(cicloDetectado, descripcion + " (Taquicardia)");
	}

}
