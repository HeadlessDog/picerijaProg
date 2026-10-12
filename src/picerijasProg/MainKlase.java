package picerijasProg;

import java.util.Arrays;

import javax.swing.JList;
import javax.swing.JOptionPane;

public class MainKlase {
	
	public static void main(String[] args) {
		int izveletaDarbiba = 0;
		String[] options = {"Apturet programmu", "Izveidot pasūtījumu", "Apskatīt pasūtījumus", "Labot pasūtījumus"};
		
		do {
			izveletaDarbiba = JOptionPane.showOptionDialog(null, "Izvēlieties darbību: ",
					"Picerijas pasūtījumu programma", 0, JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
			
			switch(izveletaDarbiba)
			{
			case 0: JOptionPane.showMessageDialog(null, "Jus izvelejaties apturet programmu");break;
			case 1:
				int choice = JOptionPane.showConfirmDialog(null, "Vai pica tiks saņemta uz vietas?",
                    "Saņemšana", JOptionPane.YES_NO_CANCEL_OPTION);
				if(choice == JOptionPane.YES_OPTION)
					PasutijumaIzveide.sastaditPasutijumu(true);
				else if(choice == JOptionPane.NO_OPTION)
					PasutijumaIzveide.sastaditPasutijumu(false);
				else JOptionPane.showMessageDialog(null, "Darbība atcelta");
			break;
			case 2: JOptionPane.showMessageDialog(null, "Jus izvelejaties apskatīt pasūtījumus"); break;
			case 3: JOptionPane.showMessageDialog(null, "Jus izvelejaties labot pasūtījumus"); break;
			default: System.out.println("Error"); break;
			}
			
		}while(izveletaDarbiba != 0);

	}

}
