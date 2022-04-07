package pk_TA5_6;

import javax.swing.JOptionPane;

public class Seis {

	public static void main(String[] args) {
		
		// Calcular el precio final con IVA de un precio introducido
		
		final int IVA= 21;
		double valorSinIva = 100;
		double valorConIva = 0;
		String inputString = "";
		
		// Input parse
		inputString = JOptionPane.showInputDialog("Introduce el precio del producto sin iva");
		valorSinIva = Double.parseDouble(inputString);
		
		// Procesar valor
		valorConIva = valorSinIva + (valorSinIva* IVA/100);

		// Mostrar resultado
		JOptionPane.showMessageDialog(null, valorConIva);
	}

}
