package picerijasProg;

import java.nio.file.Path;

import javax.swing.JOptionPane;

public class PasutijumaIzveide {
	private static	String adrese;
	private static	int talr;
	private	static String vards;
	private	static double lielums;
	private	static double cenasLielumaKoef;
	private	static String[] piedevas;
	private	static String[] merces;
	private	static String[] dzerieni;
	private	static String[] uzkodas;
	private static double katrasPiedevasCena;
	private static double katrasMercesCena;
	private static double katrasUzkodasCena;
	private static double katraDzerienaCena;
	private	static double picasCena;
	private static double uzkoduKopejaCena;
	private static double dzerienuKopejaCena;
	private	static double piegadesCena = 0;
	private	static double kopejaCena;
	private	static int pasutijumaNumurs;
	private	static Path datuFails;
	
	public static void sastaditPasutijumu(boolean uzVietas) {
		System.out.println("Sastade izsaukta, uzvietas : "+uzVietas);
		String tempString;
		boolean valid;
		do {
			tempString = JOptionPane.showInputDialog(null, "Ievadi pasūtītāja tālruni(tikai ar skatiļiem):");
			valid = false;
			if(tempString.length()==8)
				valid = StringParbaude.intParbaude(tempString);
			
			if(valid)
				talr = Integer.parseInt(tempString);
			else
				JOptionPane.showMessageDialog(null, "Ievadi 8 skaitļus!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
		}while(!valid);
		
		do {
			tempString = JOptionPane.showInputDialog(null, "Ievadi pasūtītāja vārdu:");
			valid = false;
			if(tempString != null) {
				if(tempString.length() != 0) 
					valid = true;
			}
			
			if(!valid) JOptionPane.showMessageDialog(null, "Dati nav ievadīti!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
			else vards = tempString;
		}while(!valid);
		
		do {
			tempString = JOptionPane.showInputDialog(null, "Ievadi picas lielumu (cm):");
			valid = false;
			if(tempString != null) {
				if (tempString.length()<6)
					valid = StringParbaude.doubleParbaude(tempString);
			}
			
			if(valid)
				lielums = Double.parseDouble(tempString);
			else
				JOptionPane.showMessageDialog(null, "Nepareizi ievadīti dati vai skaitlis par lielu!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
		}while(!valid);
		
		do {
			tempString = JOptionPane.showInputDialog(null, "Ievadi piedevas, atdali katru ar atstarpi:");
			valid = false;
			if(tempString != null) {
				if(tempString.length() != 0) 
					valid = true;
			}
			
			
			
			if(!valid) JOptionPane.showMessageDialog(null, "Dati nav ievadīti!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
			else piedevas = tempString.split(" ");
		}while(!valid);
		
		do {
			tempString = JOptionPane.showInputDialog(null, "Ievadi individuālas piedevas cenu:");
			valid = false;
			if(tempString != null) {
				if (tempString.length()<6)
					valid = StringParbaude.doubleParbaude(tempString);
			}
			
			if(valid)
				katrasPiedevasCena = Double.parseDouble(tempString);
			else
				JOptionPane.showMessageDialog(null, "Nepareizi ievadīti dati vai skaitlis par lielu!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
		}while(!valid);
		
		do {
			tempString = JOptionPane.showInputDialog(null, "Ievadi mērces, atdali katru ar atstarpi:");
			valid = false;
			if(tempString != null) {
				if(tempString.length() != 0) 
					valid = true;
			}

			if(!valid) JOptionPane.showMessageDialog(null, "Dati nav ievadīti!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
			else merces = tempString.split(" ");
		}while(!valid);
		
		do {
			tempString = JOptionPane.showInputDialog(null, "Ievadi individuālas mērces cenu:");
			valid = false;
			if(tempString != null) {
				if (tempString.length()<6)
					valid = StringParbaude.doubleParbaude(tempString);
			}
			
			if(valid)
				katrasMercesCena = Double.parseDouble(tempString);
			else
				JOptionPane.showMessageDialog(null, "Nepareizi ievadīti dati vai skaitlis par lielu!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
		}while(!valid);
		
		if(JOptionPane.showConfirmDialog(null, "Vai pasūtījumā ir dzērieni?",
                "Dzerieni", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			do {
				tempString = JOptionPane.showInputDialog(null, "Ievadi dzerienu, atdali katru ar atstarpi:");
				valid = false;
				if(tempString != null) {
					if(tempString.length() != 0) 
						valid = true;
				}
	
				if(!valid) JOptionPane.showMessageDialog(null, "Dati nav ievadīti!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
				else dzerieni = tempString.split(" ");
			}while(!valid);
			
			do {
				tempString = JOptionPane.showInputDialog(null, "Ievadi individuāla dzeriena cenu:");
				valid = false;
				if(tempString != null) {
					if (tempString.length()<6)
						valid = StringParbaude.doubleParbaude(tempString);
				}
				
				if(valid)
					katraDzerienaCena = Double.parseDouble(tempString);
				else
					JOptionPane.showMessageDialog(null, "Nepareizi ievadīti dati vai skaitlis par lielu!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
			}while(!valid);
		}
		if(JOptionPane.showConfirmDialog(null, "Vai pasūtījumā ir uzkodas?",
                "Uzkodas", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
			do {
				tempString = JOptionPane.showInputDialog(null, "Ievadi uzkodu, atdali katru ar atstarpi:");
				valid = false;
				if(tempString != null) {
					if(tempString.length() != 0) 
						valid = true;
				}
	
				if(!valid) JOptionPane.showMessageDialog(null, "Dati nav ievadīti!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
				else uzkodas = tempString.split(" ");
				
				do {
					tempString = JOptionPane.showInputDialog(null, "Ievadi individuālas uzkodas cenu:");
					valid = false;
					if(tempString != null) {
						if (tempString.length()<6)
							valid = StringParbaude.doubleParbaude(tempString);
					}
					
					if(valid)
						katrasUzkodasCena = Double.parseDouble(tempString);
					else
						JOptionPane.showMessageDialog(null, "Nepareizi ievadīti dati vai skaitlis par lielu!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
				}while(!valid);
			}while(!valid);
		}
		
		if(!uzVietas)
		{
			do {
				tempString = JOptionPane.showInputDialog(null, "Ievadi pasūtītāja adresi:");
				valid = false;
				if(tempString != null) {
					if(tempString.length() != 0) 
						valid = true;
				}
				
				if(!valid) JOptionPane.showMessageDialog(null, "Dati nav ievadīti!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
				else vards = tempString;
			}while(!valid);
			
			do {
				tempString = JOptionPane.showInputDialog(null, "Ievadi piegādes cenu:");
				valid = false;
				if(tempString != null) {
					if (tempString.length()<9)
						valid = StringParbaude.doubleParbaude(tempString);
				}
				
				if(valid)
					piegadesCena = Double.parseDouble(tempString);
				else
					JOptionPane.showMessageDialog(null, "Nepareizi ievadīti dati vai skaitlis par lielu!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
			}while(!valid);
		}
		
		do {
			tempString = JOptionPane.showInputDialog(null, "Ievadi picas lieluma/piedevuCena koeficientu:");
			valid = false;
			if(tempString != null) {
				if (tempString.length()<6)
					valid = StringParbaude.doubleParbaude(tempString);
			}
			
			if(valid)
				cenasLielumaKoef = Double.parseDouble(tempString);
			else
				JOptionPane.showMessageDialog(null, "Nepareizi ievadīti dati vai skaitlis par lielu!", "Kļūda!", JOptionPane.ERROR_MESSAGE);
		}while(!valid);
		
		picasCena = (katrasPiedevasCena*(double)piedevas.length + katrasMercesCena*(double)merces.length)*lielums*cenasLielumaKoef;
		uzkoduKopejaCena = katrasUzkodasCena*uzkodas.length;
		dzerienuKopejaCena = katraDzerienaCena*dzerieni.length;
		kopejaCena = picasCena+uzkoduKopejaCena+dzerienuKopejaCena+piegadesCena;
		
		pasutijumaNumurs = (int)(Math.random()*90000 + 10000);
		
		JOptionPane.showMessageDialog(null, picasCena+" "+uzkoduKopejaCena+" "+dzerienuKopejaCena+" "+kopejaCena);
	}
	

}
