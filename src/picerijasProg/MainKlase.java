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
			case 0: JOptionPane.showMessageDialog(null, "Jus izvelejaties apturet programmu"); break;
			case 1: JOptionPane.showMessageDialog(null, "Jus izvelejaties izveidot pasutijumu"); break;
			case 2: JOptionPane.showMessageDialog(null, "Jus izvelejaties apskatīt pasūtījumus"); break;
			case 3: JOptionPane.showMessageDialog(null, "Jus izvelejaties labot pasūtījumus"); break;
			default: System.out.println("Error"); break;
			}
			
		}while(izveletaDarbiba != 0);

	}

}
