package pk_TA5_10;

import javax.swing.JOptionPane;

public class Diez {

	public static void main(String[] args) {
		// input numero de ventas

		int numberOfSales = 0;
		double totalPrice = 0;
		double inputPrice = 0;

		String inputTotalSalesString = JOptionPane.showInputDialog("¿Número de productos vendidos?");
		numberOfSales = Integer.parseInt(inputTotalSalesString);

		// Hacer un loop por cada venta y pedir el precio
		for (int i = 1; i <= numberOfSales; i++) {
			String inputPriceString = JOptionPane.showInputDialog("Introduce el precio del producto " + i);
			inputPrice = Double.parseDouble(inputPriceString);
			// sumar valor del input con el valor anterior
			totalPrice += inputPrice;
		}

		// Mostrar resultado
		JOptionPane.showMessageDialog(null, "El total es: " + totalPrice);

	}

}
