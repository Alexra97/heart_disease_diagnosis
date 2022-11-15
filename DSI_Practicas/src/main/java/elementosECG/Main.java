package elementosECG;

import org.kie.api.KieServices;
import org.kie.api.runtime.KieContainer;
import org.kie.api.runtime.KieSession;

import java.awt.FileDialog;
import java.awt.Frame;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {
	private static final int lineasAIgnorar = 3;
	public static void main(String[] args) {

		// Cargar la base de conocimiento.
		KieServices ks = KieServices.Factory.get();
		KieContainer kc = ks.getKieClasspathContainer();
		// Crear una sesión.
		KieSession kSession = kc.newKieSession("ksession-rules");
		
		// Leer el ECG desde el archivo.
		String cadena;
		FileReader f;
		int i = 0;
		String nombre = "";
		float comienzo = 0;
		float fin = 0;
		float puntoMax = 0;
		String aux[];
		
		// Lanzar ventana para selección del archivo.
		Frame frame = new Frame();
		FileDialog archivo = new FileDialog(frame, "Elija un archivo", FileDialog.LOAD);
		archivo.setVisible(true);
		String nombreFichero = archivo.getDirectory() + archivo.getFile();
		try {
			f = new FileReader(nombreFichero);
			BufferedReader b = new BufferedReader(f);
			int numCiclo = 0;
			while((cadena = b.readLine())!=null) {
				if (i > lineasAIgnorar) { // Saltar las primeras tres líneas dela archivo.
					nombre = cadena.substring(0,1);
					cadena = cadena.substring(2,cadena.length()-2);
				    aux = cadena.split(",");
				    comienzo = Float.parseFloat(aux[0]);
				    fin = Float.parseFloat(aux[1]);
				    puntoMax = Float.parseFloat(aux[2]);
				    switch (nombre) {
					    case "P" : 
					    	numCiclo++;
					    	OndaP op = new OndaP(numCiclo, comienzo, fin, puntoMax);
						    kSession.insert(op);
					    	break;
					    case "Q" : 
					    	OndaQ oq = new OndaQ(numCiclo, comienzo, fin, puntoMax);
						    kSession.insert(oq);
					    	break;
					    case "R" : 
					    	OndaR or = new OndaR(numCiclo, comienzo, fin, puntoMax);
						    kSession.insert(or);
					    	break;
					    case "S" : 
					    	OndaS os = new OndaS(numCiclo, comienzo, fin, puntoMax);
						    kSession.insert(os);
						    break;
					    case "T" : 
					    	OndaT ot = new OndaT(numCiclo, comienzo, fin, puntoMax);
						    kSession.insert(ot);
					    	break;
				    }
				}
				i++;
			}
			b.close();
		} catch (FileNotFoundException e) {
			System.out.println("No se ha podido encontrar el fichero.");
			return;
		} catch (IOException e) {
			e.printStackTrace();
		}
		kSession.getAgenda().getAgendaGroup("elementos ECG").setFocus();
		kSession.fireAllRules();
		kSession.getAgenda().getAgendaGroup("sintomas").setFocus();
		kSession.fireAllRules();
		kSession.getAgenda().getAgendaGroup("cardiopatias").setFocus();
		kSession.fireAllRules();
		kSession.getAgenda().getAgendaGroup("informe").setFocus();
		kSession.fireAllRules();
		}
}
