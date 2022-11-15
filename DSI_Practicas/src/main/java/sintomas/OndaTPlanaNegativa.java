package sintomas;

public class OndaTPlanaNegativa extends Sintoma {
	private static final String descripcion = "Onda T plana o negativa detectada en el ciclo ";
	public OndaTPlanaNegativa(int cicloDetectado) {
		super(cicloDetectado, descripcion + cicloDetectado + " (Hipopotasemia) (Isquemia coronaria)");
	}

}
