package pk_TA5_13;

import javax.swing.JOptionPane;

public class Trece {

	public static void main(String[] args) {
		// Calculadora inversa

		// Input usuario: 2 operadores int type, 1 signo aritmético String type

		int first = 0;
		int second = 0;
		String sign = "";
		int result = 0;

		// Pedir input al usuario
		String inputFirst = JOptionPane.showInputDialog("Introduce el primer número");
		String inputSecond = JOptionPane.showInputDialog("Introduce el segundo número");
		sign = JOptionPane.showInputDialog("Introduce el signo aritmético (+, -, /, *, %)");
		
		// Parse input
		first = Integer.parseInt(inputFirst);
		second = Integer.parseInt(inputSecond);
		
		switch (sign) {
		case "+":
			result= first + second;
			
			break;
		case "-":
			result= first - second;
			
			break;
		case "/":
			result= first / second;
			
			break;
		case "*":
			result= first * second;
			
			break;
		case "%":
			result= first % second;
			
			break;

		default:
			JOptionPane.showMessageDialog(null, "El dato introducido no es correcto");
			break;
		}
		
		
		// Mostrar resultado
		JOptionPane.showMessageDialog(null, "El resultado es: " + result);

	}

}
