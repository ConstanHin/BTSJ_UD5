package pk_TA5_12;

import javax.swing.JOptionPane;

public class Doce {

	public static void main(String[] args) {
		// Solicita introducción de contraseña y comprueba si es correcta

		// Contraseña:
		String pass = "123";
		int intentos = 3;

		// Pedir contraseña con 3 intentos
		int i = 0;
		do {
			
			String inputString = JOptionPane.showInputDialog("Introduce contraseña");
			
			// Comprobar si contraña correcta
			if(inputString.equals(pass)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				break;
			}

			i++;
		} while (i<intentos);

	}

}
