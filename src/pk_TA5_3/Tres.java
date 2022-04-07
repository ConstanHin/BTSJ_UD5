package pk_TA5_3;

import javax.swing.JOptionPane;

public class Tres {

	public static void main(String[] args) {

		// Pide un input con interfaz gráfica y lo muestra por pantalla

		String name = "Constantin";

		System.out.println("Bienvenido!");
		System.out.print("Introduce tu nombre:");
		name = JOptionPane.showInputDialog("Introduce tu nombre:");
		
		JOptionPane.showMessageDialog(null, "Hola " + name);


	}

}
