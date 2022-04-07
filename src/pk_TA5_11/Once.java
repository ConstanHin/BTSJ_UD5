package pk_TA5_11;

import javax.swing.JOptionPane;

public class Once {

	public static void main(String[] args) {
		// Pide input de dia de la semana y muestra si es día laboral

		String key = "";
		
		String inputString = JOptionPane.showInputDialog("Introduce el dia de la semana");
		key = inputString.toLowerCase();
		
		// Comprobar si es dia laboral
		switch (key) {
		case "lunes":
			JOptionPane.showMessageDialog(null, "El día es laboral");
			
			break;
		case "martes":
			JOptionPane.showMessageDialog(null, "El día es laboral");

			break;
		case "miercoles":
			JOptionPane.showMessageDialog(null, "El día es laboral");

			break;
		case "jueves":
			JOptionPane.showMessageDialog(null, "El día es laboral");

			break;
		case "viernes":
			JOptionPane.showMessageDialog(null, "El día es laboral");

			break;
		case "sabado":
			JOptionPane.showMessageDialog(null, "El día no es laboral");

			break;
		case "domingo":
			JOptionPane.showMessageDialog(null, "El día no es laboral");

			break;

		default:
			JOptionPane.showMessageDialog(null, "El día introducido no es correcto");
			break;
		}


	}

}
