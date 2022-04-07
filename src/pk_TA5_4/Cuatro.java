package pk_TA5_4;

import javax.swing.JOptionPane;

public class Cuatro {

	public static void main(String[] args) {
		// Calcular area de un circulo
		
		double radius = 1;
		double result = 0;
		String radInputString = "0";
		
		// Introducir
		radInputString = JOptionPane.showInputDialog( "Introduce el radio");
		
		// Convertir
		radius = Double.parseDouble(radInputString);
		
		// Calcular
		result = Math.PI * Math.pow(radius, 2);
		
		// Mostrar
		JOptionPane.showMessageDialog(null, "El area del circulo es: " + result);
		
	}

}
