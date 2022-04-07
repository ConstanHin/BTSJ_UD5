package pk_TA5_5;

import javax.swing.JOptionPane;

public class Cinco {

	public static void main(String[] args) {
		
		// Comprobar si el numero introducido es múltiplo de 2

		String userInput = "0";
		int number = 0;
		String outputString = "";

		// Introducir y convertir numero
		userInput = JOptionPane.showInputDialog("Introduce un número múltiplo de 2");
		number = Integer.parseInt(userInput);

		// Comprobar numero
		if (number % 2 == 0) {
			outputString = "El número es múltiplo de 2";
		} else {
			outputString = "El número no es múltiplo de 2";
		}

		// Mostrar resultado
		JOptionPane.showMessageDialog(null, outputString);
		

	}

}
