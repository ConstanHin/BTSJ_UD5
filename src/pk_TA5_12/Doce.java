package pk_TA5_12;

import javax.swing.JOptionPane;

public class Doce {

	public static void main(String[] args) {
		// Solicita introducci�n de contrase�a y comprueba si es correcta

		// Contrase�a:
		String pass = "123";
		int intentos = 3;

		// Pedir contrase�a con 3 intentos
		int i = 0;
		do {
			
			String inputString = JOptionPane.showInputDialog("Introduce contrase�a");
			
			// Comprobar si contra�a correcta
			if(inputString.equals(pass)) {
				JOptionPane.showMessageDialog(null, "Enhorabuena");
				break;
			}

			i++;
		} while (i<intentos);

	}

}
