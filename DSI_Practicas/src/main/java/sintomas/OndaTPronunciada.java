package sintomas;

public class OndaTPronunciada extends Sintoma {
	private static final String descripcion = "Onda T muy pronunciada detectada en el ciclo ";
	public OndaTPronunciada(int cicloDetectado) {
		super(cicloDetectado, descripcion + cicloDetectado + " (Infarto agudo de miocardio)");
	}

}
