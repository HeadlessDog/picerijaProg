package picerijasProg;

import java.nio.file.Path;

public class PasutijumaIzveide {
	private	String adrese;
	private	int talr;
	private	String vards;
	private	double lielums;
	private	String[] piedevas;
	private	String[] merces;
	private	double picasCena;
	private	double piegadesCena;
	private	boolean sanemtUzvietas;
	private	int pasutijumaNumurs;
	private	Path datuFails;
	
	public static void sastaditPasutijumu(boolean uzVietas) {
		System.out.println("Sastade izsaukta, uzvietas : "+uzVietas);
	}

}
