package pk_TA5_5;

import javax.swing.JOptionPane;

public class Cinco {

	public static void main(String[] args) {
		
		// Comprobar si el numero introducido es m�ltiplo de 2

		String userInput = "0";
		int number = 0;
		String outputString = "";

		// Introducir y convertir numero
		userInput = JOptionPane.showInputDialog("Introduce un n�mero m�ltiplo de 2");
		number = Integer.parseInt(userInput);

		// Comprobar numero
		if (number % 2 == 0) {
			outputString = "El n�mero es m�ltiplo de 2";
		} else {
			outputString = "El n�mero no es m�ltiplo de 2";
		}

		// Mostrar resultado
		JOptionPane.showMessageDialog(null, outputString);
		

	}

}
