package pk_TA5_13;

import javax.swing.JOptionPane;

public class Trece {

	public static void main(String[] args) {
		// Calculadora inversa

		// Input usuario: 2 operadores int type, 1 signo aritm�tico String type

		int first = 0;
		int second = 0;
		String sign = "";
		int result = 0;

		// Pedir input al usuario
		String inputFirst = JOptionPane.showInputDialog("Introduce el primer n�mero");
		String inputSecond = JOptionPane.showInputDialog("Introduce el segundo n�mero");
		sign = JOptionPane.showInputDialog("Introduce el signo aritm�tico (+, -, /, *, %)");
		
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
